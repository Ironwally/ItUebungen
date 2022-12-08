package src.SafeCalculator;

class IntegerOverflowException extends Exception {
    public IntegerOverflowException() {

    }
}
class SafeCalculator {
    int add(int x, int y) throws IntegerOverflowException {
        long z = (long) x+y;
        if (z != (int)z) throw new IntegerOverflowException();
        return z;
    }
    int mul(int x, int y) throws IntegerOverflowException {
        long z = (long) x+y;
        if (z != (int)z) throw new IntegerOverflowException();
        return z;
    }
}
