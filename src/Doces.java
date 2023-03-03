import java.util.Scanner; 
    
public class Doces {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int dinheiro = leitor.nextInt();
        int doces = dinheiro*2;
        // TODO: Crie a condição necessária para que cada cliente saiba quantos doces vai obter de acordo com a entrada
        System.out.println("O cliente obteve " + doces + " doces");
    }
}