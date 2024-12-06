package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners;

import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.stringreturners.StringStringReturner;

/**
 * Returner for BuzzString
 */
@Service
public class BuzzStringReturner implements StringStringReturner {

	/**
	 * @return String
	 */
	public String getReturnString() {
		final String myString = String.formatted("%s", com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.Constants.BUZZ);
		return new String(myString);
	}

}