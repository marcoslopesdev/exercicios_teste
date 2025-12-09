import java.util.Scanner;

public class SequenciaDeNumeros {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int quant = 0;
        int maiorNumero = Integer.MIN_VALUE;
        int menorNumero = Integer.MAX_VALUE;

        System.out.println("------------------------");
        System.out.println("| SEQUÊNCIA DE NÚMEROS |");
        System.out.println("------------------------");

        while(quant <= 0) {
            System.out.print("Quantidade de números a ser inserida: ");
            quant = read.nextInt();

            if (quant <= 0) {
                System.out.print("Quantidade inválida! Digite um número maior que zero.\n\n");
            }
        }

        int[] numeros = new int[quant];

        for(int i = 0; i < quant; ++i) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = read.nextInt();

            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }

            if (numeros[i] < menorNumero) {
                menorNumero = numeros[i];
            }
        }

        System.out.print("Sequência digitada: ");

        for(int i = 0; i < quant; ++i) {
            System.out.print(numeros[i] + " ");
        }

        System.out.print("\nMaior número: " + maiorNumero);
        System.out.print("\nMenor número: " + menorNumero);

        read.close();
    }
}
