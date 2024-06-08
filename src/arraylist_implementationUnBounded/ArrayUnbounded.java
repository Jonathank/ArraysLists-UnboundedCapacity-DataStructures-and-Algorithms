package arraylist_implementationUnBounded;

public class ArrayUnbounded<E> implements List<E> {
	private int size = 0;
	private E data[];
	private static final int CAPACITY = 3;
	
	//default array capacity of 3
	public ArrayUnbounded(){
		this(CAPACITY);
	}
//constructs an array with defined user capacity
	@SuppressWarnings("unchecked")
	public ArrayUnbounded(int capacity) {
		data = (E[]) new Object[capacity];
	}
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return (size == 0);
	}
	/*
	 * utility method to check the index if its in range with
	 * the size of the array
	 */
	protected void checkindex(int index, int size) throws IndexOutOfBoundsException {
		try {
			if(index > size||index < 0) {
				throw new IndexOutOfBoundsException();
			}
		}catch(IllegalStateException e) {
			e.printStackTrace();
		}
	}

	@Override
	public E get(int index) {
		checkindex(index,size);
		E val = data[index];
		return val;
	}

	@Override
	public E set(int index, E value) {
		checkindex(index,size);
		E  val = data[index];
		data[index] = value;
		
		return val;
	}
	//
	/*
	 * resize method for creating anew array twice size of current array
	 * 
	 */
	@SuppressWarnings("unchecked")
	protected void resize(int capacity) {
		E temp[] = (E[]) new Object[capacity]; 
		for(int k =0; k < size;k++) {
			temp[k] = data[k];
			data = temp;
		}
	}

	@Override
	public void add(int index, E value) {
		checkindex(index,size +1);
		/*
		 * /checks if array is full, if so, its grown to twice its size 
		 * and assigned as anew array wich as well is initilaized(referenced) back
		 * to old array
		 */
		if(size == data.length) 
			resize(2*data.length);
		
		
		
		for(int k = size-1; k >= index;k--) {
			data[k+1] = data[k];
			data[index] = value;
		}
		size++;
	}

	@Override
	public E remove(int index) {
		checkindex(index,size);
		
		E val = data[index];
		for(int k = index; k < size-1;k++ ) {
			data[k] = data[k+1];
			data[size-1] = null;
		}
		size--;
		return val;
	}
	@Override
	public void addnew(E e) {
		if(size == data.length) {
			resize(2*data.length);
		}
		data[size] = e;
		size++;
		
	}

}
