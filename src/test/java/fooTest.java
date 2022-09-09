import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class fooTest {
    @Test
    void fooTest() {
        int result = foo.fooBar(1, 1);
        Assertions.assertEquals(2, result);
    }
}
