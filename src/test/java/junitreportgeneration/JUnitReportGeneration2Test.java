package junitreportgeneration;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class JUnitReportGeneration2Test {

	private String developer = "Paul";

	@Test
	public void instanceOfTest1() {
		assertThat(new ArrayList<>(), instanceOf(List.class));
	}

	@Test
	public void assertTrueTest2() {
		assertTrue(true);
	}

	@Test
	public void equalToTest2() {
		assertThat(developer, is("Paul"));
	}
}
