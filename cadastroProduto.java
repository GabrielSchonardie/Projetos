import java.util.Scanner;

class cadastroProduto {

    public static void main (String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("\nDigite o nome do produto: ");
        String nomeProduto = read.nextLine();

        System.out.print("\nDigite a quantidade do produto: ");
        int quantidade = read.nextInt();

        System.out.print("\nDigite o preço do produto: R$ ");
        double preco = read.nextDouble();

        System.out.printf(
                "\nProduto: %s - Quantidade: %d - Preço: R$ %.2f ",
                nomeProduto, quantidade, preco
        );

        read.close();
    }
}
