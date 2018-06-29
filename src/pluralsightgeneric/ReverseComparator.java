package pluralsightgeneric;

import java.util.Comparator;

public class ReverseComparator<T> implements Comparator<T> {
	
	
	private Comparator<T> delegateComparator;
	

	public ReverseComparator(Comparator<T> delegateComparator) {
		super();
		this.delegateComparator = delegateComparator;
	}


	@Override
	public int compare(T o1, T o2) {
		// TODO Auto-generated method stub
		 return -1* delegateComparator.compare(o1, o2);
	}


	

}
