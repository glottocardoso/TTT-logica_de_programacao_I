package aula03;

import java.util.Scanner;

public class Exc4 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int[] numerosDecrescente = new int[5];
        int numeroImpressao = 0;
        int rank = numeros.length-1;
        Scanner sc = new Scanner(System.in);

        //Preenchimento do array:
        for (int i=0; i<numeros.length; i++){
            numeroImpressao += 1;
            System.out.println("Informe o número " + numeroImpressao + ":");
            numeros[i] = sc.nextInt();
        }

        //Montagem do rank:
        for (int i=0; i<numeros.length; i++){
            for(int y=0; y<numeros.length; y++){
                if (numeros[i]>numeros[y]){
                    rank--;
                };
            }
            numerosDecrescente[rank]=numeros[i];
            rank = numeros.length-1;
        }

        //Impressão do array decrescente:
        for (int z=0; z<numeros.length; z++){
            System.out.println(numerosDecrescente[z]);
        }
    }
}
