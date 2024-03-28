package timeBomb.Algorithm;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import B1.lib.ColorCodes;

public class TimerBomber {
    public static String Init(int seconds) throws InterruptedException{
        Timer timing = new Timer();
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
            ***************************************
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
