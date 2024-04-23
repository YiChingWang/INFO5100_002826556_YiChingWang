package SingletonPattern;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ToDoList ToDOListOfOllie = ToDoList.getInstance();

        ToDOListOfOllie.addTask("Finish Java work");
        ToDOListOfOllie.addTask("Eat an apple");
        ToDOListOfOllie.addTask("Walk one hour");

        List<String> tasks = ToDOListOfOllie.getTasks();
        System.out.println("--------------------------");
        System.out.println("ToDo List：\n");
        for (String task : tasks) {
            System.out.println(task);
        }

        ToDOListOfOllie.removeTask("Finish Java work");
        tasks = ToDOListOfOllie.getTasks();
        System.out.println("--------------------------");
        System.out.println("Latest ToDo List：\n");
        for (String task : tasks) {
            System.out.println(task);
        }
    }
}
