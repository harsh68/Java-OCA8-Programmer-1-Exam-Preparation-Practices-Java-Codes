/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Harsh
 */
public class AsLi {
    public static void main(String[] args) {
        String names[] = {"Rsel", "Jeanne", "saul", "Mushfiq"};
        List<String> list = new ArrayList(Arrays.asList(names));//create copy of list in list line 19
  if(list.removeIf( (s) -> { return s.contains("s"); } )){
      System.out.println(list);
  }
    }
}
