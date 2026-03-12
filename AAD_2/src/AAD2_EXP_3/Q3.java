package AAD2_EXP_3;

public class Q3 {

	public static void main(String[] args) {
		int[] num = {23, 4, 57, 82, 95, 13, 113, 224, 72, 18};
        int size = 10;
        int[] hashTable = new int[size];

        for (int i = 0; i < size; i++)
            hashTable[i] = 0;

        for (int i : num) {
            int index = i % size;
            int f=1;
            while(hashTable[index] != -1){
                index = (i % size + f*f) % size;
                f++;
            }
            hashTable[index] = i;
            
        }

        System.out.println("Hash Table:");
        for (int i = 0; i < size; i++) {
            System.out.println(i + " -> " + hashTable[i]);
        }
	}

}
