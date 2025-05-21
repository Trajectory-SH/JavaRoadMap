package lang.math.test;

import java.util.Arrays;
import java.util.Random;

public class LottoGenerator {
    private final int[] lottonum;
    private final Random random;

    public LottoGenerator() {
        lottonum = new int[6];
        random = new Random(System.nanoTime());
    }

    public void numberGenerator() {
        for (int i = 0; i < 6; i++) {
            while (true) {
                if (i == 0) {
                    lottonum[i] = random.nextInt((45) + 1);
                    break;
                } else if (lottonum[i - 1] != lottonum[i]) {
                    lottonum[i] = random.nextInt((45) + 1);
                    break;
                }
            }
        }//lottonum 생성 완료
        Arrays.sort(lottonum);

        numberPrint();



    }

    private void numberPrint() {
        System.out.println("====Lotto Number Generate====");
        System.out.print("로또 번호: ");
        for (int i : lottonum) {
            System.out.print(" " + i);
        }
        System.out.println();
        System.out.println("====Lotto Number Terminate====");
    }

}
