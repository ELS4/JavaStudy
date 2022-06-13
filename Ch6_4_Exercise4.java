# JavaStudy
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String query = new String();
		query = scanner.nextLine();
		query = query.trim();
		StringTokenizer st = new StringTokenizer(query, "+ ");
		int res = 0;
		while(st.hasMoreTokens()) {
			String token= st.nextToken();
			res = res + Integer.parseInt(token);
		}
		System.out.println("합은 "+ res);
	}
}
