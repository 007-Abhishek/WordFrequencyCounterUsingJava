import java.util.*;
public class wordFrequencyCounter {

	public static void main(String[] args) {
		List<String> names = List.of("Sophia","SOPHIA","William","Jacob","William",
				"Emma","Isabella","William","Sophia","Olivia","Isabella","William",
				"Sophia");
		System.out.println(wordCounter(names));
		}
	
		public static String wordCounter(List<String> words) {
			Map<String,Integer> countMap = new HashMap<>();
			
			for(String name : words) {
				countMap.compute(name, (k,v) -> v==null ? 1 :v+1);
			}
			
			StringBuilder stringBuilder = new StringBuilder();
			for (Map.Entry<String, Integer> entry :countMap.entrySet()) {
	            stringBuilder.append(entry);
	            stringBuilder.append("\n");
	        }
			return stringBuilder.toString();
		}

}
