package vista;

public class ValorVenta {

    public static void valorVentaMenu() {

        boolean loop = true;

        while (loop) {
            System.out.println("Selecciona un calzado en el listado de códigos:");

            // Mostramos el listado de códigos con un for-each
            int i = 0;
            for (String codigo : ContenidoIngreso.codigoZapatoLista) {
                System.out.println(i + ") " + codigo);
                i++;
            }

            // Leemos la opción del usuario
            int opcion;
            do {
                System.out.print("Opción seleccionada: ");
                opcion = ContenidoIngreso.sc.nextInt();
                ContenidoIngreso.sc.nextLine(); // Limpiamos el buffer de lectura
            } while (opcion < 0 || opcion >= ContenidoIngreso.codigoZapatoLista.size());

            // Mostramos el valor de venta correspondiente al código seleccionado
            String codigoSeleccionado = ContenidoIngreso.codigoZapatoLista.get(opcion);
            int indiceCodigoSeleccionado = ContenidoIngreso.codigoZapatoLista.indexOf(codigoSeleccionado);
            int valorVenta = ContenidoIngreso.valorZapatoLista.get(indiceCodigoSeleccionado);
            System.out.println("El valor de venta del calzado " + codigoSeleccionado + " es: $" + valorVenta);

            System.out.println("\nPresione cualquier tecla para volver al menú principal...");
            ContenidoIngreso.sc.nextLine(); // Esperamos a que el usuario presione una tecla
            loop=false;
        }
    }
}