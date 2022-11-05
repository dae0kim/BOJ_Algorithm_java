import java.io.*;
import java.util.*;
import java.math.BigInteger;
 
public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String A = st.nextToken();
		String B = st.nextToken();
		BigInteger result = new BigInteger(A).add(new BigInteger(B)); 
		System.out.println(result);
	}
}