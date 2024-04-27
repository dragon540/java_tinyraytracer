package java_tinyraytracer;

import java.util.Formatter;

public class Rendering {
	public void createFile() {
		try {
			Formatter form = new Formatter("../java_tinyraytracer/img.ppm");
			form.format("%s\n", "P6");
			form.format("%s %s\n%s\n", "256", "256", "255");
			form.close();
		}
		catch (Exception e) {
			System.out.println("Cannot create file");
		}
	}
}
