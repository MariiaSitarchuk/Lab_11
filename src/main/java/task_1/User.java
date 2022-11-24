package task_1;

import lombok.Builder;
import lombok.ToSTring;
import lombok.Singular;
import lombok.experimental.SuperBuilder;

import java.unit.List;

@SuperBuilder
@ToSTring
public class User extends Human {
  private int age;
  private Gender gender;
  private double weight;
  private double height;
  @Singular  //(value = "Work")
  // can add one element to the List
  private List<String> occupations;
}
  
