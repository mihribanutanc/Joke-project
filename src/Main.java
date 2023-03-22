import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {

		System.out.println("Hello world!");
	}

	public static Collection<String> mapToUpperCase(String... names){
		return Arrays.stream(names).map(name->name.toUpperCase()).collect(Collectors.toList());
	}
}