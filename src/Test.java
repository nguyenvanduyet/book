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
        int count=0;
        for (ProgrammingBook P:
             programmingBooks) {
            if (P.getLanguage()=="java"){
                count++;
            }
        }
        System.out.println("số sách có ngôn ngữ java là:"+ count);
        Book[] books=new Book[10];
        for (int i = 0; i < 5; i++) {
            books[i]=programmingBooks[i];
        }
        for (int i = 0; i < 5; i++) {
            books[i+5]=fictionBooks[i];
        }
        int sum=0;
        for (Book book:
                books) {
            sum +=book.getPrice();
            
        }
        System.out.println("tổng giá của 10 cuốn sách là:"+sum);
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên sách cần tìm giá");
        String name=scanner.nextLine();
        for (Book N:
            books){
            if (name.equals(N.getName())){
                System.out.println("giá sách là :"+N.getPrice());
                break;
            }
            }
        }

}

