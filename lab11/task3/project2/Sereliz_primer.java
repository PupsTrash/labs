package task3.project2;

import java.io.*;
import java.util.Scanner;

public class Sereliz_primer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in, "cp1251");
// создается файл на диске
        File f = new File("E:\\MyFileSer");
        f.createNewFile();
// -------------ЗАПИСЬ ОБЪЕКТА В ФАЙЛ-------------
// Создается поток для записи объекта
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
// Вводится информация об объекте (стране)
        recordFilmFile recordFilmFile = new recordFilmFile();
        System.out.println("Введите информацию о фильме: ");
        System.out.print("Название => ");
        recordFilmFile.name = sc.nextLine();
        System.out.print("год выпуска => ");
        recordFilmFile.yearOfIssue = Integer.parseInt(sc.nextLine());
        System.out.print("стоимость проката => ");
        recordFilmFile.sale = sc.nextDouble();
        System.out.print("жанр => ");
        recordFilmFile.genre = sc.nextLine();
        System.out.print("страна => ");
        recordFilmFile.country = sc.nextLine();
// Объект записывается в файл
        oos.writeObject(recordFilmFile);
// Дописывается информация и закрывается файловый поток
        oos.flush();
        oos.close();
// -------------ЧТЕНИЕ ОБЪЕКТА ИЗ ФАЙЛА-------------
// Создается поток для чтения объекта из файла
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream oin = new ObjectInputStream(fis);
// Объект считывается, и на экран выводится требуемая информация
        recordFilmFile = (recordFilmFile) oin.readObject();
        System.out.println(" Название страны " +
                recordFilmFile.name);
        System.out.println(" ее площадь = " +
                recordFilmFile.sale);
// Поток закрывается
        oos.close();
    }
}
