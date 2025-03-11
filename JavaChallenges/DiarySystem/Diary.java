import java.util.Calendar;
import java.util.*;

public class Diary {

  private List<Event> events;

  public Diary () {
    events = new ArrayList<>();
  }

  public void addEvent(Event event) {
    events.add(event);
  }

  public void removeEvent(Event event) {
    events.remove(event);
  }

  public Event nextEvent() {
    if(events.isEmpty()) return null;
    events.sort(Comparator.comparing(e -> e.date));
    return events.get(0);  
  }

  public void displayEvents() {
    for(Event evt : events) {
      evt.display();
    }
  }




}
