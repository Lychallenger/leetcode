
import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


class Main {
    public int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points, Comparator.comparingInt(a->a[0]*a[0]+a[1]*a[1]));
        return Arrays.copyOf(points,K);
    }
}