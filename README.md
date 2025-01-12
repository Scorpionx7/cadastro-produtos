### **README para o Projeto - Cadastro de Produtos**

---

# 🛒 Cadastro de Produtos
**Organize e gerencie seus produtos de forma eficiente!**  
Este é um projeto em **Java 21**, utilizando **Spring Boot**, **MySQL** e **Docker**, que permite o cadastro,
listagem e exclusão de produtos. Ideal para pequenas aplicações ou como base para novos projetos! 🚀

---

## 📖 **Índice**
- [🚀 Sobre o Projeto](#-sobre-o-projeto)
- [🛠 Tecnologias](#-tecnologias)
- [📦 Configuração do Ambiente](#-configuração-do-ambiente)
    - [🐋 Usando Docker](#-usando-docker)
    - [🐬 Usando MySQL Local](#-usando-mysql-local)
- [📜 Endpoints](#-endpoints)
- [💻 Como Rodar o Projeto](#-como-rodar-o-projeto)
- [📧 Contato](#-contato)

---

## 🚀 **Sobre o Projeto**
O **Cadastro de Produtos** é um sistema simples e funcional que permite:
- **Cadastrar produtos:** Adicione nome, descrição, valor e disponibilidade.
- **Listar produtos:** Visualize todos os produtos cadastrados em uma interface amigável.
- **Excluir produtos:** Gerencie os dados removendo produtos desnecessários.

A aplicação é 100% configurável para rodar em **MySQL local** ou com **Docker**, permitindo flexibilidade máxima.

---

## 🛠 **Tecnologias**
As tecnologias utilizadas neste projeto são:
- **Java 21** ☕
- **Spring Boot** 🌱
- **Thymeleaf** 🌐 (para renderização de páginas)
- **MySQL** 🐬 (banco de dados relacional)
- **Docker** 🐋 (para criar um ambiente de banco de dados portátil)

---

## 📦 **Configuração do Ambiente**

### 🐋 **Usando Docker**
Se você tem o Docker instalado, basta rodar o comando abaixo para configurar o banco de dados:

```bash
docker-compose up -d
```

Isso cria um banco MySQL com as seguintes credenciais:
- **Banco de dados:** `produtos_db`
- **Usuário:** `root`
- **Senha:** `root`

### 🐬 **Usando MySQL Local**
1. Certifique-se de que o MySQL está instalado e rodando na sua máquina.
2. Crie o banco de dados:
   ```sql
   CREATE DATABASE produtos_db;
   ```
3. Configure o `application.properties` ou as variáveis de ambiente:
   ```properties
   spring.datasource.username=root
   spring.datasource.password=root
   ```

---

## 📜 **Endpoints**
Aqui estão os principais endpoints da aplicação:
- **Listagem de Produtos:** `GET /produtos`  
  Exibe a listagem de todos os produtos cadastrados.

- **Cadastro de Produtos:** `GET /produtos/cadastro`  
  Abre o formulário para cadastro de novos produtos.

- **Salvar Produto:** `POST /produtos/salvar`  
  Salva um novo produto no banco de dados.

- **Excluir Produto:** `DELETE /produtos/excluir/{id}`  
  Exclui um produto pelo ID.

---

## 💻 **Como Rodar o Projeto**

### Pré-requisitos:
- **Java 21+**
- **Maven**
- **Docker** (opcional, caso não use MySQL local)

### Passos:
1. **Clone o Repositório**:
   ```bash
   git clone <URL_DO_REPOSITORIO>
   cd cadastro
   ```

2. **Suba o Banco de Dados**:
    - **Com Docker**:
      ```bash
      docker-compose up -d
      ```
    - **Com MySQL Local**:
      Certifique-se de que o MySQL está rodando e o banco `produtos_db` está criado.

3. **Compile e Execute**:
   ```bash
   mvn spring-boot:run
   ```

4. **Acesse a Aplicação**:
   Abra o navegador e acesse:
    - [http://localhost:8080/produtos](http://localhost:8080/produtos) - Listagem de Produtos

---

## 📧 **Contato**
Entre em contato para dúvidas ou sugestões!
- 🌐 [**LinkedIn**](https://www.linkedin.com/in/estherrezende/)
- 📧 **E-mail:** [rezendealvesesther@gmail.com](mailto:rezendealvesesther@gmail.com)


![Java Badge](https://img.shields.io/badge/Java-21+-green?style=flat&logo=java)  
![Spring Boot Badge](https://img.shields.io/badge/Spring%20Boot-3.0+-green?style=flat&logo=springboot)  
![MySQL Badge](https://img.shields.io/badge/MySQL-8.0+-blue?style=flat&logo=mysql)  
![Docker Badge](https://img.shields.io/badge/Docker-Enabled-blue?style=flat&logo=docker)  
