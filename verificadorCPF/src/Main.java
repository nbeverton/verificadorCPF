public class Main {
    public static void main(String[] args) {
//Preciso saber se o cpf é real
//Primeiro passo: Multiplar digitos de acordo com a tabela


    int primeiroDigito = 5;
    int segundoDigito = 7;
    int terceiroDigito = 2;
    int quartoDigito = 3;
    int quintoDigito = 6;
    int sextoDigito = 7;
    int setimoDigito = 4;
    int oitavoDigito = 1;
    int nonoDigito = 4;
    int decimoDigito = 4;
    int decimoPrimeiroDigito = 2;

    int verificador1;
    int verificador2;

    int S1 = (primeiroDigito*10 + segundoDigito*9 + terceiroDigito*8 + quartoDigito*7 + quintoDigito*6 + sextoDigito*5 +
            setimoDigito*4 + oitavoDigito*3 + nonoDigito*2) % 11;

    if (S1 == 0 || S1 == 1){
            verificador1 = 0;
        }else {
            verificador1 = 11-S1;
    }
    System.out.println(verificador1);

    int S2 = (primeiroDigito*11 + segundoDigito*10 + terceiroDigito*9 + quartoDigito*8 + quintoDigito*7 + sextoDigito*6 +
            setimoDigito*5 + oitavoDigito*4 + nonoDigito*3 + decimoDigito*2) % 11;

    if(S2 == 0 || S2 == 1){
        verificador2 = 0;
    }else {
        verificador2 = 11-S2;
    }
    System.out.println(verificador2);

    if (verificador1 == decimoDigito && verificador2 == decimoPrimeiroDigito){
        System.out.println("O número informado é de um CPF válido");
    }else {
        System.out.println("O número informado não pertence a um CPF válido. Por favor, reveja o número digitado");
    }
    }
}