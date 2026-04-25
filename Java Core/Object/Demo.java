// class Calculator {
//   public int add(int num1, int num2) {
//     int result = num1 + num2;
//     return result;
//   }
// }
// class Demo {
//   public static void main (String[] args) {
//     Calculator cal = new Calculator();
//     int result = cal.add(5, 10);
//     System.out.println(result);
//   }
// }

class Computer {
	public void playMusic() {
		System.out.println("Music playing...");
	}

	public String getMeAPen(int cost) {
		if (cost >= 10)
			return "Pen";
		else {
			return "Nothing";
		}
	}
}

class Demo {
	public static void main(String[] args) {
		Computer obj = new Computer();
		obj.playMusic();
		String src = obj.getMeAPen(10);
		System.out.println(src);
	}
}
