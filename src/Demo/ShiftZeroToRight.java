package Demo;

public class ShiftZeroToRight {

	public static void main(String[] args) {
		
		int ar[]= {1,2,0,3,4,0,0,5,6,0};
		int index =0;
		int ar1[] = new int[ar.length];
		
		for(int i=0; i<=ar.length-1;i++) {
			
			if(ar[i]!=0) {
				
				ar1[index]=ar[i];
				index++;
			}
		}
		for(int i=0; i<=ar1.length-1;i++) {
			
			System.out.println(ar1[i]+" ");
		}

	}

}
