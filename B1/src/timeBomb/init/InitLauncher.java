package timeBomb.init;

import java.util.Scanner;

import B1.lib.ColorCodes;
import timeBomb.Algorithm.TimerBomber;

public class InitLauncher {
    private Scanner leia = new Scanner(System.in);
    private int seconds;
    private boolean state = true;

    public InitLauncher(){
            try {
            int __seconds = leia.nextInt();
            this.seconds = __seconds;
            leia.close();
        } catch (Exception e) {
            state = false;
            System.out.println(ColorCodes.ErrorColor.getCode() + "este tipo de dado não é suportado. \n" + ColorCodes.CorrectionColor.getCode() + "solução : altere para o tipo double" );
        }
    }

    
    /** 
     * *Esse metodo inicia a contagem pegando o atributo seconds como sendo seu inicializador
     * @throws InterruptedException
     */
    public void InitCount() throws InterruptedException{
        System.out.println(TimerBomber.Init(this.seconds));
    }
}
