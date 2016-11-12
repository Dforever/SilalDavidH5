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