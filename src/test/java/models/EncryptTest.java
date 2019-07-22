package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptTest {
    private Encrypt testText = new Encrypt("Oliver", 1);

    @Test
    public void runEncrypt_instanciate() {
        assertTrue(testText instanceof Encrypt);
    }

}