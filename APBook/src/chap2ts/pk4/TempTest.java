package chap2ts.pk4;
import java.io.IOException;

public class TempTest {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter temperature scale:");
		String tempScale = System.in.toString();
		System.out.println("Enter number of degrees: ");
		double tempDegrees = (double) System.in.read();
		
		if (Temperature.isValidTemp(tempDegrees, tempScale)){
			Temperature t = new Temperature (tempDegrees, tempScale);
			System.out.println("Valide Temp: " + t.toString());
		}
		else {
			System.out.println("Invalide Temp");
		}
		
		Temperature t = new Temperature(tempDegrees, tempScale);
		if (!t.isValidTemp(tempDegrees, tempScale)){
			System.out.println("Invalide Temp ");
		}
		else
			System.out.println("Valide Temp: " + t.toString());
			
	}

}
