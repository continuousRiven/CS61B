public class IntList {
	public int first;
	public IntList rest;

	public IntList(int f, IntList r) {
		first = f;
		rest = r;
	}

	/** Return the size of the list using... recursion! */
	public int size() {
		if(this.rest == null) {
			return 1;
		}
		else return 1 + this.rest.size();
	}

	/** Return the size of the list using no recursion! */
	public int iterativeSize() {
		IntList p = this;
		int totalSize = 0;
		while (p != null) {
			p = p.rest;
			totalSize = totalSize + 1;
		}
		return totalSize;
	}

	/** Returns the ith value in this list.*/
	public int get(int i) {
		if(i==0) {
			return this.first;
  		}
		else return this.rest.get(i-1);
	}

	public static void main(String[] args) {
		IntList L = new IntList(25, null);
		L = new IntList(20, L);
		L = new IntList(15, L);
		L = new IntList(10, L);
		L = new IntList(5, L);

		System.out.println(L.iterativeSize());
		System.out.println(L.size());
		System.out.println(L.get(4));
	}
} 
