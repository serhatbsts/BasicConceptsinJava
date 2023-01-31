package javaLesson;

import java.util.Scanner;

public class usingScanner {
    //Get data on user-->kullanıcıdan veri almak
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);

      int kullaniciInt= tara.nextInt();
        System.out.println("Kullanıcı İnt Değeri:"+kullaniciInt);

        double kullaniciDouble= tara.nextDouble();
       System.out.println("Kullanıcı double Değeri:"+kullaniciDouble);

        String isim= tara.next();
        System.out.println("Kullanıcı isim Değeri:"+isim);
        tara.nextLine();
        String isimSoyisim= tara.nextLine();
        System.out.println("Kullanıcı isim Değeri:"+isimSoyisim);



        char kullaniciChar=tara.next().charAt(4);
        System.out.println("Kullanıcı char değer :"+kullaniciChar);
    }
}
