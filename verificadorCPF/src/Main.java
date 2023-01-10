package br.com.nbeverton;
import java.util.Scanner;

public class VerificadorDeCPF {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o seu CPF: ");
        String CPF = entrada.nextLine();

        int digito1 = Integer.parseInt(String.valueOf(CPF.charAt(0)));
        int digito2 = Integer.parseInt(String.valueOf(CPF.charAt(1)));
        int digito3 = Integer.parseInt(String.valueOf(CPF.charAt(2)));
        int digito4 = Integer.parseInt(String.valueOf(CPF.charAt(3)));
        int digito5 = Integer.parseInt(String.valueOf(CPF.charAt(4)));
        int digito6 = Integer.parseInt(String.valueOf(CPF.charAt(5)));
        int digito7 = Integer.parseInt(String.valueOf(CPF.charAt(6)));
        int digito8 = Integer.parseInt(String.valueOf(CPF.charAt(7)));
        int digito9 = Integer.parseInt(String.valueOf(CPF.charAt(8)));
        int digito10 = Integer.parseInt(String.valueOf(CPF.charAt(9)));
        int digito11 = Integer.parseInt(String.valueOf(CPF.charAt(10)));

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
