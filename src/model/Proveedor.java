package model;

public class Proveedor extends Persona {

    private String empresa;

    public Proveedor(String nombre, Direccion direccion, Rut rut, Tarjeta tarjeta, String empresa) {
        super(nombre, direccion, rut, tarjeta);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nEmpresa: " + empresa;
    }

}