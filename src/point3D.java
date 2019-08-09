public class point3D extends point2D {
    public float z=0;

    public point3D() {

    }

    public point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[]getXYZ(){
        float[] temp = new float[3];
        temp[0] = this.x;
        temp[1] = this.y;
        temp[2]=this.z;
        return temp;
    }
    public void setXYZ(float x,float y,float z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    @Override
    public String toString(){
        return "point3D :"+"x = "+x+"y="+y+"z="+z;
    }
}
