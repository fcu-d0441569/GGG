
public class Main {

	public static void main(String[] args) {
		
		Stratege stratege = new Stratege();
		BubbleSort bubblesort = new BubbleSort();
		SelectionSort selectionSort = new SelectionSort(); 
		QuickSort quickSort = new QuickSort();
		stratege.doSort(quickSort);
	}

}
