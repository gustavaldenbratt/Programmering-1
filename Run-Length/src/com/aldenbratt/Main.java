package com.aldenbratt;

import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        MyScanner in = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        char command = in.next().charAt(0);
        char[] message = in.next().toCharArray();
        int length = message.length;
        StringBuilder sb = new StringBuilder();

        if (command == 'E') {
            char cur, prev = message[0];
            int repeat = 1;

            for (int i = 1; i < length; i++) {
                cur = message[i];

                if (cur != prev) {
                    sb.append(prev);
                    sb.append(repeat);
                    prev = cur;
                    repeat = 0;
                }

                repeat++;
            }

            sb.append(prev);
            sb.append(repeat);

        } else if (command == 'D') {
            for (int i = 0; i < length; i += 2) {
                char ch = message[i];
                int repeat = message[i + 1] - '0';

                while (repeat-- > 0) {
                    sb.append(ch);
                }
            }
        }

        out.println(sb.toString());

        out.close();
    }

    public static class MyScanner {
        private static BufferedReader br;
        private String line;
        private StringTokenizer st;

        MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextLine() {
            try {
                line = br.readLine();
            } catch (IOException e) {
                return null;
            }

            if (line != null) {
                st = new StringTokenizer(line);
            }

            return line;
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                line = nextLine();
            }

            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}
