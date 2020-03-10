public class Funcionario {

    public static void main(String[] agrs) {

        CalculoFaixaSalarial cfs;
        cfs = new CalculoFaixaSalarial();

        double somaSalarioAtual = 0;
        double somaSaarioReajustado = 0;
        cfs.Calculo(somaSalarioAtual, somaSaarioReajustado);
    }
}
