package transport;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Car car1 = new Car("Lada", "Granta", 1.7, "жёлтый", 2015, "Россия", "механика", "седан", "Р123ОЕ77", 5, true);
        Car.Key key1 = car1.new Key(true, true);
        System.out.println(car1);
        System.out.print("Введите номер месяца (1..12): ");
        int monthNumber = in.nextInt();
        car1.changeTires (monthNumber);
        System.out.println(car1);
        System.out.println(key1);
    }
}