package aula05;

import java.util.Scanner;

public class Exc4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a velocidade da via: ");
        int velocidadeVia = sc.nextInt();

        System.out.println("Informe a velocidade do motorista: ");
        int velocidadeMotorista = sc.nextInt();

        int diferencaVelocidades = velocidadeMotorista-velocidadeVia;
        int valorMulta = 0;

        if (diferencaVelocidades>0){
            if (diferencaVelocidades<=10){
                valorMulta = 50;
            }else if(diferencaVelocidades<=30){
                valorMulta = 100;
            } else {
                valorMulta = 200;
            }
        System.out.println("O valor da multa é: "+valorMulta);
        }
    }
}
