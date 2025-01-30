
    import java.util.ArrayList;
import java.util.Scanner;

class Expense {
    String category;
    double amount;
    String description;

    public Expense(String category, double amount, String description) {
        this.category = category;
        this.amount = amount;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Category: " + category + ", Amount: $" + amount + ", Description: " + description;
    }
}

    static ArrayList<Expense> expenses = new ArrayList<>();
    static double totalAmount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nExpense Tracker Menu:");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. View Total Expenses");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
              switch (choice) {
                case 1:
                    addExpense(scanner);
                    break;
                case 2:
                    viewExpenses();
                    break;
                case 3:
                    viewTotalExpenses();
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
    public static void addExpense(Scanner scanner) {
        System.out.print("Enter expense category: ");
        String category = scanner.nextLine();
        System.out.print("Enter expense amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();  
        System.out.print("Enter expense description: ");
        String description = scanner.nextLine();
        Expense expense = new Expense(category,amount,description)
        expenses.add(expense);
        totalAmount += amount;
        System.out.println("Expense added successfully!");
    }
    public static void viewExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses added yet.");
        } else {
            System.out.println("\nList of Expenses:");
            for (Expense expense : expenses) {
                System.out.println(expense);
            }
        }
    }

    // Method to view total expenses
    public static void viewTotalExpenses() {
        System.out.println("\nTotal Expenses: $" + totalAmount);
    }

