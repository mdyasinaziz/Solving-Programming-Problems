import java.util.Scanner;
public class task8 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter the number of published articles: ");
        int publishedArticle = scanner.nextInt();
        
        System.out.println("Payment: " + (publishedArticle * 500));
    }
}
