package com.example;

import javax.ejb.Stateless;

@Stateless
public class AtmVerify implements AtmVerifyRemote {

	@Override
	public boolean isValid(String card) {
		Integer val = Integer.parseInt(card);
		if (val % 2 == 0)
			return false;
		else
			return true;
	}

}
