package conversor_de_salarios.init;

import java.util.Scanner;

import B1.lib.ColorCodes;
import conversor_de_salarios.algorithm.CalculoSalarios;

/**
 * ? essa classe ira criar os inputs no console para o usuario colocar seu
 * salário e o salario minimo
 * 
 * @Constructor InputValues(void)
 */
public class InputValues {

    private double salario_pessoa;
    private double salario_minimo;
    private boolean state = true;

    private static Scanner leia = new Scanner(System.in);

    public InputValues() {
        /**
         * * aqui faz captura dos dados do usuario para analisar e ver se não possue nenhum erro.
         */
        try {
            double SlP = leia.nextDouble();
            double SlM = leia.nextDouble();
            this.salario_pessoa = SlP;
            this.salario_minimo = SlM;
            leia.close();
        } catch (Exception e) {
            state = false;
            System.out.println(ColorCodes.ErrorColor.getCode() + "este tipo de dado não é suportado. \n" + ColorCodes.CorrectionColor.getCode() + "solução : altere para o tipo double" );
        }

    }

    /**
     * * essa função irá chamar o algoritmo do calculo atraves do Metodo
     * "calcular_salario"
     * @return double
     */
    public String Calculator(){
        if(state){
            return String
            .format("%sCalculo feito com sucesso !!\n---------------------\nSeu salario é de %.1f R$.\nE o salario minimo é %.1f R$ .\nSeu Salario corresponde a %.1f salarios minimo"
            ,ColorCodes.SucessColor.getCode()
            ,this.salario_pessoa
            ,this.salario_minimo
            ,CalculoSalarios.calcular_salario(this.salario_pessoa, this.salario_minimo));
        }else{
            return ColorCodes.ErrorColor.getCode() + "não foi possivel dar prosseguimento. erro na entrada";
        }

    }

}
