package builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

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

    String test = "eyJDT01NT05fSEVBRCI6eyJNU0ciOiLshLHqs7UiLCJDT0RFIjoiMDAwMCIsIkVSUk9SIjoiZmFsc2UifSwiUkVQX1JFQyI6ImRTOUptY1JZWFYxTGZwamJYNHJaMUFKblNIbkREeHBTTjFjODU2YzVST0o3UjVlQnVlQzRzTWN0VnRPc3dkbzd0SmtkTjBFSGl5aG1qV2xJU3dTeGZTa0FlK2I1dDNXTTJQRCtvZzFTS1JmMzBPR2dlRVRHZ2tnTVcrb0hRQkFmVm9ZXC9mUDUyU1Jma2NaOCtUbDY4OVR4MUR2Z0FcL2lBRzdINnIyWWlKVFhhczhsU0l4QjhFYVJiVGczZXMxeFwvMFBCWENpZHRrMmo5Q2Y2NmxJUGExMENXaEJlVFRnSHBIWE1pQkwrZU4wZUxTaWVwUGFxN3BDRCtqajJiZlZUNFphWjAxUzhBUURTWjJoYlI0QURzcTFONzZrNXNsTTJzbGlwOHFPaDJjRXg2T2d5S1ZIYmxUOVVcL0tIbVVZRGtISks0RU9Hb1BvTlwvaE5saUZyaER1TVB3PT0ifQ==";
    String resRadisMchtDecoded = new String(Base64.getDecoder().decode(test), StandardCharsets.UTF_8);
    System.out.printf(resRadisMchtDecoded);
  }
}
