public class Main {


    public static void printYear(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год " + year + " является високосным");
        } else {
            System.out.println("Год " + year + " не является високосным");
        }
    }
    public static void main(String[] args) {
        // Методы.Домашнее задание.
        System.out.println("Методы.Домашнее задание.");
        System.out.println("Программа-определитель високосного года");
        int year = 2031;
        printYear(year);
    }
}