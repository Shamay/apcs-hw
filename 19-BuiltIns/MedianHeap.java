import java.util.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianHeap{

    private PriorityQueue<Integer> minHeap, maxHeap;

    public MedianHeap(){
	Comparator<Integer> cmp = Collections.reverseOrder(null);  
	minHeap = new PriorityQueue<Integer>(11,cmp);
	maxHeap = new PriorityQueue<Integer>();
    }

    public void add(Integer n){
	if(minHeap.size() >= maxHeap.size()){
	    maxHeap.add(n);
	}else{
	    minHeap.add(n);
	}
    }

    public Integer findMedian(){
	if(minHeap.size() > maxHeap.size())
	    return minHeap.peek();
	else if(maxHeap.size() > minHeap.size())
	    return maxHeap.peek();
	else
	    return (minHeap.peek() + maxHeap.peek()) / 2;
    }

    public Integer removeMedian(){
	if(minHeap.size() > maxHeap.size())
	    return minHeap.poll();
	else if(maxHeap.size() > minHeap.size())
	    return maxHeap.poll();
	else
	    return (minHeap.poll() + maxHeap.poll()) / 2;
    }


}
