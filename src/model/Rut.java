package model;

public class Rut {

    private String numero;

    public Rut(String numero) throws RutInvalidoException {

        if (numero == null || numero.isEmpty()) {
            throw new RutInvalidoException("El RUT no puede estar vacío.");
        }

        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return numero;
    }

}