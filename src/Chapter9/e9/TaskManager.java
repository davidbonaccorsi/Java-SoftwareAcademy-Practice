package Chapter9.e9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TaskManager {

    private List<Task> tasks;

    private TaskManager(){
        tasks = new ArrayList<>();
    }

    public TaskManager getTaskManager(){
        if(tasks == null){
            new TaskManager();
            return this;
        }
        return this;
    }

    public void addTask(Task t){
        tasks.add(t);
        System.out.println("Added task: " + t);
    }

    public List<Task> getTasksByPriority() {
        List<Task> sorted = new ArrayList<>(tasks);
        sorted.sort(Comparator.comparingInt(Task::priority).reversed());
        return sorted;
    }

    public List<Task> getTasksByDueDate() {
        List<Task> sorted = new ArrayList<>(tasks);
        sorted.sort(Comparator.comparing(Task::dueDate));
        return sorted;
    }

    public List<Task> OverdueTasks(){
        LocalDate today = LocalDate.now();

        return tasks.stream()
                .filter(t -> t.dueDate().isBefore(today))
                .toList();

    }

    public boolean removeTask(String name) {
        return tasks.removeIf(task -> task.name().equals(name));
    }

    public static void main(String[] args){
        TaskManager manager = new TaskManager();
        manager.addTask(new Task("Write report", 1,
                LocalDate.now().plusDays(2)));
        manager.addTask(new Task("Fix bug", 3,
                LocalDate.now().plusDays(1)));
        manager.addTask(new Task("Review code", 2,
                LocalDate.now().minusDays(1)));

        manager.getTasksByDueDate().forEach(System.out::println);

    }
}
