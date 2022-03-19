/**
 *
 * @author anderson
 */

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nome;

        System.out.println("Digite o nome da pessoa: ");
        nome = ler.next();
        System.out.println("\n");

        switch(nome) {
            case "Steve":
                System.out.println("-----------------\nJurídica:\nNOME: Steve Jobs\nCNPJ:123456789\n-----------------\n");
                break;
            case "Bill":
                System.out.println("-----------------\nFísica:\nNOME: Bill Gates\nCPF:987654321\n-----------------\n");
                break;
            default:
                System.out.println("!!Essa pessoa nao existe no nosso banco de dados!!\n");
        }
    }
}
