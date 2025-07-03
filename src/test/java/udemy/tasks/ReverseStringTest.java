package udemy.tasks;

import org.junit.jupiter.api.Test;
import udemy.tasks.strings.ReverseString;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void reverseString() {
        assertEquals("notnA si eman yM !iH", ReverseString.reverseString("Hi! My name is Anton"));
    }

    @Test
    void reverseStringWithOneChar() {
        assertEquals("n", ReverseString.reverseString("n"));
    }

    @Test
    void reverseStringWithNullString() {
        assertThrows(
                IllegalArgumentException.class,
                () -> ReverseString.reverseString(null)
        );
    }

    @Test
    void reverseString2() {
        assertEquals("notnA si eman yM !iH", ReverseString.reverseString2("Hi! My name is Anton"));
    }

    @Test
    void reverseStringWithOneChar2() {
        assertEquals("n", ReverseString.reverseString2("n"));
    }

    @Test
    void reverseStringWithNullString2() {
        assertThrows(
                IllegalArgumentException.class,
                () -> ReverseString.reverseString2(null)
        );
    }
}