package javaLesson;

public class basicConcepts {
    public static void main(String[] args) {
        System.out.println("hello world");

        byte byteDeger=127;//-128 ile 127 arasında değer alır. tamsayı değeri saklar
        short shortDeger=32000;//-32768 ile 32767 arasında değer alır ve 16 bittir.tamsayı değeri saklar
        int intDeger=60000;//-2^31 ile 2^31-1 arasında değer alır 32 bittir.tamsayı değeri saklar
        long longDeger=-12000;//-2^63 ile 2^63-1 arasında değer alır ve 64 bittir.tamsayı değeri saklar

        float floatDeger=2.4F;//-3,4 * 10^38 ile 3.4*10^38 32 bittir. ondalıklı değer saklar
        double doubleDeger=2.456;//-1.7*10^308 ile 1.7*10^308 arasında ondalıklı bir değer saklar ve 64 bittir

        char charDeger='l';//karakter türünde değer alır 16 bittir.
        boolean booleanDeger=false;//false veya true değerlerini alır 1 bittir.

        String stringDeger="hello world";

        System.out.println("Byte Değeri: "+byteDeger);
        System.out.println("Short Değeri: "+shortDeger);
        System.out.println("Int Değeri: "+intDeger);
        System.out.println("Long Değeri: "+longDeger);
        System.out.println("Float Değeri: "+floatDeger);
        System.out.println("Double Değeri: "+doubleDeger);
        System.out.println("Char Değeri: "+charDeger);
        System.out.println("boolean Değeri: "+booleanDeger);
        System.out.println("String Değeri: "+stringDeger);

    }

}
