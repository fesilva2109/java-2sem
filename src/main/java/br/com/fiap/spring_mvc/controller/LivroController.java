package br.com.fiap.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/livros")
public class LivroController {
    @GetMapping("/lista")
    public String listarLivros(Model model){
        model
        return "livroLista";
    }

}
