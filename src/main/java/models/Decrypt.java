package models;

public class Decrypt {
    private String text;
    private int key;

    public Decrypt(String text, int key){
        this.text = text;
        this.key = key;
    }

    public String getText() {
        return text;
    }

    public int getKey() {
        return key;
    }

    public String decryptText(String text, int key) {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
        char[] vowels = letters.toCharArray();
        String[] uText = text.toUpperCase().split("");
        String individuals = "";
        for (String x: uText){
            individuals += (vowels[letters.indexOf(x)] == ' '? ' ':letters.indexOf(x) + key > 25?vowels[letters.indexOf(x) - (26 - key)]: vowels[letters.indexOf(x) + key]);
        }

        return individuals;
    }
}
