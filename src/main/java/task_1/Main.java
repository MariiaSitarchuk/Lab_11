package task_1;

public class Main {
  public static void main(String[] args) {
    User user = User.builder().name("Mariia").age(19).occupation("UCU").gender(Gender.FEMALE).build();
    System.out.println(user);
  }
}
