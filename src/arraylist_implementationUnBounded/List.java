package arraylist_implementationUnBounded;

public interface List<E> {
	int size();
	boolean isEmpty();
	E get(int index);
	E set(int index,E value);
	void add(int index, E value);
	E remove(int index);
	void addnew(E e);
}
