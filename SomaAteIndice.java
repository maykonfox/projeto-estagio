public class SomaAteIndice{
    public static void main(String[] args) {
        int INDICE = 13;
        int SOMA = 0;
        int K = 0;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println("A soma dos números de 1 até " + INDICE + " é: " + SOMA);
    }
}
