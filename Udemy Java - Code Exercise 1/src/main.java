
public class main {

	public static void main(String[] args) {
		
		SpeedConverter f = new SpeedConverter();
		
		double kiloMetersPerHour = 10.25;
		
		f.printConversion(f.toMilesPerHour(kiloMetersPerHour));
		
		MegaBytesConverter e = new MegaBytesConverter();
		
		int kiloBytes = -7;
		
		e.printMegaBytesAndKiloBytes(kiloBytes);
	}

}
