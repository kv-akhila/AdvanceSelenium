package sample;

import java.time.LocalDateTime;

public class demo {
	public static void main(String[] args) {
		System.out.println(LocalDateTime.now().toString().replace(':', '-'));
	}

}
