package aula05;

import java.util.Scanner;

public class Exc5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas deseja cadastrar? ");
        int i = sc.nextInt();
        sc.nextLine();

        String[][] agenda = new String[i][3];
        String codigoDigitado = "";

            for (int j = 0; j < i; j++) {
                System.out.println("Digite o código da pessoa: ");
                codigoDigitado = sc.nextLine();

                for (int y=0;y<agenda.length;y++) {
                    if (codigoDigitado.equals(agenda[y][0])) {
                        System.out.println("Esse usuário já existe. Deseja removê-lo? (1-SIM / 2-NÃO)");
                        if (sc.nextInt() == 1) {
                            sc.nextLine();
                            agenda[y][0] = "";
                            agenda[y][1] = "";
                            agenda[y][2] = "";
                            System.out.println("Nova agenda:");
                            for (int l = 0; l < i; l++) {
                                System.out.println(agenda[l][0]+"\t\t\t"+agenda[l][1]+"\t\t\t"+agenda[l][2]);
                            }
                            System.out.println("Digite o código da pessoa: ");
                            codigoDigitado = sc.nextLine();
                            break;
                        }else {
                            sc.nextLine();
                            System.out.println("Digite o código da pessoa: ");
                            codigoDigitado = sc.nextLine();
                        }
                    }
                }

                agenda[j][0] = codigoDigitado;

                System.out.println("Digite o número de telefone da pessoa: ");
                agenda[j][1] = sc.nextLine();

                System.out.println("Digite a idade da pessoa: ");
                agenda[j][2] = sc.nextLine();

                System.out.println("Código:\t\tTelefone:\t\tIdade:");
                System.out.println("======\t\t========\t\t=====");

                for (int k = 0; k < i; k++) {
                    System.out.println(agenda[k][0]+"\t\t"+agenda[k][1]+"\t\t"+agenda[k][2]);
                }
            }
        }
    }

