package model;

public class Cliente extends Persona {

    private int puntos;

    public Cliente(String nombre, Direccion direccion, Rut rut, Tarjeta tarjeta, int puntos) {
        super(nombre, direccion, rut, tarjeta);
        this.puntos = puntos;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPuntos: " + puntos;
    }

}