package com.codility;

class Solution {
	
	public int countDiv(int[] A) {
		printArray(A);
		// store the times of zero's occurrences
		int zeroCount = 0;
		int result = 0;
		for (int element : A) {
			if (element == 0)
				zeroCount++;
			// add the count of zero to the result when the car is traveling west
			if (element == 1 && zeroCount != 0)
				result += zeroCount;
			// the number of passing cars exceeds 1,000,000,000
			if (result > 1000000000)
				return -1;
		}
		return result;
//		int count = 0;
//		Map<Integer, Boolean> map = new HashMap <Integer, Boolean> ();
//		for (int i = 0; i < A.length; i++) {
//			if (i == (A.length - 1) && A[i] == 0) {
//
//			} else if (A[i] == 0) {
//				map.put(i, true);
//			}
//		}
//		System.out.println(map);
//		if (map.isEmpty()) {
//			return count;
//		} else {
//			for (Map.Entry<Integer, Boolean> entry : map.entrySet()) {
//				int startIndex = entry.getKey();
//				for (int i = startIndex; i < A.length; i++) {
//					if (A[i] == 1) {
//						count++;
//					}
//				}
//			}
//		}
//		return count;
	}
	
//	public int countDiv(int A, int B, int K) {
////		int count = 0;
////		for (int i = a; i <= b; i++) {
////			if (i % k == 0) {
////				count++;
////			}
////		}
////		return count;
//		
//		return (B/K) - (A/K) + (A%K == 0 ? 1 : 0);
//	}
	void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			String append = "";
			if( i != arr.length-1 ) {
				append = ",";
			}
			System.out.print(arr[i] + ""+append);
		}
		System.out.println();
	}
//	
//	public int frogRiverOne(int arr[], int x) {
//		int steps = x;
//		boolean[] flagArray = new boolean[steps + 1];
//		for (int i = 0; i < arr.length; i++) {
//			if (!flagArray[arr[i]]) {
//				flagArray[arr[i]] = true;
//				steps--;
//			}
//			if (steps == 0)
//				return i;
//		}
//		return -1;
//	}
//	
//	public int permutation(int arr[]) {
//		int permutation = 1;
//		Arrays.sort(arr);
//		for (int i = 0; i < arr.length; i++) {
//			if( arr[i] != (i+1)) {
//				permutation = 0;
//				break;
//			}
//		}
//		return permutation; 
//	}
//	
//	public int missingValues(int arr[]) {
//		int missingNumber = 0;
//		int sum = 0;		
//		int arrSum = 0;
//		for (int i = 0; i < arr.length; i++) {
//			sum +=(i+1);
//			arrSum += arr[i];
//		}
//		sum += arr.length+1;
//		missingNumber =  sum - arrSum;
//		return missingNumber; 
//	}
//	
//	public int forgJump(int x, int y, int d) {
//		int count = (y - x) / d; 
//		if ((y - x) % d != 0) 
//			count++; 
//		return count; 
////		int numberOfJumps = 0;
////		if (y > x) {
////			int distance = x + d;
////			while ((y + d) > distance) {
////				numberOfJumps++;
////				distance += d;
////			}
////		}
////		return numberOfJumps;
//	}
//
//	
//	public int tapeEqulibrim(int[] A) {
//		long diff = 0;
//
//		long bckSum = A[0];
//		long fwdSum = 0;
//
//		for (int i = 1; i < A.length; i++) {
//			fwdSum += A[i];
//		}
//		diff = Math.abs(bckSum - fwdSum);
//		if (A.length > 2) {
//			for (int i = 1; i < A.length - 1; i++) {
//				bckSum +=A[i];
//				fwdSum -=A[i];
//				long tmp = Math.abs(bckSum - fwdSum);
//				if( tmp < diff) {
//					diff = tmp;
//				}
//			}
//		}
//		return (int) diff;
//	}
//	
//	// Function to Solve for Minimum Absolute Difference (Tape Equilibrium)
//	public int tapeEqulibrim(int[] A) {
//		long lsum = A[0]; // Set Left Sum Equal to First Element
//		long rsum = 0; // Set Right Sum Equal to Zero
//		long diff = 0; // Variable to Hold Difference
//		// Set Right Sum to Sum of Rest of Values in Array
//		for (int i = 1; i < A.length; i++)
//			rsum += A[i];
//		diff = Math.abs(lsum - rsum); // Set Diff Equal to Absolute Difference of Left and Right Sums
//		// If More Elements
//		if (A.length > 2) {
//			// Update Left and Right Sums, and Difference (If Necessary)
//			for (int i = 1; i < A.length - 1; i++) {
//				lsum += A[i];
//				rsum -= A[i];
//				long tmp = Math.abs(lsum - rsum);
//				// If Smaller, Update Difference
//				if (tmp < diff) {
//					diff = tmp;
//				}
//			}
//		}
//		return (int) diff; // Return diff as Integer
//	}
	
