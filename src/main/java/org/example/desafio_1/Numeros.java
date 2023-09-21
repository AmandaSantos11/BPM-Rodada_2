package org.example.desafio_1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Numeros {
    private ArrayList<Integer> numeros_pares = new ArrayList<>();
    private ArrayList<Integer> numeros_impares = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    public boolean receberQuantidadeDeNumeros(int n){
        if (n>1 && n<1000){
            return true;
        }
        else {
            return false;
        }
    }
    public void adicionarNumerosNasListas(int n){
        for (int i = 0; i < n; i++){
            int numero;

            do {
                System.out.println("Digite o " + (i + 1) + "º número:");
                numero = scanner.nextInt();
                if (numero < 0) {
                    System.out.println("Números negativos não são permitidos!");
                }
            } while (numero < 0);

            if (numero % 2 == 0){
                numeros_pares.add(numero);

            }else {
                numeros_impares.add(numero);
            }
        }
    }
    public void exibirAsListas(){
        System.out.println("== Numeros ==");
        Collections.sort(numeros_pares);
        Collections.sort(numeros_impares, Collections.reverseOrder());

        for (Integer numeros_pares : numeros_pares) {
            System.out.println(numeros_pares);
        }

        for (Integer numeros_impares : numeros_impares) {
            System.out.println(numeros_impares);
        }
    }
}