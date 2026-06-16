package dao;

import model.Hospede;
import java.util.List;

/*
 Interface responsável pelas operações
 de banco de dados da entidade Hospede.
 */
public interface HospedeDAO {

    // Inserir um novo hóspede
    void inserir(Hospede hospede);

    // Atualizar um hóspede existente
    void atualizar(Hospede hospede);

    // Excluir um hóspede pelo ID
    void excluir(int id);

    // Retornar todos os hóspedes cadastrados
    List<Hospede> listar();
}