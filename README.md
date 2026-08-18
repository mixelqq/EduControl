# 🎓 EduControl — Sistema de Cursos e Matrículas

## 📌 Sobre o projeto

O **EduControl** é um sistema desenvolvido em **Java** com o objetivo de representar o gerenciamento de uma instituição de ensino.

O sistema permite representar informações sobre **alunos, professores, cursos e matrículas**, aplicando conceitos de **Programação Orientada a Objetos (POO)**.

---

## 🎯 Objetivo

O objetivo do projeto é desenvolver uma aplicação simples que represente o funcionamento de uma instituição de ensino, utilizando **classes, atributos, métodos e objetos**.

---

## 👥 Entidades do sistema

| Classe | Descrição |
|---|---|
| 👨‍🎓 `Aluno` | Representa os estudantes |
| 👨‍🏫 `Professor` | Representa os professores |
| 📚 `Curso` | Representa os cursos oferecidos |
| 📝 `Matricula` | Representa a matrícula de um aluno em um curso |
| ▶️ `Main` | Executa e demonstra o funcionamento do sistema |

---

## 💻 Tecnologias utilizadas

- ☕ **Java**
- 💻 **Visual Studio Code**
- 🐙 **GitHub**

---
# Diagrama atulizado:  
```mermaid
classDiagram
  class Aluno {
    -id: int
    -nome: String
    -email: String
    -matriculado: boolean
    +Aluno(id, nome, email)
    +getId() int
    +getNome() String
    +getEmail() String
    +isMatriculado() boolean
    +matricular() void
    +exibirInformacoes() void
  }
  class Professor {
    -id: int
    -nome: String
    -email: String
    -lecionando: boolean
    +Professor(id, nome, email)
    +getId() int
    +getNome() String
    +getEmail() String
    +isLecionando() boolean
    +lecionar() void
    +exibirInformacoes() void
  }
  class Curso {
    -id: int
    -nome: String
    -descricao: String
    -turno: Turno
    -vagasTotais: int
    -vagasOcupadas: int
    +Curso(id, nome, descricao, turno, vagasTotais)
    +getId() int
    +getTurno() Turno
    +adicionarAluno() void
    +exibirInformacoes() void
  }
  class Matricula {
    -id: int
    -aluno: Aluno
    -curso: Curso
    -data: String
    -status: StatusMatricula
    +Matricula(id, aluno, curso, data)
    +getStatus() StatusMatricula
    +confirmar() void
    +cancelar() void
    +exibirInformacoes() void
  }
  class Turno {
    <<enumeration>>
    MATUTINO
    VESPERTINO
    NOTURNO
  }
  class StatusMatricula {
    <<enumeration>>
    PENDENTE
    CONFIRMADA
    CANCELADA
  }
  Matricula "many" --> "1" Aluno : refere-se a
  Matricula "many" --> "1" Curso : refere-se a
  Curso --> Turno : possui
  Matricula --> StatusMatricula : possui
```





## 📂 Estrutura do projeto

```text
poo-edu-control/
│
├── Main.java
├── Aluno.java
├── Professor.java
├── Curso.java
├── Matricula.java
├── README.md
│
└── img/
    ├── imagem1.png
    └── imagem2.png


