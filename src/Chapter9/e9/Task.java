package Chapter9.e9;

import java.time.LocalDate;

public record Task(String name, int priority, LocalDate dueDate) {
}
