package estudando.java.introducao;

public class ExercicioSwitch {
    public static void main(String[] args) {
        int day = 4;
        // switch pode ser usado apenas: char, int, byte , short, enum, String
        switch (day) {
            case 1:
            case 7:
                System.out.println("Weekend");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Working Day");
                break;
            default:
                System.out.println("Invalid Option");
        }

    }
}
