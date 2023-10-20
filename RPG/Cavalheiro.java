package RPG;

interface Cavalheiro {
   void atacar();

   void defender();

   void desviar();

   void esperar();
}

class RpgCavalheiro implements Cavalheiro {
   String nome;

   public RpgCavalheiro(String nome) {
      this.nome = nome;
   }

   public String getNome() {
       return nome;
   }

   @Override
   public void atacar() {
      System.out.println("O cavallheiro está atacando o vilão com a sua excalibur");
   }

   public void defender() {
      System.out.println("O cavalheiro se denfedendeu com o seu escudo leão dorado ");
   }

   public void desviar() {
      System.out.println("O cavalheiro desviou de um ataque mortal ");
   }

   public void esperar() {
      System.out.println("O cavalheiro decidiu esperar\n");
   }

}