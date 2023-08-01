public class Human {
     private String surname;
    private String name;
    private String patronymic;
    private String birthday;
    private String phoneNumber;
    private String sex;


    public Human(String[] fullName) {
        this.surname = fullName[0];
        this.name = fullName[1];
        this.patronymic = fullName[2];
        this.birthday = fullName[3];
        this.phoneNumber = fullName[4];
        this.sex = fullName[5];
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return String.format("<%s> <%s> <%s> <%s> <%s> <%s>", surname, name, patronymic, birthday, phoneNumber, sex);
    }
}
