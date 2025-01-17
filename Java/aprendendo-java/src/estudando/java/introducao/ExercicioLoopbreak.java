package estudando.java.introducao;

public class ExercicioLoopbreak {
    public static void main(String[] args) {
        double valueCar = 30000;
        for (int i = 1; i < valueCar; i++) {
            double installment = valueCar / i;
            if (installment <= 1000) {
                System.out.println("o maior número de parcelas é de " + i + "x .");
                break;
            }
        }
    }
}
