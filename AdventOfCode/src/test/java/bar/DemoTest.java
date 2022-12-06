package bar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {

    @Test
    void testingAdding(){
        assertEquals(5,Demo.add(3,2));
    }
}