package com.juaracoding;

public class NomorTiga {
    public static void main(String[] args) {
        // Data input
        String input = ":T1:202112SOAL3\n" +
                ":T2:SOAL3/2112/AB000000011 OD:0001234500CDE5432100 SOAL003 ABCDE12345 XAS SKILL TEST ESSAY.DT\n" +
                ":T1:202111SOAL3\n" +
                ":T2:SOAL3/2111/BC000011100 OD:0003452100EFG2451300 SOAL003 EFGHI25134 XAS SKILL TEST ESSAY .DT\n" +
                ":T1:202110SOAL3\n" +
                ":T2:SOAL3/2110/DE210031010 OD:0001524300HIJ2145300 SOAL003 JKLMN52431 XAS SKILL TEST ESSAY.DT\n" +
                "\n" +
                "REQUIREMENT\n" +
                "1 Tag:T2: terdiri dari 5 Trailer\n" +
                "*1 Trailer = 18 CHAR";

        // Pisahkan data input berdasarkan baris
        String[] lines = input.split("\n");

        // Proses pemindahan dan penggabungan trailer
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < lines.length; i += 4) {
            // Pindahkan Trailer 3, 4, 5 ke posisi 1, 2, 3
            String t1 = lines[i];
            String t2 = lines[i + 1].substring(0, 18 * 3);
            String t3 = lines[i + 1].substring(18 * 3);
            result.append(t1).append("\n").append(":T2:").append(t3).append(t2).append("\n");

            // Pindahkan Trailer 1 dan 2 ke posisi 4 dan 5
            t1 = lines[i + 2];
            t2 = lines[i + 3];
            result.append(t1).append("\n").append(t2).append("\n");
        }
        System.out.println(result.toString());
    }
}
