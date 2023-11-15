# Calculadora com Spring Boot

# Detalhes sobre o projeto

## Objetivo
O objetivo deste projeto foi criar uma calculadora para realizar operações básicas, como por exemplo, adição, subtração, multiplicação e divisão.

## Como a calculadora deve se comportar?
Como detalhes comportamentais, o código deverá aceitar apenas números sendo impossível a inserção de caractéres diferentes, além disso, não será possível efetuar nenhuma operação matemática caso os campos para inserção de números estejam vazios. Ademais, não é possível efetuar divisões por zero, de modo que será retornada a mensagem de impossibilidade caso haja a tentativa.

# Sobre o projeto

## Iniciando a aplicação
Para iniciar a aplicação deve-se dar o comando "Run" na sua IDE, logo após, basta abrir o seu navegador e acessar a URL: http://localhost:8080/

## Estrutura
Acessando as pastas src/main/java/com/calculator/calculadora, é possível encontrar mais três divisões de pastas, controller, domain e service.

### Controller
Na pasta controller encontra-se a classe CalculadoraController.java, onde são definidos os métodos e mapeamento para o funcionamento da aplicação no localhost.

### Domain
Em domain está localizada a classe Calculadora.java, nela estão contidos os métodos somar, subtrair, multiplicar e dividir, que são responsáveis por fazer as operações matemáticas através de dois paramêtros, double a e double b.

### Service
Por vez, em service localiza-se a classe CalculadorService.java, dentro desta classe está contido o método calcular, que torna possível a escolha da operação matemática que será utilizada por meio de um switch-case.

### Classe CalculadoraApplication.java
Esta classe é responsável por rodar o Spring Boot Application.

## Autor
### Artur Ramiro do Vale Silva