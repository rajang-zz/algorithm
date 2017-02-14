import java.util.Scanner;

class MergeSort{
	
	
	
	public static void merge(int[] data,int[] aux, int lo,int mid,int hi){
		
		int i = lo;
		int j=mid+1;
		int k=lo;
		
		for(int ci=lo; ci<= hi; ci++)
			aux[ci] = data[ci];
		
		while(k <= hi){

			
			if(j > hi) 
				data[k++] = aux[i++];
			else if( i > mid)
				data[k++] = aux[j++];
			else if(aux[i] < aux[j]) 
				data[k++] = aux[i++];
			else 
				data[k++] = aux[j++];
			
		}
		
	}
		
	public static void sort(int[] data, int[] aux, int lo, int hi){
		
		if(lo == hi) return;
		int mid =(lo+hi)/2;
		sort(data,aux,lo,mid);
		sort(data,aux,mid+1,hi);
		merge(data,aux,lo,mid,hi);
		
	}
		
		
	

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the data size : ");
		int len = scanner.nextInt();
		int[] dat = new int[len];
		
		System.out.println("Enter the data : ");
		
		for(int i=0; i<len;i++)
			
			dat[i] = scanner.nextInt();
		
		
		//int[] data = {44,3,11,9,55,6,33,45,0,34};
		int[] aux = new int[len];
		
		sort(dat,aux,0,len-1);
		
		for(int p:dat)
			System.out.println(p);
		
		
	}
	
}