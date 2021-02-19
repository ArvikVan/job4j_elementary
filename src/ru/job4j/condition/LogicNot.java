package ru.job4j.condition;

public class LogicNot {
    public boolean isEven(int num) {
        return  num % 2 == 0;
    }

    public boolean isPositive(int num) {
        return num > 0;
    }

    public boolean notEven(int num) {
        return !isEven(num);
    }

    public boolean notPosistive(int num) {
        return !isPositive(num);
    }

    public boolean notEvenAndPosistive(int num) {
        return notEven(num) && isPositive(num);
    }

    public boolean evenOrNotPosistive(int num) {
        return isEven(num) || notPosistive(num);
    }
}
