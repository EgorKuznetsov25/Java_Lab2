import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1.1 Точка
        System.out.println("1.1 Точка: " + new Point(3, 5));

        // 1.3 Имя
        System.out.println("1.3 Имя 1: " + new Name("", "Клеопатра", ""));
        System.out.println("1.3 Имя 2: " + new Name("Пушкин", "Александр", "Сергеевич"));

        // 2.1 Линия
        System.out.println("2.1 Линия: " + new Line(new Point(1, 3), new Point(23, 8)));

        // 3.3 Города (Граф)
        System.out.println("3.3 Город A: " + new City3("A", new String[]{"B:5", "D:6"}));

        // 4.8 Города (Конструкторы)
        System.out.println("4.8 Город (пустой): " + new City4("Москва"));
        System.out.println("4.8 Город (с путями): " + new City4("Питер", new String[]{"Москва:100"}));

        // 5.5 Дроби (с проверкой ввода)
        System.out.println("\n--- 5.5 Дроби ---");
        System.out.print("Введите числитель 1-й дроби: ");
        int num1 = readInt(sc);

        int den1 = 0;
        while (den1 == 0) {
            System.out.print("Введите знаменатель 1-й дроби (не 0): ");
            den1 = readInt(sc);
        }

        System.out.print("Введите числитель 2-й дроби: ");
        int num2 = readInt(sc);

        int den2 = 0;
        while (den2 == 0) {
            System.out.print("Введите знаменатель 2-й дроби (не 0): ");
            den2 = readInt(sc);
        }

        Fraction f1 = new Fraction(num1, den1);
        Fraction f2 = new Fraction(num2, den2);

        System.out.println("Ваши дроби: " + f1 + " и " + f2);
        System.out.println(f1 + " + " + f2 + " = " + f1.sum(f2));
        System.out.println(f1 + " - " + f2 + " = " + f1.minus(f2));
        System.out.println(f1 + " * " + f2 + " = " + f1.multiply(f2));
        System.out.println(f1 + " / " + f2 + " = " + f1.div(f2));
        System.out.println(f1 + " + 5 (целое) = " + f1.sum(5));
    }

    // МЕТОД ДЛЯ ПРОВЕРКИ ВВОДА (защита от букв)
    public static int readInt(Scanner sc) {
        while (true) {
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                System.out.print("Ошибка! Введите целое число: ");
                sc.next(); // Убираем введенный мусор
            }
        }
    }
}