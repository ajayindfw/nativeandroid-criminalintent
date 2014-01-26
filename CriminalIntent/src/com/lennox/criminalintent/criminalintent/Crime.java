package com.lennox.criminalintent.criminalintent;

import java.util.UUID;

public class Crime {
	public String getTitle() {
		return mTitle;
	}

	public void setTitle(String title) {
		mTitle = title;
	}

	public UUID getId() {
		return mId;
	}

	private UUID mId;
	private String mTitle;
	
	public Crime()
	{
		mId = UUID.randomUUID();
	}
}
