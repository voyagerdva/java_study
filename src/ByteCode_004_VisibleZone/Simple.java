package ByteCode_004_VisibleZone;

public class Simple {
    public static void main(String[] args) {

        {
            int AAA = 100;
            int BBB = AAA + 200;
            short AAA1 = 300;
            System.out.println(BBB);
        }

        {
            int CCC = 400;
            int DDD = CCC + 500;
            short AAA2 = 300;
            System.out.println(DDD);
        }
        {
            int EEE = 100;
            int FFF = EEE + 200;
            short AAA3 = 300;
            System.out.println(FFF);
        }

        {
            int AAA = 400;
            int BBB = AAA + 500;
            short AAA4 = 300;
            System.out.println(BBB);
        }

        int AAA = 600;
        int BBB = AAA + 700;
        short AAA5 = 300;

        System.out.println(AAA);
        System.out.println(BBB);
    }
}
