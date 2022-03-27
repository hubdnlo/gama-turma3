package br.projetoFinal.conta.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;

import br.projetoFinal.conta.dao.ContaCorrenteDAO;
import br.projetoFinal.conta.model.ContaCorrente;

@CrossOrigin
@RestController
public class ContaCorrenteController {

    @Autowired
	private ContaCorrenteDAO dao;

	@GetMapping("/conta-corrente/buscar")
	public ArrayList<ContaCorrente> recuperarTudasContasCorrente(){
		ArrayList<ContaCorrente> lista;
		lista = (ArrayList<ContaCorrente>)dao.findAll();
		return lista;
		}
	
	@GetMapping("/conta-corrente/buscar/{numero}")
	public ContaCorrente recuperarContaCorrente(@PathVariable int numero) {
		return dao.findById(numero).orElse(null);
	}

	@PostMapping("/conta-corrente/cadastrar")
	public ContaCorrente criarContaCorrente(ContaCorrente contaCorrente) {
		return dao.save(contaCorrente);
	}

	@DeleteMapping("/conta-corrente/deletar/{numero}")
	public void deletarContaCorrente(@PathVariable int numero) {
		dao.deleteById(numero);
	}

}
