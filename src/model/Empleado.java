package model;

public class Empleado extends Persona {

    private String cargo;

    public Empleado(String nombre, Direccion direccion, Rut rut, Tarjeta tarjeta, String cargo) {
        super(nombre, direccion, rut, tarjeta);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCargo: " + cargo;
    }

}