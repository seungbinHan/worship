import common.WorshipKinds;

public class Main {
  public static void main(String[] args) {
    new WorshipSepereator()
        .matcher(WorshipKinds.sunday)
        .serve();
  }
}
