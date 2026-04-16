import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Book> books = new ArrayList<Book>();
        System.out.println("Enter the number of books: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Title: ");
            sc.nextLine();
            String title = sc.nextLine();
            System.out.print("Author: ");
            String author = sc.nextLine();
            System.out.print("Year: ");
            int year = sc.nextInt();
            books.add(new Book(title, author, year));
            }
        System.out.println("\nBooks published after 2000:");
        for (Book b : books) {
            if (b.getYear() > 2000) {
                System.out.println(b.getTitle() + " - " + b.getAuthor() + " (" + b.getYear() + ")");
            }
        }
        sc.close();
    }
}
