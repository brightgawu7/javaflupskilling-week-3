package exercise1;

import exercise1.controllers.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Exercise1Config.class);

        // Retrieve an instance of UserController from the application context.
        UserController controller = context.getBean(UserController.class);

        // Call the printUser method of the UserController instance to print user information.
        controller.printUser();

    }
}
