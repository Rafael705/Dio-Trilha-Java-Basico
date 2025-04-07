<h1>
    <a href="https://www.dio.me/">
     <img align="center" width="40px" src="https://hermes.digitalinnovation.one/assets/diome/logo-minimized.png"></a>
    <span> Programação orienta a objeto
 </span>
</h1>



Este documento reúne anotações e exemplos sobre conceitos fundamentais da linguagem Java, como **criação de pacotes**, uso de **getters e setters**, **construtores**, **this** e **enums**. da [Digital Innovation One](https://www.dio.me/).

---

## 📦 Criação de Pacotes (Packages)

Os **packages** são usados para organizar melhor as classes e evitar conflitos de nomes. É uma prática comum utilizar o nome do domínio da empresa ou projeto ao contrário.

### 🗂 Estrutura de exemplo:

```
meu-projeto/
├── src/
│   └── com/
│       └── bridges/
│           └── meuprojeto/
│               └── Main.java
```

### 📄 Exemplo:

```java
package com.bridges.meuprojeto;

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
    }
}
```

---

## 🧱 Getters e Setters

Usados para acessar e modificar atributos privados de uma classe.

```java
public class Pessoa {
    private String nome;
    private int idade;

    // Getter
    public String getNome() {
        return nome;
    }

    // Setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
```

---

## ☕ Modelo JavaBeans

Um JavaBean é uma classe que:

- Possui construtor padrão (sem argumentos);
- Tem atributos `private`;
- Usa métodos `get` e `set` para acessar/modificar os atributos.

> Serve para representar dados (como DTOs ou entidades).

---

## 🔄 `this` - Quando usar?

O `this` é usado para referenciar o **objeto atual** da classe.

### 📄 Exemplo:

```java
public class Pessoa {
    private String nome;

    public void setNome(String nome) {
        this.nome = nome; // 'this.nome' é o atributo da classe, 'nome' é o parâmetro
    }
}
```

> Use `this` quando os nomes dos parâmetros forem iguais aos atributos da classe ou para clareza.

---

## 🏗 Construtores

- São métodos especiais chamados **quando o objeto é criado**.
- Devem ter o **mesmo nome da classe**.
- Não têm tipo de retorno.

### 📄 Exemplo:

```java
public class Pessoa {
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
```

> Se você não declarar nenhum construtor, o Java cria um **construtor padrão** automaticamente.

---

## 🔢 Enums

- Um **enum** é um tipo especial de classe que representa um **conjunto fixo de constantes**.
- Útil para representar valores predefinidos como estados, tipos ou códigos padronizados (ex: códigos IBGE, status de pedidos).

### 📄 Exemplo:

```java
public enum Estado {
    SP, RJ, MG, BA, RS;
}
```

### 🧪 Usando um enum:

```java
public class Pessoa {
    private Estado estado;

    public Pessoa(Estado estado) {
        this.estado = estado;
    }

    public void mostrarEstado() {
        System.out.println("Estado: " + estado);
    }
}
```

---

##

