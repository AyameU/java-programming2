import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> tasks = new ArrayList<>();

    public TodoList() {}

    public void add(String task) {
        tasks.add(task);
    }

    public void print() {
        for(int i = 0, j = 1; i < tasks.size(); i++, j++) {
            System.out.println(j + ": " + tasks.get(i));
        }
    }

    public void remove(int number) {
        tasks.remove(number - 1);
    }
}
