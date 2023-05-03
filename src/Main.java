import java.util.Locale;

public class Main {
    public static void main(String[] args) {


        task1();
        task2();
        task3();
    }

    private static void task3() {
        String fullName = "Иванов Семён Семёнович";
        String fullNameFixed = fullName.replaceAll("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullNameFixed);
    }

    private static void task2() {
        String fullName = "Ivanov Ivan Ivanovich";
        String fullNameUpperCase = fullName.toUpperCase(Locale.ROOT);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpperCase);
    }

    private static void task1() {
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника - " + fullName);
    }


}