package aula05;

import java.util.Scanner;

public class Exc10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;
        int opiniao;

        int somaOtimoIdades = 0;
        double mediaOtimoIdades = 0;
        int qtdRegular = 0;
        int qtdBom = 0;
        int qtdOtimo = 0;
        double porcentagemBom;

        for (int i = 1; i < 6; i++) {
            System.out.println("Digite a idade do espectador "+i+ " :");
            idade = sc.nextInt();
            System.out.println("Digite a opinião do espectador "+i+ "(1-Ótimo / 2-Bom / 3-Regular) :");
            opiniao = sc.nextInt();

            if (opiniao==1){
                somaOtimoIdades += idade;
                qtdOtimo++;
            }

            if (opiniao==3){
                qtdRegular++;
            }

            if (opiniao==2){
                qtdBom++;
            }

        }
        mediaOtimoIdades = (double) somaOtimoIdades/qtdOtimo;
        porcentagemBom = (double) qtdBom/5*100;

        System.out.println("A média das idades das pessoas que responderam ótimo é: " + mediaOtimoIdades);
        System.out.println("A quantidade de pessoas que respondeu regular é: " + qtdRegular);
        System.out.println("A percentagem de pessoas que respondeu “bom” entre todos os espectadores analisados é: "+porcentagemBom);
    }
}
