import java.util.Scanner; 
    
public class Radar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidadeAtual = leitor.nextInt();
        
        if(velocidadeAtual <= 60){
            System.out.println("Não foi multado");
        }
        else if (velocidadeAtual > 60)
        {
            System.out.println("Foi multado");
        }

        // TODO: Crie a condição necessária para verificar se o motorista, de acordo com a entrada, foi multado ou não.

    }
}