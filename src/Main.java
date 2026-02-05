public class Main {

    public static void main(String[] args) {

        TaskManager manager = new TaskManager();

        manager.addTask("Do homework");
        manager.addTask("Attend meeting");
        manager.addTask("Prepare presentation");
        manager.addTask("Submit assignment");

        try {
           manager.addTask("");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        manager.displayTasks();


        manager.sortTasks();
        manager.displayTasks();


        manager.searchTask("Submit assignment");
        manager.searchTask("Go to gym");


        manager.removeTask("Do homework");
        manager.removeTask("Sleep");

        manager.displayTasks();


        manager.findLongestTask();

        manager.getTaskByIndex(1);
        manager.getTaskByIndex(10);

    }
}
