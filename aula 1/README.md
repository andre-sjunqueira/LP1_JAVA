# 📚 Exercícios de Java


### Alterar mensagem do programa
Altere o programa para imprimir uma mensagem diferente no console.:

```java
public class MyFirstJavaProgram {
    
   public static void main(String []args) {
       System.out.println("atividade 1"); 

   }
}
```
<br>

### 2 Imprimir duas linhas usando duas instruções
Altere o programa para imprimir duas linhas de texto, utilizando duas linhas de código System.out.

```java
public class MyFirstJavaProgram {
    
   public static void main(String []args) {
      System.out.println("linha 1"); 
            System.out.println("linha 2"); 

   }
}
```
<br>

### 3 Imprimir duas linhas usando \n
Sabendo que \n representa uma quebra de linha, imprima duas linhas de texto utilizando uma única instrução System.out.

```java
public class MyFirstJavaProgram {
    
   public static void main(String []args) {
       System.out.println("linha1 \nlinha2"); 

   }
}
 
```
<br>

### 4 Calculo de gastos
Na empresa em que trabalhamos, há tabelas com o gasto de cada mês.
Para fechar o balanço do primeiro trimestre, precisamos somar o gasto total.

Janeiro: R$ 15.000;
Fevereiro: R$ 23.000;
Março: R$ 17.000

O programa deve:
Calcular a despesa total do trimestre
Calcular a média mensal de gastos
Exemplo:

```java
import java.util.Locale;

public class MyFirstJavaProgram {
    public static void main(String[] args) {

        double janeiro = 15000;
        double fevereiro = 23000;
        double marco = 17000;

        double total = janeiro + fevereiro + marco;
        double media = total / 3;

        System.out.printf(Locale.forLanguageTag("pt-BR"), "Despesa total: R$ %,.2f\n", total);
        System.out.printf(Locale.forLanguageTag("pt-BR"), "Media mensal: R$ %,.2f\n", media);
    }
}
```
<br>




