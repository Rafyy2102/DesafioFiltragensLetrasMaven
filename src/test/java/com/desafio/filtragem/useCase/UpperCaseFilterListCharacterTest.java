package com.desafio.filtragem.useCase;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class UpperCaseFilterListCharacterTest {

    @Test
    public void testGetUpperCaseLetters() {

        String input = "VbAcMdfrOerSffDooEhhToooUawedRlloMwwAppIhhhTfffAsfdU!";
        List<Character> result = UpperCaseFilterListCharacter.getUpperCaseLetters(input);
        List<Character> expected = Arrays.asList('V', 'A', 'M', 'O', 'S', 'D', 'E', 'T', 'U', 'R', 'M', 'A', 'I', 'T', 'A', 'U');

        assertEquals(expected, result);
    }
}