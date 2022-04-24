package aula04;

import java.util.Scanner;

public class Exc6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] gabarito = {{1,2,3,4,5,6,7,8,9,10,11,12,13},{13,12,11,10,9,8,7,6,5,4,3,2,1},{60,23,64,41,33,11,20,4,9,6,27,44,31}};
        int[][] resposta = new int[3][13];
        int acertos = 0;

        System.out.println("Digite seu número:");
        int numeroApostador = sc.nextInt();

        System.out.println("Digite o número de seu gabarito:");
        int numeroGabarito = sc.nextInt();

        for (int y=0; y<13;y++){
            System.out.println("Digite um número " + y + " : ");
            resposta[numeroGabarito][y] = sc.nextInt();
            if (resposta[numeroGabarito][y]==gabarito[numeroGabarito][y]) {
                acertos++;
            }
        }
        System.out.println("Apostador " + numeroApostador);
        System.out.println("Acertos: " + acertos);

        if (acertos==13){
            System.out.println("Ganhador");
        }
    }
}
