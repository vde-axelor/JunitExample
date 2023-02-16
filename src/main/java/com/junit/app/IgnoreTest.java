package com.junit.app;

import org.junit.Ignore;
import org.junit.Test;

public class IgnoreTest {
	@Ignore("Test is ignored as a demonstration")
	@Test
	public void testSame() {
		assertThat(3, is(3));
//		assertThat(x, is(not(4)));
//		assertThat(responseString, either(containsString("color")).or(containsString("colour")));
//		assertThat(myList, hasItem("3"));
	}

	private void assertThat(int i, Object object) {
		// TODO Auto-generated method stub
		
	}

	private Object is(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