//	public int tapeEqulibrim(int[] A) {
//		int[] A_TEMP = new int[A.length-1];
//		for (int i = 0; i < A_TEMP.length; i++) {
//			int result = 0;
//			int fwdCount = i + 1;
//			int fwdSum = 0;
//			while (fwdCount < A.length) {
//				fwdSum += A[fwdCount];
//				fwdCount++;
//			}
//			int bckCount = i;
//			int bckSum = 0;
//			while (bckCount >= 0) {
//				bckSum += A[bckCount];
//				bckCount--;
//			}
//			result = Math.abs(fwdSum - bckSum);
//			A_TEMP[i] = result;
//		}
//		Arrays.sort(A_TEMP);
//		return A_TEMP[0];
//	}

//	public int tapeEqulibrim(int[] A) {
//		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//		for (int i = 0; i < A.length; i++) {
//			map.put(i + 1, A[i]);
//		}
//		System.out.println(map);
//		Map<Integer, Integer> tempMap = new TreeMap<Integer, Integer>();
//		for (int i = 1; i < map.size(); i++) {
//			int result = 0;
//			int fwdCount = i + 1;
//			int fwdSum = 0;
//			while (fwdCount <= map.size()) {
//				fwdSum += map.get(fwdCount);
//				fwdCount++;
//			}
//			int bckCount = i;
//			int bckSum = 0;
//			while (bckCount >= 1) {
//				bckSum += map.get(bckCount);
//				bckCount--;
//			}
//			result = Math.abs(fwdSum - bckSum);
//			tempMap.put(result, i );
//		}
//		Object i[] = tempMap.keySet().toArray();
//		return (Integer) i[0];
//	}
	
//	public int tapeEqulibrim(int[] A) {
//		int minVal = 0;
//		int arrayLength = A.length;
//		if (arrayLength == 2) {
//			return Math.abs(A[1] - A[0]);
//		}
//		for (int split = 1; split < arrayLength - 1; split++) {
//			A[split] = Math.abs(A[split] + A[split - 1]);
//		}
//		printArray(A);
//		int total = Math.abs(A[arrayLength - 2] + A[arrayLength - 1]);
//		minVal = total;
//		System.out.println("minVal :: "+minVal);
//		for (int split = 0; split < arrayLength - 1; split++) {
//			int rSum = Math.abs(A[split] - total);
//			System.out.println("rSum :: "+rSum);
//			if (Math.abs(A[split] - rSum) < minVal) {
//				minVal = Math.abs(A[split] - rSum);
//				System.out.println("minVal :: "+minVal);
//			}
//		}
//		return minVal;
//	}
	
//	public int solution(int number) {
//		// write your code in Java SE 8
//		String binaryString = Integer.toBinaryString(number);
//		int zeroCount = 0;
//		int maxCount = 0;
//		for (int i = 0; i < binaryString.length() - 1; i++) {
//			if (binaryString.charAt(i + 1) == '0')
//				zeroCount++;
//			else {
//				if (binaryString.charAt(i) == '0') {
//					if (zeroCount > maxCount) {
//						maxCount = zeroCount;
//					}
//					zeroCount = 0;
//				}
//			}
//		}
//		return maxCount;
//	}
//
//	int[] rotate(int arr[], int d, int n) {
//		if(arr.length == 0) {
//			return arr;
//		}
//		int i;
//		for (i = 0; i < d; i++) {
//			arr = rotatebyOne(arr, n);
//			printArray(arr);
//		}
//		return arr;
//	}
//
//	int[] rotatebyOne(int arr[], int n) {
//		int tempArray[] = new int[n];
//		int i, temp;
//		temp = arr[n - 1];
//		for (i = n - 1; i > 0; i--) {
//			tempArray[i] = arr[i - 1];
//		}
//		tempArray[i] = temp;
//		return tempArray;
//	}
}
