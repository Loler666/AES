/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aes;

/**
 *
 * @author AS21 13
 */
public class AES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        String cosa="Cosas de cosas para que las cosas se queden como cosas xD así bien loco alv";
        String passwordEnc=AESenjava.encrypt(cosa);
        String passwordDec=AESenjava.decrypt(passwordEnc);
        
        System.out.println("Texto que quiero y voy a encriptar:" + cosa);
        System.out.println("Texto encriptado:" + passwordEnc);
        System.out.println("Texto Decifrado:" + passwordDec);
        
    }
    
}
