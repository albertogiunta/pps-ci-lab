
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *	This class shows the Magnificience of my writing style and knowledge of the java 8 environment
 *	
 **/
public class Alessandro{

	public Alessandro(final Integer length){
		final Map<Integer, String> m =
			IntStream.range(0, length+1).boxed()
				.collect(Collectors.toMap(k -> k, k -> "Alessandro"));
		
		System.out.println(m.toString());
	}

	public static void main(final String[] args){

		new Alessandro(101);
	}

}