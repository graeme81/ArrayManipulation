package uber19319h;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OtherProductsTest {
	OtherProducts tester = new OtherProducts();
	int[] a = {1, 2, 3, 4, 5};
	int[] b = {3, 2, 1};
	
	@Test
	void test1() {
		int[] result = tester.manipulate(a);
		assertEquals(a.length, result.length);
	}
	
	@Test
	void test2() {
		int[] result = tester.manipulate(a);
		int[] expect = {120, 60, 40, 30, 24};
		for(int i = 0; i < expect.length; i++) {
			assertEquals(expect[i], result[i]);
		}
	}
	
	@Test
	void test3() {
		int[] result = tester.manipulate(b);
		int[] expect = {2, 3, 6};
		for(int i = 0; i < expect.length; i++) {
			assertEquals(expect[i], result[i]);	
		}
		
	}

}
