/** Classe base de configurações gerais
 * 
 *  @version 1.0
 * 
 *  @author Matheus Gabriel
 */

package RPG;
public abstract class Settings {
    public static void start(){}
    public void timeDelay(int millis){}
}

/** Sub classe de 'Settings' para configurar tempos de resposta
 * da Thread principal e espaço entre prints
 * 
 *  @version 1.0
 * 
 *  @author Matheus Gabriel
 */

class Delay extends Settings{
    @Override
    public void timeDelay(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {};
    }

    public void spacePrint(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            System.out.println();
        }
    }
}