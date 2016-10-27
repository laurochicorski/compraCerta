package br.com.compracerta.plataforma.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.compracerta.plataforma.entities.Conta;
import br.com.compracerta.plataforma.repositories.ContaRepository;

@Controller
@RequestMapping("/conta")
public class ContaController {

	@Autowired
	private ContaRepository contaRepository;
	
	@RequestMapping(value="/all", method= RequestMethod.GET)
	public @ResponseBody List<Conta> ConsultarTodos(){
		return contaRepository.findAll();
	}
}
