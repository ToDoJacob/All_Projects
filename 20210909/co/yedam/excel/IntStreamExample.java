package co.yedam.excel;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class IntStreamExample {

	public static void main(String[] args) {
		IntStream is = IntStream.rangeClosed(1, 10);
		
		is
		.filter(n -> n >= 5)
//		.filter(new IntPredicate() {
//			@Override
//			public boolean test(int value) {
//				return value >= 5;
//			}
//		})
		.forEach(value -> System.out.println(value));
//		.forEach(new IntConsumer() {
//			@Override
//			public void accept(int value) {
//				System.out.println(value);
//			}
//		});
		
	}

}
