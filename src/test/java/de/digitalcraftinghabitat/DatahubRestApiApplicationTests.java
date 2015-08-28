package de.digitalcraftinghabitat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static junit.framework.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DatahubRestApiApplication.class)
@WebAppConfiguration
public class DatahubRestApiApplicationTests {

	@Test
	public void contextLoads() {
		assertTrue(true);
	}

}
