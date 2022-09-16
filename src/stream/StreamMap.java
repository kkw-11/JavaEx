package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
  public static void main(String[] args){
    //

      List<Integer> integers = new ArrayList();

      for(int i = 0;i < 10; ++i){
          integers.add(i);
      }

      List newIntegers = integers.stream().map(i -> i + 10).collect(Collectors.toList());


      ArrayList<String> listOfString = new ArrayList<>(Arrays.asList("Apple", "Banana", "Melon", "Grape", "Strawberry"));
      System.out.println(listOfString);

      listOfString.stream().map(s -> s.toUpperCase()).forEach(System.out::println);


  }
}
