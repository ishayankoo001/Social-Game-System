package com.SGS.dependency;

import java.util.Arrays;

public class AcquaintanceArray {
    public AcquaintanceElement[] getAcquaintanceElements() {
        return acquaintanceElements;
    }

    public void setAcquaintanceElements(AcquaintanceElement[] acquaintanceElements) {
        this.acquaintanceElements = acquaintanceElements;
    }

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
    public int findPlayerInAcquaintances(Player player) {
        for (int i = 0; i < acquaintanceElements.length; i++) {
            if (acquaintanceElements[i].getPlayer().equals(player)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "AcquaintanceArray{" +
                Arrays.toString(acquaintanceElements) +
                '}';
    }
}
