package entidades;

public class Calculator {

    public double valor1;
    public String ope;
    public double valor2;

    public double Operacao(){
        double resultado = 0;
        switch (ope){

            case "+": resultado = valor1 + valor2;
                    break;
            case "-": resultado = valor1 - valor2;
                    break;
            case "/": resultado = valor1 / valor2;
                    break;
            case "*": resultado = valor1 * valor2;
                    break;
            default: System.out.println("Operacao nao encontrada.");
                    break;

        }
        return resultado;
    }







}
