package vista;

import java.util.ArrayList;
import vista.Aplicacion;

public class MenuCalzaddoMujer extends ContenidoIngreso {

    public static String tituloSistema =
            "------------------------------------------\n"
                    + "           Calzado Mujer                  \n"+
                    "------------------------------------------";

    public static void menuCalzadoMujer(){

        boolean loop = true;

        while (loop){

            System.out.println(tituloSistema);

            ArrayList<Integer> indexMujer = new ArrayList<>();

            for (int i = 0; i < tipoZapatoLista.size(); i++){

                String tipoZapato = tipoZapatoLista.get(i);

                if (tipoZapato.contains("de mujer")){

                    indexMujer.add(i);
                }
            }

            if (indexMujer.isEmpty()){

                System.out.println("No hay stock de zapatos de mujer");

            }else{

                System.out.println("Se encontraron " + indexMujer.size() + " zapatos de mujer en stock:");

                for (int index : indexMujer){

                    System.out.println("Tipo de Zapato: " + tipoZapatoLista.get(index)
                            + " Dia de Venta: " + diaVentaZapatoLista.get(index)
                            + " Altura del Taco: " + sizeTacon.get(index)
                            + " Descuento: " + descuento.get(index));
                }
            }

            System.out.println("Presione Enter para continuar...");
            sc.nextLine();
            loop = false;

        }
    }
}