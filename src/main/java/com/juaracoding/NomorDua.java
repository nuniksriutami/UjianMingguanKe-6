package com.juaracoding;

public class NomorDua {
    public static void main(String[] args) {
        int n = 5; // Jumlah baris

        for (int i = 1; i <= n; i++) {
            int start = i;

            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(start);
                start += 2;
                if (j < n - i + 1) {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}
