package in.staling.webfluxtest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WebfluxTestApplicationTests {

	@Autowired
	private WebfluxController webfluxController;

	@Test
	void testSayHello() {
		assertEquals("Hello Stalin", webfluxController.sayHello("Stalin").block());
	}

}
