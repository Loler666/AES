/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aes;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 *
 * @author AS21 13
 */
public class AESenjava {
    private static final String ALGO= "AES";
    private static final byte[] keyValue= new byte[]{'h','o','l','a','v','a','n','a','v','a','l','e','r','w','i','i'};
    
    public static String encrypt(String Data) throws Exception{
        Key key= generateKey();
        Cipher c= Cipher.getInstance(ALGO);
        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] encValores =c.doFinal(Data.getBytes());
        String encriptadoValores= new BASE64Encoder().encode(encValores);
        return encriptadoValores;
    }
    public static String decrypt(String encriptadoValores )
            throws Exception{
        Key key= generateKey();
        Cipher c= Cipher.getInstance(ALGO);
        c.init(Cipher.DECRYPT_MODE, key);        
        byte[] decodificarValores= new BASE64Decoder().decodeBuffer(encriptadoValores);
        byte[] decifrarValores;
        decifrarValores = c.doFinal(decodificarValores);
        String decodificartexto = new String(decifrarValores);
        return decodificartexto;
    }
    
    
    public static Key generateKey(){
        Key key= new SecretKeySpec(keyValue,ALGO);
    return key;
    }
}
