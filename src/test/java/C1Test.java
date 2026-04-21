import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C1Test {
    private final C1 c = new C1();

    @Test
    void testShouldReturnRightFeature() {
        assertEquals("Feature 1", c.m());
    }
}
