import java.util.Calendar;
import java.util.*;

public class Meeting extends Event {
  
  private List<String> people;
  private String link;

  public Meeting(Calendar date, String d, List<String> people, String link) {
    super(date, d);
    this.people = people;
    this.link = link;
  }

  private String formatPeople() {
    String formattedPeople = "";
    for(String p : people) {
      formattedPeople += p + " ";
    }
    return formattedPeople;
  }
  
  public void display() {
    String result = "Meeting date: " + date.get(Calendar.DATE) + 
      ". People: " + formatPeople() + "Meeting link: " +
        link;
    System.out.println(result);
  }

  public static List<String> peopleToArr(String people) {
    int lCommaIndex = -1;
    List<String> peopleList = new ArrayList<>();
    for(int i = 0; i < people.length(); i++) {
      if(people.charAt(i) == ',') {
        String person = people.substring(lCommaIndex + 1, i);
        peopleList.add(person);
        lCommaIndex = i;
      }
    }
    peopleList.add(people.substring(lCommaIndex + 1, people.length()));
    return peopleList;
  }
}
