package task_1;

import lombok.Builder;
import lombok.ToSTring;

import java.unit.List;

@Builder
@ToSTring
public class User {
  private String name;
  private int age;
  private Gender gender;
  private double weight;
  private double height;
  @Singular
  private List<String> occupations;
}
  
