import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        Map<String, Integer> votation = new HashMap<>();
        
        System.out.print("Enter file full path: ");
        String path = sc.nextLine();
        
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            
            while (line != null) {
                String[] fields = line.split(",");

                String candidate = fields[0];
                Integer vote = Integer.parseInt(fields[1]); 

                if (votation.containsKey(candidate)){
                    vote += votation.get(candidate);
                    votation.put(candidate, vote);

                } else {
                    votation.put(candidate, vote);
                }

                line = br.readLine();
            } 
        } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            
        }

        for (String key : votation.keySet()){
            System.out.println(key + ": " + votation.get(key));
        }
        
        sc.close();
    }
}
