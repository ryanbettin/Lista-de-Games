# 🎮 Projeto Listagem De Jogos

Este projeto é uma **API REST** desenvolvida em **Java com Spring Boot**, utilizando **JPA/Hibernate** para persistência de dados, banco em memória **H2**, e arquitetura em camadas.  
O objetivo é gerenciar uma lista de jogos, permitindo a organização e ordenação de forma flexível.  

---

## 🚀 Tecnologias Utilizadas

- **Java 21**  
- **Spring Boot** (Web, Data JPA)  
- **Hibernate** (ORM)  
- **H2 Database** (Banco em memória para testes)  
- **PostgreSQL** (Homologação e Produção)  
- **Maven** (gerenciador de dependências)  

---

## 🏗️ Arquitetura do Projeto

O sistema segue a arquitetura em camadas, dividindo responsabilidades de forma clara:  

- **Controladores REST** → Recebem as requisições HTTP e retornam JSON.  
- **Camada de Serviço** → Contém as regras de negócio.  
- **Camada de Acesso a Dados (Repositories)** → Comunicação com o banco de dados via JPA/Hibernate.  
- **Entidades e DTOs** → Representam os modelos de dados e objetos de transferência.  

📌 Fluxo de comunicação entre **Front-end** e **Back-end**:

<img width="700" height="463" alt="Captura de tela 2025-08-25 204052" src="https://github.com/user-attachments/assets/1e83c784-33a0-4f71-b914-58f08bf6f91b" />


---

## 📊 Modelo de Domínio

O diagrama abaixo mostra as entidades do sistema e seus relacionamentos:  

- **Game** → Representa o jogo, com título, ano, gênero, plataforma, score e descrições.  
- **GameList** → Representa uma lista de jogos.  
- **Belonging** → Tabela associativa que define a posição dos jogos dentro de uma lista.  

<img width="824" height="290" alt="dslist-model" src="https://github.com/user-attachments/assets/c75f5cc7-a534-4711-8896-b6640d96c71d" />


---

## ▶️ Como Rodar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git

2. Acesse a pasta do projeto:
    ```bash
   cd seu-repositorio

3. Execute a aplicação:
   ```bash
   ./mvnw spring-boot:run

4. Acesse o console do H2 em:
      ```bash
   http://localhost:8080/h2-console

   JDBC URL: jdbc:h2:mem:testdb

   Usuário: sa

   Senha: (vazio)


# ⚙️ Perfis de Execução

## O projeto foi configurado para rodar em diferentes ambientes utilizando Spring Profiles:

🔹 1. Desenvolvimento e Testes (test)

Perfil: test

Banco de dados: H2 (em memória)

Utilizado para testes locais e execução rápida, sem necessidade de instalar banco de dados externo.

🔹 2. Homologação / Staging (dev)

Perfil: dev

Banco de dados: PostgreSQL (homologação)

Utilizado para validação e testes integrados em ambiente próximo ao de produção.

🔹 3. Produção (prod)

Perfil: prod

Banco de dados: PostgreSQL (produção)

Utilizado no ambiente final, garantindo persistência real dos dados.

## 📌 Para executar em um perfil específico, utilize a propriedade do Spring Boot

defina no application.properties:

spring.profiles.active=dev

## 📌 Endpoints Principais

GET /games → Retorna todos os jogos.

GET /lists → Retorna todas as listas de jogos.

GET /lists/{id}/games → Retorna os jogos de uma lista específica.

## 📚 Aprendizados

Estruturação de um projeto em camadas no Spring Boot.

Utilização de DTOs para transferência de dados.

Mapeamento objeto-relacional com JPA/Hibernate.

Configuração de banco em memória (H2) para testes.

Exposição de APIs REST com Spring Web.

Utilização de Spring Profiles para ambientes diferentes (test, dev, prod).
