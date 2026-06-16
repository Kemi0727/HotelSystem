package service;

import model.Reserva;

/*
 Classe responsável pelas regras
 relacionadas aos quartos.
 */
public class QuartoService {

    /*
    verificar:
     - Disponibilidade do quarto
     - Alteração de status
     - Regras de ocupação
     */

    /*
     Ocupa o quarto quando o
     hóspede realiza check-in.
     */
    public void ocuparQuarto(Reserva reserva) {

        reserva.getQuarto().setStatus("Ocupado");
    }

    /*
     Libera o quarto quando o
     hóspede realiza check-out.
     */
    public void liberarQuarto(Reserva reserva) {

        reserva.getQuarto().setStatus("Disponível");
    }

}