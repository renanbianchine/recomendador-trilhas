# 🥾 Recomendador de Trilhas API

Meu primeiro projeto prático de back-end estruturando uma API REST. Desenvolvido como parte da minha jornada prática nos estudos de Análise e Desenvolvimento de Sistemas, com foco em dominar o ecossistema Java.


## 🚀 Tecnologias Utilizadas
* **Java 17**
* **Spring Boot** (Web, Data JPA)
* **H2 Database** (Banco de dados em memória)
* **Maven**

## ⚙️ Funcionalidades Implementadas
* **Cadastro de Trilhas (POST):** Recebe dados em JSON e persiste no banco de dados.
* **Validação de Negócio:** Bloqueia o cadastro de trilhas com nomes duplicados, retornando erro `400 Bad Request`.
* **Busca Completa (GET):** Retorna a lista de todas as trilhas cadastradas.
* **Busca Dinâmica com Filtro (GET):** Permite filtrar trilhas por nível de dificuldade através de *Query Params* (ex: `?dificuldade=DIFICIL`), gerando as consultas SQL dinamicamente via Spring Data JPA.

## 🏃 Como rodar o projeto
1. Clone este repositório.
2. Abra o projeto na sua IDE (recomendado: IntelliJ IDEA).
3. Execute a classe `RecomendadorTrilhasApplication`.
4. A API estará disponível em `http://localhost:8080/api/trilhas`.