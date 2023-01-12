import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number;
        int basValue;
        int result = 0;

        System.out.print("Bir sayı giriniz : ");
        number = scan.nextInt();

        int tempNumber = number;

        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            result += basValue;
            tempNumber /= 10;
        }
        System.out.println("Sayının Rakamları Toplamı : " + result);


    }
}
