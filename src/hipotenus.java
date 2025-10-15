import java.util.Scanner;

public class hipotenus {
    public static void main(String[] args) {
        double a,b ;
        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        b = input.nextDouble();
        double sonuc = (a*a + b*b);
        int sonuc1 = (int)sonuc;
        System.out.println("Hipotenüs " + sonuc1
        );
    }
}
