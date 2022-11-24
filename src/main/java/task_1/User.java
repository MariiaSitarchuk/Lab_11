package task_1;

import lombok.Builder;

import java.unit.List;

@Builder
public class User {
  private String name;
  private int age;
  private Gender gender;
  private double weight;
  private double height;
  private List<String> occupations;
}
  
