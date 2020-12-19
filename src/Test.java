import LibraryBook.Book;
import LibraryBook.FictionBook;
import LibraryBook.ProgrammingBook;

import javax.naming.Name;
import javax.xml.bind.PrintConversionEvent;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ProgrammingBook[] programmingBooks = new ProgrammingBook[5];
        programmingBooks[0] = new ProgrammingBook(1, "java cơ bản", 50.000, "Nguyen", "java", "framework1");
        programmingBooks[1] = new ProgrammingBook(2, "hướng đối tượng", 20.000, "Mừng", "C", "framework2");
        programmingBooks[2] = new ProgrammingBook(3, "c++ cơ bản", 10.000, "Khải", "C++", "framework3");
        programmingBooks[3] = new ProgrammingBook(4, "php cơ bản", 30.000, "Hoàn", "java", "framework4");
        programmingBooks[4] = new ProgrammingBook(5, "python cơ bản", 25.000, "Hiếu", "python", "framework5");

        FictionBook[] fictionBooks = new FictionBook[5];
        fictionBooks[0] = new FictionBook(10, "Hiếu", 60.000, "Anh", "Hành động");
        fictionBooks[1] = new FictionBook(9, "Mừng", 70.000, "Anh", "tình cảm");
        fictionBooks[2] = new FictionBook(8, "Hoàn", 80.000, "Anh", "kinh dị");
        fictionBooks[3] = new FictionBook(7, "Thanh", 100.000, "Anh", "chiến tranh");
        fictionBooks[4] = new FictionBook(6, "Khải", 90.000, "Anh", "võ thuật");
        int sum1=0;
        for (ProgrammingBook P:
             programmingBooks){
            sum1 +=P.getPrice();
        }
        int sum2=0;
        for (FictionBook F:
             fictionBooks) {
            sum2 +=F.getPrice();
        }
        int sum =sum1+sum2;
        System.out.println(sum);
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên sách cần tìm giá");
        String name=scanner.nextLine();
        if (name==programmingBooks.)

        }

}

