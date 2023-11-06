package com.example.application.views.grupo7;

import java.util.concurrent.ThreadLocalRandom;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;

public class Triqui {
    private final int FILAS = 3;
    private final int COLUMNAS = 3;
    private final char JUGADOR_X = 'X';
    private final char JUGADOR_O = 'O';
    private final char ESPACIO_VACIO = ' ';
    private final int CONTEO_PARA_GANAR = 3;

    VerticalLayout layout;
    Button buttons[][];
    H1 mensaje;
    char jugadorActual;
    int x, y;
    char[][] tablero;
    boolean finJuego = true;
    Button btnInicio;

    // El método `public Triqui()` es el constructor de la clase `Triqui`. Inicializa el tablero de
    // juego ("tablero"), crea el diseño para la interfaz del juego ("layout") y configura los botones
    // y sus detectores de eventos.
    public Triqui() {

        tablero = new char[FILAS][COLUMNAS];

        layout = new VerticalLayout();
        layout.setAlignItems(Alignment.CENTER);

        btnInicio = new Button("Nuevo Juego");
        btnInicio.addClickListener(event -> {
            iniciarJuego();
        });

        mensaje = new H1(" ");

        HorizontalLayout h1 = new HorizontalLayout();
        HorizontalLayout h2 = new HorizontalLayout();
        HorizontalLayout h3 = new HorizontalLayout();
        buttons = new Button[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new Button();
                buttons[i][j].setText("");
                buttons[i][j].setId("C" + i + "F" + j);
                buttons[i][j].setWidth("80px");
                buttons[i][j].setHeight("80px");
                buttons[i][j].setText(" ");
                buttons[i][j].getStyle().set("font-size", "40px");
                buttons[i][j].addThemeVariants(ButtonVariant.LUMO_PRIMARY);
                buttons[i][j].addClickListener(event -> {                    
                    jugar(String.valueOf(event.getSource().getId().get()));
                });
                if (i == 0) {
                    h1.add(buttons[i][j]);
                }
                if (i == 1) {
                    h2.add(buttons[i][j]);
                }
                if (i == 2) {
                    h3.add(buttons[i][j]);
                }
            }
        }
        layout.add(btnInicio);
        layout.add(h1);
        layout.add(h2);
        layout.add(h3);
        layout.add(mensaje);
    }

   /**
    * La función "mostrarTablero" devuelve un objeto VerticalLayout.
    * 
    * @return Se devuelve un objeto VerticalLayout.
    */
    public VerticalLayout mostrarTablero() {
        return layout;
    }

    /**
     * La función "limpiarTablero" limpia el tablero de juego restableciendo el texto, estado y tema de
     * cada botón.
     */
    public void limpiarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setText("");
                tablero[i][j] = ESPACIO_VACIO;
                buttons[i][j].removeThemeVariants(ButtonVariant.LUMO_ERROR);
                buttons[i][j].removeThemeVariants(ButtonVariant.LUMO_SUCCESS);
                buttons[i][j].addThemeVariants(ButtonVariant.LUMO_PRIMARY);
            }
        }
    }
   
    /**
     * La función comprueba si una coordenada específica en una matriz de caracteres 2D está vacía.
     * 
     * @param y El parámetro y representa el índice de fila de la coordenada en el tablero.
     * @param x El parámetro x representa el índice de columna de la coordenada en el tablero.
     * @param tablero Una matriz de caracteres bidimensional que representa un tablero de juego.
     * @return El método devuelve un valor booleano.
     */
    private boolean coordenadasVacias(int y, int x, char[][] tablero) {
        return tablero[y][x] == ESPACIO_VACIO;
    }
   
    /**
     * La función `colocarPieza` coloca una pieza en un tablero de juego en las coordenadas
     * especificadas y actualiza la interfaz de usuario en consecuencia.
     * 
     * @param y El parámetro y representa el índice de fila de la celda donde se colocará la pieza en
     * el tablero.
     * @param x El parámetro x representa el índice de la columna de la celda donde se colocará la
     * pieza en el tablero.
     * @param pieza El parámetro "pieza" representa el valor del carácter de la pieza a colocar en el
     * tablero.
     * @param tablero El parámetro "tablero" es una matriz de caracteres bidimensional que representa
     * el tablero de juego. Se utiliza para almacenar el estado actual del tablero de juego, donde cada
     * celda puede contener un personaje que representa la pieza de un jugador o un espacio vacío.
     * @return El método devuelve un valor booleano.
     */
    private boolean colocarPieza(int y, int x, char pieza, char[][] tablero) {
        if (!coordenadasVacias(y, x, tablero)) {
            mensaje.setText("Celda ocupada");            
            return false;
        }
        tablero[y][x] = pieza;
        if (pieza == JUGADOR_O) {
            buttons[x][y].addThemeVariants(ButtonVariant.LUMO_ERROR);
        } else {
            buttons[x][y].addThemeVariants(ButtonVariant.LUMO_SUCCESS);
        }
        buttons[x][y].setText(String.valueOf(jugadorActual));
        return true;
    }

   /**
    * La función "contarHaciaArriba" cuenta el número de apariciones consecutivas de un carácter
    * específico en una columna de una matriz 2D, comenzando desde una posición determinada y avanzando
    * hacia arriba.
    * 
    * @param x El parámetro x representa el índice de la columna en el tablero donde comienza el
    * conteo.
    * @param y El parámetro "y" representa el índice de fila en el arreglo 2D "tablero" donde queremos
    * comenzar a contar hacia arriba.
    * @param jugador El parámetro "jugador" representa el personaje que representa a un jugador en el
    * juego.
    * @param tablero Una matriz de caracteres bidimensional que representa el tablero de juego.
    * @return El método devuelve el valor de la variable "contador", que representa el recuento de
    * apariciones consecutivas del carácter "jugador" en la columna especificada del array "tablero".
    */
    private int contarHaciaArriba(int x, int y, char jugador, char[][] tablero) {
        int yInicio = (y - CONTEO_PARA_GANAR >= 0) ? y - CONTEO_PARA_GANAR + 1 : 0;
        int contador = 0;
        for (; yInicio <= y; yInicio++) {
            if (tablero[yInicio][x] == jugador) {
                contador++;
            } else {
                contador = 0;
            }
        }
        return contador;
    }

    /**
     * La función cuenta el número de apariciones consecutivas de un personaje específico en una fila
     * en la dirección correcta en un tablero de juego.
     * 
     * @param x La coordenada x de la posición inicial para contar.
     * @param y El parámetro y representa el índice de fila en el tablero donde queremos comenzar a
     * contar hacia la derecha.
     * @param jugador El parámetro "jugador" representa el símbolo del personaje del jugador para el
     * cual estamos contando las ocurrencias consecutivas.
     * @param tablero Una matriz de caracteres bidimensional que representa el tablero de juego.
     * @return El método devuelve el valor de la variable "contador", que representa el recuento de
     * apariciones consecutivas del personaje del jugador en la dirección especificada.
     */
    private int contarHaciaDerecha(int x, int y, char jugador, char[][] tablero) {
        int xFin = (x + CONTEO_PARA_GANAR < COLUMNAS) ? x + CONTEO_PARA_GANAR - 1 : COLUMNAS - 1;
        int contador = 0;
        for (; x <= xFin; x++) {
            if (tablero[y][x] == jugador) {
                contador++;
            } else {
                contador = 0;
            }
        }
        return contador;
    }

   /**
    * La función `contarHaciaArribaDerecha` cuenta el número de apariciones de un carácter específico
    * en una línea diagonal que va hacia arriba y hacia la derecha en una matriz 2D.
    * 
    * @param x El parámetro x representa el índice de la columna inicial en el tablero de juego.
    * @param y El parámetro "y" representa el índice de fila en el arreglo 2D "tablero" donde comienza
    * el conteo.
    * @param jugador El parámetro "jugador" representa el carácter del jugador para el cual estamos
    * contando las ocurrencias consecutivas.
    * @param tablero El parámetro "tablero" es una matriz bidimensional de personajes que representan
    * el tablero de juego.
    * @return El método devuelve el valor de la variable "contador", que representa el recuento de
    * apariciones consecutivas del personaje del jugador en la dirección diagonal hacia arriba y hacia
    * la derecha.
    */
    private int contarHaciaArribaDerecha(int x, int y, char jugador, char[][] tablero) {
        int xFin = (x + CONTEO_PARA_GANAR < COLUMNAS) ? x + CONTEO_PARA_GANAR - 1 : COLUMNAS - 1;
        int yInicio = (y - CONTEO_PARA_GANAR >= 0) ? y - CONTEO_PARA_GANAR + 1 : 0;
        int contador = 0;
        while (x <= xFin && yInicio <= y) {
            if (tablero[y][x] == jugador) {
                contador++;
            } else {
                contador = 0;
            }
            x++;
            y--;
        }
        return contador;
    }

    /**
     * La función cuenta el número de apariciones consecutivas de un personaje específico en una línea
     * diagonal que va hacia abajo y hacia la derecha en un tablero de juego.
     * 
     * @param x La coordenada x de la posición inicial para contar.
     * @param y El parámetro "y" representa el índice de la fila inicial en la matriz 2D "tablero".
     * @param jugador El parámetro "jugador" representa el carácter del jugador en el juego. Se utiliza
     * para comprobar si la posición actual en el tablero pertenece al jugador o no.
     * @param tablero Una matriz de caracteres bidimensional que representa el tablero de juego.
     * @return El método devuelve el valor de la variable "contador", que representa el recuento de
     * apariciones consecutivas del personaje del jugador en la dirección diagonal hacia la parte
     * inferior derecha.
     */
    private int contarHaciaAbajoDerecha(int x, int y, char jugador, char[][] tablero) {
        int xFin = (x + CONTEO_PARA_GANAR < COLUMNAS) ? x + CONTEO_PARA_GANAR - 1 : COLUMNAS - 1;
        int yFin = (y + CONTEO_PARA_GANAR < FILAS) ? y + CONTEO_PARA_GANAR - 1 : FILAS - 1;
        int contador = 0;
        while (x <= xFin && y <= yFin) {
            if (tablero[y][x] == jugador) {
                contador++;
            } else {
                contador = 0;
            }
            x++;
            y++;
        }
        return contador;
    }
   
    /**
     * La función comprueba si un jugador ha ganado en un juego Connect Four contando el número de
     * piezas consecutivas en diferentes direcciones en el tablero de juego.
     * 
     * @param jugador La variable "jugador" representa el símbolo del jugador (ya sea 'X' u 'O') que
     * estamos comprobando para ganar.
     * @param tablero Una matriz bidimensional que representa el tablero de juego.
     * @return El método devuelve un valor booleano.
     */
    private boolean comprobarSiGana(char jugador, char[][] tablero) {
        int y;
        for (y = 0; y < FILAS; y++) {
            int x;
            for (x = 0; x < COLUMNAS; x++) {
                if (contarHaciaArriba(x, y, jugador, tablero) >= CONTEO_PARA_GANAR ||
                        contarHaciaDerecha(x, y, jugador, tablero) >= CONTEO_PARA_GANAR ||
                        contarHaciaArribaDerecha(x, y, jugador, tablero) >= CONTEO_PARA_GANAR ||
                        contarHaciaAbajoDerecha(x, y, jugador, tablero) >= CONTEO_PARA_GANAR) {
                    return true;
                }
            }
        }       
        return false;
    }
   
   /**
    * La función "oponenteDe" devuelve el jugador oponente dado el jugador actual en un juego.
    * 
    * @param jugador El parámetro "jugador" representa el jugador actual.
    * @return el oponente del jugador. Si el jugador es PLAYER_O, devuelve PLAYER_X. De lo contrario,
    * devuelve PLAYER_O.
    */
    private char oponenteDe(char jugador) {
        if (jugador == JUGADOR_O) {
            return JUGADOR_X;
        } else {
            return JUGADOR_O;
        }
    }
    
    /**
     * La función "empate" comprueba si el tablero de juego dado está empatado.
     * 
     * @param tableroOriginal Una matriz de caracteres bidimensional que representa el tablero de
     * juego.
     * @return El método devuelve un valor booleano.
     */
    private boolean empate(char[][] tableroOriginal) {
        int y;
        for (y = 0; y < FILAS; y++) {
            int x;
            for (x = 0; x < COLUMNAS; x++) {                
                if (tableroOriginal[y][x] == ESPACIO_VACIO) {
                    return false;
                }
            }
        }
        return true;
    }
    
   /**
    * La función "aleatorioEnRango" genera un número entero aleatorio dentro de un rango específico.
    * 
    * @param minimo El valor mínimo del rango a partir del cual se debe generar el número aleatorio.
    * @param maximo El parámetro "máximo" representa el valor máximo en el rango de números aleatorios
    * que desea generar.
    * @return El método devuelve un número entero aleatorio dentro del rango especificado.
    */
    private int aleatorioEnRango(int minimo, int maximo) {       
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }
    
   /**
    * La función "jugadorAleatorio" devuelve un carácter seleccionado aleatoriamente, ya sea 'O' o 'X'.
    * 
    * @return El método `jugadorAleatorio()` devuelve un valor de carácter. Devuelve el carácter
    * `JUGADOR_O` o el carácter `JUGADOR_X`.
    */
    private char jugadorAleatorio() {
        if (aleatorioEnRango(0, 1) == 0) {
            return JUGADOR_O;
        } else {
            return JUGADOR_X;
        }
    }

    /**
     * La función "iniciarJuego" inicializa el juego limpiando el tablero, estableciendo el estado del
     * juego en no terminado, seleccionando aleatoriamente un jugador para comenzar y mostrando un
     * mensaje indicando el turno del jugador actual.
     */
    public void iniciarJuego() {
        limpiarTablero();
        finJuego = false;
        jugadorActual = jugadorAleatorio();
        mensaje.setText(String.valueOf("Turno jugador: " + jugadorActual));
    }

    /**
     * La función "jugar" se utiliza para manejar la lógica de un juego, donde el jugador selecciona un
     * botón y se asignan las coordenadas correspondientes a las variables x e y.
     * 
     * @param btnSelect El parámetro `btnSelect` es una cadena que representa el botón seleccionado por
     * el jugador. Se utiliza para determinar las coordenadas (x, y) en el tablero de juego donde el
     * jugador quiere colocar su pieza. El formato de `btnSelect` es "CXFY", donde C representa la
     * columna y F representa la fila
     */
    private void jugar(String btnSelect) {
        if (!finJuego) {
            if (btnSelect.equals("C0F0")) {
                x = 0;
                y = 0;
            } else if (btnSelect.equals("C0F1")) {
                x = 0;
                y = 1;
            } else if (btnSelect.equals("C0F2")) {
                x = 0;
                y = 2;
            } else if (btnSelect.equals("C1F0")) {
                x = 1;
                y = 0;
            } else if (btnSelect.equals("C1F1")) {
                x = 1;
                y = 1;
            } else if (btnSelect.equals("C1F2")) {
                x = 1;
                y = 2;
            } else if (btnSelect.equals("C2F0")) {
                x = 2;
                y = 0;
            } else if (btnSelect.equals("C2F1")) {
                x = 2;
                y = 1;
            } else if (btnSelect.equals("C2F2")) {
                x = 2;
                y = 2;
            }
            if (colocarPieza(y, x, jugadorActual, tablero)) {
                finJuego = comprobarGanador();
                if (!finJuego) {
                    jugadorActual = oponenteDe(jugadorActual);
                    mensaje.setText(String.valueOf("Turno jugador: " + jugadorActual));
                }
            }
        }
    }

    /**
     * La función "comprobarGanador" comprueba si el jugador actual ha ganado la partida o si hay
     * empate.
     * 
     * @return El método devuelve un valor booleano.
     */
    private boolean comprobarGanador() {
        if (comprobarSiGana(jugadorActual, tablero)) {           
            mensaje.setText("El jugador " + String.valueOf(jugadorActual) + " gana");           
            return true;
        } else if (empate(tablero)) {           
            mensaje.setText("Empate");           
            return true;
        } else {
            return false;
        }
    }

}
