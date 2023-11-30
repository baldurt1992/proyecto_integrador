package com.example.application.views.grupo7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.application.views.MainLayout;
import com.example.application.views.Secciones;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.grid.Grid;

@PageTitle("Grupo 7")
@Route(value = "grupo-7", layout = MainLayout.class)
public class Grupo7View extends VerticalLayout {

        private H3 salida = new H3();

        public Grupo7View() {
                setAlignItems(Alignment.CENTER);
                setSizeFull();

                VerticalLayout vl = new VerticalLayout();
                vl.setJustifyContentMode(JustifyContentMode.CENTER);
                vl.setAlignItems(Alignment.CENTER);
                vl.setWidthFull();
                vl.setHeight("300px");
                vl.setMinHeight("300px");
                vl.scrollIntoView();

                vl.getStyle().set("background-position", "center");
                vl.getStyle().set("background-repeat", "no-repeat");
                vl.getStyle().set("background-size", "cover");
                vl.getStyle().set("background",
                                "url(https://topmanagement.com.mx/wp-content/uploads/2020/10/PWC-Entretenimiento-620x350.jpg)");

                H1 t1 = new H1("Grupo 7");
                H2 t2 = new H2("Entretenimiento");
                t1.getStyle().set("color", "white");
                t2.getStyle().set("color", "white");
                t1.getStyle().set("color", "white");
                t2.getStyle().set("color", "white");
                t1.getStyle().set("text-shadow", "#000 3px 0 15px");
                t2.getStyle().set("text-shadow", "#000 3px 0 15px");
                vl.add(t1);
                vl.add(t2);
                vl.add(new Hr());

                add(vl);
                Secciones secciones = new Secciones();
                ArrayList<Map<String, String>> users = new ArrayList<>();

                // Integrantes
                Map<String, String> est1 = new HashMap<>();
                est1.put("image",
                                "https://firebasestorage.googleapis.com/v0/b/fotos-proyecto-bfc34.appspot.com/o/Fotos%2FAlejandra%20Tamayo%20Hernandez.png?alt=media&token=ee5cf90c-6c41-4b49-9648-035b4374fa0b&_gl=1*1pyyin4*_ga*MTQ5NTE1NzQ3Ni4xNjk2MzQ0MDA1*_ga_CW55HF8NVT*MTY5NjM0NDAwNS4xLjEuMTY5NjM0NjA1Ny42MC4wLjA.");
                est1.put("name", "Alejandra Tamayo Hernandez");
                Map<String, String> est2 = new HashMap<>();
                est2.put("image",
                                "https://firebasestorage.googleapis.com/v0/b/fotos-proyecto-bfc34.appspot.com/o/Fotos%2FManuelaOrlas.png?alt=media&token=3fcebe16-d1ca-492d-9f15-907d6a46adae&_gl=1*16g32bf*_ga*MTQ5NTE1NzQ3Ni4xNjk2MzQ0MDA1*_ga_CW55HF8NVT*MTY5NjM0NDAwNS4xLjEuMTY5NjM0NjA4MC4zNy4wLjA.");
                est2.put("name", "Manuela Orlas Rengifo");
                Map<String, String> est3 = new HashMap<>();
                est3.put("image",
                                "https://firebasestorage.googleapis.com/v0/b/fotos-proyecto-bfc34.appspot.com/o/Mariana%20Garzon%20Guerra.png?alt=media&token=d49badd4-d1dd-477b-9993-0f4939bc7285&_gl=1*1m6ykil*_ga*MTQ5NTE1NzQ3Ni4xNjk2MzQ0MDA1*_ga_CW55HF8NVT*MTY5NzU1Mzg5OS40LjEuMTY5NzU1NDA0Ny41MC4wLjA.");
                est3.put("name", "Mariana Garzon Guerra");

                users.add(est1);
                users.add(est2);
                users.add(est3);
                add(secciones.students(users));

                String titulo1;
                String titulo2;
                String descripcion;
                String gist;
                String replit;
                String diagrama;

                // Algoritmo1
                titulo1 = "Algoritmo 1";
                titulo2 = "Triqui";
                descripcion = "Disfruta de este clásico juego.";
                gist = "<script src=\"https://gist.github.com/jfinfocesde/e2da562bb64be1b54f461de2cd5c001d.js\"></script>";
                replit = "https://replit.com/@jhonvalencia3/ProyectoPrueba";
                diagrama = "https://firebasestorage.googleapis.com/v0/b/njj-88377.appspot.com/o/cesde%2FImagen%20de%20WhatsApp%202023-11-29%20a%20las%2022.49.59_99e85342.jpg?alt=media&token=dc33ff09-a22f-48aa-af00-d244356c8aef ";
                add(secciones.algoritmo(titulo1, titulo2, descripcion, algoritmo1(), gist, replit, diagrama));

                // Algoritmo2
                titulo1 = "Algoritmo 2";
                titulo2 = "Adivina la palabra";
                descripcion = "En este juego daremos una lista de letras con la que el jugador debe ir conformando palabras";
                gist = "<script src=\"https://gist.github.com/marigarzon/118de00cdc14cf126581202a5af90740.js\"></script>";
                replit = "https://replit.com/@MarianaGarzon4/WelcomeEmptyEllipses#Main.java";
                diagrama = "https://firebasestorage.googleapis.com/v0/b/imagenes-4518a.appspot.com/o/WhatsApp%20Image%202023-11-19%20at%208.42.42%20PM.jpeg?alt=media&token=4810e6f9-7543-40f1-8eb6-4d675d330de5";
                add(secciones.algoritmo(titulo1, titulo2, descripcion, algoritmo2(), gist, replit, diagrama));

        }

