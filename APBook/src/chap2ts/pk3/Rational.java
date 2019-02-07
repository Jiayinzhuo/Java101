package chap2ts.pk3;
//#16
public class Rational {
	private int numerator;
	private int denominator;

	Rational() {
	}

	Rational(int n) {
		this.numerator = n;
	}

	Rational(int numer, int denom) {
		this.numerator = numer;
		this.denominator = denom;
	}

	int numerator() {
		return this.numerator;
	}

	int denominator() {
		return this.denominator;
	}

	//Returns (this+r). Leave this unchanged
	public Rational plus(Rational r) {
		fixSigns();
		r.fixSigns();
		int denom = denominator * r.denominator();
		int numer = numerator * r.denominator + r.numerator * denominator;

		Rational rat = new Rational(numer, denom);
		rat.reduce();
		return rat;

		// Rational x = new Rational();
		// x.numerator = this.numerator() + r.numerator();
		// x.denominator = this.denominator() + r.denominator();
		// return x;
	}

	private void fixSigns() {
		if (this.denominator < 0) {
			this.denominator *= -1;
		}
	}

	//simply
	private void reduce() {

	}

}
