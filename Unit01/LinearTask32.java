//Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0 ≤к ≤59). Какое время будут
//показывать часы через р ч q мин r с?

public class LinearTask32 {
    public static void task32() {
        int m = 22, n = 43, k = 55;
        int p = 4, q = 46, c = 300;
        k += c;
        if(k > 60){
            n += k/60;
            k %= 60;
        }

        n += q;
        if(n > 60){
            m += n/60;
            n %= 60;
        }

        m += p;
        m %= 24;
        System.out.println("m = " + m + " n = " + n + " k = " + k);
    }
}
