package ImpressaoNaturais;

public class ImpressaoNaturaisTeste {
    public static void main(String[] args) {
        ImpressoesNaturais impNat;
        impNat = new ImpressoesNaturais();

        int value = 8;

        StringBuilder sb = new StringBuilder(impNat.impNaturais(value));

        System.out.println(sb.reverse().toString());
        System.out.println(impNat.impNaturais(value));
    }
}