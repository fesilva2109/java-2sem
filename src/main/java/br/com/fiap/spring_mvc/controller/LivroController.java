package br.com.fiap.spring_mvc.controller;

import br.com.fiap.spring_mvc.entity.Livro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/livros")
public class LivroController {
    @GetMapping("/lista")
    public String listarLivros(Model model){
        Livro livro1 = new Livro();
        livro1.setId(1L);
        livro1.setTitulo("Harry Potter");
        Livro livro2 = new Livro();
        livro2.setId(2L);
        livro2.setTitulo("Percy Jackson");
        List<Livro> livros = List.of(livro1, livro2);
        model.addAttribute("listaLivros", livros);
        return "livroLista";
    }

}
