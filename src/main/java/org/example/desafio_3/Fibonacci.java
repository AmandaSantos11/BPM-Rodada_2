package org.example.desafio_3;
import java.util.Scanner;
public class Fibonacci {
    private Scanner scanner = new Scanner(System.in);
    public int receberNumero(){
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
        return numero;
    }
    public void exibirNumeroFibonacci(int numero){
        int elemento0=0;
        int elemento1=1;
        int fibonacci=0;

        for (int i = 0; i < numero; i++) {
            fibonacci = elemento0+elemento1;
            elemento1 = elemento0;
            elemento0 = fibonacci;
        }

        System.out.println("Fib = "+fibonacci);
    }
}