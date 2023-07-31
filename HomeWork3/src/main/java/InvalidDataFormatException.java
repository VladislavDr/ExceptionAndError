public class InvalidDataFormatException extends RuntimeException{
    public InvalidDataFormatException() {
        super(String.format("Введено не верное количество данных"));
    }
    public InvalidDataFormatException(String message){
        super(message);
    }
}
