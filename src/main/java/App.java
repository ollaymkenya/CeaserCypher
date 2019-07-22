import models.Decrypt;
import models.Encrypt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args){

        boolean programRunning = true;

        while (programRunning){
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("----------------------WELCOME TO CEASER CIPHER-----------------------To Encrypt press 1 to decrypt press 2 to exit press 3");
            try{
                String navChoice = bufferedReader.readLine();

                if(navChoice.equals("1")){
                    System.out.println("Enter your statement to be encrypted");
                    String text = bufferedReader.readLine();
                    System.out.println("Enter the key to encrypt with");
                    int key = Integer.parseInt(bufferedReader.readLine());

                    Encrypt newEncryption = new Encrypt(text, key);
                    System.out.println("Your encrypted word is: " + newEncryption.encryptText(text, key));
                }else if(navChoice.equals("2")){
                    System.out.println("Enter your statement to be decrypted");
                    String text = bufferedReader.readLine();
                    System.out.println("Enter the key to decrypt with");
                    int key = Integer.parseInt(bufferedReader.readLine());

                    Decrypt newDecryption = new Decrypt(text, key);
                    System.out.println("Your decrypted word is: " + newDecryption.decryptText(text, key));
                }
                else if(navChoice.equals("3")){
                    programRunning = false;
                }
                else {
                    System.out.println("Please input a correct value");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
