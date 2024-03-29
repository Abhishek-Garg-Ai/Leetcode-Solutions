// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
	Iterator<Integer> itr;
    int nextVal;
    public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        itr=iterator;
        if(itr.hasNext()) nextVal=itr.next();
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return nextVal;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        int ans=nextVal;
        if(itr.hasNext()) nextVal=itr.next();
	    else nextVal=-1;
        return ans;
	}
	
	@Override
	public boolean hasNext() {
	    return nextVal!=-1;
	}
}