package model;

public class Quarto {

    private int numero;
    private String tipo;
    private double valorDiaria;
    private String status;

    /*
     Classe que representa
     um quarto do hotel.
     */
    public Quarto() {
    }

    public Quarto(int numero, String tipo, double valorDiaria, String status) {
        this.numero = numero;
        this.tipo = tipo;
        this.valorDiaria = valorDiaria;
        this.status = status;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Quarto " + numero + " - " + tipo;
    }
}