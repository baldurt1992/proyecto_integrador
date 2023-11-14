package com.example.application.views.grupo5;

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
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.notification.Notification;

@PageTitle("Grupo 5")
@Route(value = "grupo-5", layout = MainLayout.class)
public class Grupo5View extends VerticalLayout {

    public Grupo5View() {
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
                "url(https://images.unsplash.com/photo-1483959651481-dc75b89291f1?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1898&q=80)");

        H1 t1 = new H1("Grupo 5");
        H2 t2 = new H2("Geometría");
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
                "https://firebasestorage.googleapis.com/v0/b/fotos-proyecto-bfc34.appspot.com/o/Fotos%2Ffoto_CarlosAndresSanchez.png?alt=media&token=a711bcd0-88c1-408e-83b6-63eb603ceb5e&_gl=1*oxjj94*_ga*MTQ5NTE1NzQ3Ni4xNjk2MzQ0MDA1*_ga_CW55HF8NVT*MTY5NjM0NDAwNS4xLjEuMTY5NjM0NTg1Mi42MC4wLjA.");
        est1.put("name", "Carlos Andrés Sánchez Correa");
        Map<String, String> est2 = new HashMap<>();
        est2.put("image",
                "https://firebasestorage.googleapis.com/v0/b/fotos-proyecto-bfc34.appspot.com/o/Fotos%2Fnelson-fotor-20231009113544.png?alt=media&token=6c211e90-58b7-400e-ba06-b1fda5014114&_gl=1*6xghvl*_ga*MTY3NDMzNDI5NC4xNjk0NTQ2MzEz*_ga_CW55HF8NVT*MTY5Njg2ODg1NS4xMi4xLjE2OTY4NjkzNTguNTIuMC4w");
        est2.put("name", "Nelson Enrique Fonnegra Osorio");
        Map<String, String> est3 = new HashMap<>();
        est3.put("image",
                "https://firebasestorage.googleapis.com/v0/b/fotos-proyecto-bfc34.appspot.com/o/Fotos%2Ffoto%20jhonny-fotor-2023100393147.png?alt=media&token=d6c1bd57-bc38-48a0-b5a7-e312361ec4b3&_gl=1*144zqsu*_ga*MTQ5NTE1NzQ3Ni4xNjk2MzQ0MDA1*_ga_CW55HF8NVT*MTY5NjM0NDAwNS4xLjEuMTY5NjM0NTkwOS4zLjAuMA..");
        est3.put("name", "Jhonny Alejandro Pérez Santana");

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
        titulo2 = "Calcular el volumen de 6 figuras geométricas";
        descripcion = "Elegir una figura geométrica entre: prisma rectangular, cubo, cilindro, cono, pirámide y esfera ,  luego hallar el volumen de cada uno pidiendo los datos que se necesitan para sacar el volumen de cada uno.";
        gist = "<script src=\"https://gist.github.com/CASanchezc5/2f776783eb1cbbbd8c6157c18fb669fc.js\"></script>";
        replit = "https://replit.com/@carlos-andre253/Algoritmo1";
        diagrama = "https://firebasestorage.googleapis.com/v0/b/imagenes-dd8e6.appspot.com/o/Diagrama%20en%20blanco.png?alt=media&token=b0f5ba8f-c00e-44f5-8511-9fcbd2e5140d&_gl=1*1vj3ohr*_ga*MzAzMzU0MjM2LjE2OTQ2MTYwNDY.*_ga_CW55HF8NVT*MTY5NjQ2OTMyOC4xMi4xLjE2OTY0Njk0MzYuMjQuMC4w";
        add(secciones.algoritmo(titulo1, titulo2, descripcion, algoritmo1(), gist, replit, diagrama));

        // Algoritmo2
        titulo1 = "Algoritmo 2";
        titulo2 = "Calcular el área de un Triángulo";
        descripcion = "Se desea calcular el área de un triángulo, teniendo como parámetros para poder ser hallada su base y su altura, el área de un triangulo es la medida de la superficie que ocupa dicho trianguló, y expresa en unidades cuadradas.";
        gist = "<script src=\"https://gist.github.com/CASanchezc5/0d2e7678e457b72e9852feeade1b3632.js\"></script>";
        replit = "https://replit.com/@carlos-andre253/Algoritmo2";
        diagrama = "https://firebasestorage.googleapis.com/v0/b/imagenes-dd8e6.appspot.com/o/DFAlgoritmo2.png?alt=media&token=61fa9db1-9209-455b-bdbd-855c1b256269&_gl=1*2hxmtu*_ga*MzAzMzU0MjM2LjE2OTQ2MTYwNDY.*_ga_CW55HF8NVT*MTY5Njk4NDkxMC4xOC4xLjE2OTY5ODgwNzQuMzkuMC4w";
        add(secciones.algoritmo(titulo1, titulo2, descripcion, algoritmo2(), gist, replit, diagrama));

        // Algoritmo3
        titulo1 = "Algoritmo 3";
        titulo2 = "Calcular el área de un Triángulo Equilátero o Isósceles";
        descripcion = "Se desea calcular el área de un triángulo, dandome a elejir entre un triángulo isósceles y un triángulo equilátero. Triángulo isósceles: presenta dos lados de igual medida. Triángulo equilátero: los tres lados miden lo mismo y por lo tanto los tres ángulos son iguales.";
        gist = "<script src=\"https://gist.github.com/CASanchezc5/42faf7760876813e2f715357833f1f65.js\"></script>";
        replit = "https://replit.com/@carlos-andre253/Algoritmo3";
        diagrama = "https://firebasestorage.googleapis.com/v0/b/imagenes-dd8e6.appspot.com/o/Algoritmo3.png?alt=media&token=ff13a66d-38a3-4ebe-a5e3-0d49cc6e18e5&_gl=1*1t8fody*_ga*MzAzMzU0MjM2LjE2OTQ2MTYwNDY.*_ga_CW55HF8NVT*MTY5NzE0NDc2OS4yMy4xLjE2OTcxNDQ5NDguNjAuMC4w";
        add(secciones.algoritmo(titulo1, titulo2, descripcion, algoritmo3(), gist, replit, diagrama));

        // Algoritmo4
        titulo1 = "Algoritmo 4";
        titulo2 = "Teorema de Pitágoras";
        descripcion = "Hallar la hipotenusa en un triángulo rectángulo mediante el teorema de Pitágoras. El Teorema de Pitágoras dice que todo triángulo rectángulo el cuadrado de la hipotenusa es igual a la suma de los cuadrados de los catetos. Un triángulo rectángulo es aquel que tiene un ángulo de 90° y el lado opuesto a este ángulo se le conoce como hipotenusa y los otros lados se les conoce como catetos.";
        gist = "<script src=\"https://gist.github.com/CASanchezc5/3538207080891e061f491e20e5957075.js\"></script>";
        replit = "https://replit.com/@carlos-andre253/Algoritmo4";
        diagrama = "https://firebasestorage.googleapis.com/v0/b/desarrollo-software-nelson.appspot.com/o/Teorema%20de%20Pitagoras%20-%20Diagrama%20de%20flujo.jpg?alt=media&token=d29542d8-d41d-4b8a-b411-a34977959988&_gl=1*weqc1i*_ga*MTcwMTI3Mzk1MS4xNjk2MzQ2MTUy*_ga_CW55HF8NVT*MTY5ODk0MTQxNi4xMi4xLjE2OTg5NDE0NzAuNi4wLjA";
        add(secciones.algoritmo(titulo1, titulo2, descripcion, algoritmo4(), gist, replit, diagrama));

    }

    public HorizontalLayout algoritmo1() {

        VerticalLayout vl1 = new VerticalLayout();
        vl1.setAlignItems(Alignment.CENTER);
        vl1.add(new Image(
                "https://firebasestorage.googleapis.com/v0/b/imagenes-dd8e6.appspot.com/o/volumenes_geometricos1.png?alt=media&token=5273b7a5-3347-4711-88ad-558c202f8b77&_gl=1*1pxz0zm*_ga*MzAzMzU0MjM2LjE2OTQ2MTYwNDY.*_ga_CW55HF8NVT*MTY5NjM3NDI5NC4xMC4xLjE2OTYzNzQzOTAuNjAuMC4w",
                ""));

        VerticalLayout vl2 = new VerticalLayout();
        vl2.setAlignItems(Alignment.CENTER);

        HorizontalLayout hl = new HorizontalLayout();
        hl.setAlignItems(Alignment.CENTER);
        hl.setWidthFull();

        NumberField parametro1 = new NumberField("Parámetro 1(cm)");
        NumberField parametro2 = new NumberField("Parámetro 2(cm)");
        NumberField parametro3 = new NumberField("Altura de la Pirámide(cm)");
        parametro3.setVisible(false); // Inicialmente, oculta el tercer NumberField

        Button calcular = new Button("Calcular Volumen");
        H3 resultado = new H3();

        Select<String> select = new Select<>();
        select.setLabel("Elige Figura Geométrica");
        select.setItems("Cubo", "Cilindro",
                "Esfera", "Cono",
                "Prisma rectangular", "Pirámide");
        select.setValue("Cubo");
        H2 salida1 = new H2();

        select.addValueChangeListener(event -> { // usamos addValueChangeListener para escuchar los cambios de selección
                                                 // en el Select
            String figura = event.getValue(); // Obtiene la opción seleccionada en el ComboBox
            String infofig = "";
            if (figura == "Cubo") {
                infofig = "Cubo";
            } else if (figura == "Cilindro") {
                infofig = "Cilindro";
            } else if (figura == "Esfera") {
                infofig = "Esfera";
            } else if (figura == "Cono") {
                infofig = "Cono";
            } else if (figura == "Prisma rectangular") {
                infofig = "Prisma rectangular";
            } else if (figura == "Pirámide") {
                infofig = "Pirámide";
            }
            salida1.setText(infofig);

            if ("Pirámide".equals(figura)) {
                parametro3.setVisible(true); // Muestra el tercer NumberField solo si se selecciona "Pirámide"
            } else {
                parametro3.setVisible(false); // Oculta el tercer NumberField para cualquier otra figura
            }

            if ("Cubo".equals(figura) || "Esfera".equals(figura)) {
                parametro2.setVisible(false); // Oculta el tercer NumberField para cualquier otra figura
            } else {
                parametro2.setVisible(true); // Muestra el tercer NumberField solo si se selecciona "Cubo o Esfera"
            }
        });

        calcular.addClickListener(event -> {
            double alturaPiramide = 0;
            String figura = select.getValue();

            double valorParametro1 = parametro1.getValue();
            double valorParametro2 = parametro2.getValue();
            if (parametro3.getValue() != null) {
                alturaPiramide = parametro3.getValue();
            }

            double volumen = calcularVolumen(figura, valorParametro1, valorParametro2, alturaPiramide);
            String numeroFormateado = String.format("%.2f", volumen);
            resultado.setText(String.valueOf("El volumen es: " + numeroFormateado + "cm3"));

        });

        vl2.add(new H3("Calculadora de Volumen de Figuras Geométricas"));
        vl2.add(select);
        vl2.add(salida1);
        vl2.add(parametro1);
        vl2.add(parametro2);
        vl2.add(parametro3);
        vl2.add(calcular);
        vl2.add(resultado);

        hl.add(vl1);
        hl.add(vl2);
        return hl;
    }

    public double calcularVolumen(String figura, double parametro1, double parametro2, double alturaPiramide) {
        switch (figura) {
            case "Cubo":
                return Math.pow(parametro1, 3);
            case "Cilindro":
                return Math.PI * Math.pow(parametro1, 2) * parametro2;
            case "Esfera":
                return (4.0 / 3.0) * Math.PI * Math.pow(parametro1, 3);
            case "Cono":
                return (1.0 / 3.0) * Math.PI * Math.pow(parametro1, 2) * parametro2;
            case "Prisma rectangular":
                return parametro1 * parametro2;
            case "Pirámide":
                return (1.0 / 3.0) * ((parametro1 * parametro2) / 2) * alturaPiramide;
            default:
                return 0.0; // Opción inválida
        }
    }

    public HorizontalLayout algoritmo2() {

        VerticalLayout vl1 = new VerticalLayout();
        vl1.setAlignItems(Alignment.CENTER);
        vl1.add(new Image(
                "https://firebasestorage.googleapis.com/v0/b/imagenes-dd8e6.appspot.com/o/areatriangulo.png?alt=media&token=75bdc776-6fe6-4a12-a0a0-427f24735e79&_gl=1*13v5p03*_ga*MzAzMzU0MjM2LjE2OTQ2MTYwNDY.*_ga_CW55HF8NVT*MTY5Njk4MTIzMS4xNy4wLjE2OTY5ODEyMzEuNjAuMC4w",
                ""));

        VerticalLayout vl2 = new VerticalLayout();
        vl2.setAlignItems(Alignment.CENTER);

        HorizontalLayout hl = new HorizontalLayout();
        hl.setAlignItems(Alignment.CENTER);
        hl.setWidthFull();

        NumberField base = new NumberField("Base (cm)");
        NumberField altura = new NumberField("Altura (cm)");

        Button calcular = new Button("Calcular Área");
        H3 resultado = new H3();

        calcular.addClickListener(event -> {

            double valorBase = base.getValue();
            double valorAltura = altura.getValue();
            double area = (valorBase * valorAltura) / 2;

            String numeroFormateado = String.format("%.2f", area); // para formatear el resultado que sea a 2 cifras
                                                                   // decimales
            resultado.setText("El área es: " + numeroFormateado + " cm2");

        });

        vl2.add(new H3("Calculadora de Área del Triángulo"));
        vl2.add(base);
        vl2.add(altura);
        vl2.add(calcular);
        vl2.add(resultado);

        hl.add(vl1);
        hl.add(vl2);
        return hl;
    }

    public HorizontalLayout algoritmo3() {

        VerticalLayout vl1 = new VerticalLayout();
        vl1.setAlignItems(Alignment.CENTER);
        vl1.add(new Image(
                "https://firebasestorage.googleapis.com/v0/b/imagenes-dd8e6.appspot.com/o/equilatero-isosceles.png?alt=media&token=0c3312fd-c68c-4163-9188-391c2218cc54&_gl=1*r4t7f2*_ga*MzAzMzU0MjM2LjE2OTQ2MTYwNDY.*_ga_CW55HF8NVT*MTY5NzkxOTUzOS4yNC4xLjE2OTc5MjQxMTEuMjMuMC4w",
                ""));

        VerticalLayout vl2 = new VerticalLayout();
        vl2.setAlignItems(Alignment.CENTER);

        HorizontalLayout hl = new HorizontalLayout();
        hl.setAlignItems(Alignment.CENTER);
        hl.setWidthFull();

        NumberField base = new NumberField("Base en cm");
        NumberField lado = new NumberField("Lado(os) en cm");

        base.setVisible(false); // Inicialmente, oculta el NumberField

        Button calcular = new Button("Calcular Área del Triángulo");
        H3 resultado = new H3();

        Select<String> select = new Select<>();
        select.setLabel("Elige Triángulo");
        select.setItems("Equilátero", "Isósceles");
        select.setValue("Equilátero");
        H2 salida1 = new H2();

        select.addValueChangeListener(event -> { // usamos addValueChangeListener para escuchar los cambios de selección
                                                 // en el Select

            String figura = event.getValue();
            String infofig = "";
            if ("Equilátero".equals(figura)) {
                infofig = "Equilátero";
                base.setVisible(false); // Ocultar el campo "base" solo si se selecciona "Equilátero"
                lado.setVisible(true); // Mostrar el campo "lado" solo si se selecciona "Equilátero"
            } else if ("Isósceles".equals(figura)) {
                infofig = "Isósceles";
                base.setVisible(true); // Mostrar el campo "base" solo si se selecciona "Isósceles"
                lado.setVisible(true); // Mostrar el campo "lado" solo si se selecciona "Isósceles"
            } else {
                infofig = "Opción no Válida";
                base.setVisible(false); // Ocultar el campo "base" para otras opciones
                lado.setVisible(false); // Ocultar el campo "lado" para otras opciones
            }
            salida1.setText(infofig);
        });

        calcular.addClickListener(event -> {

            String figura = select.getValue();
            String numeroFormateado;

            double valorParametro1 = base.getValue();
            double valorParametro2 = lado.getValue();
            double areaEqui;
            double areaIso;

            if (figura == "Equilátero") {
                areaEqui = (Math.sqrt(3) / 4) * Math.pow(valorParametro2, 2);
                numeroFormateado = String.format("%.2f", areaEqui); // para formatear el resultado que sea a 2 cifras
                                                                    // decimales
                resultado.setText(String.valueOf("El área es: " + numeroFormateado + " cm2"));
            } else if (figura == "Isósceles") {
                areaIso = (valorParametro1 / 2)
                        * Math.sqrt(Math.pow(valorParametro2, 2) - Math.pow(valorParametro1 / 2, 2));
                numeroFormateado = String.format("%.2f", areaIso); // para formatear el resultado que sea a 2 cifras
                                                                   // decimales
                resultado.setText(String.valueOf("El área es: " + numeroFormateado + " cm2"));
            }

        });

        vl2.add(new H3("Calculadora de Área de Triangulos Equilátero e Isósceles"));
        vl2.add(select);
        vl2.add(salida1);
        vl2.add(base);
        vl2.add(lado);

        vl2.add(calcular);
        vl2.add(resultado);

        hl.add(vl1);
        hl.add(vl2);
        return hl;
    }

    public HorizontalLayout algoritmo4() {

        VerticalLayout vl1 = new VerticalLayout();
        vl1.setAlignItems(Alignment.CENTER);
        vl1.add(new Image(
                "https://firebasestorage.googleapis.com/v0/b/imagenes-dd8e6.appspot.com/o/teoremapitagoras.png?alt=media&token=6492454d-6e0a-4da4-a527-4fbfc44dc3c5&_gl=1*mlsmp9*_ga*MzAzMzU0MjM2LjE2OTQ2MTYwNDY.*_ga_CW55HF8NVT*MTY5ODUwODg1Ny4yOS4xLjE2OTg1MDg5OTIuMi4wLjA.",
                ""));

        VerticalLayout vl2 = new VerticalLayout();
        vl2.setAlignItems(Alignment.CENTER);

        HorizontalLayout hl = new HorizontalLayout();
        hl.setAlignItems(Alignment.CENTER);
        hl.setWidthFull();

        NumberField cateto1 = new NumberField("Longitud del primer cateto (cm)"); // Campo para ingresar números
        NumberField cateto2 = new NumberField("Longitud del segundo cateto (cm)"); // Campo para ingresar números
        Button calcularButton = new Button("Calcular Hipotenusa"); // Este es el botón
        H3 resultado = new H3(); // Este es el resultado que aparece como un texto en H3

        calcularButton.addClickListener(event -> { // Para que el botón tenga funcionalidad
            double valorCateto1 = cateto1.getValue() != null ? cateto1.getValue() : 0;
            double valorCateto2 = cateto2.getValue() != null ? cateto2.getValue() : 0;

            if (valorCateto1 <= 0 || valorCateto2 <= 0) {
                Notification.show("Por favor, ingresa longitudes positivas para los catetos.");
                return;
            }

            double hipotenusa = calcularHipotenusa(valorCateto1, valorCateto2);

            String numeroFormateado = String.format("%.2f", hipotenusa);
            resultado.setText(String.valueOf("La Hipotenusa es de: " + numeroFormateado + " cm"));
        });

        vl2.add(new H3("Calculadora de Hipotenusa"));
        vl2.add(cateto1);
        vl2.add(cateto2);
        vl2.add(calcularButton);
        vl2.add(resultado);
        hl.add(vl1);
        hl.add(vl2);
        return hl;
    }

    public static double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
    }

}
