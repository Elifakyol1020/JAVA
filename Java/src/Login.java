import java.util.Scanner;

public class Login {
    public boolean login(Hesap hesap){
        Scanner scn=new Scanner(System.in);
        String kullanici_adi;
        String parola;
        System.out.print("Kullanici adi:");
        kullanici_adi=scn.nextLine();
        System.out.print("parola:");
        parola=scn.nextLine();
        if(hesap.getKullanici_Adi().equals(kullanici_adi)&&hesap.getParola().equals(parola)){
            return true;
        }else{
            return false;
        }
    }
}
