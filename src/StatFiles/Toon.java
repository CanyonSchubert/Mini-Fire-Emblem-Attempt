package StatFiles;

public class Toon {

	JobType job;
	StatPack stats;
	GrowthStat growth;
	Inventory items;
	
	public Toon() {
		job = null;
		stats = null;
		growth = null;
		items = null;
	}
	
	public Toon(JobType classOf, StatPack statsOf, GrowthStat growthOf, Inventory itemsOf) {
		job = classOf;
		stats = statsOf;
		growth = growthOf;
		items = itemsOf;
	}	
}
