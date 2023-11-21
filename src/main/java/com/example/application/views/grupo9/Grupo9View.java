package com.example.application.views.grupo9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.application.views.MainLayout;
import com.example.application.views.Secciones;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
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

@PageTitle("Grupo 9")
@Route(value = "grupo-9", layout = MainLayout.class)
public class Grupo9View extends VerticalLayout {

    public Grupo9View() {
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
                "url(https://images.unsplash.com/photo-1588012832114-a464f4ab4802?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1776&q=80)");

        H1 t1 = new H1("Grupo 9");
        H2 t2 = new H2("Deporte");
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
                "https://firebasestorage.googleapis.com/v0/b/fotos-proyecto-bfc34.appspot.com/o/Fotos%2FSantiago%20Tamayo%20(1).png?alt=media&token=9b929996-cbc7-462a-89c8-6be5c2d15a05&_gl=1*4aqwi*_ga*MTQ5NTE1NzQ3Ni4xNjk2MzQ0MDA1*_ga_CW55HF8NVT*MTY5NjM0NDAwNS4xLjEuMTY5NjM0NjI2MC4zOS4wLjA.");
        est1.put("name", "santiago tamayo");
        Map<String, String> est2 = new HashMap<>();
        est2.put("image",
                "https://firebasestorage.googleapis.com/v0/b/fotos-proyecto-bfc34.appspot.com/o/Fotos%2Fimagen%20jorge%20uribe.png?alt=media&token=ee59bfcf-c3fd-4905-b1e5-c569f5d130ac&_gl=1*1rpi6x8*_ga*MTQ5NTE1NzQ3Ni4xNjk2MzQ0MDA1*_ga_CW55HF8NVT*MTY5NjM0NDAwNS4xLjEuMTY5NjM0NjIzOS42MC4wLjA.");
        est2.put("name", "jorge uribe");

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
        titulo2 = "Indice de grasa corporal";
        descripcion = "La grasa corporal; es la cantida Total de grasa que se distribuye por nuestro cuerpo. Se define como un porcentaje , que es  diferente para hombres y mujeres.:";
        gist = "<script src=\"https://gist.github.com/santi0804/4d4a7c1dc169fb6deb822eb93574a8b5.js\"></script>";
        replit = "https://replit.com/@SantiagoTamayo4/Algoritmo1#Main.java";
        diagrama = "https://firebasestorage.googleapis.com/v0/b/imagenes-e192b.appspot.com/o/diagrama%20de%20flujo-1.png?alt=media&token=e546629b-c9e6-460b-9866-5c46aa086711";
        add(secciones.algoritmo(titulo1, titulo2, descripcion, algoritmo1(), gist, replit, diagrama));

        

    }

    public HorizontalLayout algoritmo1() {

        VerticalLayout vl1 = new VerticalLayout();
        vl1.setAlignItems(Alignment.CENTER);
        vl1.add(new Image(
                "https://firebasestorage.googleapis.com/v0/b/imagenes-e192b.appspot.com/o/grasa%201.jpg?alt=media&token=1f886453-2579-44ed-a539-8db7461078b9",
                ""));

        VerticalLayout vl2 = new VerticalLayout();
        vl2.setAlignItems(Alignment.CENTER);

        HorizontalLayout hl = new HorizontalLayout();
        hl.setAlignItems(Alignment.CENTER);
        hl.setWidthFull();

        NumberField peso = new NumberField("Peso (kg)");
        NumberField altura = new NumberField("Altura (m)");
        IntegerField edad = new IntegerField("Edad");
        ComboBox<String> genero = new ComboBox<>("Género");
        genero.setAllowCustomValue(true);
        List<String> opcionesgenero = Arrays.asList("Hombre", "Mujer");
        genero.setItems(opcionesgenero);
        Button calcular = new Button("Calcular");
        H3 salida = new H3();

        calcular.addClickListener(event -> {
            double valorpeso = peso.getValue();
            double valoraltura = altura.getValue();
            int valoredad = edad.getValue();
            String valorgenero = genero.getValue();
            double imc = valorpeso / (valoraltura * 2);
            double grasacorporal;
            genero.setValue(valorgenero);

            if (valorgenero.equalsIgnoreCase("hombre")) {
                grasacorporal = (1.2 * imc) + (0.23 * valoredad) - 10.8 - 5.4;
            } else if (valorgenero.equalsIgnoreCase("mujer")) {
                grasacorporal = (1.2 * imc) + (0.23 * valoredad) - 5.4;

            } else {
                throw new IllegalArgumentException("Sexo no válido. Use 'M' para masculino o 'F' para femenino.");
            }
            salida.setText("Su grasa corporal es aproximadamente: " + grasacorporal + "%");

        });
        vl2.add(new H3("Calculadora grasa corporal"));
        vl2.add(peso);
        vl2.add(altura);
        vl2.add(edad);
        vl2.add(genero);
        vl2.add(calcular);
        vl2.add(salida);
        hl.add(vl1);
        hl.add(vl2);
        return hl;
    }
}
