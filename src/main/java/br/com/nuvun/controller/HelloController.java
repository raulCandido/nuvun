package br.com.nuvun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("oi")
	public String teste(Model model) {
		model.addAttribute("texto", "texto que aparece na tela");
		return "hello";
	}
}
