package br.com.nbeverton;
import java.util.Scanner;

public class VerificadorDeCPF {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o seu CPF: ");
        String CPF = entrada.nextLine();

        String valor1 = String.valueOf(CPF.charAt(0));
        Integer digito1 = Integer.parseInt(valor1);
        String valor2 = String.valueOf(CPF.charAt(1));
        Integer digito2 = Integer.parseInt(valor2);
        String valor3 = String.valueOf(CPF.charAt(2));
        Integer digito3 = Integer.parseInt(valor3);
        String valor4 = String.valueOf(CPF.charAt(3));
        Integer digito4 = Integer.parseInt(valor4);
        String valor5 = String.valueOf(CPF.charAt(4));
        Integer digito5 = Integer.parseInt(valor5);
        String valor6 = String.valueOf(CPF.charAt(5));
        Integer digito6 = Integer.parseInt(valor6);
        String valor7 = String.valueOf(CPF.charAt(6));
        Integer digito7 = Integer.parseInt(valor7);
        String valor8 = String.valueOf(CPF.charAt(7));
        Integer digito8 = Integer.parseInt(valor8);
        String valor9 = String.valueOf(CPF.charAt(8));
        Integer digito9 = Integer.parseInt(valor9);
        String valor10 = String.valueOf(CPF.charAt(9));
        Integer digito10 = Integer.parseInt(valor10);
        String valor11 = String.valueOf(CPF.charAt(10));
        Integer digito11 = Integer.parseInt(valor11);

        int verificador1;
        int verificador2;

        int S1 = (digito1*10 + digito2*9 + digito3*8 + digito4*7 +
                digito5*6 + digito6*5 + digito7*4 + digito8*3 +
                digito9*2) % 11;

        if (S1 == 0 || S1 == 1){
            verificador1 = 0;
        }else {
            verificador1 = 11-S1;
        }
        System.out.println(verificador1);

        int S2 = (digito1*11 + digito2*10 + digito3*9 + digito4*8 +
                digito5*7 + digito6*6 + digito7*5 + digito8*4 +
                digito9*3 + digito10*2) % 11;

        if (S2 == 0 || S2 == 1){
            verificador2 = 0;
        } else {
            verificador2 = 11-S2;
        }

        System.out.println(verificador2);


        if (verificador1 == digito10 && verificador2 == digito11){
            System.out.println("O número de CPF digitado é válido");
        } else {
            System.out.println("Por favor, digite um número de CPF válido.");
        }

        entrada.close();
    }
}
