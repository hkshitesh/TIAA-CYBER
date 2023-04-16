package tiaa;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class HMAC {
	
	static public byte[] calculateHMAC(byte[] secretKey, byte[] message) throws NoSuchAlgorithmException, InvalidKeyException
	{
		byte[] hmacSHA256 = null;
		Mac mac = Mac.getInstance("HmacSHA256");
		SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey, "HmacSHA256");
		mac.init(secretKeySpec);
		hmacSHA256=mac.doFinal();
		return hmacSHA256;
	}
}
