package com.example.application.views.grupo1;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.text.DecimalFormat;

import org.atmosphere.util.StringFilterAggregator;

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
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.ClickEvent;

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
        est1.put("image",
                "https://firebasestorage.googleapis.com/v0/b/fotos-proyecto-bfc34.appspot.com/o/Fotos%2FBaldur%202-fotor-2023092613481.png?alt=media&token=7074c54a-9223-40d9-be3c-079af1eb631c&_gl=1*htidj1*_ga*MTQ5NTE1NzQ3Ni4xNjk2MzQ0MDA1*_ga_CW55HF8NVT*MTY5NjM0NDAwNS4xLjEuMTY5NjM0NTE5Ni45LjAuMA..");
        est1.put("name", "Andrés Baldur Tamayo");
        Map<String, String> est2 = new HashMap<>();
        est2.put("image",
                "https://firebasestorage.googleapis.com/v0/b/fotos-proyecto-bfc34.appspot.com/o/Fotos%2FEdison%20Mart%C3%ADnez%20Osorio.png?alt=media&token=6791f7ec-5e02-4f02-aa0d-c47a44b993ff&_gl=1*xnv67*_ga*MTQ5NTE1NzQ3Ni4xNjk2MzQ0MDA1*_ga_CW55HF8NVT*MTY5NjM0NDAwNS4xLjEuMTY5NjM0NTIxMi42MC4wLjA.");
        est2.put("name", "Edison Martínez Osorio");
        Map<String, String> est3 = new HashMap<>();
        est3.put("image",
                "https://firebasestorage.googleapis.com/v0/b/fotos-proyecto-bfc34.appspot.com/o/Fotos%2FDuber%20%20Carmona-fotor-2023100393639.png?alt=media&token=eb0de2b9-41b8-4fd9-bb7e-3c2db9ac29a1&_gl=1*1s63mq7*_ga*MTQ5NTE1NzQ3Ni4xNjk2MzQ0MDA1*_ga_CW55HF8NVT*MTY5NjM0NDAwNS4xLjEuMTY5NjM0NTIyMi41MC4wLjA.");
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
        titulo2 = "Calculadora de calorías diaras\r\n" + //
                "";
        descripcion = "Calculadora que ayuda a las personas a estimar la cantidad de calorías que deben consumir diariamente en función de su edad, género, nivel de actividad y objetivos de peso.";
        gist = "<script src=\"https://gist.github.com/baldurt1992/6e01ff37ac313a4182b367b692fcc4b5.js\"></script>";
        replit = "https://replit.com/@andresbaldur92/calculadoraCalorias";
        diagrama = "https://firebasestorage.googleapis.com/v0/b/fotos-proyecto-bfc34.appspot.com/o/Untitled%20Workspace%20(1).jpg?alt=media&token=778ebe06-5170-41f1-bffa-e7f6346d6a5f&_gl=1*64lald*_ga*MTY3NDMzNDI5NC4xNjk0NTQ2MzEz*_ga_CW55HF8NVT*MTY5NzA1NjQxOS4xNi4xLjE2OTcwNTY0NDguMzEuMC4w";
        add(secciones.algoritmo(titulo1, titulo2, descripcion, algoritmo1(), gist, replit, diagrama));

        // Algoritmo2
        titulo1 = "Algoritmo 2";
        titulo2 = "Cálculo de Zona de Ritmo Cardíaco Objetivo\r\n" + //
                "";
        descripcion = "Calculadora que permite calcular la ZCO(zona cardiaca objetivo). Basados en la edad se determinan las pulsaciones por minuto de la persona y se calcula su frecuencia cardiaca objetivo";
        gist = "<script src=\"https://gist.github.com/baldurt1992/6e01ff37ac313a4182b367b692fcc4b5.js\"></script>";
        replit = "https://replit.com/@andresbaldur92/calculadoraCalorias";
        diagrama = "https://firebasestorage.googleapis.com/v0/b/fotos-proyecto-bfc34.appspot.com/o/Untitled%20Workspace%20(1).jpg?alt=media&token=778ebe06-5170-41f1-bffa-e7f6346d6a5f&_gl=1*64lald*_ga*MTY3NDMzNDI5NC4xNjk0NTQ2MzEz*_ga_CW55HF8NVT*MTY5NzA1NjQxOS4xNi4xLjE2OTcwNTY0NDguMzEuMC4w";
        add(secciones.algoritmo(titulo1, titulo2, descripcion, algoritmo2(), gist, replit, diagrama));

        // Algoritmo3
        titulo1 = "Algoritmo 3";
        titulo2 = "Test de Burpees\r\n" + //
                "";
        descripcion = "Este test evalua el estado físico de una persona dependiendo de la cantidad de repeticiones de Burpees que logra realizar.";
        gist = "<script src=\"https://gist.github.com/baldurt1992/6e01ff37ac313a4182b367b692fcc4b5.js\"></script>";
        replit = "https://replit.com/@andresbaldur92/calculadoraCalorias";
        diagrama = "https://firebasestorage.googleapis.com/v0/b/fotos-proyecto-bfc34.appspot.com/o/Untitled%20Workspace%20(1).jpg?alt=media&token=778ebe06-5170-41f1-bffa-e7f6346d6a5f&_gl=1*64lald*_ga*MTY3NDMzNDI5NC4xNjk0NTQ2MzEz*_ga_CW55HF8NVT*MTY5NzA1NjQxOS4xNi4xLjE2OTcwNTY0NDguMzEuMC4w";
        add(secciones.algoritmo(titulo1, titulo2, descripcion, algoritmo3(), gist, replit, diagrama));

    }

    public HorizontalLayout algoritmo1() {

        VerticalLayout vl1 = new VerticalLayout();
        vl1.setAlignItems(Alignment.CENTER);
        vl1.add(new Image(
                "https://firebasestorage.googleapis.com/v0/b/fotos-proyecto-bfc34.appspot.com/o/CaloriasFinal-fotor-20231009122957.png?alt=media&token=453fada9-9ea5-4f24-9c73-473de707885b&_gl=1*8zkd8u*_ga*MTY3NDMzNDI5NC4xNjk0NTQ2MzEz*_ga_CW55HF8NVT*MTY5Njg3MjM3Ni4xMy4xLjE2OTY4NzI2MjguNDYuMC4w",
                ""));

        VerticalLayout vl2 = new VerticalLayout();
        vl2.setAlignItems(Alignment.CENTER);

        HorizontalLayout hl = new HorizontalLayout();
        hl.setAlignItems(Alignment.CENTER);
        hl.setWidthFull();

        IntegerField edad = new IntegerField("Edad");
        Button calcular = new Button("Calcular calorías");
        H3 salida = new H3();

        ComboBox<String> comboBoxObjeto = new ComboBox<>("Objetivo de peso");
        comboBoxObjeto.setAllowCustomValue(true);
        List<String> opcionesObjeto = Arrays.asList("Perder", "Mantener", "Ganar");
        comboBoxObjeto.setItems(opcionesObjeto);

        ComboBox<String> comboBoxGenero = new ComboBox<>("Género");
        comboBoxGenero.setAllowCustomValue(true);
        List<String> opcionesGenero = Arrays.asList("Hombre", "Mujer");
        comboBoxGenero.setItems(opcionesGenero);

        ComboBox<String> comboBoxNivel = new ComboBox<>("Nivel de actividad");
        comboBoxNivel.setAllowCustomValue(true);
        List<String> opcionesNivel = Arrays.asList("Sedentario", "Ligero", "Moderado", "Activo", "Muy activo");
        comboBoxNivel.setItems(opcionesNivel);

        calcular.addClickListener((ClickEvent<Button> event) -> {
            int valoredad = edad.getValue();
            String valorgenero = comboBoxGenero.getValue();
            String valornivelActividad = comboBoxNivel.getValue();
            String valorobjetivoPeso = comboBoxObjeto.getValue();

            comboBoxGenero.setValue(valorgenero);
            comboBoxNivel.setValue(valornivelActividad);
            comboBoxObjeto.setValue(valorobjetivoPeso);

            String genero;
            while (true) {
                System.out.print("Ingresa tu género (Hombre/Mujer): ");
                genero = valorgenero.toLowerCase();
                if (genero.equals("hombre") || genero.equals("mujer")) {
                    break;
                } else {
                    System.out.println("Error: Debes ingresar 'Hombre' o 'Mujer'.");
                }
            }

            double factorActividad = 1.0;
            switch (valornivelActividad.toLowerCase()) {
                case "sedentario":
                    factorActividad = 1.2;
                    break;
                case "ligero":
                    factorActividad = 1.375;
                    break;
                case "moderado":
                    factorActividad = 1.55;
                    break;
                case "activo":
                    factorActividad = 1.725;
                    break;
                case "muy activo":
                    factorActividad = 1.9;
                    break;
                default:
                    System.out.println("Nivel de actividad no válido. Se usará el valor por defecto (Moderado).");
                    factorActividad = 1.55;
                    break;
            }

            double tmb;
            if (genero.equals("hombre")) {
                tmb = 88.362 + (13.397 * valoredad);
            } else {
                tmb = 447.593 + (9.247 * valoredad);
            }

            double caloriasDiarias;
            switch (valorobjetivoPeso.toLowerCase()) {
                case "perder":
                    caloriasDiarias = tmb * factorActividad - 500;
                    break;
                case "mantener":
                    caloriasDiarias = tmb * factorActividad;
                    break;
                case "ganar":
                    caloriasDiarias = tmb * factorActividad + 500;
                    break;
                default:
                    System.out.println("Objetivo de peso no válido. Se asumirá mantener el peso.");
                    caloriasDiarias = tmb * factorActividad;
                    break;
            }
            DecimalFormat formato = new DecimalFormat("0");
            String caloriasFormateadas = formato.format(caloriasDiarias);
            salida.setText("Las calorías que deberías consumir para " + valorobjetivoPeso.toLowerCase() + " peso son "
                    + caloriasFormateadas + " calorías por día.");

        });
        vl2.add(new H3("Calculadora de calorías diarias"));
        vl2.add(edad);
        vl2.add(comboBoxGenero);
        vl2.add(comboBoxNivel);
        vl2.add(comboBoxObjeto);
        vl2.add(calcular);
        vl2.add(salida);
        hl.add(vl1);
        hl.add(vl2);
        return hl;

    }

    int zonaMaximaCalculada = 0;
    int zonaminimacalculada = 0;

    public HorizontalLayout algoritmo2() {

        VerticalLayout vl1 = new VerticalLayout();
        vl1.setAlignItems(Alignment.CENTER);
        vl1.add(new Image(
                "https://firebasestorage.googleapis.com/v0/b/fotos-proyecto-bfc34.appspot.com/o/CORAZON-fotor-2023101285820.jpg?alt=media&token=8591e994-8599-4830-8ce6-a17cbba8b6ee&_gl=1*t1fhmh*_ga*MTQ5NTE1NzQ3Ni4xNjk2MzQ0MDA1*_ga_CW55HF8NVT*MTY5NzExOTI2MC4yLjEuMTY5NzEyMDA2NC40MC4wLjA.",
                ""));

        VerticalLayout vl2 = new VerticalLayout();
        vl2.setAlignItems(Alignment.CENTER);

        HorizontalLayout hl = new HorizontalLayout();
        hl.setAlignItems(Alignment.CENTER);
        hl.setWidthFull();

        IntegerField edad = new IntegerField("Edad");
        TextField fcm = new TextField("FCM");
        fcm.setReadOnly(true);
        TextField zomax = new TextField("Zona máxima");
        zomax.setReadOnly(true);
        TextField zomin = new TextField("Zona mímina");
        zomin.setReadOnly(true);
        Button calcular = new Button("Calcular ZCO");
        H3 salida = new H3();

        edad.addValueChangeListener(event -> {
            Integer edadIngresada = event.getValue();
            if (edadIngresada != null) {
                int fcmCalculada = 220 - edadIngresada;
                fcm.setValue(Integer.toString(fcmCalculada));

                if (zomax.getValue() != null) {
                    zonaMaximaCalculada = (int) (fcmCalculada * 0.85);
                    zomax.setValue(Integer.toString(zonaMaximaCalculada));
                }
                if (zomin.getValue() != null) {
                    zonaminimacalculada = (int) (fcmCalculada * 0.5);
                    zomin.setValue(Integer.toString(zonaminimacalculada));
                }
            }
            salida.setText(
                    "Tu zona de ritmo cardiaco objetivo máxima es de " + zonaMaximaCalculada + " lpm"
                            + ", tu zona mínima es de "
                            + zonaminimacalculada + " lpm."
                            + " si estás realizando ejercicio moderado, te recomendamos mantener tus pulsaciones máximo en "
                            + zonaminimacalculada + " lpm,"
                            + " si estás realizando ejercicio vigoroso, te recomendamos mantener tus pulsaciones máximo en "
                            + zonaMaximaCalculada + " lpm.");
        });

        vl2.add(new H3("Cálculo de Zona de Ritmo Cardíaco Objetivo"));
        vl2.add(edad);
        vl2.add(edad, calcular, fcm, zomax, zomin);
        vl2.add(calcular);
        vl2.add(salida);
        hl.add(vl1);
        hl.add(vl2);
        return hl;

    }


    String estado = "";
    public HorizontalLayout algoritmo3() {

        VerticalLayout vl1 = new VerticalLayout();
        vl1.setAlignItems(Alignment.CENTER);
        vl1.add(new Image(
                "https://firebasestorage.googleapis.com/v0/b/fotos-proyecto-bfc34.appspot.com/o/beneficios-burpees-fotor-20231012102031.jpg?alt=media&token=d34731e0-9410-402c-9a8c-cb4215c25bc4&_gl=1*ahyw9p*_ga*MTQ5NTE1NzQ3Ni4xNjk2MzQ0MDA1*_ga_CW55HF8NVT*MTY5NzEyNDAzOC4zLjEuMTY5NzEyNDA0OS40OS4wLjA.",
                ""));

        VerticalLayout vl2 = new VerticalLayout();
        vl2.setAlignItems(Alignment.CENTER);

        HorizontalLayout hl = new HorizontalLayout();
        hl.setAlignItems(Alignment.CENTER);
        hl.setWidthFull();

        ComboBox<String> comboBoxGenero = new ComboBox<>("Selecciona tu género");
        comboBoxGenero.setAllowCustomValue(true);
        List<String> opcionesGenero = Arrays.asList("Hombre", "Mujer");
        comboBoxGenero.setItems(opcionesGenero);
        IntegerField burpeesrealizados = new IntegerField("Ingresa las repeticiones");
        Button calcular = new Button("Calcular estado físico");
        H3 salida = new H3();

        
        
        calcular.addClickListener((ClickEvent<Button> event)-> {
            String valorGenero = comboBoxGenero.getValue();
            int valorRepeticiones = burpeesrealizados.getValue();
            
            if (valorGenero.equalsIgnoreCase("hombre")) {
                if (valorRepeticiones < 25) {
                    estado = "malo";
                } else if (valorRepeticiones >= 25 && valorRepeticiones <= 35) {
                   estado = "normal";
                } else if (valorRepeticiones >= 35 && valorRepeticiones <= 45) {
                   estado = "bueno";
                } else if (valorRepeticiones >= 45 && valorRepeticiones <= 55) {
                   estado = "muy bueno";
                } else {
                   estado = "excelente";
                }
             } else if (valorGenero.equalsIgnoreCase("mujer")) {
                if (valorRepeticiones < 25) {
                   estado = "malo";
                } else if (valorRepeticiones >= 20 && valorRepeticiones <= 30) {
                   estado = "normal";
                } else if (valorRepeticiones >= 30 && valorRepeticiones <= 40) {
                   estado = "bueno";
                } else if (valorRepeticiones >= 40 && valorRepeticiones <= 50) {
                   estado = "muy bueno";
                } else {
                   estado = "excelente";
                }
             } else {
                estado = null; 
             }     
             
        salida.setText("Haz realizado " + valorRepeticiones + " repeticiones. " + "Tu estado físico es " + estado + ".");

         });

        


        





        vl2.add(new H3("Test de Burpees"));
        vl2.add(comboBoxGenero);
        vl2.add(burpeesrealizados);
        vl2.add(calcular);
        vl2.add(salida);
        hl.add(vl1);
        hl.add(vl2);
        return hl;

    }

}
