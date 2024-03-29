package advinhação.algorithm;

import colors.ColorCodes;

import java.util.Random;
import java.util.Scanner;

public class AdvinhacaoAlgorithm extends Random{

    private Scanner leia = new Scanner(System.in);

    public void Game() {
        int number = nextInt(100);
        System.out.println("------- jogo da advinhação ------");
        System.out.println("---- chute um numero entre 0 e 100 ----");
        int chute = leia.nextInt();
        System.out.println(number);
        while (chute != number){
            System.out.println(interval(chute,number));
            System.out.println("tente novamente !");
            chute = leia.nextInt();
        }
        System.out.println(ColorCodes.SucessColor.getCode() + " você acertou !! parabens");
    }

    private String interval(int num,int comparable){
        if(num >= comparable){
            return ColorCodes.CorrectionColor.getCode() + "seu chute é maior que o numero sorteado";
        }else{
            return ColorCodes.CorrectionColor.getCode() + "seu chute é menor que o numero sorteado";
        }
    }

}
