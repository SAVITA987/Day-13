package sample;
import java.util.Optional;
class FindMax {

	public static <T extends Comparable<T>> T testMaximum(T x, T y, T z) {
	        T max = x;

	        if (y.compareTo(max) > 0) {
	            max = y;
	        }

	        if (z.compareTo(max) > 0) {
	            max = z;
	        }

	        return max;
	    }

	    public static <T extends Comparable<T>> void printMax(T max) {
	        System.out.println("Maximum value: " + max);
	    }

	    public static void main(String[] args) {

	        Integer intResult1 = testMaximum(10, 5, 8);
	        System.out.println("TC 1.1 - " + intResult1);
	        printMax(intResult1);

	        Integer intResult2 = testMaximum(5, 10, 8);
	        System.out.println("TC 1.2 - " + intResult2);
	        printMax(intResult2);

	        Integer intResult3 = testMaximum(8, 5, 10);
	        System.out.println("TC 1.3 - " + intResult3);
	        printMax(intResult3);
	        
	        Float floatResult1 = testMaximum(10.5f, 5.3f, 8.7f);
	        System.out.println("TC 2.1 - " + floatResult1);
	        printMax(floatResult1);

	        Float floatResult2 = testMaximum(5.3f, 10.5f, 8.7f);
	        System.out.println("TC 2.2 - " + floatResult2);
	        printMax(floatResult2);

	        Float floatResult3 = testMaximum(8.7f, 5.3f, 10.5f);
	        System.out.println("TC 2.3 - " + floatResult3);
	        printMax(floatResult3);

	        String strResult1 = testMaximum("Apple", "Peach", "Banana");
	        System.out.println("TC 3.1 - " + strResult1);
	        printMax(strResult1);

	        String strResult2 = testMaximum("Peach", "Banana", "Apple");
	        System.out.println("TC 3.2 - " + strResult2);
	        printMax(strResult2);

	        String strResult3 = testMaximum("Banana", "Apple", "Peach");
	        System.out.println("TC 3.3 - " + strResult3);
	        printMax(strResult3);

	        MaxFinderGeneric<String> maxFinderGeneric = new MaxFinderGeneric<>("Apple", "Peach", "Banana");
	        maxFinderGeneric.testMaximum();
	    }
	}

	class MaxFinderGeneric<T extends Comparable<T>> {

	    private T x, y, z;

	    public MaxFinderGeneric(T x, T y, T z) {
	        this.x = x;
	        this.y = y;
	        this.z = z;
	    }

	    public void testMaximum() {
	        T max = FindMax.testMaximum(x, y, z);
	        System.out.println("Generic Class - " + max);
	        FindMax.printMax(max);
	    }
	}

