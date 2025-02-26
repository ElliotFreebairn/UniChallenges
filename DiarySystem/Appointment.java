import java.util.Calendar;
import java.util.Date;

public class Appointment extends Event {

  private String location;

  public Appointment(Calendar date, String d, String location) {
    super(date, d);
    this.location = location;
  }

  public void display() {
    String display = "Appointment Date: " + date.get(Calendar.DATE) + 
      ". Location is at " + location;
    System.out.println(display);
  }


}
