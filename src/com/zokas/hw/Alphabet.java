package HW4;

public enum Alphabet {
    A(1),
    B(2),
    C(3),
    D(4),
    E(5),
    F(6),
    G(7),
    H(8);

    int position;

    Alphabet(int position) {
        this.position = position;
    }

    public int getLetterPosition() {
        return position;
    }
}
