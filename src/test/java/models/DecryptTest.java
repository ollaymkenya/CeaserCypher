package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptTest {
    private Decrypt testText = new Decrypt("Oliver", 1);

    @Test
    public void runDecrypt_instanciate() {
        assertTrue(testText instanceof Decrypt);
    }

    @Test
    public void runDecrypt_checkForText() {
        assertEquals("Oliver" ,testText.getText());
    }

    @Test
    public void runDecrypt_checkForKey() {
        assertEquals(1, testText.getKey());
    }

    @Test
    public void runDecrypt_Encrypt_Text() {
        assertEquals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", testText.decryptText("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD", 3));
    }
}