# ⚔️ Mini RPG Java

Um mini RPG de fantasia medieval desenvolvido em Java para praticar lógica de programação por meio de um jogo de combate por turnos executado no terminal.

O projeto está sendo desenvolvido por etapas, com o objetivo de implementar mecânicas de jogo e aplicar os conhecimentos adquiridos durante meus estudos de Java.

## 🎮 Sobre o projeto

O jogador assume o papel de um aventureiro que encontrará monstros durante sua jornada. Ao longo do desenvolvimento, o jogo receberá mecânicas de combate, cura, sobrevivência e progressão.

A proposta é construir um jogo funcional utilizando os recursos da linguagem Java, começando por estruturas condicionais e evoluindo para estruturas de repetição e métodos.

## 🛠️ Tecnologias e conhecimentos

- Java
- Lógica de programação
- Variáveis e tipos de dados
- Entrada e saída de informações com `Scanner`
- Estruturas condicionais (`if/else` e `switch`)
- Estruturas de repetição — em desenvolvimento
- Métodos e parâmetros — planejados
- Geração de números aleatórios — planejada

## 📌 Funcionalidades atuais

- Solicitação do nome do aventureiro.
- Inicialização da vida do aventureiro em 100 HP.
- Definição de duas poções iniciais.
- Criação de um Goblin com 80 HP.
- Exibição das fichas dos personagens.
- Menu com as opções de atacar, usar poção e fugir.
- Tratamento das escolhas por meio de `switch`.
- Mensagens para opções válidas e inválidas.

**Status:** protótipo inicial da versão v1.0.0.

As opções de combate ainda exibem mensagens demonstrativas. O cálculo de dano, a cura, o contra-ataque e a repetição das batalhas serão implementados nas próximas etapas.

## ▶️ Como executar

### Pré-requisitos

- JDK instalado.
- Terminal ou IDE compatível com Java.

### Execução pelo terminal

1. Clone o repositório.
2. Acesse a pasta do projeto.
3. Compile o arquivo:

```bash
javac MiniRpg.java
```

4. Execute o programa:

```bash
java MiniRpg
```

Se o nome da classe pública for alterado para `MiniRPG`, o arquivo também deverá ser renomeado para `MiniRPG.java`.

## 🗺️ Próximos objetivos

- [ ] Implementar ataques com dano aleatório.
- [ ] Criar o contra-ataque do Goblin.
- [ ] Implementar o uso de poções.
- [ ] Desenvolver a mecânica de fuga.
- [ ] Controlar os turnos com estruturas de repetição.
- [ ] Identificar vitória e derrota.
- [ ] Permitir iniciar uma nova partida.
- [ ] Organizar funcionalidades em métodos.
- [ ] Testar e revisar as mecânicas implementadas.

## 📚 Documentação

A pasta [`docs`](docs/) contém os documentos complementares:

- [Visão geral do projeto](docs/01-visao-geral.md)
- [Requisitos funcionais](docs/02-requisitos.md)
- [Regras do jogo](docs/03-regras-do-jogo.md)
- [Plano de versões](docs/04-plano-de-versoes.md)
- [Plano de testes](docs/05-plano-de-testes.md)

## 🎯 Objetivo de aprendizagem

Este projeto faz parte da minha prática de programação em Java, com foco no desenvolvimento da lógica, na resolução de problemas e na construção gradual de aplicações.

---

Projeto pessoal de estudo desenvolvido em Java.
