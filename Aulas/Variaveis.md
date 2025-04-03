<h1>
    <a href="https://www.dio.me/">
     <img align="center" width="40px" src="https://hermes.digitalinnovation.one/assets/diome/logo-minimized.png"></a>
    <span> Variáveis </span>
</h1>

#### Nome de Variáveis
Devem ser escritas com a primeira letra minúscula.

Caso sejam compostas, a segunda palavra deve começar com maiúscula (CamelCase).

Exemplo:
```java
int ano;
int anoFabricacao;
```

### Regras Adicionais para Variáveis
Se o valor da variável não deve ser alterado, ela deve ser declarada como `final` e escrita em MAIÚSCULAS:
```java
final String BR = "Brasil";
final double PI = 3.14;
final int ESTADOS_BRASILEIROS = 27;
final int ANO_2000 = 2000;
```

#### Regras Gerais para Nomeação de Variáveis
- Deve conter apenas letras, `_`, `$` ou números (0-9).
- Deve iniciar com uma letra minúscula.
- Não pode ter espaços.
- Não pode usar palavras-chave da linguagem.
- Deve ter nome único dentro do escopo.

### Declaração de Variáveis e Métodos
#### Variáveis
Estrutura:
```java
tipo nomeBemDefinido = Atribuição;
```
Exemplo:
```java
int idade = 23;
double altura = 1.62;
Dog spike;
```
Também podemos trabalhar com valores lógicos (booleanos):
```java
boolean ligado = true;
boolean desligado = false;
```

#### Métodos
Estrutura:
```java
TipoRetorno NomeEmInfinitivo(Parametro(s))
```
Exemplos:
```java
int somar(int numeroUm, int numeroDois);
String formatarCep(long cep);
```

### Criação de Package
Os packages ajudam a organizar as classes dentro do projeto.
Para criar um package, basta defini-lo no topo do arquivo:
```java
package com.meuprojeto.utils;

public class MinhaClasse {
    
}
```



---
*Criado por Bridges*