import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {
    @Test
    void returnsOnlyFive() {
        assertEquals(5, new HelloWord().returnsOnlyFive());
    }
}
