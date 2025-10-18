import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class TorresDeHanoiCompacto {

    static long movimentos; 

    /**
     */
    static void resolver(int n, char origem, char destino, char aux) {
        if (n > 0) {
            resolver(n - 1, origem, aux, destino);
            movimentos++;
            resolver(n - 1, aux, destino, origem);
        }
    }

    public static void main(String[] args) {
        
        IntStream.of(1, 10, 20, 30, 40, 41).forEach(discos -> {
            movimentos = 0; 
            long movimentosEsperados = (long) Math.pow(2, discos) - 1;
            
            System.out.printf("Executando para %d discos... (Movimentos esperados: %,d)%n", discos, movimentosEsperados);

            long inicio = System.currentTimeMillis();
            resolver(discos, 'A', 'C', 'B');
            long duracao = System.currentTimeMillis() - inicio;

            System.out.printf(">> Concluído! Movimentos: %,d | Tempo: %s%n%n", movimentos,
                String.format("%02d:%02d:%02d:%02d",
                    TimeUnit.MILLISECONDS.toHours(duracao),
                    TimeUnit.MILLISECONDS.toMinutes(duracao) % 60,
                    TimeUnit.MILLISECONDS.toSeconds(duracao) % 60,
                    (duracao % 1000) / 10)
            );
        });
    }
}