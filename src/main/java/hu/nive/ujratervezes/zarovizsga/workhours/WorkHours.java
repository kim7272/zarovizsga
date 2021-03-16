package hu.nive.ujratervezes.zarovizsga.workhours;

 import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;
 import java.util.ArrayList;
 import java.util.List;

  public class WorkHours {


      public String minWork(String s) {

          List<String> workData = new ArrayList<>();
          List<Integer> numbers = new ArrayList<>();
          Integer minIndex = 0;

          try (BufferedReader reader = new BufferedReader(new InputStreamReader(WorkHours.class.getResourceAsStream(s)))) {
              workData = new WorkHours().readLines(reader);
              for (String data : workData){
                  String[] parts = data.split(",");
                  numbers.add(Integer.parseInt(parts[1]));
              }
              minIndex = numbers.indexOf(min(numbers));

          } catch (IOException ioe) {
              throw new IllegalStateException("Can not read file", ioe);
          }

            return workData.get(minIndex);
      }

      public int min(List<Integer> numbers) {
          int min = 0;
          for (Integer n: numbers) {
              if (n < min) {
                  min = n;
              }
          }
          return min;
      }

      private List<String> readLines(BufferedReader reader) throws IOException {
          List<String> data = new ArrayList<>();
          String line;
          while ((line = reader.readLine())  != null) {
              data.add(line);
          }
          return data;
      }
  }





