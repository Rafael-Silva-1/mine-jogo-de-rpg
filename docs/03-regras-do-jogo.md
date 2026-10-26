# Regras do jogo

## 1. Atributos iniciais

| Atributo | Aventureiro | Goblin |
|---|---:|---:|
| Vida inicial | 100 HP | 80 HP |
| Dano por ataque | 10 a 20 HP | 8 a 15 HP |
| Quantidade de poções | 2 | Não se aplica |
| Cura por poção | 25 HP | Não se aplica |

Esses valores representam as regras planejadas para a primeira versão completa do combate.

## 2. Ações disponíveis

### Atacar

O aventureiro causa dano aleatório entre 10 e 20 pontos de vida.

Se o Goblin continuar vivo, ele poderá contra-atacar, causando entre 8 e 15 pontos de dano.

### Usar poção

Uma poção recupera 25 pontos de vida.

A vida máxima do aventureiro é de 100 HP. O jogador não poderá ultrapassar esse limite nem usar uma poção quando não houver unidades disponíveis.

### Fugir

A fuga encerra a batalha imediatamente. Na primeira versão, não haverá tentativa de fuga nem contra-ataque do inimigo nessa situação.

## 3. Ordem dos turnos

1. Exibir a situação atual dos combatentes.
2. Apresentar as opções de ação.
3. Receber a escolha do jogador.
4. Verificar se a escolha é válida.
5. Executar a ação escolhida.
6. Verificar se o combate terminou.
7. Se o Goblin estiver vivo e a batalha continuar ativa, realizar o contra-ataque.
8. Verificar novamente as condições de encerramento.
9. Continuar ou finalizar a batalha.

## 4. Condições de encerramento

- **Vitória:** o Goblin chega a zero pontos de vida.
- **Derrota:** o aventureiro chega a zero pontos de vida.
- **Fuga:** o jogador escolhe fugir.

## 5. Regras complementares

- O Goblin não poderá atacar depois de ser derrotado.
- A vida exibida não deverá ficar negativa.
- Uma escolha inválida não deverá consumir um turno.
- Uma nova partida deverá restaurar os atributos iniciais.

Essas regras serão implementadas e verificadas durante o desenvolvimento.
