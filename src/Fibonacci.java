import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("--------------------------");
        System.out.println("| SEQUÊNCIA DE FIBONACCI |");
        System.out.println("--------------------------");

        int quant = 0;

        while (quant < 1) {
            System.out.print("\nDigite a quantidade de números da sequência de Fibonacci que você gostaria de ver: ");
            quant = read.nextInt();
            if (quant <= 0) {
                System.out.println("\nValor inválido. Tente novamente!");
            }
        }

        int anterior = 1;
        int atual = 1;
        int proximo = 0;
        int penultimo = 1;
        boolean presenteNaLista = false;

        if (quant == anterior) {
            System.out.println("\nSequência de Fibonacci até o " + quant + "º número: " + anterior);
            System.out.println("\nO número " + quant + " aparece nesta sequência de Fibonnaci");

        } else if (quant == 2) {
            System.out.println("\nSequência de Fibonacci até o " + quant + "º número: ");
            System.out.println(anterior);
            System.out.println(atual);
            System.out.println("\nO número " + quant + " não aparece nesta sequência de Fibonnaci");

        } else {
            System.out.println("\nSequência de Fibonacci até o " + quant + "º número:");
            System.out.println(anterior);
            System.out.println(atual);

            //1-1-2-4-7-11-18-36-65-101-166

            for (int i = 3; i <= quant; ++i) {

                if (atual % 2 == 0) {
                    proximo = penultimo + anterior + atual;
                } else {
                    proximo = anterior + atual;
                }

                System.out.println(proximo);

                penultimo = anterior;
                anterior = atual;
                atual = proximo;

                if (proximo == quant) {
                    presenteNaLista = true;
                }
            }

            if (presenteNaLista) {
                System.out.println("\nO número " + quant + " aparece nesta sequência de Fibonnaci!\n");

            } else {
                System.out.println("\nO número " + quant + " não aparece nesta sequência de Fibonnaci!\n");
            }
        }

        read.close();
    }
}
