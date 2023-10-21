package RPG;
import java.util.Random;
import java.util.Scanner;

public class HistoryRGP extends Settings {

    public static void start() {
        Scanner sc = new Scanner(System.in);
        Delay delay = new Delay();

        System.out.println("Seja bem vindo ao RPG");
        System.out.println("Digite o seu nome");
        String nome = sc.nextLine();

        System.out.println("Carregando...");
        delay.timeDelay(1500);
        delay.SpacePrint(10);

        Florest(nome);
        sc.close();
    }

    public static void Florest(String playerName) {
        Scanner sc = new Scanner(System.in);
        Jogador jogador = new Jogador(playerName);
        Delay delay = new Delay();

        System.out.println("\t" + jogador.getNome() + " e seus amigos estão acampando em uma floresta.\n"
                + "Ao longo do dia, fizeram diversas coisas. Foram pescar no riacho perto aonde\n"
                + "montaram suas barracas, montaram uma fogueira para assar marshmellow a noite, mas\n"
                + "comecaram a sentir rajadas de ventos fortes durante a tarde, e que elas se intensificaram.\n"
                + "\tDurante a noite, emquanto comiam alguns marsmallows, começaram sentir algumas gotas de"
                + "\nchuvas, e Carlos disse:"
                + "\n- É melhor entrarmos em nossas barracas e esperarmos passar\n"
                + "Todos entraram em suas barracas e a chuva se intensificou");

        delay.timeDelay(500);
        boolean historyLoop = true;
        do {
            System.out.println("=====");
            System.out.println("Qual atitude " + jogador.getNome() + " deve tomar?"
                    + "\n1) Dormir"
                    + "\n2) Esperar");
            int opcaoEscolhida = sc.nextInt();
            switch (opcaoEscolhida) {
                case 1:
                    delay.timeDelay(500);
                    fallFlorest(jogador.getNome());
                    historyLoop = false;
                    break;

                case 2:
                    delay.timeDelay(500);
                    System.out.println(
                            "Você decidiu esperar, e esperou tanto tempo, que a chuva /imundou o chão e morreu afogado.");
                    historyLoop = false;
                    break;

                default:
                    delay.timeDelay(250);
                    System.out.println("Selecione uma opção valida.");
                    delay.SpacePrint(3);
                    break;
            }
        } while (historyLoop);

        sc.close();
    }

    public static void fallFlorest(String playerName) {
        Scanner sc = new Scanner(System.in);
        Jogador jogador = new Jogador(playerName);
        Delay delay = new Delay();
        Random random = new Random();
        int sorteio = random.nextInt(10);
        delay.SpacePrint(10);

        if (sorteio >= 1 && sorteio <= 9) {
            System.out.println("\tEnquanto você dorme, rachaduras começam a surgir sobre o chão, e com o alto som\n"
                    + "acorda desesperado.\n"
                    + "===================");

            delay.timeDelay(200);
            boolean historyLoop = true;

            do {
                System.out.println("O que o" + jogador.getNome() + " irá fazer?\n"
                        + "1)Sair correndo\n"
                        + "2)Decide ficar na barraca\n");
                int opcao = sc.nextInt();
                delay.timeDelay(250);

                switch (opcao) {
                    case 1:
                        System.out.println("Você decide sair correndo e...");

                        if (sorteio > 1 && sorteio <= 9) {
                            System.out.println("As rachaduras ficaram maiores, e você acabou caindo...");
                            delay.SpacePrint(3);
                            System.out.println("Carregando história...");
                            delay.SpacePrint(10);
                            delay.timeDelay(1500);

                            if (sorteio > 5) {
                                preLuta(jogador.getNome());
                            } else {
                                System.out.println(jogador.getNome() + " começa a escutar sons...");
                                preLuta(jogador.getNome());
                            }
                        } else {
                            System.out.println(
                                    "Uma pedra acaba caindo em sua cabeça enquanto corria, e acabou morrendo.\n"
                                            + "\bFIM DE JOGO");
                            break;
                        }
                        historyLoop = false;
                        break;

                    case 2:
                        System.out.println("As rachaduras ficaram maiores, e acabou caindo e morrendo."
                                + "\bFIM DE JOGO");
                        historyLoop = false;
                        break;

                    default:
                        System.out.println("As rachaduras ficaram maiores, e acabou caindo e morrendo."
                                + "\bFIM DE JOGO");
                        break;
                }
            } while (historyLoop);
        }

        sc.close();
    }

    public static void preLuta(String playerName) {
        Scanner sc = new Scanner(System.in);
        Jogador jogador = new Jogador(playerName);
        Delay delay = new Delay();

        System.out.println("Sons, esse estranhos, se astralam e surge uma criatura terrível");
        boolean historyLoop = true;

        do {
            System.out.println("O que " + jogador.getNome() + " irá fazer?\n" +
                    "\n1)Correr entre o caminho que a rachadura formou." +
                    "\n2)Batalhar contra a criatura misteriosa.");
            int opcao = sc.nextInt();
            delay.timeDelay(250);

            if (opcao == 1) {
                System.out.println("A criatura te pegou...");
                delay.SpacePrint(3);
                System.out.println("Carregando luta...");
                delay.timeDelay(1500);
                delay.SpacePrint(10);
                jogador.atacar();
                historyLoop = false;
            } else if (opcao == 2) {
                System.out.println("Carregando luta...");
                delay.timeDelay(1500);
                delay.SpacePrint(10);
                jogador.atacar();
                historyLoop = false;
            } else {
                System.out.println("Opção invalida.");
            }
        } while (historyLoop);
        sc.close();
    }

    public static void endStory(String playerName) {}
}