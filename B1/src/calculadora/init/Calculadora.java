package calculadora.init;

import colors.ColorCodes;

import javax.management.RuntimeErrorException;
import javax.swing.JOptionPane;



public class Calculadora {

    public Calculadora() {
        try {
            double n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro numero ","",1).replace(",","."));
            double n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo numero ","",1).replace(",","."));
            String op = JOptionPane.showInputDialog(null,"Escolha uma operação \n + : soma\n - : menos\n  * : multiplicação\n '\' : divisão\n ^ : exponenciação");
            JOptionPane.showMessageDialog(null,operator(n1,n2,op));
        } catch (Exception e) {
            System.out.println(ColorCodes.ErrorColor.getCode() + "este tipo de dado não é suportado. \n" + ColorCodes.CorrectionColor.getCode() + "solução : altere para o tipo double" );
        }

    }

    private Number operator(double n1, double n2 , String operator){
        switch (operator) {
            case "+":
                return n1 + n2;
            case "-":
                return n1 - n2;
            case "*":
                return n1 * n2;
            case "/":
                return n1 / n2;
            case "^":
                return Math.pow(n1,n2);
            default:
                throw new RuntimeErrorException(null);
        }

    }
}
