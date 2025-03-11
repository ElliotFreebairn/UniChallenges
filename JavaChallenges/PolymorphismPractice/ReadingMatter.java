
public class ReadingMatter {

  private int numPages;

  public ReadingMatter(int numPages) {
    this.numPages = numPages;
  }

  public int getNumPages() {
    return numPages;
  }
  
  public void printInfo() {
    System.out.println("Readingmatter. Number of pages " + numPages);
  }

  public static void main(String[] args) {
    Newspaper n = new Newspaper(10, "Hello world");

    ReadingMatter r = new Newspaper(10, "Hello world");

    Newspaper n1 = (Newspaper)r;

    r.printInfo();
    n.printInfo();

    System.out.println(n1.getHeadline());
  }
}
