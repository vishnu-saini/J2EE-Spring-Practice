package com.example;

import javax.ejb.Remote;

@Remote
public interface AtmVerifyRemote {

	public boolean isValid(String card);
}
