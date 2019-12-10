import java.util.*;
import java.util.stream.Collectors;

public class StreamsWithFilteringMap {

	public static void main(String[] args) {

		Map<String, List<String>> phoneNumbers = new LinkedHashMap<String, List<String>>();
		phoneNumbers.put("John Lawson", Arrays.asList("3232312323", "8933555472"));
		phoneNumbers.put("Mary Jane", Arrays.asList("12323344", "492648333"));
		phoneNumbers.put("Lou Mary", Arrays.asList("77323344", "938448333"));

		Map<String, List<String>> filteredNumbers = phoneNumbers.entrySet().stream()
				.filter(x -> x.getKey().contains("Mary") && x.getKey().startsWith("Mary")).collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));

		filteredNumbers.forEach((key, value) -> {
			System.out.println("Name: " + key + ": ");
			value.forEach(System.out::println);
		});

	}
}