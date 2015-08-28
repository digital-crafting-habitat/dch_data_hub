package de.digitalcraftinghabitat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static junit.framework.Assert.assertTrue;

@RunWith(JUnit4.class)
public class SimpleTestClass {

	@Test
	public void simpleTest() {
		assertTrue(true);
	}

}
