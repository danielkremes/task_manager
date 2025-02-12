# Task Manager

## [Projeto demonstração em video](https://youtu.be/ra941bTsTQc)

Este projeto é uma **API do gerenciador de tarefas** criada com o **Spring Boot**, que oferece funcionalidade para criar, atualizar, recuperar e excluir tarefas. Ele inclui suporte para filtragem de tarefas com base em seu status de conclusão.

## Recursos

- Recuperar todas as tarefas.
- Recuperar uma tarefa específica por seu ID.
- Criar novas tarefas.
- Atualizar tarefas existentes.
- Excluir tarefas por seu ID.
- Filtrar tarefas com base em seu status de conclusão.

## Tecnologias usadas

- Java**: Linguagem de programação principal.
- Spring Boot**: Estrutura para criar a API.
- Spring Data JPA**: Para interações com o banco de dados.
- Lombok**: Simplifica o código boilerplate.
- Jakarta Persistence API (JPA)**: Para ORM e gerenciamento de entidades.
- Banco de dados Postgresql: Para testes ou como um banco de dados durante o desenvolvimento.

## Pré-requisitos

Para executar esse projeto, verifique se você tem o seguinte instalado:

- Java 17 ou posterior.
- Maven 3.6+.

## Estrutura do projeto

- Controlador**: Contém os pontos de extremidade da API REST para gerenciar tarefas.
- **`entity`**: Representa a entidade Task com campos como `title`, `description`, `completed` e `dueDate`.
- **`repositório`**: Fornece as operações de banco de dados usando JPA.
- Serviço: Contém a lógica comercial e atua como uma ponte entre as camadas do controlador e do repositório.

## Pontos de extremidade

### URL base: `/task`

#### 1. **Get all tasks**
- **URL**: `GET /task`
- **Resposta**: Lista de todas as tarefas.

#### 2. **Get task by ID**
- **URL**: `GET /task/{id}`
- Variável de caminho**: `id` (Long) - ID da tarefa.
- **Resposta**: Detalhes da tarefa ou 404 se não for encontrada.

#### 3. **Criar uma nova tarefa**
- **URL**: `POST /task`
- **Request Body**:
  ```json
  {
    “title": “Tarefa de amostra”,
    “description” (descrição): “Descrição da tarefa”,
    “completed” (concluído): false,
    “dueDate": “2025-02-20”
  }
  ```
- **Resposta**: Tarefa criada.

#### 4. **Update a task**
- **URL**: `PUT /task/{id}`
- **Variável de caminho**: `id` (Long) - ID da tarefa.
- **Corpo da solicitação**:
  ```json
  {
    “title": “Tarefa atualizada”,
    “description": “Descrição atualizada”,
    “completed” (concluído): true,
    “dueDate": “2025-03-15”
  }
  ```
- **Resposta**: Tarefa atualizada.

#### 5. **Deletar uma tarefa**
- **URL**: `DELETE /task/{id}`
- Variável de caminho**: `id` (Long) - ID da tarefa.
- **Resposta**: 204 Sem conteúdo.

#### 6. **Obter tarefas por status de conclusão**
- **URL**: `GET /task/status/{completed}`
- **Variável de caminho**: `completed` (booleano) - `true` para tarefas concluídas, `false` para tarefas incompletas.
- **Resposta**: Lista de tarefas filtradas por status de conclusão.

## Execução do aplicativo

1. Clone o repositório:
   ```bash
   git clone https://github.com/your-username/task-manager-api.git
   cd task-manager-api

Última atualização: 12/2/2025