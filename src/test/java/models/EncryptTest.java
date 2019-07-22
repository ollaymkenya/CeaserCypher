package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptTest {
    private Encrypt testText = new Encrypt("Oliver", 1);

    @Test
    public void runEncrypt_instanciate() {
        assertTrue(testText instanceof Encrypt);
    }

    @Test
    public void runEncrypt_checkForText() {
        assertEquals("Oliver" ,testText.getText());
    }

    @Test
    public void runEncrypt_checkForKey() {
        assertEquals(1, testText.getKey());
    }

    @Test
    public void runEncrypt_Encrypt_Text() {
        assertEquals("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD", testText.encryptText("The quick brown fox jumps over the lazy dog", 3));
    }
}
