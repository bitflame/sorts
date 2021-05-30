package org.example;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

public class Merge {
    public static void sort(Comparable[] a) {

    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }
    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i]; a[i]=a[j]; a[j]=t;
    }
    private static void show(Comparable[] a) {
        for (int i =0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
            StdOut.print();
        }
    }
    public static boolean isSorted(Comparable[] a) {
        for (int i =1; i < a.length; i++) {
            if (less(a[i], a[i-1])) return false;
        }
        return true;
    }
    public static void main(String [] args) {
        StdDraw.setPenRadius(0.05);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.point(0.5, 0.5);
        StdDraw.setPenColor(StdDraw.MAGENTA);
        StdDraw.line(0.2,0.2,0.8,0.2);
        String [] a = In.readStrings();
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
