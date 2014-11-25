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
    @Test
    public void whenEmptyThenNotPangram() {
        assertFalse("if empty then false", pangram.isPangram(""));
    }

    @Test
    public void whenAlphabetThenTrue() {
        String alfabeto = "abcdefghijklmnñopqrstuvwxyz";
        assertTrue("if " + alfabeto + " then true", pangram.isPangram(alfabeto));
    }

    @Test
    public void whenSomeWordsThatUsesAllCharsThenTrue() {
        String texto = "ahorabueycon desde el elefante grande hemos insertado jamon kilos la mema nuna año o pero que ria ssin tuvwxyz";
        assertTrue("if " + texto + " then true", pangram.isPangram(texto));

    }
}
