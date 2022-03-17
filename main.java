import java.util.*;
public class main {
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		double height ,weight , bmi;
		int i;
		for( i = 0 ; i < 2 ; i++ ){	
                	height = stdin.nextDouble();
			weight = stdin.nextDouble();
			bmi = height / (weight*weight);
			System.out.println( "BMI:" + String.format("%.1f", bmi) );
		}
	}
}
