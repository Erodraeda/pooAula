import java.util.Scanner;

public class ini {

    public static void main(String[] args) {
        ImpressaoNumeroImpar ini;

        ini = new ImpressaoNumeroImpar();

        Scanner in = new Scanner(System.in);

        System.out.println("Informe dois valores");
        int valor1 = in.nextInt();
        int valor2 = in.nextInt();

        System.out.println(ini.calcular(valor1, valor2));
    }

}