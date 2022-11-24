package task_2;

import lombok.Getter;

public class Client {
  @Getter
  private int id;
  // to assign id automaticly from 0
  private static in count = 0;
  @Getter @Setter
  private String name
  @Getter @Setter
  private int age;
  @Getter @Setter
  private Gender sex;
  
  public Client(String name, Gender sex, int age) {
    id = ++count;
    this.name = name;
    this.sex = sex;
    this.age = age;
  }
}
