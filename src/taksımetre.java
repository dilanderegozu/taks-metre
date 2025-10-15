import java.util.Scanner;

public class taksımetre {
    public static void main(String[] args) {
        int km;
        double kilometre = 2.20, total, acılıs = 10;
        Scanner input = new Scanner(System.in);

        System.out.println("Kilometreyi giriniz: " );

        km = input.nextInt();

        total = acılıs + km * kilometre;

       if (total > 20) {
           System.out.println(total);
       }
       else {
           System.out.println(20);
       }


    }
}



/*
Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
*/
