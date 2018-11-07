package MDW_280.JenkinsMavenProject;

import org.junit.Test;

import junit.framework.TestCase;

public class App2Test extends TestCase {
	
	App objetMul = new App();
	
	
	@Test
	public void testReussi() {
		int a = 10;
		int b = 5;
		assert(objetMul.multipleValues(a, b) == 50);
	}
	
	@Test
	public void testEchour() {
		int a = 10;
		int b = 5;
		assert(objetMul.multipleValues(a, b) == 40);
	}

	

}
