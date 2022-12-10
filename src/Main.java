import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println(" task 1 ");
        int nowYear = 2022;
     printLeapYearResult(nowYear);

        System.out.println(" task 2 ");
        int numberOS = 0;
        int currentYear = LocalDate.now().getYear();
        printOS(numberOS,currentYear);

        System.out.println(" task 3");
        int deliveryDistance = 95;
        printDistanceDay(95);
        System.out.println("Потребуется " + printDeliveryDistanceDay(95) + " дней доставки");




    }

    private static int printLeapYearResult ( int year ){
        if (year % 4 == 0){
            System.out.println(year + " високосный год.");
        } else {
            System.out.println(year + " не високосный год.");
        }
        return year;
    }

     private static int printOS (int number, int year){
        if ( number == 0 && year < 2022 ){
            System.out.println("Установите lite- версию OS для IOS");
        } else if (number==1 && year < 2022){
            System.out.println("Установите lite- версию OS для Android");
        }else if ( number == 0 && year >=2022){
            System.out.println("Установите стандартную версию OS для IOS");
        }else if ( number == 1 && year >= 2022){
            System.out.println("Установите стандартную версию OS для Android");
        } else {
            System.out.println("Введите корректные данные!");
        }
        return number;
     }

    private static int printDistanceDay (int distanceInDay){
        if (distanceInDay <= 20){
            System.out.println("Потребуется 1 день доставки");
        } else if(distanceInDay < 60) {
            System.out.println("Потребуется 2 дня доставки");
        }else if (distanceInDay == 60 || distanceInDay <=100){
            System.out.println("Потребуется 3 дня доставки");
        }else{
            System.out.println("Введите расстояние в пределах радиуса доставки");
        }
        return distanceInDay;

        //Можем использовать в случае,когда уверены, что радиус доставки ограничен и не превышает расстояние 100 км. В ином случае используем метод ниже.
    }

    private static int printDeliveryDistanceDay (int deliveryDistance ){
        return  1+((deliveryDistance+20)/40);
    }



}