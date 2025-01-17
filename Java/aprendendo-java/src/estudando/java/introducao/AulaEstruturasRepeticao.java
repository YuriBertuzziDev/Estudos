package estudando.java.introducao;

public class AulaEstruturasRepeticao {
    public static void main(String[] args) {
        //while, do while, for
        int count = 0;
        while (count < 10) {
            System.out.println("Linha: " + ++count);
        }

        int countDo = 11;
        do {
            System.out.println("Linha no do: " + ++countDo);
        } while (countDo < 10);

        for(int i ; count<10; count++){
            System.out.println("Linha no for: " + ++count);
        }
    }
}
