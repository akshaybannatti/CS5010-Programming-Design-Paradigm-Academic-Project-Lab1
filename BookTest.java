import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


/**
 * a JUnit test class for the Person class.
 */

public class BookTest {
  private Person john;
  private Book book;

  /**
   * Create a person before each test.
   */
  @Before
  public void setUp() {

    john = new Person("John", "Doe", 1945);
    book = new Book("SFSFF", john, 55F);
  }

  @Test
  public void testTitle() {
    assertEquals("SFSFF", book.getTitle());
  }


  @Test
  public void testAuthor() {
    assertEquals(john, book.getAuthor());
  }

  @Test
  public void testPrice() {
    assertEquals(55F, book.getPrice(), 0.001F);
  }
}