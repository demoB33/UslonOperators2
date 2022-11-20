public class Main {
    public static void main(String[] args) {
        //Задание1
        System.out.println("Задание1");
        int clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientOS == 0){
            if(clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для IOS по ссылке");
            }else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }

        } else {

            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        //Задание3
        System.out.println("Задание3:");
        int year = 2000; //вводимый год
        if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {
            System.out.println(year + " год является високосным");
        }else{
                System.out.println(year + " год не является високосным");

            }
        //Задание 4
        System.out.println("Задание4:");
        int deliveryDistance = 95;
        int days = 1;


        if (deliveryDistance > 20){
            days++;

        }
        if(deliveryDistance > 60){
            days++;

        }
        if(deliveryDistance > 100){
            days++;
        }
        System.out.println("Потребуется дней : " + days);

        //Задание5
        System.out.println("Задание5:");
        int monthNumber = 4;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:

                System.out.println("Зима");
            break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;

            default:
                System.out.println("Такого месяца нет" + monthNumber);
        }




    }
}