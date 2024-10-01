//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    ATM atm=new ATM();
    Hesap hesap=new Hesap("Elif Akyol","ElifAkyolll",1000);
    atm.calis(hesap);
    System.out.println("programdan cikiliyor...");
    }
}