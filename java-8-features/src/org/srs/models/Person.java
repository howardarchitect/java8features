package org.srs.models;

public class Person {
	private int personId;
    private String jobDescription;

    public Person(int personId, String jobDescription) {
        super();
        this.personId = personId;
        this.jobDescription = jobDescription;
    }

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
}
