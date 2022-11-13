import java.util.zip.InflaterOutputStream;

public class Main {
    public static void main(String[] args) {
        int clientOS = 1;
       int ios = 0;
        int android = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else  {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        //

        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear <=2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear <=2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS ==1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //

        int year = 2021;

        if ((year % 4 ==0) && (year % 100 != 0 ) || (year % 400 == 0) ) {
            System.out.println( "год високосный");
        } else {
            System.out.println("год не високосный");
        }

        //

        int deliveryDistance = 95;
        int day = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней:" + day);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней:" + (day+1) );
        } else if (deliveryDistance > 60 && deliveryDistance <=100) {
            System.out.println("Потребуется дней:" + (day+2));
        }else {
            System.out.println("Доставки нет");
        }

        //

        int monthNumber = 6;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println( monthNumber + " месяц принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " месяц принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " месяц принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " месяц принадлежит к сезону осень");
                break;
            default:
                System.out.println("такого месяца не существует");
        }

    }
}