package StatFiles;

public class Inventory {
	
	InvenItem slot1, slot2, slot3, slot4, slot5;
	
	public Inventory() {
		slot1 = null;
		slot2 = null;
		slot3 = null;
		slot4 = null;
		slot5 = null;
	}
	
	public Inventory(InvenItem item1) {
		slot1 = item1;
		slot2 = null;
		slot3 = null;
		slot4 = null;
		slot5 = null;
	}
	
	public Inventory(InvenItem item1, InvenItem item2) {
		slot1 = item1;
		slot2 = item2;
		slot3 = null;
		slot4 = null;
		slot5 = null;
	}
	
	//TODO: Other Constructors, Display Items, Get and Set Items, hasItem, Remove / Add Items
}
