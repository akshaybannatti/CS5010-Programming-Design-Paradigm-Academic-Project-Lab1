import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * a JUnit test class for the Person class.
 */
public class PersonTest {

  private Person john;

  /**
   * Create a person before each test.
   */
  @Before
  public void setUp() {

    john = new Person("John", "Doe", 1945);
  }

  @Test
  public void testFirst() {
    assertEquals("John", john.getFirstName());

  }

  @Test
  public void testSecond() {
    assertEquals("Doe", john.getLastName());
  }

  @Test
  public void testRuntimeException1() {
    john = new Person("John", "doe", 1945);
    try {
      john.getLastName();
      assert false;
    } catch (RuntimeException e) {
      assert true;
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  public void testRuntimeException3() {
    john = new Person("johnathan", "doe", 1945);
    try {
      john.getFirstName();
      assert false;
    } catch (RuntimeException e) {
      assert true;
    } catch (Exception e) {
      assert false;
    }
  }

  @Test
  public void testYearOfBirth() {
    assertEquals(1945, john.getYearOfBirth());
  }

}
