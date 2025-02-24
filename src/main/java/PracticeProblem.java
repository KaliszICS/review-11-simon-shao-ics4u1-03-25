public class PracticeProblem {

	public static void main(String args[]) {

	}

public static int[] createIntArray(){
	int arr[] = new int[5];
	for (int i = 0; i <arr.length;i++){
		arr[i] = i+1;
	}
	return arr;
}


public static String[] createArray(String word1, String word2, String word3, String word4){
	String wordArr[] = new String[4];
	wordArr[0] = word1;
	wordArr[1] = word2;
	wordArr[2] = word3;
	wordArr[3] = word4;
	return wordArr;
} 

public static int findValue(int num, int numArr[]){
	int index = -1;
for (int i = 0; i<numArr.length; i++){
if (numArr[i] == num){
	index = i;
	return index;}}

	return index;
}


public static int findThirdValue(String word, String wordArr2[]){
int index = -1;
int countOcc = 0;
for (int i =0; i<wordArr2.length; i++){
	if (wordArr2[i].equals(word)){
		countOcc +=1;
	}
	if (countOcc == 3){
		index = i;
		return index;
	}
}



return index;

}
}
