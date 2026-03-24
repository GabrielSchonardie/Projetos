import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== CALCULADORA ===");

            System.out.print("Digite N1: ");
            double n1 = read.nextDouble();

            System.out.print("Digite N2: ");
            double n2 = read.nextDouble();

            System.out.println("\nEscolha a operação:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Potência");
            System.out.println("6 - Maior número");
            System.out.println("7 - Menor número");
            System.out.println("0 - Sair");

            System.out.print("Opção: ");
            opcao = read.nextInt();

            System.out.println();

            switch (opcao) {
                case 1:
                    System.out.println("Resultado: " + (n1 + n2));
                    break;

                case 2:
                    System.out.println("Resultado: " + (n1 - n2));
                    break;

                case 3:
                    System.out.println("Resultado: " + (n1 * n2));
                    break;

                case 4:
                    if (n2 != 0) {
                        System.out.println("Resultado: " + (n1 / n2));
                    } else {
                        System.out.println("Erro: divisão por zero");
                    }
                    break;

                case 5:
                    System.out.println("Resultado: " + Math.pow(n1, n2));
                    break;

                case 6:
                    System.out.println("Maior número: " + Math.max(n1, n2));
                    break;

                case 7:
                    System.out.println("Menor número: " + Math.min(n1, n2));
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 0);

        read.close();
    }
}
