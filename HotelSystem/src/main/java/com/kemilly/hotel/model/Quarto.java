package com.kemilly.hotel.model;

public class Quarto {

    private int numero;
    private TipoQuarto tipo;
    private double valorDiaria;
    private StatusQuarto status;

    /*
     Classe que representa
     um quarto do hotel.
     */
    public Quarto() {
    }

    public Quarto(int numero, TipoQuarto tipo, double valorDiaria, StatusQuarto status) {
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

    public TipoQuarto getTipo() {
        return tipo;
    }

    public void setTipo(TipoQuarto tipo) {
        this.tipo = tipo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public StatusQuarto getStatus() {
        return status;
    }

    public void setStatus(StatusQuarto status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Quarto " + numero + " - " + tipo;
    }
}