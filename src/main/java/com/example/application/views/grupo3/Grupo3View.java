package com.example.application.views.grupo3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

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
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Grupo 3")
@Route(value = "grupo-3", layout = MainLayout.class)
public class Grupo3View extends VerticalLayout {

    public Grupo3View() {
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
                "url(https://images.unsplash.com/photo-1649073586428-e288125d930a?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1932&q=80)");

        H1 t1 = new H1("Grupo 3");
        H2 t2 = new H2("Biología");
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
        est1.put("image", "https://firebasestorage.googleapis.com/v0/b/fotos-proyecto-bfc34.appspot.com/o/Fotos%2FYojan%20David%20Gil%20Posada.png?alt=media&token=1a2bdc63-dd0b-461d-b240-11330d2e5389&_gl=1*rz5xyd*_ga*MTQ5NTE1NzQ3Ni4xNjk2MzQ0MDA1*_ga_CW55HF8NVT*MTY5NjM0NDAwNS4xLjEuMTY5NjM0NTUzMC42MC4wLjA.");
        est1.put("name", "Yojan Gil");
        Map<String, String> est2 = new HashMap<>();
        est2.put("image", "https://firebasestorage.googleapis.com/v0/b/fotos-proyecto-bfc34.appspot.com/o/Fotos%2FNicolas%20Garcia.png?alt=media&token=fc119826-8e25-4060-b337-20207bc25552&_gl=1*txo5r8*_ga*MTQ5NTE1NzQ3Ni4xNjk2MzQ0MDA1*_ga_CW55HF8NVT*MTY5NjM0NDAwNS4xLjEuMTY5NjM0NTU1NS4zNS4wLjA.");
        est2.put("name", "Nicolas Garcia");

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
        titulo2 = "Calculadora de ADENINA en cadena de ADN.";
        descripcion = "Calcula la cantidad de adenina (A) en una cadena de ADN proporcionada por el usuario. La adenina es una de las cuatro bases nitrogenadas que componen el ADN, y se representa con la letra 'A'.\r\n" + //
                "";
        gist = " <script src=\"https://gist.github.com/nicolasgarcia01/365e1c7d6174e7779474847e2586e145.js\"></script>";
        replit = "https://replit.com/@NicolasGarcia82/numero3";
        diagrama = "    ";
        add(secciones.algoritmo(titulo1, titulo2, descripcion, algoritmo1(), gist, replit, diagrama));

    }

    public HorizontalLayout algoritmo1() {


        VerticalLayout vl1 = new VerticalLayout();
        vl1.setAlignItems(Alignment.CENTER);
        vl1.add(new Image("https://firebasestorage.googleapis.com/v0/b/docuementos-12812.appspot.com/o/imagen%201.png?alt=media&token=8e5034c2-7cd0-4539-88e8-ca7e1d15cfc1&_gl=1*pu3m1r*_ga*NDM1NDI4Njg0LjE2OTc1NDk5NzY.*_ga_CW55HF8NVT*MTY5NzU0OTk3Ni4xLjEuMTY5NzU1MTkxMC40OC4wLjA.", ""));


        VerticalLayout vl2 = new VerticalLayout();
        vl2.setAlignItems(Alignment.CENTER);


        HorizontalLayout hl = new HorizontalLayout();
        hl.setAlignItems(Alignment.CENTER);
        hl.setWidthFull();


       
       
        Button calcular = new Button("Analizar");
        ComboBox <String> cadenas = new ComboBox <> ("Selecciona la cadena");
        cadenas.setAllowCustomValue(true);
        List<String> opcionescadena = Arrays.asList("ATCGATCGATCGATCG","GCTAGCTAGCTAGCTA","TATGTATGTATGTATG","CGTAGCTAATCGTAGC","ATATATATATATATAT","GATCGATCGATCGATC","AGTAGTAGTAGTAGTA","CATGCATGCATGCATG","GTAGTACGTAGTACGT");
        cadenas.setItems(opcionescadena);
        H3 salida = new H3("");


        calcular.addClickListener(event -> {
       
        String valorcadenas = cadenas.getValue();
        int cantidadAdenina = 0;
       
        for (int i = 0; i < valorcadenas.length(); i++) {
            if (valorcadenas.charAt(i) == 'A') {
                cantidadAdenina++;
            }
        }
        salida.setText("La cantidad de ADENINA es: " + cantidadAdenina);


        });
        vl2.add(new H3("Calculadora de ADENINA en cadena de ADN."));
        vl2.add(cadenas);
        vl2.add(calcular);
        vl2.add(salida);
        hl.add(vl1);
        hl.add(vl2);
        return hl;
    }

}


