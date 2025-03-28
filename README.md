# Filtragens de Letras Maiúsculas <img src="https://github.com/user-attachments/assets/4c49b711-158a-48a8-b4a2-6766bb254d80" alt="Imagem do Java" width="50"/>

Este repositório contém três abordagens distintas para filtrar as letras maiúsculas de uma string fornecida. Cada uma das soluções apresentadas utiliza uma técnica diferente: Regex, Loop e Streams. 


## Tecnologias Utilizadas

**Java 19**: A solução foi desenvolvida utilizando a versão 19 do Java, aproveitando as novas funcionalidades e otimizações da linguagem.

**JUnit 5**: Testes unitários foram realizados usando o framework JUnit 5 para garantir a confiabilidade das soluções.


### 1. Regex (Fácil):
   Esta solução utiliza expressões regulares para filtrar apenas as letras maiúsculas. A expressão regular usada é [^A-Z], onde:
[^A-Z] corresponde a qualquer caractere que não seja uma letra maiúscula (de A a Z).

O método replaceAll é utilizado para substituir todos os caracteres não desejados por uma string vazia, efetivamente removendo-os.

    public static void main(String[] args) {
        String input = "VbAcMdfrOerSffDooEhhToooUawedRlloMwwAppIhhhTfffAsfdU!";
        System.out.println("Letras maiúsculas: " + filterUppercaseUsingRegex(input));
    }

### 2. Loop (Fácil):
   A abordagem com loop percorre a string caractere por caractere e, utilizando o método Character.isUpperCase(c), verifica se o caractere é uma letra maiúscula. Se for, ele é adicionado a um StringBuilder, que é utilizado para construir a nova string com apenas as letras maiúsculas.


    public static void main(String[] args) {
        String input = "VbAcMdfrOerSffDooEhhToooUawedRlloMwwAppIhhhTfffAsfdU!";
        System.out.println("Letras maiúsculas: " + filterUppercaseUsingLoop(input));
    }

### 3. Streams (Avançada):
   Esta solução usa o conceito de Streams em Java, uma forma mais funcional de manipulação de dados. A ideia é transformar a string em um stream de caracteres, filtrar aqueles que são maiúsculos, convertê-los de volta para caracteres e finalmente concatená-los em uma nova string usando Collectors.joining().


    public static void main(String[] args) {
        String input = "VbAcMdfrOerSffDooEhhToooUawedRlloMwwAppIhhhTfffAsfdU!";
        System.out.println("Letras maiúsculas: " + filterUppercaseUsingStream(input));
    }

Cada uma dessas soluções apresenta uma maneira de resolver o problema de filtrar as letras maiúsculas de uma string. A escolha entre elas depende de vários fatores, como simplicidade, legibilidade, desempenho e familiaridade com os conceitos utilizados.

### Execute a aplicação com Maven

### 1. Clone the repository:

```bash
git clone https://https://github.com/Igorgcf/Challenge-UpperCase.git
```

### Como executar a aplicação
2. Run the application as a whole using the command: `mvn clean install` through the terminal.

Execute a aplicação como um todo utilizando o comando: `mvn clean install` através do terminal.

