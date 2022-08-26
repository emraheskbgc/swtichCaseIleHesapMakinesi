import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi1, sayi2, select;

        Scanner input = new Scanner(System.in);

        System.out.println("ilk sayıyı giriniz : ");
        sayi1= input.nextInt();
        System.out.println("ikinici sayıyı giriniz : ");
        sayi2= input.nextInt();

        System.out.println("1-Toplama\n 2-Çıkarma\n 3-Çarpma\n 4-Bölme\n");
        System.out.print("Seçiminiz :");
        select = input.nextInt();

        switch (select)
        {
            case 1:
                System.out.println("Toplam : " + (sayi1 + sayi2) );
                break;
            case 2:
                System.out.println("Çıkarma : " + (sayi1 - sayi2) );
                break;
            case 3:
                System.out.println("Çarpma : " + (sayi1 * sayi2) );
                break;
            case 4:
                System.out.println("Bölme : " + (sayi1 / sayi2) );
                break;
            default:
                System.out.println("işlem seçimi hatalı lütfen 1 - 4 arası bir sayı seçiniz . ");
        }
    }
}
