package PackTwo;

class ReverseString {
	public static void main(String[] args) {

		String s = "ABCDE";

		byte[] b =s.getBytes();

		byte[] k = new byte[s.length()];

		for (int i = 0; i < b.length; i++) {
			k[i] = b[b.length - i - 1];

		}
		System.out.print(new String(k));

	}
}