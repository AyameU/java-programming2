import java.util.Scanner;

public class UserInterface {

    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {

        while(true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if(command.equals("stop")) {
                break;
            }
            else {
                switch(command) {
                    case "add":
                        System.out.print("To add: ");
                        String task = scanner.nextLine();
                        todoList.add(task);
                        break;
                    case "list":
                        todoList.print();
                        break;
                    case "remove":
                        System.out.print("Which one is removed? ");
                        int number = Integer.parseInt(scanner.nextLine());
                        todoList.remove(number);
                        break;
                }
            }
        }
    }
}
