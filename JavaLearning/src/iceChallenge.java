import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class iceChallenge {
	
	
	public static void main(String[] args) {
		
		// Given an array of n elements 
		int a[] = {2,5,8,9,3};
		
		// remove 2 element product is minimum in the array
		firstRemoval(a);
		
	}
	
	public static void firstRemoval(int[] arr) {
		int c= 0;
		List<int[]> list = Arrays.asList(arr);
		List<int[]> a = list.stream().sorted().collect(Collectors.toList());
		
		a.get(0);
		a.get(1);
		
		
		
		
		
		
		
		System.out.println(a + " " + b + " " );
		
		
	}
	
	

}
