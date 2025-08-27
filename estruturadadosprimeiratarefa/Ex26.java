import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite data no formato DDMMAA: ");
        int data = sc.nextInt();
        int dia = data / 10000;
        int mes = (data % 10000) / 100;
        int ano = data % 100;
        int ndata = mes * 10000 + dia * 100 + ano;
        System.out.println("DATA NO FORMATO MMDDAA: " + ndata);
        sc.close();
    }
}
