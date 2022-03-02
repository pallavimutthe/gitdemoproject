
//from team member
package gitdemoproject;
import java.util.*;
public class carray {

	public static int solution(int[] A) {
		int unpaired;
		unpaired = A[0];

		for(int i=1; i< A.length; i++){
			unpaired = unpaired ^ A[i]; // xor
		}

		return unpaired;
	}
	public static void main(String[] args)
	{
		int arr[]= {9,3,9,3,9,7,9};
		System.out.println("Find unpaired number"+solution(arr));
		
}
	
	
	}
