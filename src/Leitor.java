import java.util.Scanner;

public class Leitor {
    public static void main(String[] args) throws Exception {
     
        Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;
        int tempo = paginas / paginasLidas;
        int se = paginas % 3;
        //System.out.println( se);     
        if(se == 0) 
        { System.out.println( tempo + " dias"); }
        else
        { System.out.println( tempo + 1 + " dias"); }

    }
}