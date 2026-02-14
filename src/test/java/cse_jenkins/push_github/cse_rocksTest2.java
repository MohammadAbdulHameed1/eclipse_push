package cse_jenkins.push_github;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CseRocksTest {
	cse_rocks cal = new cse_rocks();

	@Test
	void test1() {
		int result = cal.mul(2, 3);
		assertEquals(6, result);
	}
}