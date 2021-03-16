 package hu.nive.ujratervezes.zarovizsga.digitscounter;

 import java.util.HashSet;
 import java.util.Set;

 public class DigitsCounter {

     public int getCountOfDigits(String s) {

         try {
             Set numbers = new HashSet();
             int count = 0;
             s = s.replaceAll("[^\\d]", "");

             String[] parts = s.split("");
             for (String part : parts) {
                 numbers.add(Integer.parseInt(part));
             }
             count = numbers.size();
             return count;
         } catch (NumberFormatException  | NullPointerException e) {
                return 0;
         }
     }
 }


