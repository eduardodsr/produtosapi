# 🛍️ Produtos API

🚀 Uma API RESTful para gerenciar produtos, desenvolvida com **Spring Boot** e **JPA**, utilizando **H2 Database** para armazenamento temporário.

## 📌 Índice
- [📖 Sobre](#sobre)
- [🛠️ Tecnologias](#tecnologias)
- [⚙️ Configuração](#configuracao)
- [📌 Endpoints](#endpoints)
- [📤 Contribuição](#contribuicao)
- [📄 Licença](#licenca)

---

## 📖 Sobre

Esta API permite a criação e gerenciamento de produtos com os seguintes atributos:
- `id` (identificador único)
- `nome` (nome do produto)
- `descricao` (descrição detalhada)
- `preco` (preço do produto)

A API segue as boas práticas REST e pode ser integrada facilmente a outros sistemas.

---

## 🛠️ Tecnologias

🔧 **Stack utilizada:**
- ☕ **Java 21**
- 🌱 **Spring Boot 3**
- 🏗 **Spring Data JPA**
- 💾 **Banco de Dados H2 (Memória)**
- 🔒 **Spring Security**
- 📜 **Swagger/OpenAPI** (documentação)
- 🐳 **Docker** (para execução em container)

---

## ⚙️ Configuracao

### ✅ Pré-requisitos

Antes de começar, certifique-se de ter instalado:
- [Java 21](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)

### 🚀 Como rodar o projeto

1️⃣ Clone o repositório:
```bash
 git clone https://github.com/seu-usuario/produtos-api.git
```

2️⃣ Acesse o diretório do projeto:
```bash
 cd produtos-api
```

3️⃣ Execute a aplicação com Maven:
```bash
 mvn spring-boot:run
```

4️⃣ Acesse o console H2 para visualizar os dados:
- 🌍 URL: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
- 🛠️ Configuração padrão:
  - JDBC URL: `jdbc:h2:mem:produtos`
  - Usuário: `sa`
  - Senha: *(em branco)*

---

## 📌 Endpoints

### ➕ Criar um novo produto
```http
POST /produtos
```
**Body (JSON):**
```json
{
  "nome": "Notebook Gamer",
  "descricao": "Notebook potente para jogos",
  "preco": 4500.00
}
```
**Resposta:**
```json
{
  "id": "123e4567-e89b-12d3-a456-426614174000",
  "nome": "Notebook Gamer",
  "descricao": "Notebook potente para jogos",
  "preco": 4500.00
}
```

📌 **Mais endpoints em breve...**

---

## 📤 Contribuicao

Quer contribuir? Siga estes passos:

1️⃣ Fork o repositório 📌

2️⃣ Crie uma nova branch (`git checkout -b minha-feature`)

3️⃣ Faça as modificações e commit (`git commit -m 'Adicionando nova feature'`)

4️⃣ Envie um pull request ✅

---

## 📄 Licenca

📜 Este projeto está licenciado sob a [MIT License](LICENSE).
