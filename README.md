# Spring MVC Project

Este é um projeto incremental de ensino de Spring MVC + Thymeleaf.

## Tecnologias Utilizadas

### Backend
- **Java 21**: Linguagem de programação utilizada no projeto.
- **Spring Boot 3.5.4**: Framework para facilitar o desenvolvimento de aplicações Java.
- **Spring MVC**: Implementação do padrão MVC para desenvolvimento web.
- **Spring Data JPA**: Facilita a implementação de repositórios baseados em JPA.
- **Hibernate**: ORM (Object-Relational Mapping) para persistência de dados.
- **H2 Database**: Banco de dados em memória para desenvolvimento e testes.

### Frontend
- **Thymeleaf**: Engine de templates para aplicações web em Java.

### Ferramentas de Build
- **Gradle**: Ferramenta de automação de build.

### Validação
- **Spring Boot Validation**: Biblioteca para validação de dados.

## Estrutura do Projeto

O projeto segue uma estrutura padrão de aplicações Spring Boot:

- `src/main/java/br/com/fiap/spring_mvc/`: Código-fonte Java
  - `entity/`: Classes de entidade (Categoria, Livro)
  - `repository/`: Interfaces de repositório para acesso a dados
  - `SpringMvcApplication.java`: Classe principal da aplicação

## Como Executar

Para executar o projeto localmente:

1. Clone o repositório
2. Navegue até a pasta do projeto
3. Execute o comando: `./gradlew bootRun`
4. Acesse a aplicação em: `http://localhost:8080`