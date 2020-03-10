package CalcSalario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculoFaixaSalarial {

    public void Calculo(double somaSalarioAtual, double somaSalarioReajustado){

        String nome = new String();
        double salario;
        List<String> funcionarios = new ArrayList<String>();

        do{
            Scanner in = new Scanner (System.in);
            System.out.println("Insira o nome do funcionario e seu salario atual: ");
            nome = in.nextLine();
            if (nome.equals("FIM")){
                System.out.println("Soma dos salarios antes do rejuste: " + somaSalarioAtual);
                System.out.println("Soma dos salarios apos o reajuste: " + somaSalarioReajustado);
                System.out.println(funcionarios);
                return;
            }
            salario = in.nextDouble();

            double salarioAntigo = salario;
            somaSalarioAtual += salario;
            if (salario <= 150) {
                salario = salario * 1.25;
            } else if (salario > 150 && salario <= 300) {
                salario = salario * 1.2;
            } else if (salario > 300 && salario <= 600) {
                salario = salario * 1.15;
            } else if (salario > 600) {
                salario = salario * 1.1;
            }
            System.out.println("O salario de " + nome + " eh " + salario);
            somaSalarioReajustado += salario;
            double aumento = salario - salarioAntigo;
            funcionarios.add("Funcionario " + nome + ", com salario de: " + salario + ", recebeu um aumento de: " + aumento + ".");
        }while (nome != null);
    }
}
