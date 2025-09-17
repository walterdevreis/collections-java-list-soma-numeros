import entity.SomaNumeros;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(15);
        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(25);
        somaNumeros.adicionarNumero(30);
        somaNumeros.adicionarNumero(35);
        somaNumeros.adicionarNumero(40);
        somaNumeros.adicionarNumero(45);
        somaNumeros.adicionarNumero(50);

        System.out.println("-------------------------------------------");

        int soma = somaNumeros.calcularSoma();
        System.out.println("A soma dos números da lista: " + soma);

        System.out.println("-------------------------------------------");

        int maiorNumero = somaNumeros.encontrarMaiorNumero();
        System.out.println("O maior número da lista: " + maiorNumero);

        System.out.println("-------------------------------------------");

        int menorNumero = somaNumeros.encontrarMenorNumero();
        System.out.println("O menor número da lista: " + menorNumero);

        System.out.println("-------------------------------------------");

        List<Integer> exibirNumeros = somaNumeros.exibirNumeros();
        for (Integer number : exibirNumeros){
            System.out.println(number);
        }

    }
}