package AAD2_EXP_4;
import java.util.*;

class matrix {
    int mat[][];
    int count;

    matrix(int cnt) {
        mat = new int[cnt][cnt];
    }

    public void dirEDGE(int src, int dst, int cst) {
        mat[src][dst] = cst;
    }

    public void undirEDGE(int src, int dst, int cst) {
        dirEDGE(src, dst, cst);
        dirEDGE(dst, src, cst);
    }

    public void display() {
        for (int i = 0; i < count; i++) {
            System.out.println("Node " + i + " is connected to:");
            for (int j = 0; j < count; j++) {
                if (mat[i][j] != 0) {
                    System.out.println(j + " ");
                }
            }
        }
    }
}


public class Q1 {
    public static void main(String[] args) {
        matrix m = new matrix(4);
        m.dirEDGE(0, 1, 5);
        m.undirEDGE(0, 2, 10);
        m.undirEDGE(1, 3, 15);
        m.display();
    }
}
