package br.projetoFinal.conta.dao;

import org.springframework.data.repository.CrudRepository;

import br.projetoFinal.conta.model.ContaCorrente;

public interface ContaCorrenteDAO extends CrudRepository<ContaCorrente,Integer>{

    
}
