package BasicConceptsinJava;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        //for
        for (int i = 0; i < 10; i++) {
            //yapacağımız işlem
            System.out.println((i + 1) + ". Hello World in For");
        }

        //while
        int y=0;
        while (y<10){
            //yapacağımız işlem
            System.out.println((y + 1) + ". Hello World in While");
            y++;
        }
        //do while
        int z=0;
        do {
            //yapacağımız işlem
            System.out.println((z + 1) + ". Hello World in Do While");
            z++;
        }while (z<10);
    }
}
