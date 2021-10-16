package sky.pro.java.course1;

public class Main {

    public static void main(String[] args) {

        //ЗАДАЧА 1
        System.out.println("Задача 1");

        int clientOS = 1;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println(" ");

        //ЗАДАЧА 2
        System.out.println("Задача 2");

        //по условию задачи ("вложенность больше двух этажей не допускается")..
        //у меня тут как раз два вышло, надеюсь не противоречит условию, если я правильно его понял

        int clientDeviceYear = 2015;

        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientOS != 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }

        System.out.println(" ");

        //ЗАДАЧА 3
        System.out.println("Задача 3");

        int year = 1500;
        int vis1 = year % 4;
        int vis2 = year % 400;
        int vis3 = year % 100;

        boolean visYear1 = vis1 == 0;
        boolean visYear2 = vis2 == 0;
        boolean visYear3 = vis3 != 0;

        if (visYear1 && visYear3) {
            System.out.println(year + " год является високосным");
        } else if (visYear2) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println(" ");

        //ЗАДАЧА 4
        System.out.println("Задача 4");

        int deliveryDistance = 95;
        int deliveryDays = 1;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance > 20) {
            deliveryDays = ((deliveryDistance - 20) / 40) + 2; //с помощью этой формулы можно обойтись без
            //лишних конструкций if-else.
            //похожую формулу кстати подсказывал куратор Роман в Слаке.
            //можно придумать более универсальную формулу, но для этого придется писать слишком много кода, описывая
            //каждую переменную в ней, наверное для этой задачи такая громоздкость не нужна
            System.out.println("Потребуется дней: " + deliveryDays);

        //ЗАДАЧА 5
            System.out.println("Задача 5");

            int monthNumber = 12;

            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Принадлежит к сезону зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Принадлежит к сезону весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Принадлежит к сезону лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Принадлежит к сезону осень");
                    break;
                default:
                    System.out.println("Такого месяца не существует");
            }

        }
    }
}
