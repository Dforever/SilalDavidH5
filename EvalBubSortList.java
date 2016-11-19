import java.util.Random;

public class EvalBubSortList {
	public static void main(String arg[]) {
		//Will start to begin the random number generatror and load it
		Random rnd = new Random();

		//This will begin to load the new bubble sorted list
		BubSortList listSorted = new BubSortList();
		//This will make the list full of Random #'s
		for (int i = 0; i < listSorted.MAXSIZE; i++)
		{
					//This will create any number that is 20-100
					int numRandom = rnd.nextInt(100 - 20 + 1) + 20;
					//This will add item to the list
					listSorted.add(numRandom);
		}

		//This will print the whole list before the sorting
		System.out.println("Unsorted list");
		listSorted.print();

		//This will actually start the processing of sorting the list
		System.out.println("List is being Sorted..");
		listSorted.sort();

		//This will print the whole list completely sorted
		System.out.println("Complete List Sorted");
		listSorted.print();
		}
}


