import java.util.Random;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        char menu = 'y';
        do {
            int number = rand.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                success = (answer == number);

                if (answer > number) {
                    System.out.println("Kebesaran!!!");
                } else if (answer < number) {
                    System.out.println("Kekecilan!!!");
                } else if (answer == number) {
                    System.out.println("nah bener!");
                }

            } while (!success);
            System.out.print("Apakah anda ingin mengulang permainan (Y/T) ");
            menu = input.next().charAt(0);
            input.nextLine();
        }while (menu == 'Y' || menu == 'y');
    }
}
