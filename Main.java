
public class Main {
public static void main(String [] args){
	
	
	int [] v = {5,4,3,200,1};
	
	
	BubbleSort b = new BubbleSort();
	SelectionSort s = new SelectionSort();
	insertionSort i = new insertionSort();
	mergeSort m = new mergeSort();
	QuickSort q = new QuickSort();
	
	b.sort(v);
	s.sort(v);
	i.sort(v);
	m.sort(v);
	q.sort(v);
	
	System.out.println("Bubble");
	b.print(v);
	System.out.println("Selection");
	s.print(v);
	System.out.println("Insertion");
	i.print(v);
	System.out.println("Merge");
	m.print(v);
	System.out.println("Quick");
	q.print(v);
	
	}
}
