public class Statistics {
	private double averagePopulationInQueue;
	private double utilization;
	private double averagedPopulation;
	private double ResidenceTime;

	public Statistics(double averagePopulationInQueue, double utilization,
			double averagedPopulation) {
		super();
		this.averagePopulationInQueue = averagePopulationInQueue;
		this.utilization = utilization;
		this.averagedPopulation = averagedPopulation;
		
	}

	
	public double getAveragedPopulation() {
		return averagedPopulation;
	}

	public void setAveragedPopulation(double averagedPopulation) {
		this.averagedPopulation = averagedPopulation;
	}

	public double getAveragePopulationInQueue() {
		return averagePopulationInQueue;
	}

	public void setAveragePopulationInQueue(double averagePopulationInQueue) {
		this.averagePopulationInQueue = averagePopulationInQueue;
	}

	public double getUtilization() {
		return utilization;
	}

	public void setUtilization(double utilization) {
		this.utilization = utilization;
	}

}
