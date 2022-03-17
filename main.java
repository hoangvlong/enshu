public class main {
	public static void main(String[] args){
		double height ,weight , bmi;
		height = 73;
		weight = 1.73;
		bmi = height / (weight*weight);
		System.out.println( "BMI:" + String.format("%.1f", bmi) );
	}
}
