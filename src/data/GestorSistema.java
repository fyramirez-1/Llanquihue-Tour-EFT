package data;

import model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GestorSistema {

    private ArrayList<Persona> personas;
    private ArrayList<Producto> productos;
    private HashMap<Integer, Producto> mapaProductos;
    private List<Registrable> registros;


    public GestorSistema() {

        personas = new ArrayList<>();
        productos = new ArrayList<>();
        mapaProductos = new HashMap<>();
        registros = new ArrayList<>();

    }



    public void agregarPersona(Persona persona) {

        personas.add(persona);
        registros.add(persona);

    }



    public void agregarProducto(Producto producto) {

        productos.add(producto);
        mapaProductos.put(producto.getCodigo(), producto);
        registros.add(producto);

    }



    public void agregarProducto(int codigo, String nombre, double precio) {

        Producto producto = new Producto(codigo, nombre, precio);

        agregarProducto(producto);

    }



    public void mostrarPersonas() {

        for (Persona persona : personas) {

            System.out.println(persona);
            System.out.println("-------------------------");

        }

    }



    public void mostrarClientes() {

        for (Persona persona : personas) {

            if (persona instanceof Cliente) {

                System.out.println(persona);
                System.out.println("-------------------------");

            }

        }

    }



    public void mostrarProductos() {

        for (Producto producto : productos) {

            System.out.println(producto);
            System.out.println("-------------------------");

        }

    }



    public void mostrarProductosMayorA(double precio) {

        for (Producto producto : productos) {

            if (producto.getPrecio() > precio) {

                System.out.println(producto);
                System.out.println("-------------------------");

            }

        }

    }



    public Producto buscarProducto(int codigo) {

        return mapaProductos.get(codigo);

    }



    public void mostrarRegistros() {

        for (Registrable registro : registros) {

            registro.mostrarDatos();
            System.out.println("-------------------------");

        }

    }




    public ArrayList<Persona> getPersonas() {

        return personas;

    }


    public ArrayList<Producto> getProductos() {

        return productos;

    }

}