import java.util.Scanner;

public class PrimoTeste {
    public static void main(String[] args) {
        Primo primo;
        primo = new Primo();

        Scanner in = new Scanner(System.in);

        int value = in.nextInt();

        System.out.println(primo.primoChecagem(value));
        System.out.println(primo.primoPrint(value));
    }
}
