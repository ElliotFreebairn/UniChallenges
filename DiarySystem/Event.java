import java.util.Calendar;

public abstract class Event {
  
  protected Calendar date;
  protected String description;

  public Event(Calendar date, String d) {
    this.date = date;
    this.description = d;
  }

  public abstract void display();
  
}
