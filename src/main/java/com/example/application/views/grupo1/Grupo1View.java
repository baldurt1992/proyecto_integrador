package com.example.application.views.grupo1;

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

@PageTitle("Grupo 1")
@Route(value = "grupo-1", layout = MainLayout.class)
public class Grupo1View extends VerticalLayout {

    public Grupo1View() {

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
                "url(https://images.unsplash.com/photo-1590333748338-d629e4564ad9?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1898&q=80)");

        H1 t1 = new H1("Grupo 1");
        H2 t2 = new H2("Algoritmos Deportes y Salud");
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
        est1.put("image", "https://firebasestorage.googleapis.com/v0/b/fotos-proyecto-bfc34.appspot.com/o/Fotos%2FBaldur%202-fotor-2023092613481.png?alt=media&token=7074c54a-9223-40d9-be3c-079af1eb631c&_gl=1*htidj1*_ga*MTQ5NTE1NzQ3Ni4xNjk2MzQ0MDA1*_ga_CW55HF8NVT*MTY5NjM0NDAwNS4xLjEuMTY5NjM0NTE5Ni45LjAuMA..");
        est1.put("name", "Andrés Baldur Tamayo");
        Map<String, String> est2 = new HashMap<>();
        est2.put("image", "https://firebasestorage.googleapis.com/v0/b/fotos-proyecto-bfc34.appspot.com/o/Fotos%2FEdison%20Mart%C3%ADnez%20Osorio.png?alt=media&token=6791f7ec-5e02-4f02-aa0d-c47a44b993ff&_gl=1*xnv67*_ga*MTQ5NTE1NzQ3Ni4xNjk2MzQ0MDA1*_ga_CW55HF8NVT*MTY5NjM0NDAwNS4xLjEuMTY5NjM0NTIxMi42MC4wLjA.");
        est2.put("name", "Edison Martínez Osorio");
        Map<String, String> est3 = new HashMap<>();
        est3.put("image", "https://firebasestorage.googleapis.com/v0/b/fotos-proyecto-bfc34.appspot.com/o/Fotos%2FDuber%20%20Carmona-fotor-2023100393639.png?alt=media&token=eb0de2b9-41b8-4fd9-bb7e-3c2db9ac29a1&_gl=1*1s63mq7*_ga*MTQ5NTE1NzQ3Ni4xNjk2MzQ0MDA1*_ga_CW55HF8NVT*MTY5NjM0NDAwNS4xLjEuMTY5NjM0NTIyMi41MC4wLjA.");
        est3.put("name", "Duber Carmona");

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

    public HorizontalLayout algoritmo1() {

        VerticalLayout vl1 = new VerticalLayout();
        vl1.setAlignItems(Alignment.CENTER);
        vl1.add(new Image("https://static.tuasaude.com/media/article/me/dr/imc_15748_l.jpg", ""));

        VerticalLayout vl2 = new VerticalLayout();
        vl2.setAlignItems(Alignment.CENTER);

        HorizontalLayout hl = new HorizontalLayout();
        hl.setAlignItems(Alignment.CENTER);
        hl.setWidthFull();

        NumberField peso = new NumberField("Peso (kg)");
        NumberField altura = new NumberField("Altura (m)");
        Button calcular = new Button("Calcular IMC");
        H3 salida = new H3();

        calcular.addClickListener(event -> {
            double valorPeso = peso.getValue();
            double valorAltura = altura.getValue();
            double imc = valorPeso / Math.pow(valorAltura, 2);
            String info = "";
            if (imc < 18.5) {
                info = "Bajo peso";
            } else if (imc >= 18.5 && imc < 24.9) {
                info = "Peso saludable";
            } else if (imc >= 25.0 && imc < 29.9) {
                info = "Sobrepeso";
            } else if (imc >= 30.0 && imc < 34.9) {
                info = "Obesidad Clase 1";
            } else if (imc >= 35.0 && imc < 39.9) {
                info = "Obesidad Clase 2";
            } else {
                info = "Obesidad Clase 3";
            }
            String numeroFormateado = String.format("%.2f", imc);
            salida.setText(String.valueOf(numeroFormateado + ", " + info));
        });
        vl2.add(new H3("Calculadora Índice de Masa Corporal (IMC)"));
        vl2.add(peso);
        vl2.add(altura);
        vl2.add(calcular);
        vl2.add(salida);
        hl.add(vl1);
        hl.add(vl2);
        return hl;
    }

}
