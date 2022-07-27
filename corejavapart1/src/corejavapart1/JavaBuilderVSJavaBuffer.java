package corejavapart1;

public class JavaBuilderVSJavaBuffer {

	public static void main(String[] args) {
		long startingTime = System.currentTimeMillis();

		StringBuffer sbuffer = new StringBuffer("Hello"); for (int i = 0; i < 1000; i++) { sbuffer.append("Java"); }

		System.out.println("Time consumed by StringBuffer: "+(System.currentTimeMillis()-
startingTime)+"milliseconds"); startingTime = System.currentTimeMillis(); StringBuilder sbuilder = new StringBuilder("Hello");

		for (int i = 0; i < 1000; i++) { sbuilder.append("Java");

		System.out.println("Time consumed by StringBuilder:"+ (System.currentTimeMillis()-startingTime) + "milliseconds");

	}
	}

}
