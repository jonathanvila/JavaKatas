package kata.palabrasrepetidas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PalabrasManagerImpl implements PalabrasManager {

	public String[] getRepeated(String... cadena) {
		List<String> result = new ArrayList<String>();
		for (String palabra : cadena) {
			if (!result.contains(palabra)) {
			  if (Collections.frequency(Arrays.asList(cadena), palabra) > 1) {
				  result.add(palabra);
			  };
			}
		}
		return result.toArray(new String[result.size()]);
	}
}
