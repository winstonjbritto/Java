package com.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.src.StringUtil;

public class StringUtilTest {

	private static StringUtil targetClass;

	@BeforeClass
	public static void init() throws Throwable {
		targetClass = new StringUtil();
	}

	@Test
	public final void testExecuteNormal1() throws Throwable {
		String sourceStr = "It is a sample for search string. This sample gives index position and number of occurance";
		String findStr = "sample";

		Integer idxOccurCnt = targetClass.searchString(sourceStr, findStr);
		Integer expIdxOccurCnt = 2;

		Assert.assertNotNull(idxOccurCnt);
		Assert.assertEquals(expIdxOccurCnt, idxOccurCnt);
	}

	@Test
	public final void testExecuteNormal2() throws Throwable {
		String revStrContent = "Print the string reverse format";
		String revStr = targetClass.reverseString(revStrContent);

		String expRevString = "tamrof esrever gnirts eht tnirP";
		Assert.assertNotNull(revStr);
		Assert.assertEquals(expRevString, revStr);
	}

	@Test
	public final void testExecuteNormal3() throws Throwable {
		String subContent = "Get the sub content from the main content by index";
		String subStr = targetClass.subString(subContent, 4, 19);

		String expSubStr = "the sub content";
		Assert.assertNotNull(subStr);
		Assert.assertEquals(expSubStr, subStr);
	}
}