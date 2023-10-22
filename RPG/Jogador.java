/** Classe do jogador do RPG qual cria o Jogador e realiza a batalha
 *  contra a critaura final
 * 
 *  @version 1.4
 * 
 *  @author Kaique Magalhães
 *  @author Willian
 */

package RPG;
import java.util.Random;
import java.util.Scanner;

interface JogadorSettings {
    int atacar();
}

class Jogador implements JogadorSettings {
    Scanner sc = new Scanner(System.in);
    Delay delay = new Delay();

    String nome;
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
    public int atacar() {
        boolean batalha = true;
        do {
            System.out.println("Você quer atacar?\n" +
                    "1- Sim \n" +
                    "2- Não");
            int atacarSouN = sc.nextInt();

            delay.timeDelay(500);
            delay.spacePrint(3);

            System.out.println("________________________________" +
                    "\n Estatísticas" +
                    "\nVida do " + getNome() + ": " + vidaHeroi +
                    "\nVida da criatura: " + vidaVilao +
                    "\n________________________________\n");

            delay.timeDelay(1250);

            if (atacarSouN == 1) {
                System.out.println("O " + getNome() + " decide atacar...");
                int sortearAtaque = sorteio.nextInt(9);

                if (sortearAtaque % 2 == 0) {
                    vidaVilao = vidaVilao - 20;
                    delay.timeDelay(250);

                    System.out.println("O " + getNome() + " acertou o ataque. \n"
                            + "A criatura levou 20 de dano, e está com " + vidaVilao + " pontos de vida.");
                    delay.spacePrint(3);

                } else {
                    vidaHeroi = vidaHeroi - 20;
                    delay.timeDelay(1250);

                    System.out.println("O " + getNome() + " errou o ataque. \n"
                            + "O " + getNome() + " levou 20 de dano, e está com " + vidaHeroi + " pontos de vida.");
                    delay.spacePrint(3);
                }
            }
            if (atacarSouN == 2) {
                vidaHeroi = vidaHeroi - 20;
                delay.timeDelay(250);

                System.out.println("A criatura atacou e o " + getNome() + " levou 20 de dano, o " + getNome() + " está com " + vidaHeroi
                        + " pontos de vida.");
                delay.spacePrint(3);

            }
            if (vidaHeroi == 0 || vidaVilao == 0) {
                return 1;
            }

        } while (batalha);
        return 0;

    }
}