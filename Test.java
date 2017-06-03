class Test {
	static public void main (String[] arg){
		for (int i = 1 ; i <= 100; i++){
			int three = i%3;
			int five = i%5;
			if (three == 0 && five == 0) {
				System.out.println("FizzBuzz");
			} else if (three == 0 && contains(i,3)){
				System.out.println("Fizz");
			} else if (five == 0 && contains(i,5)){
				System.out.println("Buzz");
			} else {
				System.out.println(i);

			}

		}
	}
	static boolean contains (int digit,int num){
		return Integer.toString(digit).contains(Integer.toString(num));
	}
}