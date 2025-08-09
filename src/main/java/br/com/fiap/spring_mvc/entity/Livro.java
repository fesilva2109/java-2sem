package br.com.fiap.spring_mvc.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String autor;
    @Enumerated(EnumType.STRING)
    private Categoria categoria;
    private String editora;
    private BigDecimal preco;
    private String isbn;
    private LocalDate dataPublicacao;

}
