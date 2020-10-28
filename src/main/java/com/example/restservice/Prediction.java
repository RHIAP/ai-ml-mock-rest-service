package com.example.restservice;

public class Prediction {
	
	private final long predictionId;
	private final String prediction;
	private final String loanDetails;

	public Prediction(LoanApplication loanData) {
		this.predictionId = (int) (Math.random() * 100);
		this.loanDetails = loanData.toString();
		this.prediction = makePrediction(loanData);
	}

	public long getPredictionId() {
		return predictionId;
	}

	public String getLoanDetails() {
		return loanDetails;
	}

	public String getPrediction() {
		return prediction;
	}
	
	static String makePrediction(LoanApplication loanData) {
		return answers[(int) (Math.random() * answers.length)];
	}
	
	static String[] answers = new String[] {
			"Don’t count on it.",
			"It is certain.",
			"It is decidedly so.",
			"Most likely.",
			"My reply is no.",
			"My sources say no.",
			"Outlook not so good.",
			"Outlook good.",
			"Reply hazy, try again.",
			"Signs point to yes.",
			"Very doubtful.",
			"Without a doubt.",
			"Yes.",
			"Yes – definitely.",
			"You may rely on it."
	};

}
