import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("Turkce notunuzu giriniz: ");
        int turkce = inp.nextInt();

        System.out.println("Fizik notunuzu giriniz: ");
        int fizik = inp.nextInt();

        System.out.println("Matematik notunuzu giriniz: ");
        int mat = inp.nextInt();

        System.out.println("Biyoloji notunuzu giriniz: ");
        int bio = inp.nextInt();

        System.out.println("Kimya notunuzu giriniz: ");
        int kimya = inp.nextInt();

        System.out.println("İngilizce notunuzu giriniz: ");
        int ing = inp.nextInt();

        int toplam = (turkce + fizik + mat + bio + kimya + ing);
        double ortalama = toplam / 6.0;
        System.out.println("Genel Ortalamanız:  " + ortalama);
        boolean kosul1 = ortalama >= 60;
        boolean kosul2 = ortalama < 60;
        String str = (kosul1) ? "Sınıfı geçtiniz.": "kaldınız";
                System.out.println(str);
                System.out.println(kosul2);
        System.out.println(kosul2);

    }
    }
