package com.kemilly.hotel.service;

import com.kemilly.hotel.model.Quarto;
import com.kemilly.hotel.model.StatusQuarto;

/*
 * Regras relacionadas aos quartos.
 */
public class QuartoService {

    /*
     * Ocupa um quarto.
     */
    public void ocuparQuarto(
            Quarto quarto) {

        quarto.setStatus(
                StatusQuarto.OCUPADO
        );
    }

    /*
     * Libera um quarto.
     */
    public void liberarQuarto(
            Quarto quarto) {

        quarto.setStatus(
                StatusQuarto.DISPONIVEL
        );
    }

    public void validarQuarto(Quarto quarto)
            throws Exception {

        if (quarto.getValorDiaria() <= 0) {

            throw new Exception(
                    "A diária deve ser maior que zero."
            );
        }
    }

}