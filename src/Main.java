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


}