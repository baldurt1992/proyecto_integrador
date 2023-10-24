package com.example.application.views.grupo4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.example.application.views.MainLayout;
import com.example.application.views.Secciones;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.notification.Notification;

@PageTitle("Grupo 4")
@Route(value = "grupo-4", layout = MainLayout.class)
public class Grupo4View extends VerticalLayout {

    public Grupo4View() {
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
                "url(https://images.unsplash.com/photo-1555680202-c86f0e12f086?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=2070&q=80)");

        H1 t1 = new H1("Grupo 4");
        H2 t2 = new H2("Juegos");
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
        est1.put("image", "https://firebasestorage.googleapis.com/v0/b/fotos-proyecto-bfc34.appspot.com/o/Fotos%2FJuan%20Manuel%20Isaza.png?alt=media&token=65c7854f-4595-45b4-8a40-dfa9430407f1&_gl=1*6gfprf*_ga*MTY3NDMzNDI5NC4xNjk0NTQ2MzEz*_ga_CW55HF8NVT*MTY5Njg2ODg1NS4xMi4xLjE2OTY4NjkwMTUuMjcuMC4w");
        est1.put("name", "Juan Manuel Isaza");
        Map<String, String> est2 = new HashMap<>();
        est2.put("image", "https://firebasestorage.googleapis.com/v0/b/fotos-proyecto-bfc34.appspot.com/o/Fotos%2FAna%20Mar%C3%ADa%20Ospina%20Duarte.png?alt=media&token=e2bf6ceb-2b20-4fa7-8b79-67fca2d1984e&_gl=1*taz2yi*_ga*MTQ5NTE1NzQ3Ni4xNjk2MzQ0MDA1*_ga_CW55HF8NVT*MTY5NjM0NDAwNS4xLjEuMTY5NjM0NjM4Ny41MC4wLjA.");
        est2.put("name", "Ana María Ospina");

        users.add(est1);
        users.add(est2);
        add(secciones.students(users));

        String titulo1;
        String titulo2;
        String descripcion;
        String gist;
        String replit;
        String diagrama;

        // Algoritmo1
        titulo1 = "Algoritmo 1";
        titulo2 = "Adivina el número";
        descripcion = "Descripción: Juego para que intentes adivinar el número que está pensando la máquina.";
        gist = "<script src=\\\"https://gist.github.com/JuanGomezZz0/fe7210a13bcbaa5dd449bbb058dc74c4\\\"></script>" + //
                "";
        replit = "https://replit.com/@JuanIsaza/AdivinaNumero";
        diagrama = "https://firebasestorage.googleapis.com/v0/b/adivina-b2f41.appspot.com/o/code2flow_GFMARk%20(1).png?alt=media&token=eec7f2be-dd58-49f8-98cc-bee3e080d76d&_gl=1*pjfvsq*_ga*OTY1OTU1NTU1LjE2OTc1NTM5ODc.*_ga_CW55HF8NVT*MTY5NzU1Mzk4Ny4xLjEuMTY5NzU1NDE1OS41MC4wLjA";
        add(secciones.algoritmo(titulo1, titulo2, descripcion, algoritmo1(), gist, replit, diagrama));

    }

    private int numeroAdivinar;
    private int intentos;
    private TextField textField;
    private Button adivinarButton;
   
/**
     * @return
     */
    public HorizontalLayout algoritmo1() {
       
       
        VerticalLayout vl1 = new VerticalLayout();
        vl1.setAlignItems(Alignment.CENTER);
        vl1.add(new Image("https://m.media-amazon.com/images/I/51848OMGGeL.png", ""));


        VerticalLayout vl2 = new VerticalLayout();
        vl2.setAlignItems(Alignment.CENTER);


        HorizontalLayout hl = new HorizontalLayout();
        hl.setAlignItems(Alignment.CENTER);
        hl.setWidthFull();


        Random rand = new Random();
        numeroAdivinar = rand.nextInt(100) + 1;
        intentos = 0;


        textField = new TextField("Suposición:");
        adivinarButton = new Button("Adivinar");


        adivinarButton.addClickListener(event -> {
            intentos++;
            int suposicion = Integer.parseInt(textField.getValue());
            if (suposicion < numeroAdivinar) {
                Notification.show("El número es mayor. Intenta de nuevo.");
            } else if (suposicion > numeroAdivinar) {
                Notification.show("El número es menor. Intenta de nuevo.");
            } else {
                Notification.show("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
                textField.setEnabled(false);
                adivinarButton.setEnabled(false);
            }
        });


        vl2.add(new H3("¿Puedes adivinar el número?"));
        vl2.add(textField);
        vl2.add(adivinarButton);
        vl2.add();
        hl.add(vl1);
        hl.add(vl2);
        return hl;
    }

}
