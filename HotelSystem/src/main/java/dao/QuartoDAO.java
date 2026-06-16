package dao;

import model.Quarto;
import java.util.List;

/*
 Interface responsável pelas operações
 de banco de dados da entidade Quarto.
 */
public interface QuartoDAO {

    // Inserir quarto
    void inserir(Quarto quarto);

    // Atualizar quarto
    void atualizar(Quarto quarto);

    // Excluir quarto
    void excluir(int numero);

    // Listar quartos
    List<Quarto> listar();
}