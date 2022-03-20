package exercises;
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
        
        System.out.println("* --- Bem-vindo(a) --- *\n");
        System.out.println("Banco de Dados:\n-Steve\n-John\n-Alice\n-Jack\n");
        System.out.println("+------------------------+");
        System.out.println("Digite o nome da pessoa: ");
        nome = ler.next();
        System.out.println("");
        
        switch(nome) {
            case "steve":
            case "Steve":
                System.out.println(steve + "\n");
                System.out.println("+------------------------+");
                break;
                
            case "john":
            case "John":
                System.out.println(john + "\n");
                System.out.println("+------------------------+");
                break;
                
            case "alice":
            case "Alice":
                System.out.println(alice + "\n");
                System.out.println("+------------------------+");
                break;
                
            case "jack":
            case "Jack":
                System.out.println(jack + "\n");
                System.out.println("+------------------------+");
                break;
                
            default:
                System.out.println("!!Essa pessoa nao existe no nosso banco de dados!!\n");
                System.out.println("+------------------------+");
        }
    }
    
}