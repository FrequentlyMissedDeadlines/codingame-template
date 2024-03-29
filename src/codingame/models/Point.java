package codingame.models;

public class Point {
    public final int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Point other = (Point) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }

    public int manhattanDistance(int x, int y) {
        return Math.abs(this.x - x) + Math.abs(this.y - y);
    }

    public int manhattanDistance(Point p) {
        return Math.abs(this.x - p.x) + Math.abs(this.y - p.y);
    }
}
