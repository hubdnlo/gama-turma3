package br.projetoFinal.conta.dao;

import org.springframework.data.repository.CrudRepository;

import br.projetoFinal.conta.model.ContaEspecial;

public interface ContaEspecialDAO extends CrudRepository<ContaEspecial,Integer>{
}
