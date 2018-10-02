package com.unit.test.strategy;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class PersonTest {

	@Test
	@Parameters({ "17, false", "22, true", "90, true", "12, false", "12, false" })
	public void personIsAdult(int age, boolean valid) throws Exception {
		assertEquals(new Person(age).isAdult(), valid);

	}

}