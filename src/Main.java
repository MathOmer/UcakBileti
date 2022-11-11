import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mesafe,yas,tip;
        double ilkUcret = 0.10,tutar;
        Scanner input = new Scanner(System.in);

        System.out.print("mesafeyi km cinsinden giriniz: ");
        mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();

        System.out.print(" 1--> Tek Yön, 2--> Gidiş Dönüş: ");
        tip = input.nextInt();

        tutar = mesafe * ilkUcret;
        switch (tip){
            case 1:
                if (yas < 12){
                    tutar *= 0.5;
                    System.out.println("Bilet tutarı: "+tutar+" TL");
                }else if(yas >=12 && yas <=24){
                    tutar *=0.9;
                    System.out.println("Bilet tutarı: "+tutar+" TL");
                }else if (yas >65){
                    tutar *=0.3;
                    System.out.println("Bilet tutarı: "+tutar+" TL");
                }else{
                    System.out.print("Bilet tutarı: "+tutar+" TL");
                }break;

            case 2:
                tutar *=1.6;
                if (yas < 12){
                    tutar *= 0.5;
                    System.out.println("Bilet tutarı: "+tutar+" TL");
                }else if(yas >=12 && yas <=24){
                    tutar *=0.9;
                    System.out.println("Bilet tutarı: "+tutar+" TL");
                }else if (yas >65){
                    tutar *=0.3;
                    System.out.println("Bilet tutarı: "+tutar+" TL");
                }else{
                    System.out.print("Bilet tutarı: "+tutar+" TL");
                }break;
            default:
                System.out.print("Hatalı veri girdiniz.");
        }

    }
}