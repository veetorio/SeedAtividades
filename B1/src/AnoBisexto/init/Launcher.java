package AnoBisexto.init;

import AnoBisexto.Algorithm.AlgorithmAnoBisexto;
import colors.ColorCodes;

import java.util.Scanner;

public class Launcher {
    private Scanner leia = new Scanner(System.in);
    public Launcher(){
        System.out.println("------- descubra se o ano é bissexto ------");
        System.out.println("---- digite o ano ----");
        int ano = leia.nextInt();
        System.out.println(AlgorithmAnoBisexto.ISBissexto(ano));
    }
}
