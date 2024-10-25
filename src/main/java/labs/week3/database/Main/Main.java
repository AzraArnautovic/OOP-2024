package labs.week3.database.Main;

public class Main {
    public static void main(String[] args) {
        DataStructures dataStructures = new DataStructures();

        dataStructures.loadTasksFromDatabase();

        dataStructures.printTaskDescriptions();

        System.out.println("Tasks with status TO_DO:");
        dataStructures.getByStatus(TaskStatus.TO_DO)
                .ifPresent(System.out::println);


        List<TaskItem> filteredTasks = dataStructures.findIdGreater(2);
        filteredTasks.forEach(task -> System.out.println(task.getDescription()));
    }
}

