package estudando.java.introducao;

public class ExercicioCondicionais {
    public static void main(String[] args) {
        double salary = 6300.00;
        double AnnualSalary = 70000;
        double taxe;
        double totalDicounted;
        double totalSalary;


        if(AnnualSalary >= 0 && AnnualSalary <= 34712 ){
            taxe = 9.70;
        } else if ( AnnualSalary >= 34713 && AnnualSalary <= 68507) {
            taxe = 37.35;
        }
        else {
            taxe = 49.50;
        }

     totalDicounted = (AnnualSalary * taxe) / 100;
     totalSalary = AnnualSalary -((AnnualSalary * taxe) / 100);

        System.out.println("Seu Salário bruto anual é de: $"+salary+" Seu saláiro líquido anual é de: $"+totalSalary+" Foi descontado de taxa("+taxe+"%): $"+totalDicounted+".");
    }
}
