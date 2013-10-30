package com.test;

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
		targetClass.searchString(sourceStr, findStr);
	}

	@Test
	public final void testExecuteNormal2() throws Throwable {
		String revStrContent = "Print the string reverse format";
		targetClass.reverseString(revStrContent);
	}

	@Test
	public final void testExecuteNormal3() throws Throwable {
		String subContent = "Get the sub content from the main content by index";
		targetClass.subString(subContent, 4, 19);
	}
}