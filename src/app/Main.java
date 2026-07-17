package app;

import data.GestorSistema;
import model.Producto;
import utils.LectorArchivos;

public class Main {

    public static void main(String[] args) {


        GestorSistema gestor = new GestorSistema();

        // Crear lector de archivos
        LectorArchivos lector = new LectorArchivos();



        lector.leerClientes(gestor);
        lector.leerProductos(gestor);


        System.out.println("===== CLIENTES REGISTRADOS =====");

        gestor.mostrarClientes();



        System.out.println("\n===== PRODUCTOS DISPONIBLES =====");

        gestor.mostrarProductos();



        System.out.println("\n===== PRODUCTOS MAYORES A $30.000 =====");

        gestor.mostrarProductosMayorA(30000);



        System.out.println("\n===== BUSQUEDA DE PRODUCTO =====");

        Producto productoEncontrado = gestor.buscarProducto(2);


        if (productoEncontrado != null) {

            System.out.println("Producto encontrado:");
            System.out.println(productoEncontrado);

        } else {

            System.out.println("No se encontró el producto.");

        }




        System.out.println("\n===== AGREGANDO PRODUCTO NUEVO =====");

        gestor.agregarProducto(
                5,
                "Tour Lago Llanquihue",
                28000
        );


        System.out.println("\nProductos después de agregar:");

        gestor.mostrarProductos();




        System.out.println("\n===== ELEMENTOS REGISTRABLES =====");

        gestor.mostrarRegistros();


        System.out.println("\nPrograma finalizado.");

    }

}