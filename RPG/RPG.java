package RPG;

import java.util.Scanner;

public class RPG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seja bem vindo ao RPG");
        System.out.println("Digite o seu nome");
        String nome = sc.nextLine();
        RpgCavalheiro heroi = new RpgCavalheiro(nome);

        System.out.println("Carregando...");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }

        System.out.println("Dentro de uma floresta com os seus amigos para acampar, principalmente "
                + heroi.getNome() + "."
                + "\nDurante a noite, após terem comido muitos espetinhos, o céu se escurece e as rajadas se intensificam"
                +
                "\nCarlos disse:" +
                "\n- É melhor entrarmos em nossas barracas e esperarmos passar\n" +
                "Todos entraram em suas barracas e começaram a ouvir o som da chuva ");

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(250);
                System.out.println("chuá");
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println();
        }

        System.out.println("=====");
        System.out.println("A chuva começou a ficar mais forte, e vocÊ tem duas opções: "
                + "\n1) Dormir"
                + "\n2) Esperar");
        int escolhaIncial = sc.nextInt();
        switch (escolhaIncial) {
            case 1:
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                Night.dormir();
                break;

            case 2:
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                System.out.println(
                        "Você decidiu esperar, e esperou tanto tempo, que a chuva inmundou o chão e morreu afogado.");
                break;

            default:
                System.out.println("");
                break;
        }
        sc.close();
    }
}
