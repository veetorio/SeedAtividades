package timeBomb.Algorithm;

import colors.ColorCodes;

import java.util.concurrent.TimeUnit;


/**
 * * A classe contem o algoritimo da contagem regressiva
 */
public class TimerBomber {
    
    /** 
     * *Esse metodo irá iniciar um for que será executado de acordo com o inicializador(seconds)
     * @param seconds
     * @return String
     * @throws InterruptedException
     */
    public static String Init(int seconds) throws InterruptedException{

        for(int i = seconds; i >= 0 ; i--){
            TimeUnit.SECONDS.sleep(1l);
            System.out.println(i);
        }
        System.out.println("aguarde 2 segundos !!");
        TimeUnit.SECONDS.sleep(2l);
        return ColorCodes.ErrorColor.getCode() + """
             *************************************
            ******  ***********************  ******
            ****      *******************      ****
            **          ***************          **
            **           *************           **
            **             *********             **    
            **     ()       *******       ()     **
            ***************************************
            ***************** **** ****************
            ***************************************
            """
            +
            ColorCodes.ImpartionalColor.getCode()
            +
            """ 
            vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
            ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
            """
            +    
            ColorCodes.ErrorColor.getCode()
            +
            """
            ***************************************
             *************************************
              ***********************************
               *********************************
                *******************************
            """;
    
    }
}
