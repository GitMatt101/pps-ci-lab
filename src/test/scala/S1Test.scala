import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

import it.unibo.Class1;

class S1Test:
  private val c = Class1()

  @Test def testShouldReturnRightFeature(): Unit =
    assertEquals("Feature 1", c.method())

end S1Test

