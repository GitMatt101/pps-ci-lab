import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class S1Test:
  private val c = C1()

  @Test def testShouldReturnRightFeature(): Unit =
    assertEquals("Feature 1", c.m())

end S1Test

