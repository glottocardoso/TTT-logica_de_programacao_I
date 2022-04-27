package aula05;

import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Telefonou para a vítima? (Digite 1 para 'SIM' ou 0 para 'NÃO')");
        int telefonou = sc.nextInt();

        System.out.println("Esteve no local do crime? (Digite 1 para 'SIM' ou 0 para 'NÃO')");
        int esteveLocal = sc.nextInt();

        System.out.println("Mora perto da vítima? (Digite 1 para 'SIM' ou 0 para 'NÃO')");
        int moraPerto = sc.nextInt();

        System.out.println("Devia para a vítima? (Digite 1 para 'SIM' ou 0 para 'NÃO')");
        int devia = sc.nextInt();

        System.out.println("Trabalhou com a vítima? (Digite 1 para 'SIM' ou 0 para 'NÃO')");
        int trabalhou = sc.nextInt();

        int respostas = telefonou+esteveLocal+moraPerto+devia+trabalhou;

        if (respostas ==2){
            System.out.println("Suspeita");
        } else if (respostas==3||respostas==4){
            System.out.println("Cúmplice");
        } else if (respostas==5){
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }
    }
}
