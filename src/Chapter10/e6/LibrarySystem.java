package Chapter10.e6;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Challenge 3: The Library Catalog
 *
 * DIFFICULTY: Tricky
 * TOPICS: flatMap, Distinct, Set Collection
 *
 * SCENARIO:
 * You have a list of Books. Each Book has a LIST of authors (co-authored books).
 * You want a single list of ALL unique authors in the library.
 */

public class LibrarySystem {

    public record Book(String title, List<String> authors) {}

    /**
     * Method 1: Get All Unique Authors
     *
     * REQUIREMENTS:
     * 1. Start with a List of Books.
     * 2. Transform the Stream<Book> into a Stream<String> of authors.
     * 3. Remove duplicates.
     * 4. Sort them alphabetically.
     * 5. Return as a List.
     */
    public List<String> getAllUniqueAuthors(List<Book> library) {


        return library.stream()
                .flatMap(book -> book.authors().stream())
                .distinct()
                .sorted()
                .toList();



    }
}
