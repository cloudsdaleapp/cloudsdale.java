package org.cloudsdale.responses;

import org.cloudsdale.models.User;

import java.util.List;

public class UserResponse extends Response {

	private User		result;
	private List<User>	results;

	public User getResult() {
		return result;
	}

	public void setResult(User result) {
		this.result = result;
	}

	public List<User> getResults() {
		return results;
	}

	public void setResults(List<User> results) {
		this.results = results;
	}
}
