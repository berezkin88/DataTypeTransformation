package com.javaTasks;

import java.util.logging.Logger;

public class DigitsSum {
	private static Logger log = Logger.getLogger(DigitsSum.class.getName());
	Integer origin;
	int result = 0;

	public DigitsSum(Integer origin) {
		this.origin = origin;
	}

	public static void main(String[] args) {
		DigitsSum ds = new DigitsSum(12345);

		log.info("" + ds.sumStr());
		ds.result = 0;
		log.info("" + ds.sum());
	}

	public int sum() {

		if (origin == 0) {
			return result += 0;
		} else {
			result += origin % 10;
			origin = origin / 10;
			sum();
		}

		return result;
	}

	public int sumStr() {
		String or = origin.toString();

		for (int i = or.length() - 1; i >= 0; i--) {
			result += Character.getNumericValue(or.charAt(i));
		}

		return result;
	}
}
