package InterviewCoding.codes;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class SummuryStatistics {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1,2,3,4);
		IntSummaryStatistics res=numbers.stream().mapToInt(x->x.intValue()).summaryStatistics();
		System.out.println(res);

	}
}
//summaryStatistics provides a summary (max, min, average, sum, count) for a stream of integers.