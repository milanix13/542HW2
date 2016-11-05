import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTest {

	// BVA Test Case 1
    @Test
    public void testBinarySearchTC1() {
    	int[] a = {};
    	int v = 334635;

    	BinarySearch bs = new BinarySearch();
    	assertEquals(-1, bs.binarySearch(a, v));
    }

	// BVA Test Case 2
    @Test
    public void testBinarySearchTC2() {
    	int[] a = { 12345 };
    	int v = 334635;
    	int r;

    	BinarySearch bs = new BinarySearch();
    	r = bs.binarySearch(a, v);

    	assertTrue("result not between -1 and " + Integer.MAX_VALUE, r >= -1 && r <= Integer.MAX_VALUE  );
    }

	// BVA Test Case 3
    @Test
    public void testBinarySearchTC3() {
    	int[] a = new int[327];
    	int v = Integer.MIN_VALUE;
    	int r;

    	for (int i = 0; i < a.length; i++) {
    		a[i] = i + 1;
    	}

    	BinarySearch bs = new BinarySearch();
    	r = bs.binarySearch(a, v);

    	assertTrue("result not between -1 and " + Integer.MAX_VALUE, r >= -1 && r <= Integer.MAX_VALUE  );
    }

	// BVA Test Case 4
    @Test
    public void testBinarySearchTC4() {
    	int[] a = new int[327];
    	int v = Integer.MIN_VALUE  + 1;
    	int r;

    	for (int i = 0; i < a.length; i++) {
    		a[i] = i + 1;
    	}

    	BinarySearch bs = new BinarySearch();
    	r = bs.binarySearch(a, v);

    	assertTrue("result not between -1 and " + Integer.MAX_VALUE, r >= -1 && r <= Integer.MAX_VALUE  );
    }

	// BVA Test Case 5
    @Test
    public void testBinarySearchTC5() {
    	int[] a = new int[327];
    	int v = 334635;
    	int r;

    	for (int i = 0; i < a.length; i++) {
    		a[i] = i + 1;
    	}

    	BinarySearch bs = new BinarySearch();
    	r = bs.binarySearch(a, v);

    	assertTrue("result not between -1 and " + Integer.MAX_VALUE, r >= -1 && r <= Integer.MAX_VALUE  );
    }

	// BVA Test Case 6
    @Test
    public void testBinarySearchTC6() {
    	int[] a = new int[327];
    	int v = Integer.MAX_VALUE - 1;
    	int r;

    	for (int i = 0; i < a.length; i++) {
    		a[i] = i + 1;
    	}

    	BinarySearch bs = new BinarySearch();
    	r = bs.binarySearch(a, v);

    	assertTrue("result not between -1 and " + Integer.MAX_VALUE, r >= -1 && r <= Integer.MAX_VALUE  );
    }

	// BVA Test Case 7
    @Test
    public void testBinarySearchTC7() {
    	int[] a = new int[327];
    	int v = Integer.MAX_VALUE;
    	int r;

    	for (int i = 0; i < a.length; i++) {
    		a[i] = i + 1;
    	}

    	BinarySearch bs = new BinarySearch();
    	r = bs.binarySearch(a, v);

    	assertTrue("result not between -1 and " + Integer.MAX_VALUE, r >= -1 && r <= Integer.MAX_VALUE  );
    }

}
