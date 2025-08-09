package br.com.fiap.spring_mvc.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank (message = "O título é obrigatório")
    private String titulo;
    @NotBlank (message = "O autor é obrigatório")
    private String autor;
    @Enumerated(EnumType.STRING)
    @NotNull(message = "A categoria é obrigatório")
    private Categoria categoria;
    private String editora;
    @DecimalMin(value = "0.99", message = "O preço deve ser no mínimo 0.99")
    private BigDecimal preco;
    @Pattern(regexp = "^970\\d{7}$|^970\\d{10}$",
            message = "ISBN fora do padrão")
    private String isbn;
    private LocalDate dataPublicacao;

}
