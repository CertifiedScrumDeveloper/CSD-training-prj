package example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OneTest {
  @Test
  public void testFoo() throws Exception {
    One one = new One();
    assertEquals("foo", one.foo());
  }

  @Test
  public void testSeconde() {
    assertEquals(1, 1);
  }
}