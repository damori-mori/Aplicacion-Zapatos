package vista;

public class MenuContenido {


    public static String tituloSistema =
            "------------------------------------------\n"
          + "                 SISTEMA                  \n"+
            "------------------------------------------";

    public static String ingresarOp = "1) INGRESAR";
    public static String calzadoMujerOp = "2) Mostrar solo Calzado Mujer";
    public static String valorVentaOp = "3) Valor Venta";
    public static String calzadosTopOp = "4) Calzados Top";
    public static String totalImpuestosEspecificosOp = "5) Total Impuestos Especificos";
    public static String totalDescuentoOp = "6) Total Descuento";
    public static String salirOp = "7) Salir";



    public static void menu(){

        System.out.println(tituloSistema);
        System.out.println(ingresarOp);
        System.out.println(calzadoMujerOp);
        System.out.println(valorVentaOp);
        System.out.println(calzadosTopOp);
        System.out.println(totalImpuestosEspecificosOp);
        System.out.println(totalDescuentoOp);
        System.out.println("\n"+salirOp);

    }



}
