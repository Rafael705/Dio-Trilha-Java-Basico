<h1>
    <a href="https://www.dio.me/">
     <img align="center" width="40px" src="https://hermes.digitalinnovation.one/assets/diome/logo-minimized.png"></a>
    <span> Controle De Fluxo </span>
</h1>

## Instruções Especiais em Loops
As instruções especiais podem ser acionadas em loops de forma excepcional ou seletiva. Essas instruções podem ser classificadas como:

### 1. Condicionais
- **Simples**: Verifica apenas uma condição.
- **Composta**: Verifica mais de uma condição encadeada.

#### Condições Encadeadas
```java
if (condicao1) {
    // Bloco de código
} else if (condicao2) {
    // Outro bloco de código
} else {
    // Bloco padrão
}
```

#### Condição Ternária
```java
variavel = (condicao) ? valor_se_verdadeiro : valor_se_falso;
```

#### Switch Case
```java
switch(variavel) {
    case valor1:
        // Bloco de código
        break;
    case valor2:
        // Outro bloco
        break;
    default:
        // Caso padrão
}
```

### 2. Laços de Repetição

#### For
Permite que uma variável seja validada e incrementada a cada iteração.
```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```

#### While
Executa enquanto a condição for verdadeira.
```java
int i = 0;
while (i < 10) {
    System.out.println(i);
    i++;
}
```

#### Do While
Executa pelo menos uma vez antes de validar a condição.
```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 10);
```

### 3. Tratamento de Exceções
Usado para tratar erros inesperados no código.
```java
try {
    // Bloco de código
} catch (Exception e) {
    // Tratamento do erro
} finally {
    // Bloco opcional sempre executado
}
```

---

## Mapa Mental - Controle de Fluxo

```plaintext
Controle de Fluxo
|
|-- Condicionais
|   |-- Simples
|   |-- Composta
|   |-- Encadeadas (if-else if-else)
|   |-- Ternária (?:)
|   |-- Switch Case
|
|-- Laços de Repetição
|   |-- For
|   |-- While
|   |-- Do While
|
|-- Exceções
    |-- Try-Catch-Finally
```