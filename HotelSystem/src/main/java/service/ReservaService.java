package service;

import model.Reserva;

import java.time.temporal.ChronoUnit;

/*
Classe responsável pelas regras
de negócio das reservas.
 */
public class ReservaService {

    /*
     Calcula o valor total da hospedagem.
     Fórmula:
     dias hospedados × valor da diária
     */
    public double calcularValorTotal(Reserva reserva) {

        long dias = ChronoUnit.DAYS.between(
                reserva.getCheckIn(),
                reserva.getCheckOut()
        );

        return dias * reserva.getQuarto().getValorDiaria();
    }
    /*
     Verifica se as datas são válidas.
     O check-out deve ser posterior
     ao check-in.
     */
    public boolean validarDatas(Reserva reserva) {

        return reserva.getCheckOut()
                .isAfter(reserva.getCheckIn());
    }

}