package RPG;
import java.util.*;

interface Cavalheiro {
   void atacar();
}

class RpgCavalheiro implements Cavalheiro {
   String nome;

   public RpgCavalheiro(String nome) {
      this.nome = nome;
   }

   public String getNome() {
       return nome;
   }

   Random sorteio = new Random();
   int vidaHeroi = 100;
   int vidaVilao = 100;
   
   @Override
   public void atacar(){
      System.out.println("O herói decide atacar");
      int sortearAtaque = sorteio.nextInt(9);
      System.out.println(sortearAtaque);
      if (sortearAtaque %2 == 0) {
         System.out.println("O herói acertou o ataque. \n"
            + "O vilão levou 20 de dano, o vilão está com " + vidaVilao + " pontos de vida");
         vidaVilao =- 20;
      } else {
         System.out.println("O herói errou o ataque");
      }
   }
}