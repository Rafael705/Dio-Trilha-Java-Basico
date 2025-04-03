<h1>
    <a href="https://www.dio.me/">
     <img align="center" width="40px" src="https://hermes.digitalinnovation.one/assets/diome/logo-minimized.png"></a>
    <span> Tratamento de Exceções em Linguagens de Programação
 </span>
</h1>



## Introdução
O tratamento de exceções é um mecanismo fundamental para lidar com erros durante a execução de um programa. A maioria das linguagens modernas oferece estruturas como `try-catch` para capturar e tratar erros de maneira controlada.

---

## Estrutura Básica do Try-Catch
A estrutura `try-catch` permite que um bloco de código "tente" ser executado, e caso ocorra uma exceção, ela seja capturada e tratada sem interromper o fluxo do programa.

### Sintaxe Geral:
```java
try {
    // Código que pode gerar uma exceção
} catch (TipoDaExceção e) {
    // Código para tratar a exceção
} finally {
    // (Opcional) Código que será executado sempre, com ou sem exceção
}
```

### Exemplo em Java:
```java
public class ExcecaoExemplo {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0; // Isso gerará uma exceção
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero!");
        } finally {
            System.out.println("Bloco finally sempre será executado.");
        }
    }
}
```
---

## Hierarquia de Exceções
A maioria das linguagens de programação segue uma hierarquia de classes para as exceções. Em Java, por exemplo, todas as exceções são subclasses da classe `Throwable`, que se divide em:

- **Error**: Usado para erros graves que normalmente não podem ser tratados (exemplo: `OutOfMemoryError`).
- **Exception**: Usado para exceções que podem ser tratadas no código.
  - **RuntimeException**: Exceções que ocorrem durante a execução do programa (exemplo: `NullPointerException`).
  - **Checked Exceptions**: Exceções que devem ser tratadas obrigatoriamente (exemplo: `IOException`).

### Exemplo da hierarquia de exceções em Java:
```
java.lang.Throwable
 ├── java.lang.Error
 └── java.lang.Exception
     ├── java.lang.RuntimeException
     │   ├── NullPointerException
     │   ├── ArithmeticException
     │   └── IndexOutOfBoundsException
     ├── IOException
     ├── SQLException
     └── FileNotFoundException
```

### Exemplo de Captura Múltipla de Exceções em Java:
```java
try {
    int[] numeros = {1, 2, 3};
    System.out.println(numeros[5]); // Isso causará uma exceção
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Erro: Índice fora dos limites do array!");
} catch (Exception e) {
    System.out.println("Erro genérico capturado!");
}
```


---


