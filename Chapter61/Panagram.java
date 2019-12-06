import java.util.*;

public class Panagram {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] count = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        boolean isPanagram = false;
        System.out.println("Enter your sentence: ");
        String panagram = scan.nextLine().toLowerCase();
        

        String alphabet = "abcdefghijklnmopqrstuvwxyz";
        for (int j = 0; j < panagram.length(); j++) {
            for (int i = 0; i < alphabet.length(); i++) {
                if (panagram.charAt(j) == alphabet.charAt(i)) {
                    count[i] += 1;
                    System.out.println(panagram.charAt(j));
                }
            }
        }
        for (int i = 0; i < count.length; i ++) {
            if (count[i] > 0) {
                isPanagram = true;
            }
            else { 
                isPanagram = false;
            }
        }
        System.out.println(isPanagram);
    }
}