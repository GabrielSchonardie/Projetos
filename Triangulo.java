import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Digite um cateto (cm): ");
        double catetoUm = read.nextDouble();

        System.out.print("Digite outro cateto (cm): ");
        double catetoDois = read.nextDouble();

        double somaQuadrados = Math.pow(catetoUm, 2) + Math.pow(catetoDois, 2);
        double hipotenusa = Math.sqrt(somaQuadrados);

        double perimetro = catetoUm + catetoDois + hipotenusa;
        double area = (catetoUm * catetoDois) / 2.0;

        System.out.printf("\nHipotenusa: %.2f cm", hipotenusa);
        System.out.printf("\nPerímetro: %.2f cm", perimetro);
        System.out.printf("\nÁrea: %.2f cm²", area);

        read.close();
    }
}
