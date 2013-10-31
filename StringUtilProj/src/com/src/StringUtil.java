package com.src;

import java.util.ArrayList;

public class StringUtil {

	public Integer searchString(String sourceStr, String findStr) {
		int idxOccurCnt = 0;
		if (sourceStr != null && !sourceStr.isEmpty() && findStr != null
				&& !findStr.isEmpty()) {
			boolean finishFlg = false;
			int startIdx = 0;
			int findStrLen = findStr.length();
			ArrayList<Integer> idxOccurList = new ArrayList<Integer>();

			while (!finishFlg) {
				int indexPos = sourceStr.indexOf(findStr, startIdx);
				if (indexPos != -1) {
					idxOccurList.add(indexPos);
					idxOccurCnt++;
					startIdx += indexPos + findStrLen;
				} else {
					finishFlg = true;
					break;
				}
			}

			System.out.println("Index positions of find string");
			for (Integer idxOccur : idxOccurList) {
				System.out.println(idxOccur);
			}
			System.out.println("No. of occurance in the source stirng: "
					+ idxOccurCnt);
		}
		return idxOccurCnt;
	}

	public String reverseString(String strContent) {
		String revContent = "";
		if (strContent != null && !strContent.isEmpty()) {
			for (int i = strContent.length() - 1; i >= 0; i--) {
				revContent += strContent.charAt(i);
			}
		}
		System.out.println(revContent);
		return revContent;
	}

	public String subString(String content, int startIdx, int endIdx) {
		String subStrContent = "";
		if (content != null && !content.isEmpty() && startIdx < endIdx) {
			for (int i = startIdx; i < endIdx; i++) {
				subStrContent += content.charAt(i);
			}
		}
		System.out.println(subStrContent);
		return subStrContent;
	}
}
