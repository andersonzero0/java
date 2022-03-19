/**
 *
 * @author anderson
 */

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int salario;

        System.out.println("Digite seu salario: ");
        salario = ler.nextInt();

        if (salario <= 1212) {
            System.out.println("Você ganha até um salário minimo.");
        }
        if (salario > 1212 && salario <= 3336) {
            System.out.println("Você ganha até 3 salários minimos.");
        }
        if (salario > 3336) {
            System.out.println("Você ganha acima de 3 salários minimos.");
        }
    }
}
