package Lesson18;

public enum Operation {
    SUM,
    SUBTRACT,
    MULTIPLY,
    DIVIDE,
    DEFAULT;

    private char a;

    Operation() {

    }

    Operation(char a) {
        this.a = a;
    }

    public char getChar() {
        return a;
    }

    public static Operation getOperation(char a){
        if (a =='+') return Operation.SUM;
        if (a =='-') return Operation.SUBTRACT;
        if (a =='*') return Operation.MULTIPLY;
        if (a =='/') return Operation.DIVIDE;
        return Operation.DEFAULT;
    }
}
