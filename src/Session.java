public class Session {

	private double arrivalTime;
	private double backEndCompletionTime;
	private double frontEndCompletionTime;
	private double thinkTimeCompletionTime;
	private double systemDepartureTime;
	private int requestNumber;
	//private boolean completed;

	public Session() {

		arrivalTime = Double.MAX_VALUE;
		backEndCompletionTime = Double.MAX_VALUE;
		frontEndCompletionTime = Double.MAX_VALUE;
		thinkTimeCompletionTime = Double.MAX_VALUE;
		systemDepartureTime = Double.MAX_VALUE;
		requestNumber = 0;
		//completed = false;

	}

	public double getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(double arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public double getBackEndCompletionTime() {
		return backEndCompletionTime;
	}

	public void setBackEndCompletionTime(double backEndCompletionTime) {
		this.backEndCompletionTime = backEndCompletionTime;
	}

	public double getFrontEndCompletionTime() {
		return frontEndCompletionTime;
	}

	public void setFrontEndCompletionTime(double frontEndCompletionTime) {
		this.frontEndCompletionTime = frontEndCompletionTime;
	}

	public double getThinkTimeCompletionTime() {
		return thinkTimeCompletionTime;
	}

	public void setThinkTimeCompletionTime(double thinkTimeCompletionTime) {
		this.thinkTimeCompletionTime = thinkTimeCompletionTime;
	}

	public double getSystemDepartureTime() {
		return systemDepartureTime;
	}

	public void setSystemDepartureTime(double systemDepartureTime) {
		this.systemDepartureTime = systemDepartureTime;
	}

	public int getRequestNumber() {
		return requestNumber;
	}

	public void setRequestNumber(int requestNumber) {
		this.requestNumber = requestNumber;
	}

//	public boolean isCompleted() {
//		return completed;
//	}
//
//	public void setCompleted(boolean completed) {
//		this.completed = completed;
//	}

	public double minEventTime() {
		double ret = 0;
		if (backEndCompletionTime <= frontEndCompletionTime) {
			ret = backEndCompletionTime;
		} else {
			ret = frontEndCompletionTime;
		}
		if (ret <= thinkTimeCompletionTime) {
			return ret;
		} else {
			return thinkTimeCompletionTime;
		}

	}

}
