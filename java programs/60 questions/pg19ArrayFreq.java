//program 19

//sort array elements by frequency and display the number with maximum count


import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class pg19ArrayFreq {
	public static void main(String[] args) {
        
		Scanner s=new Scanner(System.in);
        
	        System.out.println("Enter number of test cases:");
	        int n=s.nextInt();
        
        	for(int i=0;i<n;i++) {
	        	System.out.println("Enter number");
	        	HashMap<Integer,Integer> hm=new HashMap<>();
	        	int no=s.nextInt();
	        	int[] ar=new int[no];
	    	
	        	for(int j=0;j<no;j++) {
	        	    ar[j]=s.nextInt();
	        	}
	        
	        	Arrays.sort(ar);
	        	int max=0;
	        
	        	for(int k=0;k<ar.length;k++) {
	        		int count=0;
	        		for(int p=0;p<ar.length;p++) {
	        	        	if(ar[k]==ar[p]) {
	        	            		count++;
	        	        	}
            			}
	            
	            		hm.put(ar[k],count);
	            		if(count>max) {
	                		max=count;
	            		}
	        	}
	        
	        	Set<Integer> set=hm.keySet();
	        	for(int y=max;y>0;y--) {
	        		for(Integer l:set) {
	        			if(y==hm.get(l)) {
	        				for(int t=0;t<hm.get(l);t++) {
	        	        		System.out.print(l+" ");
	            			}
	            		}
	        	}
	        }
        }
        s.close();
    }
 }