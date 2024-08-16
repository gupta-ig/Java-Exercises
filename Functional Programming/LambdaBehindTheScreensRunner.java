package functional;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

class EvenNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer number) {
		// TODO Auto-generated method stub
		return number %2 == 0;
	}
	
}

class SystemOutConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer number) {
		// TODO Auto-generated method stub
		System.out.println(number);
	}
	
}

class NumberSquareMapper implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer number) {
		// TODO Auto-generated method stub
		return number * number;
	}
	
}

public class LambdaBehindTheScreensRunner {

	public static void main(String[] args) {
		//1.Storing functions in variables
		//2.Passing functions to methods
		//3.Returning functions from methods
		
		Predicate<? super Integer> evenPredicate = n -> n%2 == 0;
		Predicate<? super Integer> oddPredicate = n -> n%2 != 0;
		
		List.of(23, 43, 34, 45, 36, 48).stream().filter(evenPredicate).forEach(e -> System.out.println(e));
		
		List.of(23, 43, 34, 45, 36, 48).stream().filter(new EvenNumberPredicate()).forEach(new SystemOutConsumer());
		
		List.of(23, 43, 34, 45, 36, 48).stream().filter(new EvenNumberPredicate()).map(new NumberSquareMapper()).forEach(new SystemOutConsumer());
		
		
		//.filter(new EvenNumberPredicate())
		//Stream<T> filter(Predicate<? super T> predicate);
		//boolean test(T t);
		
		//.forEach(new SystemOutConsumer())
		//void forEach(Consumer<? super T> action);
		//void accept(T t);
		
		//.map(n -> n*n)
		//<R> Stream<R> map(Function<? super T, ? extends R> mapper);
		// R apply(T t);
	}

}
