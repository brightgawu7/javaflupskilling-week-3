package qwammy.example.javaflupskilling_week_3.exercise2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * The User class represents a user with an id and a name.
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    /**
     * The unique identifier for the user.
     */
    private Long id;

    /**
     * The name of the user.
     */
    private String name;
}
