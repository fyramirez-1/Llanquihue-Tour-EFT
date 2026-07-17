package model;

public class Persona implements Registrable {

    private String nombre;
    private Direccion direccion;
    private Rut rut;
    private Tarjeta tarjeta;

    public Persona(String nombre, Direccion direccion, Rut rut, Tarjeta tarjeta) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.rut = rut;
        this.tarjeta = tarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Rut getRut() {
        return rut;
    }

    public void setRut(Rut rut) {
        this.rut = rut;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    @Override
    public void registrar() {
        System.out.println(nombre + " registrado correctamente.");
    }

    @Override
    public void mostrarDatos() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nRut: " + rut +
                "\nDireccion: " + direccion +
                "\nTarjeta: " + tarjeta;
    }

}