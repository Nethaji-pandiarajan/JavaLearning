import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamslearning {
	
	public static void main(String[] args) {
		
		// Example for Map :
		//Stream<String> fruits = Stream.of("Apple","Bannana","Grapes","Jackfruit");
		//List<String> count =  fruits.map(s-> s.toUpperCase()).collect(Collectors.toList());
		//List<Integer> count1 = fruits.map(String::length).collect(Collectors.toList());
		//System.out.println(count);
		
		// Example for Flat Map :
		
		List<Integer> odd = Arrays.asList(1,3,5,7,9);
		List<Integer> even = Arrays.asList(2,4,6,8);
		
		List<List<Integer>> oddeven = Arrays.asList(odd,even);
		
		List<Integer> flattenList = oddeven.stream().flatMap(s->s.stream()).collect(Collectors.toList());
				
		System.out.println(flattenList);
		
	}

}
