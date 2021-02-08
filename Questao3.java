import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args){
        class ExibirTexto{
            Scanner vezes = new Scanner(System.in);
            int quant = vezes.nextInt();
            int i=0;
            while(quant>i){
                System.out.print("Incomoda ");
                ++i;
            }
            System.out.print("muito mais");
        }
    }
}
