package org.aytartana.kata.pangram;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by jonathan on 24/11/14.
 */
public class PangramImpl implements Pangram {

    @Override
    public boolean isPangram(String text) {
        if (text != null) {
            text = text.toUpperCase().replaceAll("[^A-Za-zñÑ]", "");

            boolean espangram = true;
            String alphabeth = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
            for (Character letra : alphabeth.toCharArray()) {
                if (text.indexOf(letra) < 0) {
                    espangram = false;
                    break;
                }
            }
            return espangram;
        } else
            return false;
    }
}