package java_tinyraytracer;

public class Main {
	public static void main(String[]args) {
		Rendering render = new Rendering();
		render.renderToFile(512, 512);
	}
}
