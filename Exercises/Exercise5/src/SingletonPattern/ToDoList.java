package SingletonPattern;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private static ToDoList instance;

    private List<String> tasks;

    private ToDoList() {
        tasks = new ArrayList<>();
    }

    public static synchronized ToDoList getInstance() {
        if (instance == null) {
            instance = new ToDoList();
        }
        return instance;
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public boolean removeTask(String task) {
        return tasks.remove(task);
    }

    public List<String> getTasks() {
        return new ArrayList<>(tasks);
    }
}
