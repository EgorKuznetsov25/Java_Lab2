public class Fraction {
    public int num;
    public int den;

    public Fraction(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public Fraction sum(Fraction other) {
        int newNum = this.num * other.den + other.num * this.den;
        int newDen = this.den * other.den;
        return new Fraction(newNum, newDen);
    }

    public Fraction sum(int integer) {
        return sum(new Fraction(integer, 1));
    }

    public Fraction minus(Fraction other) {
        int newNum = this.num * other.den - other.num * this.den;
        int newDen = this.den * other.den;
        return new Fraction(newNum, newDen);
    }

    public Fraction minus(int integer) {
        return minus(new Fraction(integer, 1));
    }

    public Fraction multiply(Fraction other) {
        return new Fraction(this.num * other.num, this.den * other.den);
    }

    public Fraction multiply(int integer) {
        return multiply(new Fraction(integer, 1));
    }

    public Fraction div(Fraction other) {
        return new Fraction(this.num * other.den, this.den * other.num);
    }

    public Fraction div(int integer) {
        return div(new Fraction(integer, 1));
    }

    @Override
    public String toString() {
        return num + "/" + den;
    }
}