public class Hesap {
    private String Kullanici_Adi;
    private String Parola;
    private int bakiye;
    public Hesap(String kullanici_Adi,String parola,int bakiye){
        this.Kullanici_Adi=kullanici_Adi;
        this.bakiye=bakiye;
        this.Parola=parola;
    }
    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public String getKullanici_Adi() {
        return Kullanici_Adi;
    }

    public void setKullanici_Adi(String kullanici_Adi) {
        Kullanici_Adi = kullanici_Adi;
    }

    public String getParola() {
        return Parola;
    }

    public void setParola(String parola) {
        Parola = parola;
    }
    public void Para_Yatir(int tutar){
        this.bakiye+=tutar;
        System.out.println("yeni bakiyeniz: "+bakiye);
    }
    public void Para_Cek(int tutar){
        if(bakiye>=tutar){
            bakiye-=tutar;
            System.out.println("yeni bakiyeniz: "+bakiye);
        }else{
            System.out.println("Yeterli bakiyeniz bulunmaktadir...");
        }

    }
}
