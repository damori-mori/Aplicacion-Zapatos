package vista;

import java.util.Scanner;

public class Aplicacion {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Se crea un scanner para poder recibir parametros del ususario
        boolean menu1;
         //se crea un booleano Menu1 para iniciar un loop con el menu

        ContenidoIngreso.tipoZapatoLista.add(0,"de hombre");
        ContenidoIngreso.valorZapatoLista.add(0, 10000);
        ContenidoIngreso.codigoZapatoLista.add(0,"H000REG");
        ContenidoIngreso.diaVentaZapatoLista.add(0,"Semana");
        ContenidoIngreso.color.add(0, "rojo");
        ContenidoIngreso.sizeTacon.add(0,null);
        ContenidoIngreso.descuento.add(0,0.25);

        ContenidoIngreso.tipoZapatoLista.add(1,"de mujer");
        ContenidoIngreso.valorZapatoLista.add(1, 20000);
        ContenidoIngreso.codigoZapatoLista.add(1,"M000REG");
        ContenidoIngreso.diaVentaZapatoLista.add(1,"Fin de semana");
        ContenidoIngreso.color.add(1, null);
        ContenidoIngreso.sizeTacon.add(1,8);
        ContenidoIngreso.descuento.add(1,0.15);

        ContenidoIngreso.tipoZapatoLista.add(2,"deportivo");
        ContenidoIngreso.valorZapatoLista.add(2, 30000);
        ContenidoIngreso.codigoZapatoLista.add(2,"D000REG");
        ContenidoIngreso.diaVentaZapatoLista.add(2,"Semana");
        ContenidoIngreso.color.add(2, null);
        ContenidoIngreso.sizeTacon.add(2,null);
        ContenidoIngreso.descuento.add(2,0.0);

        ContenidoIngreso.tipoZapatoLista.add(3,"de hombre");
        ContenidoIngreso.valorZapatoLista.add(3, 50000);
        ContenidoIngreso.codigoZapatoLista.add(3,"H001REG");
        ContenidoIngreso.diaVentaZapatoLista.add(3,"Semana");
        ContenidoIngreso.color.add(3, "verde");
        ContenidoIngreso.sizeTacon.add(3,null);
        ContenidoIngreso.descuento.add(3,0.25);

        ContenidoIngreso.tipoZapatoLista.add(4,"de mujer");
        ContenidoIngreso.valorZapatoLista.add(4, 80000);
        ContenidoIngreso.codigoZapatoLista.add(4,"M001REG");
        ContenidoIngreso.diaVentaZapatoLista.add(4,"Fin de semana");
        ContenidoIngreso.color.add(4, null);
        ContenidoIngreso.sizeTacon.add(4,13);
        ContenidoIngreso.descuento.add(4,0.35);

        ContenidoIngreso.tipoZapatoLista.add(5,"deportivo");
        ContenidoIngreso.valorZapatoLista.add(5, 90000);
        ContenidoIngreso.codigoZapatoLista.add(5,"D000TOP");
        ContenidoIngreso.diaVentaZapatoLista.add(5,"Semana");
        ContenidoIngreso.color.add(5, null);
        ContenidoIngreso.sizeTacon.add(5,null);
        ContenidoIngreso.descuento.add(5,0.0);

        ContenidoIngreso.tipoZapatoLista.add(6,"de hombre");
        ContenidoIngreso.valorZapatoLista.add(6, 50000);
        ContenidoIngreso.codigoZapatoLista.add(6,"H002REG");
        ContenidoIngreso.diaVentaZapatoLista.add(6,"Semana");
        ContenidoIngreso.color.add(6,"amarillo");
        ContenidoIngreso.sizeTacon.add(6,null);
        ContenidoIngreso.descuento.add(6,0.0);

        ContenidoIngreso.tipoZapatoLista.add(7,"de mujer");
        ContenidoIngreso.valorZapatoLista.add(7, 100000);
        ContenidoIngreso.codigoZapatoLista.add(7,"H000TOP");
        ContenidoIngreso.diaVentaZapatoLista.add(7,"Fin de semana");
        ContenidoIngreso.color.add(7, null);
        ContenidoIngreso.sizeTacon.add(7,11);
        ContenidoIngreso.descuento.add(7,0.35);

        do {
            MenuContenido.menu();
            menu1=true;//Mientras sea true el loop se mantiene activo
            int selectOp = sc.nextInt();//se crea un scaner para poder seleccionar una ded las opciones



            switch (selectOp){

                case 1:
                    ContenidoIngreso.menuIngreso();
                    break;
                case 2:
                    MenuCalzaddoMujer.menuCalzadoMujer();
                    break;
                case 3:
                    ValorVenta.valorVentaMenu();
                    break;
                case 4:
                    int count = 0;
                    for (int i = 0; i < ContenidoIngreso.valorZapatoLista.size(); i++) {
                        if (ContenidoIngreso.valorZapatoLista.get(i) > 80000) {
                            count++;
                        }
                    }
                    System.out.println("Cantidad de calzados cuyo valorVenta es mayor a $80000: " + count);
                    sc.nextLine();
                    sc.nextLine();
                    break;
                case 5:
                    ContenidoIngreso.impuestoEspecifico();
                    System.out.println(ContenidoIngreso.impuestoEspecifico());
                    sc.nextLine();
                    sc.nextLine();
                    break;
                case 6:
                    ContenidoIngreso.totalDescuento();
                    break;
                case 7: //si se preciona 7 menu1=false, lo que cierra la app
                    menu1=false;
                    break;
                default:
                    break;

            }

        }while (menu1);

    }














}
