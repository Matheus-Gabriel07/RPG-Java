import java.util.Random;
import java.util.Scanner;

interface JogadorSettings {
    void atacar();
}

class Jogador implements JogadorSettings {
    String nome;
    Scanner sc = new Scanner(System.in);

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    Random sorteio = new Random();
    int vidaHeroi = 100;
    int vidaVilao = 100;

    @Override
    public void atacar() {
        boolean batalha = true;
        do {
            System.out.println("Você quer atacar?\n" +
                    "1- Sim \n" +
                    "2- Não");
            int atacarSouN = sc.nextInt();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            ;

            System.out.println("Vida do Herói: " + vidaHeroi);
            System.out.println("Vida do Vilão: " + vidaVilao);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {};

            if (atacarSouN == 1) {
                System.out.println("O herói decide atacar");
                int sortearAtaque = sorteio.nextInt(9);
                System.out.println(sortearAtaque);
                if (sortearAtaque % 2 == 0) {
                    vidaVilao = vidaVilao - 20;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {};

                    System.out.println("O herói acertou o ataque. \n"
                            + "O vilão levou 20 de dano, o vilão está com " + vidaVilao + " pontos de vida.");

                } else {
                    vidaHeroi = vidaHeroi - 20;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e){};

                    System.out.println("O herói errou o ataque. \n"
                            + "O herói levou 20 de dano, o herói está com " + vidaHeroi + " pontos de vida.");
                }
            }
            if (atacarSouN == 2) {
                vidaHeroi = vidaHeroi - 20;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e){};

                System.out.println("O vilão atacou e o herói levou 20 de dano, o herói está com " + vidaHeroi
                        + " pontos de vida.");
            }
            if (vidaHeroi == 0 || vidaVilao == 0) {
                batalha = false;
            }

        } while (batalha);

    }
}