package aula05;

import java.util.Scanner;

public class Exc6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade =sc.nextInt();

        if (idade>=18 && idade<=67){
            System.out.println("Você pode doar sangue");
        }else {
            System.out.println("Você não pode doar sangue");
        }
    }
}
