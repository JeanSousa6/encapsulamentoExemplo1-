public class Rectangle {
  
    private double width;
    private double height;


    public void setWidth(double width){
        this.width = width;
    }

    public void setHeight(double height){
        this.height = height;
    }
  
    public double Area(){
        return width * height;
    }

    public double Perimeter(){
        return 2 * (width + height);
    }


    public double Diagonal(){
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

}
