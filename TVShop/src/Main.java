import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    //за да няма try-catch блокове в кода надолу, тук е добавено "throws IOException"
    //ако го няма, при FileWriter-ите ще трябва да имаме try-catch блокове (което пак е валиден вариант)
    public static void main(String[] args) throws IOException {
        //създаваме си Scanner, с който ще взимаме това, което е написано в конзолата от потребителя
        Scanner in = new Scanner(System.in);

        //в size1 записваме числото, което потребителя е въвел
        //in.nextLine() взима това, което е въведено като String
        //Integer.parseInt се опитва да превърне от String към int аргумента в скобите
        System.out.println("Enter TV size: ");
        int size1 = Integer.parseInt(in.nextLine());
        //създава се нов телевизор, като големината му е въеденото от потребителя число.
        TV tv1 = new TV("LG", 1200, size1);     // 1)

        System.out.println("Enter TV size: ");
        int size2 = Integer.parseInt(in.nextLine());
        TV tv2 = new TV("Sony", 2000, size2);   // 2)

        System.out.println("Enter TV size: ");
        int size3 = Integer.parseInt(in.nextLine());
        TV tv3 = new TV("Sony", 2200, size3);   // 3)

        System.out.println("Enter TV size: ");
        int size4 = Integer.parseInt(in.nextLine());
        TV tv4 = new TV("Panasonic", 1700, size4);   // 4)

        System.out.println("Enter TV size: ");
        int size5 = Integer.parseInt(in.nextLine());
        TV tv5 = new TV("Samsung", 3700, size5);     // 5)

        System.out.println("Enter TV size: ");
        int size6 = Integer.parseInt(in.nextLine());
        TV tv6 = new TV("Panasonic", 4000, size6);   // 6)

        List<TV> tvList = new ArrayList<>();
        tvList.add(tv1);
        tvList.add(tv2);
        tvList.add(tv3);
        tvList.add(tv4);
        tvList.add(tv5);
        tvList.add(tv6);

        List<TV> largeList = new ArrayList<>();
        List<TV> smallList = new ArrayList<>();

        for (TV tv : tvList) {
            if (tv.isLarge()) {
                largeList.add(tv);
            } else {
                smallList.add(tv);
            }
        }
        Collections.sort(largeList);
        Collections.sort(smallList);

        //Големите тележизори.
        System.out.println("Enter a file name for large TVs: ");
        String fileName = in.nextLine(); //въвеждаме име на файл, в който да запишем големите телевизори
        FileWriter fileWriter = new FileWriter(fileName + ".txt"); //fileWrite, с който пишем във файлове
        System.out.println("Printing tv's over 42 inches");

        //принтират се телевизорите в конзолата и после се записват във файл.
        for (TV tv : largeList) {
            System.out.println(tv.toString());
            fileWriter.write(tv.toString() + "\n");
        }

        fileWriter.close();


        //Малките тележизори.
        System.out.println("Enter a file name for small TVs: ");
        String fileName2 = in.nextLine(); //въвеждаме име на файл, в който да запишем големите телевизори
        FileWriter fileWriter2 = new FileWriter(fileName2 + ".txt"); //fileWrite, с който пишем във файлове
        System.out.println("Printing tv's below 42 inches");

        //принтират се телевизорите в конзолата и после се записват във файл.
        for (TV tv : largeList) {
            System.out.println(tv.toString());
            fileWriter2.write(tv.toString() + "\n");
        }

        fileWriter2.close();
    }
}
