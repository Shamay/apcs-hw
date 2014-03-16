import java.util.Arrays;

public class QSortB{

	public static void QuickSort(int[] a, int L,  int H){
	    if(H-L < 1){
		return;
	    }else{
		//  pivot is leftmost element
		int count = L+1;
		int pivot = a[L];
		//  2. partition array about pivot
		for(int x = L + 1; x <= H; x++){
		    if(a[x] < pivot){
			int temp = a[count];
			a[count] = a[x];
			a[x] = temp;
			count++;	    
		    }
		}
		// switches pivot with the last switched element
		a[L] = a[count - 1];
		a[count - 1] = pivot;
		
		
		int lWall = count;
		// GROUP all the pivots
		for(int x = count;x<=H;x++){
		    if(a[x] == pivot){
			int temp = a[count];
			a[count] = a[x];
			a[x] = temp;
			count++;	    
		    }
		}
		//  4. quickselect
		QuickSort(a,L,((count+lWall)/2) - 1);
		System.out.println(Arrays.toString(a));
		QuickSort(a,(count+lWall)/2,H);
		System.out.println(Arrays.toString(a));
	    }
	}

    // median of medians
    public static int pivotPicker(int[] a){
	int[] medianList = new int[(a.length / 5)];
	int index = 0;
	for(int x = 0; x < a.length / 5; x++){
	    medianList[index] = QuickSelect(a,x*5,((x+1)*5) - 1, 2);
	    index++;
	}
	int middle = (medianList.length - 1) / 2;
	int pivot = QuickSelect(medianList,0,medianList.length - 1, middle);
	for(int x = 0; x<a.length;x++){
	    if(a[x] == pivot){
		return x;
	    }
	}
	return 0;
    }

    public static int QuickSelect(int[] a, int L,  int H, int k){
	if(L >= H){
	    return H;
	}else{
	//  pivot is leftmost element
	    int count = 1;
	    int pivot = a[L];
	//  2. partition array about pivot
     	    for(int x = L; x <= H; x++){
		if(a[x] <= pivot){
		    int temp = a[count];
		    a[count] = a[x];
		    a[x] = temp;
		    count++;	    
		}
	    }
	    // switches pivot with the last switched element
	    a[L] = a[count - 1];
	    a[count - 1] = pivot;
	//  3. check to see if we're done
	    if(count - 1 == k){
		return pivot;
	    }else if (count - 1 > k){
	//  4. quickslect(the side that does the answer)
		QuickSelect(a,L,count-1,k);
	    }else{
		QuickSelect(a,count-1,H,k);
	    }
	    return -1; //failed
	}
    }


        public static void main(String[] args){
	    int [] a = {22,55,66,11,32,56,67,89,95,10};   
	    QuickSort(a,0,a.length-1);
	}


}
