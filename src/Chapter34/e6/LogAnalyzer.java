package Chapter34.e6;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LogAnalyzer {

    
    public static void main(String[] args) {
        System.out.println("Starting Log Analyzer");
        System.out.println(cleanAndAnalyzeLog("  User: admin | IP: 192.168.0.1 | Status: FAIL  "));
    }
    /**
     * CHALLENGE 1: String Manipulation & StringBuilder
     * TOPICS: indexOf, substring, replace, StringBuilder, trim, chaining
     *
     * Scenario: Raw logs come in messy. You need to clean them and hide sensitive IPs.
     * Input Example: "  User: admin | IP: 192.168.0.1 | Status: FAIL  "
     *
     * REQUIREMENTS:
     * 1. Trim the leading/trailing spaces.
     * 2. Extract the "Status" value (e.g., "FAIL") - Hint: Use lastIndexOf("|") or substring.
     * 3. Check if the status equals "FAIL" (ignore case).
     * 4. If it is "FAIL", use StringBuilder to construct a new string: "ALERT: [admin] executed [FAIL]"
     * 5. If it is NOT fail, return just "Log Parsed".
     *
     * @param rawLog The messy log string
     * @return The formatted alert or standard message
     */
    public static String cleanAndAnalyzeLog(String rawLog) {
        // TODO: Implement using String methods and StringBuilder

        rawLog = rawLog.replace(" ", "");

        int index = rawLog.lastIndexOf(":");
        String status = rawLog.substring(index+1);
        int pipeIndex = rawLog.indexOf("|");
        int colonIndex = rawLog.indexOf(":");
        String user = rawLog.substring(colonIndex+1,pipeIndex);
        System.out.println(user);

        if (status.equalsIgnoreCase("FAIL")) {
            StringBuilder newAlert = new StringBuilder("ALERT: [");
            newAlert.append(user);
            newAlert.append("] executed [FAIL]");
            return newAlert.toString();
        }
        System.out.println(status);

        return "Log parsed";

//        throw new UnsupportedOperationException("Not implemented");
    }


    /**
     * CHALLENGE 2: Arrays & Math API
     * TOPICS: Arrays (sorting, binarySearch), Math (max, min), For Loop
     *
     * Scenario: You have an array representing server load % for each hour (0-23).
     *
     * REQUIREMENTS:
     * 1. Create a copy of the array (so we don't mess up the original).
     * 2. Sort the copy.
     * 3. Use Arrays.binarySearch to see if the load ever hit exactly 100%.
     * 4. Use a standard 'for' loop (not for-each) on the ORIGINAL array to find
     * which specific Hour (index 0-23) had the highest load.
     * 5. Return a string: "Peak Load: [Value]% at Hour [Index] | Critical: [true/false]"
     * (Critical is true if 100% was found).
     *
     * @param hourlyLoad Array of 24 integers
     * @return Summary string
     */
    public String analyzeLoadPatterns(int[] hourlyLoad) {
        // TODO: Implement using Arrays utility and loops

        int[] hourlyLoadCopy = hourlyLoad.clone();
        Arrays.sort(hourlyLoadCopy);
        int index = Arrays.binarySearch(hourlyLoadCopy,100);

        int max = 0;
        int maxHour = 0;
        for (int i = 1; i < hourlyLoad.length; i++) {
            if (hourlyLoad[i] > max && max!= 100) {
                max = hourlyLoad[i];
                maxHour = i;
            }
        }
        return "Peak Load: [" + max + "] at Hour [" + maxHour + "] | Critical: [" + (max==100) + "]";


//        throw new UnsupportedOperationException("Not implemented");
    }


    /**
     * CHALLENGE 3: Modern Switch & Loops
     * TOPICS: Switch Expression (Arrow syntax), Yield/Return, For-Each Loop, Break/Continue
     *
     * Scenario: You have a list of error codes. You need to calculate a "Risk Score".
     * Codes: "404" (1 point), "500" (5 points), "200" (0 points), "403" (3 points).
     *
     * REQUIREMENTS:
     * 1. Loop through the list using 'for-each'.
     * 2. If a code is null or empty, use 'continue' to skip it.
     * 3. If the total score exceeds 10, use 'break' to stop the loop immediately.
     * 4. Inside the loop, use a Java 14+ SWITCH EXPRESSION (Arrow syntax) to get points.
     * - "500", "503" -> 5 points
     * - "404" -> 1 point
     * - "403" -> 3 points
     * - Any other code -> 0 points
     *
     * @param errorCodes List of String codes
     * @return The final calculated score (max 10 theoretically, due to break)
     */
    public int calculateRiskScore(List<String> errorCodes) {
        // TODO: Implement using for-each and Switch Expression

        int riskScore = 0;

        for (String error : errorCodes) {
            if ( error == null || error.isEmpty()) { continue; }

            if (riskScore > 10) { break;}

            int points = switch (error) {
                case "500", "503" -> 5;
                case "404" -> 1;
                case "403" -> 3;
                default -> 0;
            };
            riskScore+=points;
        }

        return riskScore;
//        throw new UnsupportedOperationException("Not implemented");
    }


    /**
     * CHALLENGE 4: Dates, Autoboxing & Pattern Matching
     * TOPICS: instanceof (Flow Scoping), Duration, Wrapper parsing
     *
     * Scenario: The system passes generic Objects for start/end times.
     *
     * REQUIREMENTS:
     * 1. Check if 'start' AND 'end' are instances of LocalDateTime using Pattern Matching (instanceof).
     * (e.g., 'if (start instanceof LocalDateTime s && ...)')
     * 2. If they are NOT dates, return -1.
     * 3. Calculate the Duration between them.
     * 4. Return the duration in Minutes (long).
     * 5. BONUS: If the minutes are negative (end is before start), return 0.
     *
     * @param start Generic object (might be null or String)
     * @param end Generic object
     * @return Minutes of downtime
     */
    public long calculateDowntime(Object start, Object end) {
        // TODO: Implement using instanceof and Duration

        if (start instanceof LocalDateTime s && end instanceof LocalDateTime e) {
            Duration duration = Duration.between(s, e);
            long minutes = duration.toMinutes();
            if (minutes<0) {return 0;}
            return minutes;
        } else {
            return -1;
        }
//        throw new UnsupportedOperationException("Not implemented");
    }
}