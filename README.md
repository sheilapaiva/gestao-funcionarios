# Projeto de Gestão de Funcionários

Este projeto é uma aplicação Java para gerenciar funcionários. Ele foi desenvolvido utilizando o padrão de arquitetura Model-View-Controller (MVC).

## Funcionalidades

1. Inserir funcionários.
2. Remover um funcionário específico.
3. Imprimir todos os funcionários com todas suas informações.
4. Atualizar o salário dos funcionários com um aumento de 10%.
5. Agrupar os funcionários por função.
6. Imprimir os funcionários agrupados por função.
7. Imprimir os funcionários que fazem aniversário nos meses de outubro e dezembro.
8. Imprimir o funcionário com a maior idade.
9. Imprimir a lista de funcionários por ordem alfabética.
10. Imprimir o total dos salários dos funcionários.
11. Imprimir quantos salários mínimos cada funcionário ganha.

## Estrutura do Projeto

O projeto é organizado nos seguintes pacotes:

- `model`: Contém as classes `Pessoa` e `Funcionario`.
- `view`: Contém a classe `FuncionarioView` para apresentação das informações.
- `controller`: Contém a classe `FuncionarioController` que gerencia a lógica do aplicativo.
- Classe `Principal` que executa o aplicativo.

## Classes

### Model

#### `Pessoa`

Representa uma pessoa com os seguintes atributos:
- `nome`: Nome da pessoa.
- `dataNascimento`: Data de nascimento da pessoa.

#### `Funcionario`

Estende a classe `Pessoa` e adiciona os seguintes atributos:
- `salario`: Salário do funcionário.
- `funcao`: Função do funcionário.

### View

#### `FuncionarioView`

Responsável por apresentar as informações dos funcionários no console.

### Controller

#### `FuncionarioController`

Gerencia a lógica do aplicativo e interage com as classes do modelo e da visão.

### Main

#### `Principal`

Classe principal que inicializa a aplicação e realiza as operações conforme os requisitos.

## Como Executar

1. Clone o repositório para a sua máquina local.
2. Importe o projeto em sua IDE preferida (Visual Studio Code, Eclipse, IntelliJ).
3. Navegue até a classe `Principal` e execute o método `main`.

## Exemplo de Saída

Ao executar a aplicação, a saída no console será similar a:

```
Lista de Funcionários:
Nome: Maria, Data de Nascimento: 18/10/2000, Salário: 2.009,44, Função: Operador
Nome: Caio, Data de Nascimento: 02/05/1961, Salário: 9.836,14, Função: Coordenador
Nome: Miguel, Data de Nascimento: 14/10/1988, Salário: 19.119,88, Função: Diretor
Nome: Alice, Data de Nascimento: 05/01/1995, Salário: 2.234,68, Função: Recepcionista
Nome: Heitor, Data de Nascimento: 19/11/1999, Salário: 1.582,72, Função: Operador
Nome: Arthur, Data de Nascimento: 31/03/1993, Salário: 4.071,84, Função: Contador
Nome: Laura, Data de Nascimento: 08/07/1994, Salário: 3.017,45, Função: Gerente
Nome: Heloísa, Data de Nascimento: 24/05/2003, Salário: 1.606,85, Função: Eletricista
Nome: Helena, Data de Nascimento: 02/09/1996, Salário: 2.799,93, Função: Gerente

Funcionários agrupados por função:
Função: Operador
  Nome: Maria, Data de Nascimento: 18/10/2000, Salário: 2.210,38
  Nome: Heitor, Data de Nascimento: 19/11/1999, Salário: 1.740,99
Função: Eletricista
  Nome: Heloísa, Data de Nascimento: 24/05/2003, Salário: 1.767,54
Função: Recepcionista
  Nome: Alice, Data de Nascimento: 05/01/1995, Salário: 2.458,15
Função: Diretor
  Nome: Miguel, Data de Nascimento: 14/10/1988, Salário: 21.031,87
Função: Gerente
  Nome: Laura, Data de Nascimento: 08/07/1994, Salário: 3.319,20
  Nome: Helena, Data de Nascimento: 02/09/1996, Salário: 3.079,92
Função: Coordenador
  Nome: Caio, Data de Nascimento: 02/05/1961, Salário: 10.819,75
Função: Contador
  Nome: Arthur, Data de Nascimento: 31/03/1993, Salário: 4.479,02

Funcionários que fazem aniversário nos meses 10 e 12:
Nome: Maria, Data de Nascimento: 18/10/2000, Salário: 2.210,38
Nome: Miguel, Data de Nascimento: 14/10/1988, Salário: 21.031,87

Funcionário com a maior idade:
Nome: Caio, Idade: 63

Funcionários em ordem alfabética:
Nome: Alice, Data de Nascimento: 05/01/1995, Salário: 2.458,15
Nome: Arthur, Data de Nascimento: 31/03/1993, Salário: 4.479,02
Nome: Caio, Data de Nascimento: 02/05/1961, Salário: 10.819,75
Nome: Heitor, Data de Nascimento: 19/11/1999, Salário: 1.740,99
Nome: Helena, Data de Nascimento: 02/09/1996, Salário: 3.079,92
Nome: Heloísa, Data de Nascimento: 24/05/2003, Salário: 1.767,54
Nome: Laura, Data de Nascimento: 08/07/1994, Salário: 3.319,20
Nome: Maria, Data de Nascimento: 18/10/2000, Salário: 2.210,38
Nome: Miguel, Data de Nascimento: 14/10/1988, Salário: 21.031,87

Total dos salários dos funcionários: 50.906,82

Salários mínimos que cada funcionário ganha:
Nome: Maria, Salários Mínimos: 1.82
Nome: Caio, Salários Mínimos: 8.93
Nome: Miguel, Salários Mínimos: 17.35
Nome: Alice, Salários Mínimos: 2.03
Nome: Heitor, Salários Mínimos: 1.44
Nome: Arthur, Salários Mínimos: 3.70
Nome: Laura, Salários Mínimos: 2.74
Nome: Heloísa, Salários Mínimos: 1.46
Nome: Helena, Salários Mínimos: 2.54
```

## Requisitos

- Java 8 ou superior.
- Uma IDE Java (Visual Studio Code, Eclipse, IntelliJ).

## Outra Versão desse mesmo Projeto usando Spring Boot
```
https://github.com/sheilapaiva/gestao-funcionarios-api
```
