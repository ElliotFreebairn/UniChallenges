import java.util.*;

public class Main {
  public static void main(String[] args) {
    Diary myDiary = new Diary();

    Calendar date1 = Calendar.getInstance();
    date1.set(2025, Calendar.FEBRUARY, 12, 14, 0); 

    Calendar date2 = Calendar.getInstance();
    date2.set(2030, Calendar.MARCH, 30, 2, 12);

    Appointment doctorVisit = new Appointment(date1, "Doctors visit for health", "Cambridge");
    Meeting teamMeeting = new Meeting(date2, "to finish project", Meeting.peopleToArr("Helen,Elliot,Me"), 
      "www.collab.com");

    myDiary.addEvent(doctorVisit);
    myDiary.addEvent(teamMeeting);

    myDiary.displayEvents();
    System.out.print("Next event: ");
    myDiary.nextEvent().display();
  }
}
