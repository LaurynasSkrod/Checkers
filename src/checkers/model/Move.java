package checkers.model;

public class Move {
    public Move(int nowA, int newA, int nowB, int newB) {
        this.nowA = nowA;
        this.newA = newA;
        this.nowB = nowB;
        this.newB = newB;
    }

    private int nowA, newA, nowB, newB;

    public int getNowA() {
        return nowA;
    }

    public int getNewA() {
        return newA;
    }

    public int getNowB() {
        return nowB;
    }

    public int getNewB() {
        return newB;
    }
}
