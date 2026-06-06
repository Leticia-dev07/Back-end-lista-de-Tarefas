# 📝 Back-end Lista de Tarefas

API REST desenvolvida com Spring Boot para gerenciamento de tarefas (To-Do List).

## 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database
- Maven

## 📌 Funcionalidades

- Criar tarefa
- Listar tarefas
- Atualizar tarefa
- Excluir tarefa
- Marcar tarefa como concluída

## 📂 Estrutura do Projeto

src/main/java

├── controller

├── model

├── repository

├── service

└── TarefasApiApplication

## 🗄️ Modelo da Entidade

### Tarefa

| Campo | Tipo |
|---------|---------|
| id | Long |
| titulo | String |
| descricao | String |
| concluida | Boolean |

## ▶️ Executando o Projeto

### Clonar o repositório

```bash
git clone https://github.com/Leticia-dev07/Back-end-lista-de-Tarefas.git
```

### Entrar na pasta

```bash
cd Back-end-lista-de-Tarefas
```

### Executar

```bash
mvn spring-boot:run
```

A aplicação ficará disponível em:

```
http://localhost:8081
```

## 📡 Endpoints

### Listar tarefas

```http
GET /tarefas
```

### Criar tarefa

```http
POST /tarefas
```

Body:

```json
{
  "titulo": "Estudar Spring",
  "descricao": "Aprender Hibernate e JPA",
  "concluida": false
}
```

### Atualizar tarefa

```http
PUT /tarefas/{id}
```

### Excluir tarefa

```http
DELETE /tarefas/{id}
```

## 💾 Banco de Dados H2

Console H2:

```
http://localhost:8081/h2-console
```

JDBC URL:

```
jdbc:h2:mem:tarefasdb
```

Usuário:

```
sa
```

Senha:

```
(em branco)
```

## 👩‍💻 Desenvolvedora

Letícia Gabrielle

- GitHub: https://github.com/Leticia-dev07
- LinkedIn: https://linkedin.com/in/leticia-gabrielle-dev
