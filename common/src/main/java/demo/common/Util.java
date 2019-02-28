package demo.common;

/**
 * Hello world!
 *
 */
public class Util {

	public void echo(String string) {
		System.out.println(string);
	}

	public int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		Util util = new Util();
		util.echo("Hello World!");
		System.out.println();
	}
}
