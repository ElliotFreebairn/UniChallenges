import java.util.Calendar;

public class Task extends Event {
  private Calendar dueDate;
  private String priority;

  public Task(Calendar date, String d, Calendar dueDate, String priority) {
    super(date, d);
    this.dueDate = dueDate;
    this.priority = priority;
  }

  public void display() {
    String result = "Task start date: " + date.get(Calendar.DATE) + 
      ". Due date: " + dueDate.get(Calendar.DATE) + ". Priority: " +
        priority;
    System.out.println(result);

  }
}
