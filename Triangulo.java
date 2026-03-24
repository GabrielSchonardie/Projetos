import java.util.Scanner;

public class Triangulo {

    public static void main (String [] args ) {

        Scanner read = new Scanner(System.in);

        System.out.print("Digite um cateto(em cm): ");
        int catetoUm = read.nextInt();

        System.out.print("Digite outro cateto(em cm): ");
        int catetoDois = read.nextInt();

        double valorH = (Math.pow(catetoUm, 2)) + (Math.pow(catetoDois, 2));
        int hipotenusa = (int)Math.sqrt(valorH);
        System.out.println("\nHipotenusa: " + hipotenusa +" cm");
        System.out.println("Perímetro: " + (catetoDois + catetoUm + hipotenusa) + " cm");
        double area = (catetoUm * catetoDois) / 2;
        System.out.print("Área: " + area + " cm²");

        read.close();
    }
}
