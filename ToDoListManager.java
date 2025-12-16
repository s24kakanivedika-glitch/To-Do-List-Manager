import java.util.Scanner;

public class ToDoListManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array to store tasks
        String[] tasks = new String[10]; // max 10 tasks
        int count = 0; // number of tasks added

        int choice;
        do {
            System.out.println("\n=== TO-DO LIST MANAGER ===");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Done");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    if (count < tasks.length) {
                        System.out.print("Enter task: ");
                        tasks[count] = sc.nextLine();
                        count++;
                        System.out.println("Task added successfully!");
                    } else {
                        System.out.println("Task list is full!");
                    }
                    break;

                case 2:
                    System.out.println("\nYour Tasks:");
                    if (count == 0) {
                        System.out.println("No tasks added yet.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". " + tasks[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter task number to mark as done: ");
                    int taskNo = sc.nextInt();
                    if (taskNo >= 1 && taskNo <= count) {
                        tasks[taskNo - 1] = tasks[taskNo - 1] + " (Done)";
                        System.out.println("Task marked as done!");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
