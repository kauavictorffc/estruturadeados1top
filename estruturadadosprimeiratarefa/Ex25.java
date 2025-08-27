import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite data no formato DDMMAA: ");
        int data = sc.nextInt();
        int dia = data / 10000;
        int mes = (data % 10000) / 100;
        int ano = data % 100;
        System.out.println("DIA: " + dia);
        System.out.println("MES: " + mes);
        System.out.println("ANO: " + ano);
        sc.close();
    }
}
