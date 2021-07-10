
public class ifExam {
	public static void main(String[] args) {
		int x = 40;
		int y = 50;
		if(x == y) {
			System.out.println("x라는 값과 y라는 값이 같다");
		} else if(x < y) {
			System.out.println("x라는 값보다 y라는 값이 더 크다");
		} else {
			System.out.println("x라는 값보다 y라는 값이 더 작다");
		}

// if문은 conditional statement으로 처음에 나오는 if 옆에 있는 condition이 충족된다면 그 아래의 source code가 실행이 된다. 하지만 condition이 충족되지
// 않는다면 그 다음의 else if문으로 넘어간다. else if문 옆에 있는 condition이 충족된다면 그 아래의 source code가 실행이 된다. 하지만 또 condition이 충족되지
// 않는다면 그 다음의 else문으로 넘어간다. else문은 if else문이랑 if문의 마지막 단계로 위 모든 if 옆에 있는 condition들이 충족되지 않는다면 마지막으로 실행이 
// 되는 source code이다.


		if (x == y)
			System.out.println("x라는 값과 y라는 값이 같다");
			System.out.println("{} Curly brackets이 사용이 안된다면 그 바로 다음의 source code만 실행이 된다");
// If문에서 curly brackets {}이 사용이 안된다면 바로 if문 다음에 있는 source code만 실행이 된다.	
	}
}