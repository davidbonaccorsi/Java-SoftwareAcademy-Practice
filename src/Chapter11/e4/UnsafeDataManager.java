package Chapter11.e4;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnsafeDataManager {

    /**
     * Requirement 1: Process File Names
     * * You have a list of file names. You need to "read" them using the provided
     * 'unsafeReader' method.
     * * THE RULES:
     * 1. Stream the file names.
     * 2. Call 'unsafeReader' inside the stream.
     * 3. 'unsafeReader' throws a CHECKED IOException. You must handle this.
     * 4. If an IOException occurs, catch it and return "ERROR: [filename]"
     * instead of crashing the stream.
     * 5. Collect the results into a List<String>.
     */
    public List<String> processFiles(List<String> fileNames) {

        return fileNames.stream()
                .map( file -> {
                    try {
                        return unsafeReader(file);
                    } catch (IOException e) {
                        return "ERROR: " + file;
                    }
                })
                .toList();

    }

    /**
     * Requirement 2: The "Clean" Parser
     * * You have a list of raw Strings that *should* be integers (e.g., "123", "45a", "99").
     * * THE RULES:
     * 1. Stream the raw strings.
     * 2. Attempt to parse them using Integer.parseInt().
     * 3. parseInt throws an UNCHECKED NumberFormatException.
     * 4. If a number is valid, keep it.
     * 5. If it throws an exception, DISCARD the item (filter it out).
     * (Hint: You might need map() then filter() or flatMap()).
     * 6. Return a List<Integer> of only the valid numbers.
     */
    public List<Integer> getValidNumbers(List<String> rawData) {

        return rawData.stream()
                .flatMap( v -> {
                    try {
                        return Stream.of(Integer.parseInt(v));
                    } catch (NumberFormatException e){
                        return Stream.empty();
                    }
                })
                .toList();
    }

    private String unsafeReader(String file) throws IOException {
        if (file.contains("corrupt")) {
            throw new IOException("File damaged");
        }
        return "Content of " + file;
    }
}
