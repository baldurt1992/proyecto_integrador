package com.example.application.views.grupo8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.application.views.MainLayout;
import com.example.application.views.Secciones;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.H6;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Grupo 8")
@Route(value = "grupo-8", layout = MainLayout.class)
public class Grupo8View extends VerticalLayout {

    public Grupo8View() {
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
                "url(https://images.unsplash.com/photo-1584291527908-033f4d6542c8?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1925&q=80)");

        H1 t1 = new H1("Grupo 8");
        H2 t2 = new H2("Estadística");
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
                "https://firebasestorage.googleapis.com/v0/b/fotos-proyecto-bfc34.appspot.com/o/Fotos%2FStiven%20Rojas%20Martinez%20-%20Grupo%208.png?alt=media&token=82c3be0d-f032-4043-9975-1666dafcf29d&_gl=1*147388c*_ga*MTY3NDMzNDI5NC4xNjk0NTQ2MzEz*_ga_CW55HF8NVT*MTY5Njg2ODg1NS4xMi4xLjE2OTY4NjkxMDQuMTguMC4w");
        est1.put("name", "Stiven Rojas Martinez");
        Map<String, String> est2 = new HashMap<>();
        est2.put("image",
                "https://firebasestorage.googleapis.com/v0/b/fotos-proyecto-bfc34.appspot.com/o/Fotos%2FJuan%20Miguel%20G%C3%B3mez.png?alt=media&token=1bbe6da3-e5db-4424-9e4e-55c324fa8329&_gl=1*18iuyys*_ga*MTQ5NTE1NzQ3Ni4xNjk2MzQ0MDA1*_ga_CW55HF8NVT*MTY5NjM0NDAwNS4xLjEuMTY5NjM0NjE1Ni42MC4wLjA.");
        est2.put("name", "Juan Miguel Gomez");

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
        titulo2 = "Calculadora de estadística";
        descripcion = "El cálculo estadístico sirve para realizar cálculos estadísticos con los datos que introduce en el editor de estadística. Si presiona la tecla mientras se muestra el editor de estadística, se cambia a la pantalla de cálculo estadístico.:";
        gist = "<script src=\"https://gist.github.com/baldurt1992/d88199263459fdbe65d510d484e3b23f.js\"></script>";
        replit = " https://replit.com/@Juan-MiguelM162/Estadistica#Main.java";
        diagrama = "https://firebasestorage.googleapis.com/v0/b/foto-49861.appspot.com/o/code2flow_Hk936E%20(1).png?alt=media&token=3da58480-1aa8-44d3-baec-1f9407ca89d6";
        add(secciones.algoritmo(titulo1, titulo2, descripcion, algoritmo1(), gist, replit, diagrama));

        // Algoritmo2
        titulo1 = "Algoritmo 2";
        titulo2 = "Calcular la mediana";
        descripcion = "cómo podría funcionar una calculadora de mediana : Entrada de Datos, Ordenamiento de Datos, Cálculo de la Mediana, Visualización del Resultado.";
        gist = "<script src=\"https://gist.github.com/stiven2k/64331539df4c7b1e2048247e48fe35a0.js\"></script>";
        replit = "https://replit.com/@StevenMartine31/ColorfulMicroMemwatch#Main.java";
        diagrama = "https://firebasestorage.googleapis.com/v0/b/foto-49861.appspot.com/o/code2flow_Hk936E.png?alt=media&token=d641eaeb-f733-4452-85dd-c686ea75dc74";
        add(secciones.algoritmo(titulo1, titulo2, descripcion, algoritmo2(), gist, replit, diagrama));

    }

    int modo = 0;
    double cantidadNumeros;
    double suma = 0;
    double promedio;
    double maximo = Double.MIN_VALUE;
    double minimo = Double.MAX_VALUE;

    public HorizontalLayout algoritmo1() {

        VerticalLayout vl1 = new VerticalLayout();
        vl1.setAlignItems(Alignment.CENTER);
        vl1.add(new Image(
                "https://firebasestorage.googleapis.com/v0/b/fotos-proyecto-bfc34.appspot.com/o/1.jpg?alt=media&token=61504639-c4b0-45af-b978-bc2e7ff8f3d9",
                ""));

        VerticalLayout vl2 = new VerticalLayout();
        vl2.setAlignItems(Alignment.CENTER);

        HorizontalLayout hl = new HorizontalLayout();
        hl.setAlignItems(Alignment.CENTER);
        hl.setWidthFull();

        NumberField datoEntrada = new NumberField("");
        datoEntrada.setVisible(false);
        Button btnGeneral = new Button("Iniciar Proceso");

        H4 mensaje1 = new H4("");

        H6 resultado1 = new H6("");
        H6 resultado2 = new H6("");
        H6 resultado3 = new H6("");
        H6 resultado4 = new H6("");
        H6 resultado5 = new H6("");

        btnGeneral.addClickListener(event -> {
            modo++;
            if (modo == 1) {
                mensaje1.setText("Ingrese la cantidad de números que desea procesar:");
                datoEntrada.setVisible(true);
            }
            if (modo == 2) {
                cantidadNumeros = datoEntrada.getValue().doubleValue();
                datoEntrada.setValue(null);
                mensaje1.setText("Ingrese el número 1");
                btnGeneral.setText("Ingresar");
            }

            if (modo > 2) {
                if ((modo - 2) < cantidadNumeros) {

                    double numero = datoEntrada.getValue().doubleValue();
                    suma += numero;

                    if (numero > maximo) {
                        maximo = numero;
                    }

                    if (numero < minimo) {
                        minimo = numero;
                    }
                    mensaje1.setText("Ingrese el número " + String.valueOf((modo - 1)));
                    datoEntrada.setValue(null);
                } else {
                    if (cantidadNumeros > 0) {
                        promedio = suma / cantidadNumeros;
                        resultado1.setText("Resultados:");
                        resultado2.setText("Suma: " + String.valueOf(suma));
                        resultado3.setText("Promedio: " + String.valueOf(promedio));
                        resultado4.setText("Valor Máximo: " + String.valueOf(maximo));
                        resultado5.setText("Valor Mínimo: " + String.valueOf(minimo));
                        modo = 0;
                    } else {
                        System.out.println("No se ingresaron números.");
                    }
                }

            }

        });
        vl2.add(new H3("Calculadora estadística"));
        vl2.add(mensaje1);
        vl2.add(datoEntrada);
        vl2.add(btnGeneral);
        vl2.add(resultado1);
        vl2.add(resultado2);
        vl2.add(resultado3);
        vl2.add(resultado4);
        vl2.add(resultado5);

        hl.add(vl1);
        hl.add(vl2);
        return hl;
    }

    public HorizontalLayout algoritmo2() {
        VerticalLayout vl1 = new VerticalLayout();
        vl1.setAlignItems(Alignment.CENTER);
        vl1.add(new Image(
                "https://firebasestorage.googleapis.com/v0/b/fotogit-b823c.appspot.com/o/pngtree-hs-electives-sociology-subject-for-high-school-9th-grade-concepts-in-picture-image_1443135-fotor-20231129224025.png?alt=media&token=a8989e16-6765-4800-b3c1-a10874fb1fc2",
                ""));

        VerticalLayout vl2 = new VerticalLayout();
        vl2.setAlignItems(Alignment.CENTER);

        HorizontalLayout hl = new HorizontalLayout();
        hl.setAlignItems(Alignment.CENTER);
        hl.setWidthFull();

        NumberField datoEntrada = new NumberField("¿Cuántos números vas a calcular?");
        datoEntrada.setVisible(false);
        Button btnGeneral = new Button("Calcular mediana");

        H4 mensaje1 = new H4("");
        H6 resultado1 = new H6("");
        H6 resultado2 = new H6("");

        List<Double> numerosIngresados = new ArrayList<>();

        btnGeneral.addClickListener(event -> {
            modo++;
            if (modo == 1) {
                mensaje1.setText("Ingrese la cantidad de números que desea procesar:");
                datoEntrada.setVisible(true);
            } else if (modo == 2) {
                cantidadNumeros = datoEntrada.getValue().doubleValue();
                datoEntrada.setValue(null);
                mensaje1.setText("Ingrese el número 1");
                btnGeneral.setText("Ingresar");
            } else if (modo > 2 && (modo - 2) <= cantidadNumeros) {
                double numero = datoEntrada.getValue().doubleValue();
                numerosIngresados.add(numero);
                suma += numero;
                mensaje1.setText("Ingrese el número " + String.valueOf((modo - 1)));
                datoEntrada.setValue(null);
            } else if (modo > 2 && (modo - 2) > cantidadNumeros) {
                if (!numerosIngresados.isEmpty()) {
                    Collections.sort(numerosIngresados);
                    int longitud = numerosIngresados.size();
                    if (longitud % 2 == 0) {
                        int medio1 = longitud / 2 - 1;
                        int medio2 = longitud / 2;
                        double mediana = (numerosIngresados.get(medio1) + numerosIngresados.get(medio2)) / 2.0;
                        resultado1.setText("Resultados:");
                        resultado2.setText("Mediana: " + String.valueOf(mediana));
                    } else {
                        int medio = longitud / 2;
                        double mediana = numerosIngresados.get(medio);
                        resultado1.setText("Resultados:");
                        resultado2.setText("Mediana: " + String.valueOf(mediana));
                    }
                    modo = 0;
                } else {
                    mensaje1.setText("No se ingresaron números.");
                }
            }
        });

        vl2.add(new H3("Calcular la mediana"));
        vl2.add(mensaje1);
        vl2.add(datoEntrada);
        vl2.add(btnGeneral);
        vl2.add(resultado1);
        vl2.add(resultado2);

        hl.add(vl1);
        hl.add(vl2);
        return hl;
    }

}
