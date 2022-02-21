import java.util.Scanner;
public class bilet_fiyati {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        int mesafe,yas,tip;
        double tutar,tutar2,indirim = 0,indirim2=0,sonuc;

        System.out.print("Gidilecek Mesafeyi KM Cinsinden Giriniz :");
        mesafe = inp.nextInt();

        System.out.print("Yaşınızı Giriniz :");
        yas = inp.nextInt();

        System.out.print("Yolculuk Tipinizi Giriniz (1:Tek Yön,2:Çift Yön) :");
        tip = inp.nextInt();

            tutar = mesafe * 0.10;
            tutar2 = tutar;
            System.out.println("Mesafeye Göre Hesaplanan Tutar :" + tutar);

            switch (tip) {
                case 1:
                    if (yas >= 0 && yas < 12) {
                        indirim = tutar2 * 0.5;
                        System.out.println("Yaş İndirimi :" + indirim);
                    } else if (yas >= 12 && yas < 24) {
                        indirim = tutar2 * 0.1;
                        System.out.println("Yaş İndirimi :" + indirim);
                    } else if (yas >= 65) {
                        indirim = tutar2 * 0.3;
                        System.out.println("Yaş İndirimi :" + indirim);
                    }
                    sonuc = tutar - indirim;
                    System.out.println("Toplam Tutar :" + sonuc);
                    break;
                case 2:
                    if (yas >= 0 && yas < 12) {
                        indirim = tutar2 * 0.5;
                        System.out.println("Yaş İndirimi :" + indirim);
                    } else if (yas >= 12 && yas < 24) {
                        indirim = tutar2 * 0.1;
                        System.out.println("Yaş İndirimi :" + indirim);
                    } else if (yas >= 65) {
                        indirim = tutar2 * 0.3;
                        System.out.println("Yaş İndirimi :" + indirim);
                    }
                    indirim2 = tutar * 0.2;
                    System.out.println("Çift Yön Kapsamındaki İndirim Tutarı :" + indirim2);

                    sonuc = (tutar - indirim) - indirim2;
                    System.out.println("Toplam Tutar :" + sonuc);
                    break;




                default:
                    System.out.println("Hatalı giriş Yaptınız ...");

            }

    }
}
