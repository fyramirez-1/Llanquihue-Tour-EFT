package model;

public class Producto implements Registrable {

    private int codigo;
    private String nombre;
    private double precio;

    public Producto(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void registrar() {
        System.out.println("Producto registrado correctamente.");
    }

    @Override
    public void mostrarDatos() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Código: " + codigo +
                "\nNombre: " + nombre +
                "\nPrecio: $" + precio;
    }
}