import java.util.Arrays;

public class QSort{

	public static void QuickSort(int[] a, int L,  int H){
	if(H-L < 2){
	    return;
	}else{
	//  pivot is leftmost element
	    int count = L+1;
	    int pivot = a[L];
	//  2. partition array about pivot
	    for(int x = L + 1; x <= H; x++){
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
	    System.out.println(Arrays.toString(a));
	//  4. quickselect
	    QuickSort(a,L,count-1);
            QuickSort(a,count,H);
	}
    }
       
        public static void main(String[] args){
	    int [] a = {22,55,66,11,32,56,67,89,95,10};   
	    QuickSort(a,0,a.length-1);
	}


}
