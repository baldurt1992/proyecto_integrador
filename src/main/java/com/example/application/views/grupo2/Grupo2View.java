package com.example.application.views.grupo2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.example.application.views.MainLayout;
import com.example.application.views.Secciones;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Grupo 2")
@Route(value = "grupo-2", layout = MainLayout.class)
public class Grupo2View extends VerticalLayout {

    public Grupo2View() {
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
                "url(https://images.unsplash.com/photo-1635070040809-d434392ae756?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1887&q=80)");

        H1 t1 = new H1("Grupo 2");
        H2 t2 = new H2("Fisica");
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
        est1.put("image", "https://firebasestorage.googleapis.com/v0/b/fotos-proyecto-bfc34.appspot.com/o/Fotos%2FAngello%20Gomez.png?alt=media&token=e1bca8dd-d0fe-48a4-a596-260afe89240a&_gl=1*allqlf*_ga*MTQ5NTE1NzQ3Ni4xNjk2MzQ0MDA1*_ga_CW55HF8NVT*MTY5NjM0NDAwNS4xLjEuMTY5NjM0NTM3My42MC4wLjA.");
        est1.put("name", "Angello Gomez Monsalve");
        Map<String, String> est2 = new HashMap<>();
        est2.put("image", "https://firebasestorage.googleapis.com/v0/b/fotos-proyecto-bfc34.appspot.com/o/Fotos%2Fbrayan%20steven.png?alt=media&token=7f210c2b-105b-4d78-b884-7bb11d11b810&_gl=1*1ld106m*_ga*MTY3NDMzNDI5NC4xNjk0NTQ2MzEz*_ga_CW55HF8NVT*MTY5Njg2ODg1NS4xMi4xLjE2OTY4Njg5ODIuNjAuMC4w");
        est2.put("name", "Brayan Ortega");
        Map<String, String> est3 = new HashMap<>();
        est3.put("image", "https://firebasestorage.googleapis.com/v0/b/fotos-proyecto-bfc34.appspot.com/o/Fotos%2FAndr%C3%A9s%20Camilo%20Quintana.png?alt=media&token=36705d48-6898-4262-bc7e-eef1b5223883&_gl=1*dfg882*_ga*MTQ5NTE1NzQ3Ni4xNjk2MzQ0MDA1*_ga_CW55HF8NVT*MTY5NjM0NDAwNS4xLjEuMTY5NjM0NTQ0MS42MC4wLjA.");
        est3.put("name", "Andrés Camilo Quintana");

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
        titulo2 = "Calculadora de caida libre";
        descripcion = "Esta calculadora de caída libre permite determinar el tiempo de caída, la velocidad final y evaluar la letalidad de la caída de un coco a partir de una velocidad inicial y una altura especificadas.";
        gist = "<script src=\"https://gist.github.com/anggomezmo/29848b0e81602ab69f014868c513822d.js\"></script>\r\n";
        replit = "https://replit.com/@jhonvalencia3/ProyectoPrueba";
        diagrama = "https://firebasestorage.googleapis.com/v0/b/cesde-7fe22.appspot.com/o/Proyecto%20Integrador%2FDiagrama.svg?alt=media&token=e04cad73-fd1c-4972-a571-da1389d04689";
        add(secciones.algoritmo(titulo1, titulo2, descripcion, algoritmo1(), gist, replit, diagrama));



    }

    public HorizontalLayout algoritmo1() {


        VerticalLayout vl1 = new VerticalLayout();
        vl1.setAlignItems(Alignment.CENTER);
        vl1.add(new Image("https://cl.buscafs.com/www.levelup.com/public/uploads/images/93966.jpg", ""));


        VerticalLayout vl2 = new VerticalLayout();
        vl2.setAlignItems(Alignment.CENTER);


        VerticalLayout vl3 = new VerticalLayout();
        vl3.setAlignItems(Alignment.CENTER);


        HorizontalLayout hl = new HorizontalLayout();
        hl.setAlignItems(Alignment.CENTER);
        hl.setWidthFull();


        NumberField velocidadInicial = new NumberField("Velocidad Inicial (m/s)");
        NumberField altura = new NumberField("Altura (m)");
        Button calcular = new Button("Calcular");
        H3 tituloTiempo = new H3("Tiempo de caida");
        H4 resultTiempo = new H4("-");


        H3 tituloVelocidad = new H3("Velocidad final del coco");


        H4 resultVelocidad = new H4("-");


        H3 tituloLetalidad = new H3("Letalidad del coco");


        H4 resultLetalidad = new H4("-");


        calcular.addClickListener(event -> {


            DecimalFormat df = new DecimalFormat("#.00");
            double valorVelocidadInicial = velocidadInicial.getValue();
            double valorAltura = altura.getValue();
            double velFinal = Math.sqrt(Math.pow(valorVelocidadInicial, 2) + 2 * 9.8 * valorAltura);
            String velFormat = df.format(velFinal);
            double tiempo = Math.sqrt((2 * valorAltura) / 9.8);
            String tiempoFormat = df.format(tiempo);


            resultTiempo.setText(tiempoFormat + " Segundos");
            resultVelocidad.setText(String.valueOf(velFormat + " m/s"));
            if (velFinal >= 22) {
                resultLetalidad.setText("LETAL");
            } else {
                resultLetalidad.setText("NO LETAL");
            }


        });
        vl2.add(new H3("Calculadora de coco en caida libre"));
        vl2.add(velocidadInicial);
        vl2.add(altura);
        vl2.add(calcular);
        vl3.add(tituloTiempo);
        vl3.add(resultTiempo);
        vl3.add(tituloVelocidad);
        vl3.add(resultVelocidad);
        vl3.add(tituloLetalidad);
        vl3.add(resultLetalidad);


        hl.add(vl1);
        hl.add(vl2);
        hl.add(vl3);
        return hl;
    }


}


