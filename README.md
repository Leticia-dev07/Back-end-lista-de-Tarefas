# 📦 Tarefas API — Backend (Spring Boot)

API REST para gerenciamento de tarefas, desenvolvida com **Spring Boot + H2 (banco em memória)**. Fornece todos os endpoints necessários para o CRUD do aplicativo mobile.

---

## 🚀 Funcionalidades

- Listar todas as tarefas
- Buscar tarefa por ID
- Criar nova tarefa
- Atualizar tarefa existente
- Excluir tarefa
- Console H2 para visualização do banco em tempo real

---

## 🛠️ Tecnologias

| Tecnologia | Versão |
|---|---|
| Java | 17 |
| Spring Boot | 4.0.6 |
| Spring Data JPA | — |
| Hibernate | 7.x |
| H2 Database | 2.4.x (in-memory) |
| Maven | — |

---

## 📦 Instalação e execução

### Pré-requisitos

- [JDK 17](https://adoptium.net/) ou superior
- [Maven](https://maven.apache.org/) **ou** use o wrapper `mvnw` incluído no projeto

### Passos

```bash
# 1. Clone o repositório
git clone https://github.com/Leticia-dev07/Back-end-lista-de-Tarefas.git
cd back-end-lista-de-tarefas

# 2. Execute com Maven Wrapper (não precisa ter Maven instalado)
./mvnw spring-boot:run        # Linux/Mac
mvnw.cmd spring-boot:run      # Windows

# Ou, se tiver Maven instalado globalmente:
mvn spring-boot:run
```

A API estará disponível em: **`http://localhost:8082`**

> ⚠️ Certifique-se de que a porta 8082 não está em uso. Caso esteja, rode no terminal:
> `netstat -ano | findstr :8082` e encerre o processo com `taskkill /PID <numero> /F`

---

## ⚙️ Configuração

Arquivo: `src/main/resources/application.properties`

```properties
spring.application.name=tarefas-api

# Banco de dados H2 em memória
spring.datasource.url=jdbc:h2:mem:tarefasdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

# Console H2 (acessível via browser)
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

server.port=8082
```

> 💡 O banco H2 é **em memória** — os dados são perdidos ao reiniciar a aplicação. Ideal para desenvolvimento e testes.

---

## 🗄️ Console H2

Após iniciar a aplicação, acesse o banco pelo browser:

```
URL:      http://localhost:8082/h2-console
JDBC URL: jdbc:h2:mem:tarefasdb
Usuário:  sa
Senha:    (deixe em branco)
```

---

## 📁 Estrutura do projeto

```
src/main/java/com/example/demo/
├── TarefasApiApplication.java      # Classe principal (main)
├── controller/
│   └── TarefaController.java       # Endpoints REST
├── service/
│   └── TarefaService.java          # Regras de negócio
├── model/
│   └── Tarefa.java                 # Entidade JPA
└── repository/
    └── TarefaRepository.java       # Interface Spring Data JPA

src/main/resources/
└── application.properties          # Configurações da aplicação
```

---

## 📡 Endpoints da API

Base URL: `http://localhost:8082`

### GET `/tarefas`
Lista todas as tarefas.

**Resposta 200:**
```json
[
  {
    "id": 1,
    "titulo": "Estudar React Native",
    "descricao": "Completar os exercícios do módulo 3",
    "concluida": false
  }
]
```

---

### GET `/tarefas/{id}`
Busca uma tarefa pelo ID.

**Resposta 200:**
```json
{
  "id": 1,
  "titulo": "Estudar React Native",
  "descricao": "Completar os exercícios do módulo 3",
  "concluida": false
}
```

---

### POST `/tarefas`
Cria uma nova tarefa.

**Body (JSON):**
```json
{
  "titulo": "Estudar React Native",
  "descricao": "Completar os exercícios do módulo 3",
  "concluida": false
}
```

**Resposta 200:**
```json
{
  "id": 1,
  "titulo": "Estudar React Native",
  "descricao": "Completar os exercícios do módulo 3",
  "concluida": false
}
```

---

### PUT `/tarefas/{id}`
Atualiza uma tarefa existente.

**Body (JSON):**
```json
{
  "titulo": "Estudar React Native",
  "descricao": "Completar os exercícios do módulo 3",
  "concluida": true
}
```

**Resposta 200:** tarefa atualizada (mesmo formato do POST)

---

### DELETE `/tarefas/{id}`
Remove uma tarefa pelo ID.

**Resposta 200:** sem corpo

---

## 🔗 Frontend

Repositório do app mobile: [TodoApp — React Native](https://github.com/seu-usuario/todo-app-mobile)
