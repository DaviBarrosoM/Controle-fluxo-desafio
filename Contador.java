import java.security.InvalidParameterException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = scan.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = scan.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (InvalidParameterException e) {
            System.err.println(e.getMessage());
        }


    }


    static void contar(int n1, int n2) throws InvalidParameterException {
        if (n1 > n2) {
            throw new InvalidParameterException("O segundo parâmetro deve ser maior que o primeiro.");

        }
        int contagem = n2 - n1;
        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número " + (i+1));

        }
    }
}

