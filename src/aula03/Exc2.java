package aula03;

import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args){
        int numero = 0;

        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Informe um número:");
            numero = sc.nextInt();

            if(numero>=0){
                System.out.println("O número positivo");
            }else{
                System.out.println("O número é negativo");
            }
        }while(numero != 0);
    }
}
