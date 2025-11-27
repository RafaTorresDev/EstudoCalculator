import entidades.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator cc = new Calculator();

        System.out.println("Digite o primeiro valor: ");
        cc.valor1 = sc.nextDouble();
        System.out.println("Digite qual operacao voce quer (+, -, / ou *): ");
        cc.ope = sc.next();
        System.out.println("Digite o segundo valor: ");
        cc.valor2 = sc.nextDouble();

        System.out.println("O resultado e: " + cc.Operacao());






    }
}