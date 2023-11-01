package com.example.application.views.grupo6;

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
import com.vaadin.flow.component.textfield.IntegerField;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

@PageTitle("Grupo 6")
@Route(value = "grupo-6", layout = MainLayout.class)
public class Grupo6View extends VerticalLayout {

    public Grupo6View() {
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
                "url(https://images.unsplash.com/photo-1589939705384-5185137a7f0f?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=2070&q=80)");

        H1 t1 = new H1("Grupo 6");
        H2 t2 = new H2("Construción");
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
                "https://firebasestorage.googleapis.com/v0/b/fotos-proyecto-bfc34.appspot.com/o/Fotos%2FFoto%20256x256%20Carla%20Zapata.png?alt=media&token=9231e37d-3c42-4158-a127-28660bd0f408&_gl=1*1orsqne*_ga*MTQ5NTE1NzQ3Ni4xNjk2MzQ0MDA1*_ga_CW55HF8NVT*MTY5NjM0NDAwNS4xLjEuMTY5NjM0NTk3Mi42MC4wLjA.");
        est1.put("name", "Carla Zapata");
        Map<String, String> est2 = new HashMap<>();
        est2.put("image",
                "https://firebasestorage.googleapis.com/v0/b/fotos-proyecto-bfc34.appspot.com/o/Fotos%2Ffoto_SebastianCasta%C3%B1o.png?alt=media&token=234f6ab3-731a-4e51-9ce3-f0652bb7fd6d&_gl=1*wyhirh*_ga*MTY3NDMzNDI5NC4xNjk0NTQ2MzEz*_ga_CW55HF8NVT*MTY5Njg2ODg1NS4xMi4xLjE2OTY4NjkwNzcuNDUuMC4w");
        est2.put("name", "Sebastian Castaño");
        Map<String, String> est3 = new HashMap<>();
        est3.put("image",
                "https://firebasestorage.googleapis.com/v0/b/fotos-proyecto-bfc34.appspot.com/o/Fotos%2FSebastian%20Garces.png?alt=media&token=5fe733b6-0c90-47f7-89bd-5c9ec2c3b9b6&_gl=1*11lmoir*_ga*MTY3NDMzNDI5NC4xNjk0NTQ2MzEz*_ga_CW55HF8NVT*MTY5Njg2ODg1NS4xMi4xLjE2OTY4NjkwNjIuNjAuMC4w");
        est3.put("name", "Sebastian Garces");

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
        titulo2 = "Calculadora de materiales para concreto según la resistencia y cantidad.";
        descripcion = "Esta calculadora proporciona la cantidad de materiales necesarios para un metraje exacto de concreto, con su respectiva resistencia en PSI.\r\n"
                + //
                "";
        gist = "<script src=\"https://gist.github.com/Sebaxtian18/45cacc82903f12c55db9a147e54e5843.js\"></script>";
        replit = "https://replit.com/@zsebax1994/Calculadora-de-materiales-para-concreto";
        diagrama = "https://firebasestorage.googleapis.com/v0/b/github-pages-7777b.appspot.com/o/Proyecto%20integrador%20logica%2F_Diagrama%20de%20flujo%20calculadora%20de%20materiales.png?alt=media&token=c3750946-2458-4bb8-b74d-de768726c10f";
        add(secciones.algoritmo(titulo1, titulo2, descripcion, algoritmo1(), gist, replit, diagrama));

    }

    public HorizontalLayout algoritmo1() {

        VerticalLayout vl1 = new VerticalLayout();
        vl1.setAlignItems(Alignment.CENTER);
        vl1.add(new Image(
                "https://firebasestorage.googleapis.com/v0/b/github-pages-7777b.appspot.com/o/Proyecto%20integrador%20logica%2Fconcreto1.jpg?alt=media&token=1e6c5845-cd38-4b58-b892-49f343f60df8",
                ""));

        VerticalLayout vl2 = new VerticalLayout();
        vl2.setAlignItems(Alignment.CENTER);

        HorizontalLayout hl = new HorizontalLayout();
        hl.setAlignItems(Alignment.CENTER);
        hl.setWidthFull();

        IntegerField resistencia = new IntegerField("Resistencia (psi)");
        IntegerField cantidad = new IntegerField("Cantidad (m^3)");
        Button calcular = new Button("Calcular ");
        H3 salida1 = new H3();
        H3 salida2 = new H3();
        H3 salida3 = new H3();
        H3 salida4 = new H3();
        H3 salida5 = new H3();
        H3 salida6 = new H3();
        H3 salida7 = new H3();

        calcular.addClickListener(event -> {
            int valorResistencia = resistencia.getValue();
            int valorCantidad = cantidad.getValue();
            int cemento3000psi = 195; // kg m^3
            int grava3000psi = 944; // kg m^3
            int arena3000psi = 1152; // kg m^3
            int agua3000psi = 180; // kg m^3
            int adictivo3000psi1 = 1653; // kg m^3
            int adictivo3000psi2 = 0; // kg m^3

            // Para la restencia de 4000psi
            int cemento4000psi = 239; // kg m^3
            int grava4000psi = 944; // kg m^3
            int arena4000psi = 1113; // kg m^3
            int agua4000psi = 180; // kg m^3
            int adictivo4000psi1 = 2025; // kg m^3
            int adictivo4000psi2 = 200; // kg m^3

            // Para la restencia de 5000psi
            int cemento5000psi = 268; // kg m^3
            int grava5000psi = 944; // kg m^3
            int arena5000psi = 1087; // kg m^3
            int agua5000psi = 180; // kg m^3
            int adictivo5000psi1 = 2273; // kg m^3
            int adictivo5000psi2 = 220; // kg m^3

            // Para la restencia de 6000psi
            int cemento6000psi = 305; // kg m^3
            int grava6000psi = 944; // kg m^3
            int arena6000psi = 1031; // kg m^3
            int agua6000psi = 180; // kg m^3
            int adictivo6000psi1 = 2584; // kg m^3
            int adictivo6000psi2 = 240; // kg m^3

            int cementoRequerido, gravaRequerida, arenaRequerida, aguaRequerida, adictivo1Requerido, adictivo2Requerido;

            if (valorResistencia == 3000) {
                cementoRequerido = cemento3000psi * valorCantidad;
                gravaRequerida = grava3000psi * valorCantidad;
                arenaRequerida = arena3000psi * valorCantidad;
                aguaRequerida = agua3000psi * valorCantidad;
                adictivo1Requerido = adictivo3000psi1 * valorCantidad;
                adictivo2Requerido = adictivo3000psi2 * valorCantidad;
            } else if (valorResistencia == 4000) {
                cementoRequerido = cemento4000psi * valorCantidad;
                gravaRequerida = grava4000psi * valorCantidad;
                arenaRequerida = arena4000psi * valorCantidad;
                aguaRequerida = agua4000psi * valorCantidad;
                adictivo1Requerido = adictivo4000psi1 * valorCantidad;
                adictivo2Requerido = adictivo4000psi2 * valorCantidad;
            } else if (valorResistencia == 5000) {
                cementoRequerido = cemento5000psi * valorCantidad;
                gravaRequerida = grava5000psi * valorCantidad;
                arenaRequerida = arena5000psi * valorCantidad;
                aguaRequerida = agua5000psi * valorCantidad;
                adictivo1Requerido = adictivo5000psi1 * valorCantidad;
                adictivo2Requerido = adictivo5000psi2 * valorCantidad;
            } else if (valorResistencia == 6000) {
                cementoRequerido = cemento6000psi * valorCantidad;
                gravaRequerida = grava6000psi * valorCantidad;
                arenaRequerida = arena6000psi * valorCantidad;
                aguaRequerida = agua6000psi * valorCantidad;
                adictivo1Requerido = adictivo6000psi1 * valorCantidad;
                adictivo2Requerido = adictivo6000psi2 * valorCantidad;
            } else {
                System.out.println(
                        "La resistencia ingresada no es valida. Recuerde que debe ser en miles de 3000 a 6000");
                return;
                // El return nos ayuda a guardar los datos y poder imprimirlos en pantalla
                // acontinuacion
            }
            salida1.setText("El material necesario para " + valorCantidad + "m^3 de concreto, con una resistencia de "
                    + valorResistencia + " psi es: ");
            salida2.setText("Cemento: " + cementoRequerido + "kg/m^3");
            salida3.setText("Grava: " + gravaRequerida + "kg/m^3");
            salida4.setText("Arena: " + arenaRequerida + "kg/m^3");
            salida5.setText("Agua: " + aguaRequerida + "kg/m^3");
            salida6.setText("Adictivo 1: " + adictivo1Requerido + "kg/m^3");
            salida7.setText("Adictivo 2: " + adictivo2Requerido + "kg/m^3");
        });
        vl2.add(new H3("Calculadora de materiales por metro cúbico de concreto."));
        vl2.add(resistencia);
        vl2.add(cantidad);
        vl2.add(calcular);
        vl2.add(salida1);
        vl2.add(salida2);
        vl2.add(salida3);
        vl2.add(salida4);
        vl2.add(salida5);
        vl2.add(salida6);
        vl2.add(salida7);
        hl.add(vl1);
        hl.add(vl2);
        return hl;
    }

}
