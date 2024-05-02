package customerservicemanagement;

public enum ServicePlan {
	SILVER(1000), GOLD(2000), DIAMOND (5000), PLATINUM (10000);
	
	private double regiAmount;

	private ServicePlan(double regiAmount) {
		this.regiAmount = regiAmount;
	}

	public double getRegiAmount() {
		return regiAmount;
	}
	
	
}
