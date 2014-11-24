import org.aytartana.kata.pangram.Pangram;
import org.aytartana.kata.pangram.PangramImpl;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by jonathan on 24/11/14.
 */
public class PangramTest {
    Pangram pangram;

  @Test
  public void init() {
      assertNotNull("pangram is not null", pangram);
  }

    @Before
    public void setup() {
        pangram = new PangramImpl();
    }

    @Test
    public void whenSomeLettersThenNotPangram() {
      assertFalse("if some letters then not pangram", pangram.isPangram("hola"));
  }
}
