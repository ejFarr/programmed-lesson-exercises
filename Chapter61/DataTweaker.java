import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class DataTweaker {
    public static void main (String[] args) {
        ArrayList <Double> data = getData("coffee.txt");
        
        double average = 0;
        for (int i = 0; i < data.size(); i++) {
            average += data.get(i);
        }
        average /= data.size();

        double furthestDistance = Math.abs(data.get(0) - average);
        int furthest = 0;
        for (int j = 0; j < data.size(); j++) {
            if (Math.abs(data.get(j) - average) > furthestDistance) {
                furthestDistance = Math.abs(data.get(j) - average);
                furthest = j;
            }
        }
        data.remove(furthest);
        
        String output = "";
        for (int i = 0; i < data.size(); i++) {
            output+= "[" + i + "]:" + data.get(i) + "  ";
        }
        System.out.println(output);
        System.out.println("average: " + average);
        for (int i = 0; i < data.size(); i++) {
            average += data.get(i);
        }
        average /= data.size();
        System.out.println("New Average:" + average);
    }
    public static ArrayList<Double> getData(String filename) {
        ArrayList<Double> data = new ArrayList<>();
        try {
            File input = new File(filename);
            Scanner scan = new Scanner(input);
            while (scan.hasNextLine()) {
                data.add(scan.nextDouble());
            }
            scan.close();
            return data;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }  
        return data;        
    }
}