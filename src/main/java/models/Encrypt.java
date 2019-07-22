package models;

public class Encrypt {
    private String text;
    private int key;

    public Encrypt(String text, int key){
        this.text = text;
        this.key = key;
    }

    public String getText() {
        return text;
    }

    public int getKey() {
        return key;
    }
}
