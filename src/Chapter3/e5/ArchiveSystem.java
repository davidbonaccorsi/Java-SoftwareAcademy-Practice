package Chapter3.e5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ArchiveSystem {
    public static void main(String[] args){
        System.out.println(cleanText(" [SECURE]_Alpha_DATA "));
        System.out.println(organizeLocker());
        manageManifest();
        calculateOpeningDate();

    }

    public static String cleanText(String input) {
        input = input.trim();
        input = input.replace("_","-");
        return input;
    }

    public static String reconstructMessage(String[] parts) {
        StringBuilder NewMessage = new StringBuilder(100);
        for (String part : parts) {
            NewMessage.append(part + " |");
        }
        NewMessage.delete(NewMessage.length()-3, NewMessage.length());
        NewMessage.insert(0, "START: ");
        return NewMessage.reverse().toString();
    }

    public static String organizeLocker() {
        int[][]lockerCode = new int[3][3];

        Random rand = new Random();
        for (int i = 0; i< lockerCode.length; i++) {
            for (int j = 0; j < lockerCode[i].length; j++) {
                lockerCode[i][j] = rand.nextInt(100);
            }
        }

        lockerCode[1] = new int[]{10,20,30};

        Arrays.sort(lockerCode[1]);
        int index = Arrays.binarySearch(lockerCode[1], 20);
        System.out.println(index);

        int[] a = {1,2,3};
        int[] b = {1,2,3};

        System.out.println(Arrays.compare(a,b));

        b = new int[]{1,2,4};
        System.out.println(Arrays.compare(a,b));

        return "Organized locker";
    }

    public static String manageManifest() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(1);
        numbers.remove((Integer) 1);

        String[] items = {"Map", "Key"};
        List<String> newItems = Arrays.asList(items);
       // newItems.add(newItems.size()+1,"Compass"); // newItems is not an object, that's why it doesn't work

        List<String> newItems2 = new ArrayList<>();
        newItems2.addAll(0,newItems);
        newItems2.add("Compass");
        newItems2.sort(null);
        System.out.println(newItems2);
        return "";
    }

    public static Date calculateOpeningDate() {

        LocalDate today = LocalDate.now();
        LocalDateTime specific = LocalDateTime.of(2025,1,1,12,30);
        Period suplimentar = Period.of(0,1,2);
        System.out.println(suplimentar);
        LocalDate modifiedToday = today.plus(suplimentar);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMMM dd, yyyy");

        System.out.println(modifiedToday.format(format));



        return null;
    }

    
}

