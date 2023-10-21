public abstract class Settings {
    public static void start(){}
    public void timeDelay(int millis){}
    public void escolha(int opcao, String linhaDoTempo){}
}

class Delay extends Settings{
    @Override
    public void timeDelay(int millis){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {};
    }

    public void SpacePrint(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            System.out.println();
        }
    }
}