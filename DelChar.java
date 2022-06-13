# JavaStudy

public class DelChar {
	String src;
	String delCh;
	protected String delChar(String src, String delCh) {	
		this.src = src; this.delCh=delCh;
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<src.length(); i++) {
					if (delCh.indexOf(src.charAt(i)) == (-1)) {
						sb.append(src.charAt(i));
						}
					}
		return sb.toString();
	}
	public static void main(String[] args) {
		DelChar dc = new DelChar();
		System.out.println("(1!2@3^4~5) -> " + dc.delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
		System.out.println("(1 2    3   4\t5) -> " + dc.delChar("(1 2    3   4\t5)", " \t"));
		}
	}
