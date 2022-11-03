public class Point {
    private int x, y;

    public Point(){

    }

    public Point(int x , int y){
        this.x = x;
        this.y = y;
    }


    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public double distance(){
        return Math.sqrt((x*x) + (y*y));
    }

    public double distance(int x, int y){
        return Math.sqrt((this.x - x)*(this.x - x) + (this.y - y)*(this.y - y));
    }

    public double distance(Point first){
        return Math.sqrt((this.x - first.getX())*(this.x - first.getX()) + (this.y - first.getY())*(this.y - first.getY()));
    }
}