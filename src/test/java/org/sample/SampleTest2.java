package org.sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest2 {

	@Test(groups = "smoke ,sanity")
	private void tc0() {
		System.out.println("Method 0");
	}

	@Test(groups = "sanity", dependsOnGroups = "smoke")
	private void tc01() {
		System.out.println("Method 1");

	}

	@Test(groups = "smoke")
	private void tc02() {
		System.out.println("Method 2");

	}

	@Test(groups = "reg")
	private void tc03() {
		System.out.println("Method 3");
	}

	@Test(groups = "smoke")
	private void tc04() {
		Assert.assertTrue(false);
		System.out.println("Method 4");

	}

	@Test(groups = "sanity", dependsOnGroups = "smoke")
	private void tc05() {
		System.out.println("Method 5");

	}

	@Test(groups = "sanity", dependsOnGroups = "smoke")
	private void tc06() {
		System.out.println("Method 6");
	}

}
