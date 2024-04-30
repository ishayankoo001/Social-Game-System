import java.util.Arrays;

public class AcquaintanceArray {
    private AcquaintanceElement[] acquaintanceElements;
    public static AcquaintanceArray createAcquaintanceArray(String input, Universe universe) {
        //asume input is in form of "{(name1, number1), (name2, number2), ...}"
        String[] elements = input.substring(1, input.length() - 1).split("\\),");
        for (int i = 0; i < elements.length; i++) {
            elements[i] = elements[i].replace("(", "").replace(")", "").trim();
        }
        AcquaintanceElement[] acquaintanceElements = new AcquaintanceElement[elements.length];
        for (int i = 0; i < elements.length; i++) {
            String[] parts = elements[i].split(",");
            Player player = universe.findPlayer(parts[0]);
            int number = Integer.parseInt(parts[1].trim());
            acquaintanceElements[i] = new AcquaintanceElement(player, number);
        }
        AcquaintanceArray acquaintanceArray = new AcquaintanceArray();
        acquaintanceArray.acquaintanceElements = acquaintanceElements;
        return acquaintanceArray;
    }

    @Override
    public String toString() {
        return "AcquaintanceArray{" +
                "acquaintanceElements=" + Arrays.toString(acquaintanceElements) +
                '}';
    }
}
