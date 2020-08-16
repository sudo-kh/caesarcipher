package caesarcipher;

import java.io.*;

public class CaesarCipher {

    public static void main(String[] args) throws IOException {
        FileReader in = null;
        
        try {
        in = new FileReader("ciphertext.txt");
        BufferedReader br = new BufferedReader(in);
        String ciphertext = br.readLine(); 
        
        
        
        int plaintext = 64;
        
        for (int l = 0; l < 26; l++)
        {
            System.out.print("Shift " + l + ": ");
            for (int i = 0; i < ciphertext.length(); i++)
            {
                int pt = (int)ciphertext.charAt(i);
                plaintext = pt;
                if (pt >= 65 && pt <= 90) 
                {    
                    if ((pt + l) > 90)
                    {   int offset = (pt + l) % 90;
                        plaintext = 64 + offset;
                    }
                    else plaintext = pt + l; }
                else if (pt >= 97 && pt <= 122) 
                {    
                    if ((pt + l) > 122)
                    {   int offset = (pt + l) % 122;
                        plaintext = 96 + offset;
                    }
                    else plaintext = pt + l; }
                    
                System.out.print((char)plaintext);
            }
        System.out.println();
        }
        }
        catch(IOException e) {
            System.out.println("File Not Found. Ciphertext should reside at ciphertext.txt");
        }
    }
    
}
