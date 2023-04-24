package vista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContenidoIngreso {



    public static String tituloIngreso =
            "------------------------------------------\n"
          + "                 INGRESO                  \n"+
            "------------------------------------------";
    public static void tituloIngresoMetodo(){System.out.println(ContenidoIngreso.tituloIngreso);} //imprime el titulo del menu

    public static String pregunta1 = "¿Que tipo de zapato es?";
    public static String hombreOp = "1) Hombre";
    public static String mujerOp = "2) Mujer";
    public static String deportivoOp = "3) Deportivo";
    public static String pregunta2 = "¿Cual es el valor de venta?";
    public static String pregunta3 = "¿Cual es el Codigo?";
    public static  String pregunta4 = "¿Se vende en Dia de Semana o Fin de Semana?";

    static Scanner sc = new Scanner(System.in);

    public static ArrayList<String> tipoZapatoLista = new ArrayList<>();
    public static ArrayList<Integer> valorZapatoLista = new ArrayList<>();
    public static List<String> codigoZapatoLista = new ArrayList<>();
    public static List<String> diaVentaZapatoLista = new ArrayList<>();
    public static ArrayList<String> color = new ArrayList<>();
    public static ArrayList<Integer> sizeTacon = new ArrayList<>();
    public static ArrayList<Double> descuento = new ArrayList<>();


    public static void menuIngreso(){




        int i =7;

        tituloIngresoMetodo();
        System.out.println(pregunta1); //------------------PREGUNTA 1

        i++;
        System.out.println(hombreOp+mujerOp+deportivoOp);


        boolean loopPregunta1 = true;
        do{
            int tipoZapatoInt = sc.nextInt();
            sc.nextLine();
            if(tipoZapatoInt ==1){
                tipoZapatoLista.add(i,"de Hombre");
                System.out.println("¿De que color es?");
                sizeTacon.add(i,null);
                String respuestaColor = sc.nextLine().toLowerCase();

                if (respuestaColor.equals("rojo")){

                    respuestaColor="Rojo";
                    color.add(i,respuestaColor);
                    loopPregunta1 = false;

                }else if (respuestaColor.equals("verde")){

                    respuestaColor="Verde";
                    color.add(i,respuestaColor);
                    loopPregunta1 = false;

                }
                else {
                    color.add(i,respuestaColor);
                    loopPregunta1 = false;
                }

            }
            else if (tipoZapatoInt == 2) { //----------------ZAPATOS MUJER
                tipoZapatoLista.add(i,"de Mujer");
                color.add(i,null);
                System.out.println("¿Cual es el tamaño del tacon?");
                int sizeTaconInt = sc.nextInt();
                if (sizeTaconInt >= 10){
                    sizeTacon.add(i,sizeTaconInt);
                    descuento.add(i,0.2);
                    loopPregunta1 = false;
                }else{loopPregunta1 = false;}
            }
            else if (tipoZapatoInt == 3) {
                tipoZapatoLista.add(i,"Deportivo");
                loopPregunta1 = false;
            }
            else {System.out.println("esa no es una opcion valida");}
        }while (loopPregunta1);


        System.out.println(pregunta2);//------------------PREGUNTA 2
        System.out.println("reponder sin caracteres especiales, solo numeros enteros!");

        valorZapatoLista.add(i, sc.nextInt());

        sc.nextLine();
        System.out.println(pregunta3); //------------------PREGUNTA 3
        boolean loopPregunta3;

        do {

            String codigoZapato = sc.nextLine();

            if (codigoZapatoLista.contains(codigoZapato)) {
                System.out.println(codigoZapato + " Ya esta en uso");
                loopPregunta3 = true;
            } else {
                codigoZapatoLista.add(i, codigoZapato);
                loopPregunta3 = false;
            }
        }while (loopPregunta3);

        System.out.println(pregunta4); //------------------PREGUNTA 4
        boolean loopPregunta4=true;

        do{

            String respuesta = sc.nextLine();
            String respuestaMinusculas = respuesta.toLowerCase();

            if(respuestaMinusculas.equals("fin de semana")){
                respuesta = "Fin de Semana";
                diaVentaZapatoLista.add(i,respuesta);
                loopPregunta4 = false;
            } else if (respuestaMinusculas.equals("dia de semana")) {
                respuesta = "Dia de Semana";
                diaVentaZapatoLista.add(i,respuesta);
                loopPregunta4 = false;
            }
            else {System.out.println("esa no es una opcion valida");}


        }while (loopPregunta4);


        System.out.println("el zapato es " + tipoZapatoLista.get(i) + ", su Valor es de $" + valorZapatoLista.get(i) + " y su codigo es " + codigoZapatoLista.get(i));
        System.out.println("el dia ed venta es "+diaVentaZapatoLista.get(i));
        System.out.println("para salir del menu ingresa '1'"); //------------------SALIR
        boolean preguntaSalir = true;
        do {
            int salir = sc.nextInt();
            if (salir == 1) {
                preguntaSalir = false;
            } else {
                System.out.println("esa no es una opcion valida");
            }
        }while (preguntaSalir);


    }

    public static double impuestoEspecifico() {
        double sumaImpuestos = 0;
        for (int i = 0; i < tipoZapatoLista.size(); i++) {
            String tipoZapato = tipoZapatoLista.get(i);
            int valorVenta = valorZapatoLista.get(i);
            if (!tipoZapato.equals("Deportivo")) {
                double impuesto = valorVenta * 0.074;
                sumaImpuestos += impuesto;
            }
        }
        return sumaImpuestos;
    }

    public static void totalDescuento() {
        double totalDescuento = 0.0;

        for (int i = 0; i < descuento.size(); i++) {
            if (descuento.get(i) > 0) {
                totalDescuento += (valorZapatoLista.get(i) * descuento.get(i) / 100);
            }
        }

        System.out.println("El total de descuento en toda la tienda es: $" + totalDescuento);
        sc.nextLine();

    }


}
