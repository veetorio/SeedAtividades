package AnoBisexto.Algorithm;

public class AlgorithmAnoBisexto {
    public static String ISBissexto(int num){
        if(num % 4 == 0){
            return "Este ano é bissexto";
        }else{
            return  "Este ano não é bissexto";
        }
    }
}
