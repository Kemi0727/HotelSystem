package com.kemilly.hotel.service;

import com.kemilly.hotel.model.Hospede;

/*
 * Regras de negócio relacionadas
 * aos hóspedes.
 */
public class HospedeService {

    /*
     * Valida os dados do hóspede.
     */
    public void validarHospede(Hospede hospede) throws Exception {

        if (hospede.getNome() == null ||
                hospede.getNome().trim().isEmpty()) {

            throw new Exception(
                    "O nome é obrigatório."
            );
        }

        if (hospede.getCpf() == null ||
                hospede.getCpf().trim().isEmpty()) {

            throw new Exception(
                    "O CPF é obrigatório."
            );
        }

        if (hospede.getTelefone() == null ||
                hospede.getTelefone().trim().isEmpty()) {

            throw new Exception(
                    "O telefone é obrigatório."
            );
        }
    }
}