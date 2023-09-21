package org.example.desafio_1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Numeros numeros = new Numeros();

        boolean loop=false;
        System.out.println("Digite quantos números deseja inserir na lista:");
        int n = scanner.nextInt();

        do {
            if (numeros.receberQuantidadeDeNumeros(n)){
                numeros.adicionarNumerosNasListas(n);
                numeros.exibirAsListas();
                loop=true;
            }
            else {
                System.out.println("Número inválido, digite um entre 2 e 999");
                System.out.println("Digite novamente:");
                n = scanner.nextInt();
            }
        }while (!loop);
    }
}