package Task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите какую-то строку");
        Scanner scanner = new Scanner(System.in);
        String userStr = scanner.nextLine();
        try {
            isValideInput(userStr);
        } catch (InvalidInputException e){
            System.out.println("Вы ввели пустую строку! " + e.getMessage());
        }


    }

    static void isValideInput(String userStr) throws InvalidInputException {
                if (userStr == null || userStr.isEmpty()){
            throw new InvalidInputException("Строка не должна быть пустой");
        }
    }
}


