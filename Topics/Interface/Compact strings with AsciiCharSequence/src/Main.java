import java.util.*;

class AsciiCharSequence implements CharSequence {
    // implementation

    private final byte[] array;

    public AsciiCharSequence(byte[] array) {
        this.array = array.clone();
    }

    @Override
    public int length() {
        return this.array == null ? 0 : this.array.length;
    }

    @Override
    public char charAt(int i) {
        return (char) array[i];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] finalArray = new byte[end - start];

        for (int i = 0, j = start; j < end && j < this.array.length; i++, j++) {
            finalArray[i] = this.array[j];
        }

        return new AsciiCharSequence(finalArray);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (byte elem : array) {
            builder.append((char) elem);
        }

        return builder.toString();
    }

}