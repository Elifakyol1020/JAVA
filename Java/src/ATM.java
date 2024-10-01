import java.util.Scanner;

public class ATM {
    public void calis(Hesap hesap){
    Login login=new Login();
        Scanner scn=new Scanner(System.in);
        System.out.println("Bankamiza hosgeldiniz...");
        System.out.println("***********************************");
        System.out.println("kullanici girisi:");
        System.out.println("***********************************");
        int giris_hakki=3;

        while(true){
            if(login.login(hesap)){
                System.out.println("giris basarili...");
                break;
            }else{
                System.out.println("giris basarisiz...");
                giris_hakki--;
                System.out.println("kalan giris hakki: "+giris_hakki);
            }
            if(giris_hakki==0){
                System.out.println("Giris hakkiniz bitmistir.");
                return;//metodu sonlandırmak için return deriz.
            }
        }
        System.out.println("***********************************");
        String islemler="1-Bakiye Goruntule\n"
                +"2-Para Yatirma\n"+"3-Para Cekme\n"+
                "Cikis icin q'ya basin";
        System.out.println(islemler);
        System.out.println("***********************************");
        while (true){
            System.out.println("İslem Seciniz: ");
            String islem=scn.nextLine();
            if(islem.equals("q")){
                break;
            } else if (islem.equals("1")) {
                System.out.println("Bakiyeniz: "+hesap.getBakiye());
            } else if (islem.equals("2")) {
                System.out.print("Yatirmak istediginiz tutar: ");
                int tutar=scn.nextInt();
                scn.nextLine();
                hesap.Para_Yatir(tutar);
            } else if (islem.equals("3")) {
                System.out.print("Cekmek istediginiz tutar: ");
                int tutar=scn.nextInt();
                scn.nextLine();
                hesap.Para_Cek(tutar);
            }
            else {
                System.out.println("gecersiz islem...");
            }

        }
    }
}
