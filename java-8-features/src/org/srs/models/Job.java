package org.srs.models;

public class Job {
	private int personId;
	private String description;

	public Job(int personId, String description) {
		super();
		this.personId = personId;
		this.description = description;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
