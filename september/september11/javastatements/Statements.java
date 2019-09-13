package com.tekwill.homework2.september.september11.javastatements;

public class Statements {
    public static int statementA() {
        int f[];
        f = new int[20];
        for (int i = 0; i < f.length; i++) {
            f[i] = 3 * i;

        }
        return f[6];
    }

    public static int statementB() {
        int g[];
        g = new int[8];
        for (int i = 0; i < 5; i++) {
            g[i] = (i + i) * i;
        }
        for (int j = 0; j < g.length; j++) {
            System.out.print(g[j] + " ");
        }
        return 0;
    }

    public static float statementC() {
        float c[];
        c = new float[100];
        float sum = 0.0f;
        for (int i = 0; i < c.length; i++) {
            c[i] = 1.1f + (i * i);
            sum += c[i];
            System.out.print(c[i] + " ");
        }
        System.out.println();
        return sum;
    }

    public static int statementD() {
        int a[];
        int b[];

        a = new int[11];
        b = new int[34];
int i;
        System.out.println("a[] = ");
        for (i = 0; i < a.length; i++) {
            a[i] = 1 + i;
            System.out.print(a[i] + " ");

                        }
        System.out.println("\nb[] = ");
        for (int j = 0; j < a.length; j++) {
            b[j] = a[j];
            System.out.print(b[j] + " ");


        }
        return 0;
    }

    public static float statementE(){
        float e[];
        e = new float[99];
        for (int i = 0; i < e.length; i++) {
            e[i] = (i * i + 1.0f) / (i * 2.0f + 1 + i);
            System.out.print(e[i] + " ");

        }
        return 0;
    }
}
