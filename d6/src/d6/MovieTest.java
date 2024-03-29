package d6;

import java.util.Arrays;
import java.util.Comparator;

public class MovieTest {
	

	public static void main(String[] args) {

//		int[][] arr = {
//				{6,4,1},
//				{7,2,1},
//				{5,2,1},
//				{4,5,2},
//				{3,4,2},
//				{3,2,2} 
//				};
		Movie[] movies = new Movie[6];
		movies[0] = new Movie("A", 6, 4);
		movies[1] = new Movie("A", 7, 2);
		movies[2] = new Movie("A", 5, 2);
		movies[3] = new Movie("M", 4, 5);
		movies[4] = new Movie("M", 3, 4);
		movies[5] = new Movie("M", 3, 2);
		
		
		System.out.println(Arrays.toString(movies));
		
		//target
		Movie target = new Movie("", 4, 4);
		
		Arrays.sort(movies, (a, b) -> {
			
			System.out.println("-----------------");
			System.out.println(a);
			System.out.println(b);
			
			double disA =  a.calcDistance(target.action, target.kiss);
			double disB =  a.calcDistance(target.action, target.kiss);		
			
			return disA > disB ? 1: -1;
			
		});
		
		System.out.println(Arrays.toString(movies));

		
		
	}
}



