import java.util.Random;

public class Documento {
    private int id;
    private String tipo;
    private int paginas;

    private static final String[] TIPOS = {"PDF","TXT","JPG","PNG","DOCX","XLSX"};
    private static boolean[] usados = new boolean[1001];
    private static Random rand = new Random();

    public Documento() {
        // GERAR ID ÚNICO ENTRE 1 E 1000
        int novoId;
        do {
            novoId = rand.nextInt(1000) + 1;
        } while (usados[novoId]);
        usados[novoId] = true;

        this.id = novoId;
        this.tipo = TIPOS[rand.nextInt(TIPOS.length)];
        this.paginas = rand.nextInt(100) + 1;
    }

    public int getId() {
        return id;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "[ID: " + id + " | Tipo: " + tipo + " | Páginas: " + paginas + "]";
    }
}
