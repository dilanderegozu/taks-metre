import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {
        int mat,fizik,kimya,biyoloji,tarih;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu girin: ");
        mat = input.nextInt();
        System.out.println(mat);

        System.out.print("Fizik notunuzu girin: ");
        fizik = input.nextInt();
        System.out.println(fizik);

        System.out.print("Kimya notunuzu girin: ");
        kimya = input.nextInt();
        System.out.println(kimya);

        System.out.print("Bitolojş notunuzu girin: ");
        biyoloji = input.nextInt();
        System.out.println(biyoloji);

        System.out.print("Tarih notunuzu girin: ");
        tarih = input.nextInt();
        System.out.println(tarih);


        int toplam = (fizik+kimya+biyoloji+tarih+mat);
        double sonuc = toplam/5.0;

        System.out.println("Sonuç " +sonuc);
    }
}