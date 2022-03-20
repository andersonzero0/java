/**
 *
 * @author anderson
 */
import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String steve = "+------------+\n  Presidente\n+------------+";
        String john = "+----------+\n  Diretor\n+----------+";
        String alice = "+----------+\n  Vendedor\n+----------+";
        String jack = "+----------+\n    RH\n+----------+";
        
        String nome;
        
        System.out.println("+------------------------+");
        System.out.println("Digite o nome da pessoa: ");
        nome = ler.next();
        System.out.println("");
        
        switch(nome) {
            case "steve":
                System.out.println(steve + "\n");
                System.out.println("+------------------------+");
                break;
                
            case "john":
                System.out.println(john + "\n");
                System.out.println("+------------------------+");
                break;
                
            case "alice":
                System.out.println(alice + "\n");
                System.out.println("+------------------------+");
                break;
                
            case "jack":
                System.out.println(jack + "\n");
                System.out.println("+------------------------+");
                break;
                
            default:
                System.out.println("!!Essa pessoa nao existe no nosso banco de dados!!\n");
                System.out.println("+------------------------+");
        }
    }
    
}