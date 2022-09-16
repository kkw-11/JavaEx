package builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

@Builder
@AllArgsConstructor
@ToString
public class User {

  private String name;
  private int age;
  private int weight;
  private String address;

  public User(String name, int weight, String address) {
    this.name = name;
    this.weight = weight;
    this.address = address;
  }


  public static User of(String name, int weight, String address) {
    return new User(name, 80, "Seoul");
  }

  public static void main(String[] args) {
    User user = User.builder()
            .name("Seeroo")
            .address("Seoul")
            .age(21)
            .weight(30).build();
    System.out.println(user.toString());
  }
}
