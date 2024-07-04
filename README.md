# DIO - Trilha Java Básico

[www.dio.me](http://www.dio.me/)

[Desafio: Controle de Fluxo](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/controle-fluxo)

## Autor

[Fábio Neres](https://github.com/neresfabio)


## Descrição

Neste desafio de projeto, foram explorados alguns cenários com fluxos condicionais, repetições e excepcionais.

Porem, algumas outras classes foram utilizadas, como para formatar um valor `double` para mostrar apenas dois números após a virgula em Java. Tambem foram criadas scripts de teste simples.

### `DecimalFormat` ou `String.format`

- Usando `DecimalFormat`;

```java
import java.text.DecimalFormat;

public class Main {
    public static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    public static void main(String[] args) {
        double valor = valorPretendido();
        DecimalFormat df = new DecimalFormat("#.00");
        String valorFormatado = df.format(valor);
        System.out.println("Valor formatado: " + valorFormatado);
    }
}

```

- Usando `String.format`;

```java
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    public static void main(String[] args) {
        double valor = valorPretendido();
        String valorFormatado = String.format("%.2f", valor);
        System.out.println("Valor formatado: " + valorFormatado);
    }
}

```

Ambos os exemplos pegam o valor retornado pela função valorPretendido() e o formatam para mostrar apenas dois números após a vírgula. A diferença está na escolha da ferramenta para formatação: DecimalFormat ou String.format. Ambos resultam na mesma saída formatada.

### Casos Teste

1. Classe de teste para o comportamento esperado quando o primeiro parâmetro é menor que o segundo.

- `TesteContarValoresNormais`

```java
public class TesteContarValoresNormais {
    public static void main(String[] args) {
        try {
            Contador.contar(10, 20);  // Primeiro parâmetro menor que o segundo
            System.out.println("Teste bem-sucedido: O método contou corretamente.");
        } catch (Exception e) {
            System.out.println("Falha no teste: " + e.getMessage());
        }
    }
}
```

2. Classe de teste para garantir que uma exceção seja lançada quando o primeiro parâmetro é maior que o segundo

- `TesteContarParametroInvalido`

```java
public class TesteContarParametroInvalido {
    public static void main(String[] args) {
        try {
            Contador.contar(20, 10);  // Deve lançar exceção
            System.out.println("Falha no teste: Não deveria ter permitido esse valor.");
        } catch (ParametrosInvalidosException e) {
            System.out.println("Teste bem-sucedido: Exceção lançada - " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Falha no teste: Exceção inesperada - " + e.getMessage());
        }
    }
}
```

3. Classe de teste para verificar o comportamento com parâmetros iguais

- `TesteContarParametrosIguais`

```java
public class TesteContarParametrosIguais {
    public static void main(String[] args) {
        try {
            Contador.contar(10, 10);  // Parâmetros iguais, sem exceção esperada
            System.out.println("Teste bem-sucedido: Sem exceção lançada.");
        } catch (Exception e) {
            System.out.println("Falha no teste: " + e.getMessage());
        }
    }
}
```
### Vantagens e Desvantagens
#### Vantagens:

- Simplicidade para casos específicos.
- Não requer a configuração de um framework adicional.
#### Desvantagens:
- Não é automatizado.
- Difícil de manter à medida que o projeto cresce.
- Não permite teste em massa ou asserts avançados.
