import java.util.Scanner;

public class Algoritmo360 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data;

        do {
            System.out.print("Digite a data de nascimento (ddmm) ou 9999 para sair: ");
            data = sc.nextInt();

            if (data == 9999) break;

            int dia = data / 100;
            int mes = data % 100;
            String signo = "";

            switch (mes) {
                case 1: signo = (dia <= 20) ? "Capricórnio" : "Aquário"; break;
                case 2: signo = (dia <= 19) ? "Aquário" : "Peixes"; break;
                case 3: signo = (dia <= 20) ? "Peixes" : "Áries"; break;
                case 4: signo = (dia <= 20) ? "Áries" : "Touro"; break;
                case 5: signo = (dia <= 20) ? "Touro" : "Gêmeos"; break;
                case 6: signo = (dia <= 20) ? "Gêmeos" : "Câncer"; break;
                case 7: signo = (dia <= 21) ? "Câncer" : "Leão"; break;
                case 8: signo = (dia <= 22) ? "Leão" : "Virgem"; break;
                case 9: signo = (dia <= 22) ? "Virgem" : "Libra"; break;
                case 10: signo = (dia <= 22) ? "Libra" : "Escorpião"; break;
                case 11: signo = (dia <= 21) ? "Escorpião" : "Sagitário"; break;
                case 12: signo = (dia <= 21) ? "Sagitário" : "Capricórnio"; break;
            }

            System.out.println("Signo: " + signo);
        } while (data != 9999);

        sc.close();
    }
}
