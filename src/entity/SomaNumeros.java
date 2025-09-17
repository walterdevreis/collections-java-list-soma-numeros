package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SomaNumeros {

    private List<Integer> listaDeNumerosInteiros;

    public SomaNumeros(){
        this.listaDeNumerosInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.listaDeNumerosInteiros.add(numero);
    }

    public int calcularSoma(){
        int soma = this.listaDeNumerosInteiros.stream()
                .mapToInt(Integer::intValue)
                .sum();

        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = this.listaDeNumerosInteiros.get(0);

        for (int i = 1; i < listaDeNumerosInteiros.size(); i++){
            if (listaDeNumerosInteiros.get(i) > maiorNumero){
                maiorNumero = listaDeNumerosInteiros.get(i);
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = this.listaDeNumerosInteiros.get(0);

        for (int i = 1; i < listaDeNumerosInteiros.size(); i++){
            if (listaDeNumerosInteiros.get(i) < menorNumero){
                menorNumero = listaDeNumerosInteiros.get(i);
            }
        }
        return menorNumero;
    }

    public List<Integer> exibirNumeros(){
        List<Integer> exibirNum = new ArrayList<>();

        for (Integer number : listaDeNumerosInteiros){
            exibirNum.add(number);
        }
        return exibirNum;
    }

}
