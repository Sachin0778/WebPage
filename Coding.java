import java.util.Scanner;

public class Coding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of individuals: ");
        int individuals = scanner.nextInt();
        
        int largePizza = individuals / 8;
        int mediumPizza = individuals % 8 / 6;//
        int regularPizza = individuals % 8 % 6 / 4;
        int smallPizza = individuals % 8 % 6 % 4;
        
        System.out.println("Number of each type of pizza needed:");
        System.out.println("Large Pizza: " + largePizza);
        System.out.println("Medium Pizza: " + mediumPizza);
        System.out.println("Regular Pizza: " + regularPizza);
        System.out.println("Small Pizza: " + smallPizza);
        
        scanner.close();
    }
}
