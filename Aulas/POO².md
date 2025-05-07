<h1>
    <a href="https://www.dio.me/">
     <img align="center" width="40px" src="https://hermes.digitalinnovation.one/assets/diome/logo-minimized.png"></a>
    <span> POO² </span>
</h1>
Este documento reúne anotações e exemplos sobre conceitos de POO(Programação orientada a objeto [Digital Innovation One](https://www.dio.me/).

---

## 1. **Pilares da POO**

### 1.1 Encapsulamento
Oculta os detalhes internos de implementação de uma classe. A ideia é proteger os dados e expor apenas o necessário.

```java
public class Pessoa {
    private String nome; // encapsulado

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
```

### 1.2 Herança
Permite que uma classe herde atributos e métodos de outra classe.

```java
class Animal {
    void fazerSom() {
        System.out.println("Animal fazendo som");
    }
}

class Cachorro extends Animal {
    void fazerSom() {
        System.out.println("Cachorro latindo");
    }
}
```

### 1.3 Abstração
Define uma estrutura comum para classes, escondendo detalhes e destacando funcionalidades importantes.

```java
abstract class Veiculo {
    abstract void mover();
}

class Carro extends Veiculo {
    void mover() {
        System.out.println("Carro em movimento");
    }
}
```

### 1.4 Polimorfismo
Capacidade de um objeto se comportar de diferentes formas dependendo do contexto.

```java
class Forma {
    void desenhar() {
        System.out.println("Desenhando forma");
    }
}

class Circulo extends Forma {
    void desenhar() {
        System.out.println("Desenhando círculo");
    }
}

public class Teste {
    public static void main(String[] args) {
        Forma f = new Circulo();
        f.desenhar(); // Polimorfismo em ação
    }
}
```

---

## 2. **Modificadores de Acesso**

### `protected`
Permite o acesso dentro do mesmo pacote e também por subclasses em outros pacotes.

```java
class Animal {
    protected void comer() {
        System.out.println("Animal comendo");
    }
}
```

---

## 3. **Interfaces e Abstração**

### Interface
Usada para definir contratos que devem ser implementados por classes.

```java
interface Operacao {
    void executar();
}

class Soma implements Operacao {
    public void executar() {
        System.out.println("Executando soma");
    }
}
```

### Lambda + Interface Funcional
Interface funcional possui apenas um método abstrato. Pode ser usada com expressões lambda.

```java
@FunctionalInterface
interface Saudacao {
    void dizerOla();
}

public class TesteLambda {
    public static void main(String[] args) {
        Saudacao s = () -> System.out.println("Olá Lambda!");
        s.dizerOla();
    }
}
```

---

## 4. **Palavras-chave importantes**

### `sealed` e `non-sealed`
Controla quais classes podem estender uma classe selada.

```java
public sealed class Forma permits Circulo, Quadrado {}
final class Circulo extends Forma {}
non-sealed class Quadrado extends Forma {}
```

### `permits`
Declara explicitamente quais classes podem estender uma classe `sealed`.

### `instanceof`
Verifica se um objeto é de um tipo especificado.

```java
if (obj instanceof String) {
    System.out.println("É uma string!");
}
```

---

## 5. **Coleções: List e forEach**

### `List`
Lista ordenada de elementos.

```java
import java.util.*;

List<String> nomes = new ArrayList<>();
nomes.add("Ana");
nomes.add("Bruno");
```

### `forEach`
Percorre a lista e executa uma ação para cada elemento.

```java
nomes.forEach(nome -> System.out.println(nome));
```

---

## Conclusão
Esses conceitos e palavras-chave são fundamentais para dominar a POO em Java. Compreendê-los e praticá-los ajuda a criar códigos mais organizados, reutilizáveis e fáceis de manter.

<h1>
    <a href="https://www.dio.me/">
     <img align="center" width="40px" src="https://hermes.digitalinnovation.one/assets/diome/logo-minimized.png"></a>
    <span> POO² </span>
</h1>
Este documento reúne anotações e exemplos sobre conceitos de POO(Programação orientada a objeto [Digital Innovation One](https://www.dio.me/).

---

## 1. **Pilares da POO**

### 1.1 Encapsulamento
Oculta os detalhes internos de implementação de uma classe. A ideia é proteger os dados e expor apenas o necessário.

```java
public class Pessoa {
    private String nome; // encapsulado

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
```

### 1.2 Herança
Permite que uma classe herde atributos e métodos de outra classe.

```java
class Animal {
    void fazerSom() {
        System.out.println("Animal fazendo som");
    }
}

class Cachorro extends Animal {
    void fazerSom() {
        System.out.println("Cachorro latindo");
    }
}
```

### 1.3 Abstração
Define uma estrutura comum para classes, escondendo detalhes e destacando funcionalidades importantes.

```java
abstract class Veiculo {
    abstract void mover();
}

class Carro extends Veiculo {
    void mover() {
        System.out.println("Carro em movimento");
    }
}
```

### 1.4 Polimorfismo
Capacidade de um objeto se comportar de diferentes formas dependendo do contexto.

```java
class Forma {
    void desenhar() {
        System.out.println("Desenhando forma");
    }
}

class Circulo extends Forma {
    void desenhar() {
        System.out.println("Desenhando círculo");
    }
}

public class Teste {
    public static void main(String[] args) {
        Forma f = new Circulo();
        f.desenhar(); // Polimorfismo em ação
    }
}
```

---

## 2. **Modificadores de Acesso**

### `protected`
Permite o acesso dentro do mesmo pacote e também por subclasses em outros pacotes.

```java
class Animal {
    protected void comer() {
        System.out.println("Animal comendo");
    }
}
```

---

## 3. **Interfaces e Abstração**

### Interface
Usada para definir contratos que devem ser implementados por classes.

```java
interface Operacao {
    void executar();
}

class Soma implements Operacao {
    public void executar() {
        System.out.println("Executando soma");
    }
}
```

### Lambda + Interface Funcional
Interface funcional possui apenas um método abstrato. Pode ser usada com expressões lambda.

```java
@FunctionalInterface
interface Saudacao {
    void dizerOla();
}

public class TesteLambda {
    public static void main(String[] args) {
        Saudacao s = () -> System.out.println("Olá Lambda!");
        s.dizerOla();
    }
}
```

---

## 4. **Palavras-chave importantes**

### `sealed` e `non-sealed`
Controla quais classes podem estender uma classe selada.

```java
public sealed class Forma permits Circulo, Quadrado {}
final class Circulo extends Forma {}
non-sealed class Quadrado extends Forma {}
```

### `permits`
Declara explicitamente quais classes podem estender uma classe `sealed`.

### `instanceof`
Verifica se um objeto é de um tipo especificado.

```java
if (obj instanceof String) {
    System.out.println("É uma string!");
}
```

---

## 5. **Coleções: List e forEach**

### `List`
Lista ordenada de elementos.

```java
import java.util.*;

List<String> nomes = new ArrayList<>();
nomes.add("Ana");
nomes.add("Bruno");
```

### `forEach`
Percorre a lista e executa uma ação para cada elemento.

```java
nomes.forEach(nome -> System.out.println(nome));
```

---

## Conclusão
Esses conceitos e palavras-chave são fundamentais para dominar a POO em Java. Compreendê-los e praticá-los ajuda a criar códigos mais organizados, reutilizáveis e fáceis de manter.