        // Modos de juego
        final int JUGADOR_JUGADOR = 1;
        final int JUGADOR_CPU = 2;
        final int CPU_CPU = 3;

        public HorizontalLayout algoritmo1() {

                VerticalLayout vl1 = new VerticalLayout();
                vl1.setAlignItems(Alignment.CENTER);
                vl1.add(new Image(
                                "https://firebasestorage.googleapis.com/v0/b/fotogit-b823c.appspot.com/o/8605_juego_didactico_triqui_-fotor-20231024145029.jpg?alt=media&token=c7915a80-2a91-44e1-acc6-2976fab45bf8&_gl=1*1ml1re*_ga*MTY3NDMzNDI5NC4xNjk0NTQ2MzEz*_ga_CW55HF8NVT*MTY5ODE3NjkwNC4yMC4xLjE2OTgxNzcwNDcuNDkuMC4w",
                                ""));

                VerticalLayout vl2 = new VerticalLayout();
                vl2.setAlignItems(Alignment.CENTER);

                HorizontalLayout hl = new HorizontalLayout();
                hl.setAlignItems(Alignment.CENTER);
                hl.setWidthFull();

                Triqui triqui = new Triqui();

                vl2.add(triqui.mostrarTablero());
                hl.add(vl1);
                hl.add(vl2);
                return hl;
        }

        String palabraUsuario = "";
        H3 palabraIngresada = new H3("");
        H3 mensajeResultado = new H3("");

        public HorizontalLayout algoritmo2() {

                List<String> palabrasValidas = Arrays.asList("barro", "rosa", "mato", "barra", "ramo", "oso", "sorbo",
                                "mar", "bota", "marro", "broma", "baston", "tramo", "marta", "mastro");
                List<Character> listaLetras = new ArrayList<>(Arrays.asList('b', 'r', 's', 't', 'm', 'a', 'o'));
                VerticalLayout vl1 = new VerticalLayout();
                vl1.setAlignItems(Alignment.CENTER);
                vl1.add(new Image(
                                "https://firebasestorage.googleapis.com/v0/b/fotogit-b823c.appspot.com/o/x1080-fotor-2023112922457.jpg?alt=media&token=b09879ec-5d6c-4719-a853-7f1303dcd486",
                                ""));

                VerticalLayout vl2 = new VerticalLayout();
                vl2.setAlignItems(Alignment.CENTER);

                HorizontalLayout hl = new HorizontalLayout();
                hl.setAlignItems(Alignment.CENTER);
                hl.setWidthFull();

                HorizontalLayout hbtn1 = new HorizontalLayout();
                hl.setAlignItems(Alignment.CENTER);
                hl.setWidthFull();
                HorizontalLayout hbtn2 = new HorizontalLayout();
                hl.setAlignItems(Alignment.CENTER);
                hl.setWidthFull();

                Button btnLetra1 = new Button("B");
                Button btnLetra2 = new Button("R");
                Button btnLetra3 = new Button("S");
                Button btnLetra4 = new Button("T");
                Button btnLetra5 = new Button("M");
                Button btnLetra6 = new Button("A");
                Button btnLetra7 = new Button("O");

                Button btnBorrar = new Button("Borrar");
                Button btnValidar = new Button("Validar");

                btnLetra1.addClickListener(event -> {
                        palabraUsuario += "b";
                        palabraIngresada.setText(palabraUsuario);
                });
                btnLetra2.addClickListener(event -> {
                        palabraUsuario += "r";
                        palabraIngresada.setText(palabraUsuario);
                });
                btnLetra3.addClickListener(event -> {
                        palabraUsuario += "s";
                        palabraIngresada.setText(palabraUsuario);
                });
                btnLetra4.addClickListener(event -> {
                        palabraUsuario += "t";
                        palabraIngresada.setText(palabraUsuario);
                });
                btnLetra5.addClickListener(event -> {
                        palabraUsuario += "m";
                        palabraIngresada.setText(palabraUsuario);
                });
                btnLetra6.addClickListener(event -> {
                        palabraUsuario += "a";
                        palabraIngresada.setText(palabraUsuario);
                });
                btnLetra7.addClickListener(event -> {
                        palabraUsuario += "o";
                        palabraIngresada.setText(palabraUsuario);
                });
                btnBorrar.addClickListener(event -> {
                        palabraUsuario = "";
                        palabraIngresada.setText("");
                        mensajeResultado.setText("");
                });

                btnValidar.addClickListener(event -> {
                        if (esPalabraValida(palabraUsuario, listaLetras) && palabrasValidas.contains(palabraUsuario)) {
                                mensajeResultado.setText("¡Palabra válida!");
                        } else {
                                mensajeResultado.setText("Palabra no válida. Intenta nuevamente.");
                        }
                });

                hbtn1.add(btnLetra1);
                hbtn1.add(btnLetra2);
                hbtn1.add(btnLetra3);
                hbtn1.add(btnLetra4);
                hbtn2.add(btnLetra5);
                hbtn2.add(btnLetra6);
                hbtn2.add(btnLetra7);
                vl2.add(hbtn1);
                vl2.add(hbtn2);
                vl2.add(palabraIngresada);
                vl2.add(btnValidar);
                vl2.add(btnBorrar);
                vl2.add(mensajeResultado);

                hl.add(vl1);
                hl.add(vl2);
                return hl;
        }

        private boolean esPalabraValida(String palabra, List<Character> letrasDisponibles) {
                // verificar si cada letra de la palabra esta en la lista de letras
                for (char listaLetras : palabra.toCharArray()) {
                        if (!letrasDisponibles.contains(listaLetras)) {
                                return false;
                        }
                }
                // la palabra es valida solo si tiene las letras que estan en la lista
                return true;
        }

}