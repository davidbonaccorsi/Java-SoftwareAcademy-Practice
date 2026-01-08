package Chapter34.e2;

public class Score {
    public static void main (String[] args) {
        Object input = 85;
        if (input instanceof Integer score) {
            String grade = switch (score/10) {
                case 9,10 -> "A";
                case 8 -> "B";
                case 7 -> "C";
                case 6 -> "D";
                case 5,4,3,2,1,0 -> "F";
                default -> "Invalid";
            };
            System.out.println(grade);
        } else {
            System.out.println("Invalid input type");
        }

        // Exercise 2: Strings
        System.out.println(separateNames("John Smith"));
        System.out.println(separateNames(""));
        System.out.println(separateNames("   mark"));

    }

    public static String separateNames (String fullname) {
        if (fullname == null || fullname.trim().isEmpty()) {
            return "Invalid name";
        }

        int spaceIndex = fullname.trim().indexOf(" ");
        if (spaceIndex == -1 ) {
            return (fullname.trim() + " is a single name");
        }

        String firstname = fullname.substring(0, spaceIndex);
        String lastname = fullname.substring(spaceIndex);
        return ("First name: " + firstname + " | " + " Last name: " + lastname);
    }


}
