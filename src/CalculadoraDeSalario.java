import java.util.Scanner;

public class CalculadoraDeSalario {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        float salarioHora = 0.0f;
        int horasTrabalhadasMes = 0;
        int filhosMenoresQue14Anos = -1;

        System.out.println("--------------------------");
        System.out.println("| CALCULADORA DE SALÁRIO |");
        System.out.println("--------------------------");

        while (salarioHora <= 0) {
            System.out.print("\nValor do Salário Hora: ");
            salarioHora = read.nextFloat();
            read.nextLine();

            if (salarioHora <= 0) {
                System.out.println("Valor inválido. Tente novamente!");
            }
        }

        while (horasTrabalhadasMes <= 0) {
            System.out.print("\nQuantidade de horas trabalhadas no mês: ");
            horasTrabalhadasMes = read.nextInt();
            read.nextLine();

            if (horasTrabalhadasMes <= 0) {
                System.out.println("Valor inválido. Tente novamente!");
            }
        }

        while (filhosMenoresQue14Anos < 0) {
            System.out.print("\nQuantidade de filhos menores de 14 anos que o funcionário possui: ");
            filhosMenoresQue14Anos = read.nextInt();
            read.nextLine();

            if (filhosMenoresQue14Anos < 0) {
                System.out.println("Valor inválido. Tente novamente!");
            }
        }

        float salarioBruto = salarioHora * horasTrabalhadasMes;
        float salarioFamilia;

        if (salarioBruto <= 788.0f) {
            salarioFamilia = 30.5f * filhosMenoresQue14Anos;

        } else if (salarioBruto <= 1100.0f) {
            salarioFamilia = 18.5f * filhosMenoresQue14Anos;

        } else {
            salarioFamilia = 11.9f * filhosMenoresQue14Anos;
        }

        float salarioLiquido = salarioBruto + salarioFamilia;

        System.out.printf("\nSalário Bruto: R$%.2f", salarioBruto);
        System.out.printf("\nSalário Família: R$%.2f", salarioFamilia);
        System.out.printf("\nSalário Líquido: R$%.2f", salarioLiquido);


        read.close();
    }
}
