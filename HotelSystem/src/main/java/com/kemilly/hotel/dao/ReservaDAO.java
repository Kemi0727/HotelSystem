package com.kemilly.hotel.dao;

import com.kemilly.hotel.model.Reserva;
import java.util.List;

/*
 Interface responsável pelas operações
de banco de dados da entidade Reserva.
 */
public interface ReservaDAO {

    // Criar reserva
    void inserir(Reserva reserva);

    // Atualizar reserva
    void atualizar(Reserva reserva);

    // Excluir reserva
    void excluir(int id);

    // Listar reservas
    List<Reserva> listar();

    // Buscar reservas de um hóspede específico
    List<Reserva> buscarPorHospede(int idHospede);

    // Buscar reserva pelo Id
    Reserva buscarPorId(int id);
}