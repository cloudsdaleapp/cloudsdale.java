package org.cloudsdale.responses;

import org.cloudsdale.models.Message;

import java.util.List;

public class MessageResponse extends Response {

	private Message			result;
	private List<Message>	results;

	public Message getResult() {
		return result;
	}

	public void setResult(Message result) {
		this.result = result;
	}

	public List<Message> getResults() {
		return results;
	}

	public void setResults(List<Message> results) {
		this.results = results;
	}
}
