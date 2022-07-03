package Phase1.Topic2_OperatorsLoopsVarScoping;

/*
           4 = 1 0 0
           6 = 1 1 0
    output & = 1 0 0 = 4
           | = 1 1 0 = 6
           ^ = 0 1 0 = 2
           ~ = 0 1 1 = - 5
                taking 1's comp = 000000..100
                2's comp addition =       + 1
                output = 000000101
leftshift operator: << - this is basically multiplying the number with 2, but this multiplication fails for large numbers
                         since the first bit can become 1, which makes the compiler think it as negative number
rightshift operator: >> - this is basically dividing the number with 2.

in both the cases the padding happens with 0. Padding means the first bits are put as zero when shifting occurs.
 17>>1 = 8
 17>>2 = 4
 19<<1 = 38
 19<<2 = 76

 */
public class Operators {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~a);

        System.out.println(17 >> 1);
        System.out.println(17 >> 2);
        System.out.println(19 << 1);
        System.out.println(19 << 2);

        int i = 7;
        System.out.println(++i);
        // 8
        System.out.println(i++);
        //8, i = 9
        System.out.println(i--);
        //9, i = 8
        System.out.println(--i);
        //7, i = 7

    }
}
