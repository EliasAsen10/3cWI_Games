package slota;
import java.util.Random;

public class SlotMachine {private static final int NUM_SYMBOLS = 3;
    private static final String[] SYMBOLS = {"1", "7", "10"};

    public static void main(String[] args) {
        SlotMachine slotMachine = new SlotMachine();
        String[] result = slotMachine.play();
        System.out.println("Slot machine result: " + result[0] + " " + result[1] + " " + result[2]);
    }

    public String[] play() {
        String[] result = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            int symbolIndex = random.nextInt(NUM_SYMBOLS);
            result[i] = SYMBOLS[symbolIndex];
        }

        return result;
    }
}
