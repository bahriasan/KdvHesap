import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {
        double tutar, kdv, toplam;
        System.out.println("Malın Değerini Giriniz");
        Scanner value = new Scanner(System.in);
        tutar = value.nextDouble();
        kdv = (tutar>0 && tutar<=1000) ? (tutar*0.18) : (tutar*0.08);
        toplam = tutar + kdv;
        System.out.println("Kdv: " + kdv + "\n" + "Toplam değer: " + toplam);
    }
}

