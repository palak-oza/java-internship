import java.util.ArrayList; 
import java.util.Scanner; 
 
public class TodoListApp { 
    private final ArrayList<String> todoList = new ArrayList<>(); 
 
    public void displayList() { 
        System.out.println("To-Do List:"); 
        for (int i = 0; i < todoList.size(); i++) { 
            System.out.println(i + 1 + ". " + todoList.get(i)); 
        } 
    } 
 
    public void addTask(String task) { 
        todoList.add(task); 
        System.out.println("Task added: " + task); 
    } 
 
    public void removeTask(int taskIndex) { 
        if (taskIndex >= 0 && taskIndex < todoList.size()) { 
            String removedTask = todoList.remove(taskIndex); 
            System.out.println("Task removed: " + removedTask); 
        } else { 
            System.out.println("Invalid task index."); 
        } 
    } 
 
    public static void main(String[] args) { 
        TodoListApp todoListApp = new TodoListApp(); 
        Scanner scanner = new Scanner(System.in); 
        int choice; 
 
        do { 
            System.out.println("\nMenu:"); 
            System.out.println("1. Display To-Do List"); 
            System.out.println("2. Add Task"); 
            System.out.println("3. Remove Task"); 
            System.out.println("4. Quit"); 
            System.out.print("Enter your choice: "); 
            choice = scanner.nextInt(); 
 
            switch (choice) { 
                case 1: 
                    todoListApp.displayList(); 
                    break; 
                case 2: 
                    System.out.print("Enter task to add: "); 
                    scanner.nextLine(); // Consume the newline character 
                    String taskToAdd = scanner.nextLine(); 
                    todoListApp.addTask(taskToAdd); 
                    break; 
                case 3: 
                    System.out.print("Enter task index to remove: "); 
                    int taskIndexToRemove = scanner.nextInt(); 
                    todoListApp.removeTask(taskIndexToRemove - 1); 
                    break; 
                case 4: 
                    System.out.println("Goodbye!"); 
                    break; 
                default: 
                    System.out.println("Invalid choice. Please try again."); 
            } 
 
        } while (choice != 4); 
 
    } 
} 
