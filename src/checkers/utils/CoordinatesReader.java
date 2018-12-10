package checkers.utils;

import java.util.Scanner;

public class CoordinatesReader {
    private Scanner scanner = new Scanner(System.in);

    public checkers.model.Move getCoordinates() {
        int nowA, newA, nowB, newB;
        System.out.println("Iveskite pradines saskes koordinates");
        nowA = scanner.nextInt();
        nowB = scanner.nextInt();
        System.out.println("Iveskite galines saskes koorindates");
        newA = scanner.nextInt();
        newB = scanner.nextInt();
        return new checkers.model.Move(nowA, newA, nowB, newB);
    }

}
