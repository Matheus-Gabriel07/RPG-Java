package RPG;

import java.util.Random;
import java.util.Scanner;

public class Night {
    public static void dormir() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int aleatorio = random.nextInt(10);

        if (aleatorio >= 1 && aleatorio <= 9) {
            System.out
                    .println("Enquanto você dorme, rachaduras começam a surgir sobre o chão, e você acorda desesperado."
                            + "\nO que desejeja fazer?"
                            + "\n1)Sair correndo"
                            + "\n2)Decide ficar na barraca");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você decide sair correndo e...");

                    if (aleatorio % 2 != 0) {
                        System.out.println("As rachaduras ficaram maiores, e voce acabou caindo");
                        if (aleatorio > 5) {
                            System.out.println("Sons estranhos, se atralam e surge uma criatura terrível, DESCRIÇÃO");
                            System.out.println("O que você deseja fazer:" +
                                    "\n1)Correr entre o caminho que a rachadura formou" +
                                    "\n1)Batalhar contra a criatura misteriosa");
                            opcao = sc.nextInt();

                            if (opcao == 1) {
                                System.out.println("Vilão te pega");
                                // Batalha
                            } else if (opcao == 2) {
                                // Batalha
                            } else {
                                break;
                            }
                        } else {
                            System.out.println("Sons estranhos começam a ficar mais alto");
                            System.out.println("O que você deseja fazer:" +
                                    "\n1)Correr entre o caminho que a rachadura formou" +
                                    "\n1)Esperar");
                            opcao = sc.nextInt();

                            if (opcao == 1) {
                                System.out.println("Vilão te pega");
                                // Batalha
                            } else if (opcao == 2) {
                                System.out.println(
                                        "Enquanto você está esperando alguma movimentação, surge uma criatura terrível, DESCRIÇÃO");
                                System.out.println("O que você deseja fazer:" +
                                        "\n1)Correr entre o caminho que a rachadura formou" +
                                        "\n1)Batalhar contra a criatura misteriosa");
                                opcao = sc.nextInt();

                                if (opcao == 1) {
                                    System.out.println("Vilão te pega");
                                    // Batalha
                                } else if (opcao == 2) {
                                    // Batalha
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    } else {
                        System.out.println("Você conseguiu sair correndo pela floresta, até chegar ao carro de vocês."
                                + "\nDesesperado, ligou o carro e conseguiu seguir até a rodovia. E sua aventura chega ao fim.");
                        break;
                    }
                    break;

                case 2:
                    System.out.println("As rachaduras ficaram maiores, e voce acabou caindo");
                    break;

                default:
                    System.out.println("As rachaduras ficaram maiores, e voce acabou caindo");
                    break;
            }
        } else {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            
            System.out.println(
                    "Você decidiu esperar, e esperou tanto tempo, que a chuva inmundou o chão e morreu afogado.");
        }
        sc.close();
    }
}