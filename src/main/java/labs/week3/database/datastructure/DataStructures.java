/*package labs.week3.database.datastructure;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
public class DataStructures {
    private List<TaskItem> tasks;

    public DataStructures() {
        tasks = Arrays.asList(
                new TaskItem(1, "Push lab code to the GitHub", TaskStatus.TO_DO),
                new TaskItem(2, "Prepare for the quiz", TaskStatus.IN_PROGRESS),
                new TaskItem(3, "Go over tasks from Lab2", TaskStatus.COMPLETED)
        );
    }

    public List<TaskItem> getAllObjects() {
        return this.tasks;
    }

    public Optional<TaskItem> getByStatus(TaskStatus status) {
        return tasks.stream()
                .filter(taskItem -> taskItem.getStatus().equals(status))
                .findFirst();
    }

    public List<TaskItem> findIdGreater(int id) {
        return tasks.stream()
                .filter(taskItem -> taskItem.getId() >= id)
                .toList();
    }

    public void printTaskDescriptions() {
        tasks.stream()
                .forEach(taskItem -> System.out.println(taskItem.getDescription()));
    }

    // Method to get tasks from the database
    public void loadTasksFromDatabase() {
        DbConnect dbConnect = new DbConnect();
        try {
            dbConnect.getAllTasks();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
*/
