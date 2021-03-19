package br.com.sbs.estacionamento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.sbs.estacionamento.entities.Veiculo;
import br.com.sbs.estacionamento.service.VeiculoService;

@Controller
@RequestMapping("/veiculos")
public class VeiculoController {

	@Autowired
	private VeiculoService veiculoService;

	@RequestMapping("novoVeiculo")
	public String form() {
		return "formVeiculo";
	}

	@RequestMapping("/listaTodos")
	public ModelAndView lista() {
		ModelAndView model = new ModelAndView("listaVeiculos");
		List<Veiculo> veiculos = veiculoService.findAll();
		model.addObject("veiculos", veiculos);
		return model;
	}

	@RequestMapping()
	public String showForm() {
		return "index";
	}

	@RequestMapping("adicionaTarefa")
	public String adicionaTarefa(Veiculo veiculo) {	

		veiculoService.adiciona(veiculo);
		return "tarefa/adicionada";
	}
}
