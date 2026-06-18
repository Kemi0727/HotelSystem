package com.kemilly.hotel.dao.impl;

import com.kemilly.hotel.dao.ReservaDAO;
import com.kemilly.hotel.model.Reserva;

import java.util.ArrayList;
import java.util.List;

public class ReservaDAOImpl implements ReservaDAO {

    @Override
    public void inserir(Reserva reserva) {

    }

    @Override
    public void atualizar(Reserva reserva) {

    }

    @Override
    public void excluir(int id) {

    }

    @Override
    public List<Reserva> listar() {
        return new ArrayList<>();
    }

    @Override
    public List<Reserva> buscarPorHospede(int idHospede) {
        return new ArrayList<>();
    }

    @Override
    public Reserva buscarPorId(int id) {
        return null;
    }
}