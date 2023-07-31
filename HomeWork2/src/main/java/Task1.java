import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        float userFloat = userPoint();
        System.out.println("Ваше число " + userFloat);


    }

    static float userPoint(){
        System.out.println("Введите какое-то число");
        Scanner scanner = new Scanner(System.in);
        String userPointStr = scanner.next();

        try {
            return Float.parseFloat(userPointStr);
        } catch (NumberFormatException e){
            System.out.println("Вы ввели не число. Попробуйте еще разок.");
            return userPoint();
        }
    }
}
