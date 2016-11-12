public class BubSortList {
	//Max size of ArrayList will equal the size of Array
	public final int MAXSIZE = 10;

	//This will be the array for the list
	private int[] ray;

	//This will be the length of list
	private int nowLength;

	//The constructor for the Bubble Sort List
	public BubSortList() {
		ray = new int[MAXSIZE];
		nowLength = 0;
	}

	//Will be adding method
		public void add(int Item) {
			if (nowLength < MAXSIZE) {
				ray[nowLength] = Item;
				nowLength++;
			}
	}

	//The method for sorting thats being used
		public void sort() {
			for (int j = nowLength - 1; j > 1; j--) {
				for (int i = 0; i < j; i++) {
					if (ray[i] > ray[i+1]) {
						int tmp = ray [i];
						ray[i] = ray[i+1];
						ray[i+1] = tmp;
					}
				}
				print();
			}
	}