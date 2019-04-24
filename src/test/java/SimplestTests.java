import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class SimplestTests {
    @Test
    @DisplayName("Passed Test")
    public void passedTest() {
        System.out.println("This test never fails");
    }

    @Test
    @DisplayName("Failed Test")
    public void failedTest() {
        System.out.println("This is failing test");
        fail("This test always fails");
    }

    @Test
    @DisplayName("Error Test")
    public void errorTest() {
        System.out.println("This is error test");
        throw new RuntimeException("This test always errors");
    }
}
