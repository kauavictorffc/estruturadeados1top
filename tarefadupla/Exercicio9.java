public class Exercicio9 {
    static int somaRecursiva(int[] v, int i) {
        if (i == v.length) return 0;
        return v[i] + somaRecursiva(v, i + 1);
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4};
        System.out.println("Soma: " + somaRecursiva(numeros, 0));
    }
}
