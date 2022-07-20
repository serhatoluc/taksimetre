import java.util.Scanner;

public class taksi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int acilis = 10;
        double kmKatSayi = 2.2;
        double km;
        double toplam;
        String sonuc;

        System.out.println("Merhaba, Taksimetre Programına Hoşgeldiniz...");
        System.out.print("Lütfen Alınan Km'yi Giriniz: ");
        km = input.nextDouble();
        toplam = ((km * kmKatSayi) + (acilis));

        sonuc = toplam >= 20 ? ("Ödemeniz Gereken Tutar: " + toplam + " ₺") : ("Ödemeniz Gereken Tutar 20 TL");

        System.out.println(sonuc);

    }
}
