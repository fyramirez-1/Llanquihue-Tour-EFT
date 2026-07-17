package utils;

import data.GestorSistema;
import model.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectorArchivos {

    public void leerClientes(GestorSistema gestor) {

        try {

            BufferedReader br = new BufferedReader(new FileReader("clientes.txt"));

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");

                String nombre = datos[0];
                Rut rut = new Rut(datos[1]);
                Direccion direccion = new Direccion(datos[2], datos[3]);
                Tarjeta tarjeta = new Tarjeta(datos[4], datos[5]);
                int puntos = Integer.parseInt(datos[6]);

                Cliente cliente = new Cliente(nombre, direccion, rut, tarjeta, puntos);

                gestor.agregarPersona(cliente);

            }

            br.close();

        } catch (IOException e) {

            System.out.println("Error al leer clientes.");

        } catch (RutInvalidoException e) {

            System.out.println(e.getMessage());

        }

    }

    public void leerProductos(GestorSistema gestor) {

        try {

            BufferedReader br = new BufferedReader(new FileReader("productos.txt"));

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");

                int codigo = Integer.parseInt(datos[0]);
                String nombre = datos[1];
                double precio = Double.parseDouble(datos[2]);

                Producto producto = new Producto(codigo, nombre, precio);

                gestor.agregarProducto(producto);

            }

            br.close();

        } catch (IOException e) {

            System.out.println("Error al leer productos.");

        }

    }

}