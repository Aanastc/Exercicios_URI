import java.io.IOException;
import java.util.Scanner;

public class 1115 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        while (true) {
            Point point = new Point(sc.nextInt(), sc.nextInt());

            if (point.hasANullCoordinate())
                break;
            point.printQuadrant();
        }
    }
}

class Point {

    private int xCoordinate;
    private int yCoordinate;

    public Point(int xCoordinate, int yCoordinate) {
        super();
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public boolean hasANullCoordinate() {
        if (getxCoordinate() == 0 || getyCoordinate() == 0)
            return true;
        return false;
    }

    public String getQuadrant() {

        if (getxCoordinate() > 0 && getyCoordinate() > 0)
            return "primeiro";
        else if (getxCoordinate() > 0 && getyCoordinate() < 0)
            return "quarto";
        else if (getxCoordinate() < 0 && getyCoordinate() < 0)
            return "terceiro";
        else
            return "segundo";
    }

    public void printQuadrant() {
        System.out.println(getQuadrant());
    }
}