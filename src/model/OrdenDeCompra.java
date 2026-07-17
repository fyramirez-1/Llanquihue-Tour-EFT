package model;

import java.util.ArrayList;

public class OrdenDeCompra {

    private int numeroOrden;
    private Cliente cliente;
    private ArrayList<Producto> productos;

    public OrdenDeCompra(int numeroOrden, Cliente cliente) {
        this.numeroOrden = numeroOrden;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public int getNumeroOrden() {
        return numeroOrden;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularTotal() {

        double total = 0;

        for (Producto producto : productos) {
            total += producto.getPrecio();
        }

        return total;
    }

    @Override
    public String toString() {

        String texto = "Orden N° " + numeroOrden + "\n";
        texto += "Cliente: " + cliente.getNombre() + "\n";
        texto += "Productos:\n";

        for (Producto producto : productos) {
            texto += producto.getNombre() + " - $" + producto.getPrecio() + "\n";
        }

        texto += "Total: $" + calcularTotal();

        return texto;
    }

}