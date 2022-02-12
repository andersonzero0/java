/*
* String- armazena texto, como "Olá". Os valores de string são cercados por aspas duplas.
* int- armazena inteiros (números inteiros), sem decimais, como 123 ou -123.
* float- armazena números de ponto flutuante, com decimais, como 19,99 ou -19,99.
* char- armazena caracteres únicos, como 'a' ou 'B'. Os valores de caractere são cercados por aspas simples.
* boolean- armazena valores com dois estados: verdadeiro ou falso.
*/
public class Variaveis {
    public static void main(String[] args) {
        String name = "John";
        System.out.println("Hello" + name);
        //
        int myNum = 15;
        System.out.println(myNum);
        //
        int num;
        num = 15;
        System.out.println(num);
        //
        int numx = 15;
        numx = 20;  // myNum is now 20
        System.out.println(numx);
        //
        final int numy = 15;
        numy = 20; // will generate an error
        System.out.println(numy);
        //
        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);
        //
        int x = 5;
        int y = 6;
        System.out.println(x + y); // Print the value of x + y
        //
        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z);
    }
}
