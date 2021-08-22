package homework;

import java.util.Stack;

import co.jacob.Thread.Coin;

public class CoinStack {
	public static void main(String[] args) {
		
		Stack<Coin> coinBox = new Stack<Coin>();
		//push -> add addfirst addlast
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(60));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(80));
		
		while(!coinBox.isEmpty()) {
			//pop ->get + remove, removefirst, removelast
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}
	}
	
}
