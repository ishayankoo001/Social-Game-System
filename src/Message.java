import java.util.Arrays;

public class Message {
    public Message(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return Arrays.toString(numbers);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Check for reference equality
        if (o == null || getClass() != o.getClass()) return false; // Check for null and ensure exact class match

        Message message = (Message) o;
        return Arrays.equals(numbers, message.numbers); // Check for content equality
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(numbers); // Compute hash code based on the contents of the numbers array
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    private int[] numbers;
}
