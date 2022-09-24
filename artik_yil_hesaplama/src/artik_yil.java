import java.util.Scanner;

public class artik_yil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil;
        System.out.print("Artık yıl olup olmadığını öğrenmek istediğiniz yılı giriniz:");
        yil = input.nextInt();

        if (yil%4 == 0) {
            System.out.print(yil + "artık bir yıldır !");
        }

        else {

            if((yil%100 == 0) && (yil%400 == 0)) {

                System.out.print(yil + "artık bir yıldır !");
            }

            else {

                System.out.print(yil + "artık bir yıl değildir !");

            }


        }


    }
}
