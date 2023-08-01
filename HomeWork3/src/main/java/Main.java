import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] textUser = scannetTextUser();

        try {
            isInvalidFormatText(textUser);
            Human human = new Human(textUser[0], textUser[1], textUser[2], textUser[3], textUser[4], textUser[5]);
            writerFullNameUser(human);
        } catch (InvalidDataFormatException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String[] scannetTextUser() {
        System.out.println("Введите данные в формате: Фамилия Имя Отчество ДатаРождения НомерТелефона Пол. \n" +
                "Вводите данные с пробелами, без запятых. В поле 'пол' укажите f, если девушка, или m, если мужчина.");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] textUser = text.split(" ");
        return textUser;
    }

    public static void isInvalidFormatText(String[] textUser) {
        List sexUserLst = List.of("m", "f", "м", "ж");
        if (textUser.length != 6 || !(sexUserLst.contains(textUser[5]))) {
            throw new InvalidDataFormatException();
        }
    }

    public static void writerFullNameUser(Human human) throws IOException {
        String fileName = human.getSurname();
        FileWriter writer = null;
        boolean fileBool = new File(fileName).isFile();
        System.out.println(fileBool + " bool");

        try {
            writer = new FileWriter(fileName, true);
            writer.write(human + "\n");
//            writer.flush();

        } catch (IOException e) {
            throw new IOException(e);

        } finally {
                writer.close();
        }
    }
}

