package tiaa;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class GetHMAC {
	public static void main(String[] args) throws InvalidKeyException, NoSuchAlgorithmException, UnsupportedEncodingException {
     byte[] hmacSha256= HMAC.calculateHMAC("secret1234".getBytes("UTF-8"), "Hello TIAA".getBytes("UTF-8"));
     System.out.println(String.format("Hex:%064x", new BigInteger(1,hmacSha256)));
	}
}