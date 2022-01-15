import java.util.Scanner;
public class main {
    public static void main(String[] args) {
    double boy,kilo;
        Scanner input=new Scanner(System.in);
        System.out.print("lutfen boyunuzu(metre cinsinden) giriniz:");
        boy=input.nextDouble();
        System.out.print("kilonuzu girin");
        kilo=input.nextDouble();
        double kitleendeksi = (kilo / (boy * boy));
        System.out.println("vücut kitle endeksiniz:"+kitleendeksi);
    }
}
