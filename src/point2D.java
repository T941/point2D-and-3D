public class point2D {
    public  float x=0;
    public float y=0;
    public point2D(){

    }

    public point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[]getXY(){
        float[] temp = new float[2];
        temp[0] = this.x;
        temp[1] = this.y;
        return temp;
    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString() {
        return "Point 2D: x = " + this.x + ", y = " + this.y;
    }
}
