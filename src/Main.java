public class Main {
    public static void printYear(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год " + year + " является високосным");
        } else {
            System.out.println("Год " + year + " не является високосным");
        }
    }
    public static void determineDevYear(int clientDeviceYear) {

        if (clientDeviceYear < 2015) {
            System.out.print("Установите облегчённую версию приложения");
        }
        if (clientDeviceYear >= 2015) {
            System.out.print("Установите полную версию приложения");
        }
    }
    public static void determineOpSys(int clientOpSys) {
        if (clientOpSys == 0) {
            System.out.print(" для IOS по ссылке");
        }
        if (clientOpSys == 1) {
            System.out.print(" для Android по ссылке");
        }
    }
    public static void calculationDelivery(int deliveryDistance) {
        if(deliveryDistance < 20){
            System.out.println("Для доставки Вашей карты потребуется 1 день.");
        }
        if(deliveryDistance >= 20 && deliveryDistance < 60){
            System.out.println("Для доставки Вашей карты потребуется 2 дня");
        }
        if(deliveryDistance >= 60 && deliveryDistance < 100){
            System.out.println("Для доставки Вашей карты потребуется 3 дня");
        }
        if(deliveryDistance >= 100){
            System.out.println("На доставку Вашей карты потребуется больше 3-х дней.Как только карта " +
                    "прибудет " + "в Ваш населённый пунт,мы вас известим!");
        }
    }
    public static void main(String[] args) {
        // Методы.Домашнее задание.
        System.out.println("Методы.Домашнее задание.");
        // Задание 1.
        System.out.println("Задание 1.");
        System.out.println("Программа-определитель високосного года");
        int year = 2031;
        printYear(year);
        // Задание 2.
        System.out.println("Задание 2.");
        System.out.println("Программа определитель ПО.");
        int clientDeviceYear = 2010;
        int clientOpSys = 1;
        determineDevYear(clientDeviceYear); determineOpSys(clientOpSys);
        System.out.println();
        // Задание 3.
        System.out.println("Задание 3.");
        System.out.println("Расчёт времени доставки:");
        int deliveryDistance = 100;
        calculationDelivery(deliveryDistance);
    }
}