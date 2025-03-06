
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collectionddemo {
    public static void main(String[] args) {
      Student s = new Student();

      Scanner sc  = new Scanner(System.in);
      int no = sc.nextInt();

      s.setRollNumber(no);
      s.getRollNumber();

      List<Integer> l = new ArrayList<>();

    }
}


class Student {
  private int rollNuber;
  private String name;

  public void setRollNumber(int no) {
    this.rollNuber = no;
  }

  public void setName(String n) {
    this.name = n;
  }


  public int getRollNumber() {
    return this.rollNuber;
  }

  public String getName() {
    return this.name;
  }
}