package com.example.application.views.grupo7;

import java.util.ArrayList;
import java.util.HashMap;
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
        titulo2 = "Calculadora Índice de Masa Corporal (IMC)";
        descripcion = "El Índice de Masa Corporal (IMC) es una medida utilizada para evaluar si una persona tiene un peso saludable en relación con su altura. Se calcula dividiendo el peso de una persona en kilogramos por el cuadrado de su altura en metros. La fórmula básica del IMC es la siguiente:";
        gist = "<script src=\"https://gist.github.com/jfinfocesde/e2da562bb64be1b54f461de2cd5c001d.js\"></script>";
        replit = "https://replit.com/@jhonvalencia3/ProyectoPrueba";
        diagrama = "https://firebasestorage.googleapis.com/v0/b/cesde-7fe22.appspot.com/o/Proyecto%20Integrador%2FDiagrama.svg?alt=media&token=e04cad73-fd1c-4972-a571-da1389d04689";
        add(secciones.algoritmo(titulo1, titulo2, descripcion, algoritmo1(), gist, replit, diagrama));

    }

    private static final int JUGADOR_JUGADOR = 1;
    private static final int JUGADOR_CPU = 2;
    private static final int CPU_CPU = 3;
    private StringBuilder[][] board = new StringBuilder[3][3];
    private boolean xTurn = true;

    public HorizontalLayout algoritmo1() {

        VerticalLayout vl1 = new VerticalLayout();
        vl1.setAlignItems(Alignment.CENTER);
        vl1.add(new Image(
                "https://firebasestorage.googleapis.com/v0/b/fotogit-b823c.appspot.com/o/8605_juego_didactico_triqui_-fotor-20231024145029.jpg?alt=media&token=c7915a80-2a91-44e1-acc6-2976fab45bf8&_gl=1*1ml1re*_ga*MTY3NDMzNDI5NC4xNjk0NTQ2MzEz*_ga_CW55HF8NVT*MTY5ODE3NjkwNC4yMC4xLjE2OTgxNzcwNDcuNDkuMC4w",
                ""));
        VerticalLayout vl2 = new VerticalLayout();
        vl2.setAlignItems(Alignment.CENTER);
        VerticalLayout vl3 = new VerticalLayout();
        vl3.setAlignItems(Alignment.CENTER);

        HorizontalLayout hl = new HorizontalLayout();
        hl.setAlignItems(Alignment.CENTER);
        hl.setWidthFull();

        HorizontalLayout optionsLayout = new HorizontalLayout();
        Button playerVsPlayerButton = new Button("Jugador vs Jugador");
        Button playerVsCpuButton = new Button("Jugador vs CPU");
        Button cpuVsCpuButton = new Button("CPU vs CPU");

        VerticalLayout gridLayout = new VerticalLayout();
        gridLayout.setWidth("300px");
        gridLayout.setHeight("300px");
        gridLayout.setJustifyContentMode(JustifyContentMode.CENTER);

        for (int i = 0; i < 3; i++) {
            HorizontalLayout row = new HorizontalLayout();
            for (int j = 0; j < 3; j++) {
                Button button = new Button();
                button.setWidth("100px");
                button.setHeight("100px");
                // Agrega aquí la lógica de manejo de eventos para el botón
                row.add(button);
            }
            gridLayout.add(row);
        }

        ;

        playerVsPlayerButton.addClickListener(e -> {
            iniciarJuego(JUGADOR_JUGADOR);
        });

        playerVsCpuButton.addClickListener(e -> {
            iniciarJuego(JUGADOR_CPU);
        });

        cpuVsCpuButton.addClickListener(e -> {
            iniciarJuego(CPU_CPU);
        });

        optionsLayout.add(playerVsPlayerButton, playerVsCpuButton, cpuVsCpuButton);

        HorizontalLayout layout = new HorizontalLayout();
        layout.add(optionsLayout);

        vl2.add(new H3("Triqui"));
        vl2.add(optionsLayout);
        vl2.add(playerVsCpuButton);
        vl2.add(playerVsPlayerButton);
        vl2.add(cpuVsCpuButton);
        vl3.add(gridLayout);
        hl.add(vl1);
        hl.add(vl2);
        hl.add(vl3);
        layout.add(hl);
        layout.add(vl2);
        layout.add(vl3);
        return layout;
    }

    public void iniciarJuego(int modoJuego) {
        limpiarTablero();
        salida.setText("");

        switch (modoJuego) {
            case JUGADOR_JUGADOR:
                // Lógica para jugador vs jugador
                Notification.show("Modo Jugador vs Jugador seleccionado.");
                break;
            case JUGADOR_CPU:
                // Lógica para jugador vs CPU
                Notification.show("Modo Jugador vs CPU seleccionado.");
                break;
            case CPU_CPU:
                // Lógica para CPU vs CPU
                Notification.show("Modo CPU vs CPU seleccionado.");
                break;
            default:
                break;
        }
    }

    private void limpiarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = new StringBuilder(" ");
            }
        }

    }
}