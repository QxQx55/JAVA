public class Rectangle{
    int width;
    int length;
    double result;
    Rectangle(){
        length=1;
        width=1;
       
    }
    Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }
    void getArea(){
        result=length*width;
    }
    void getArea(int length){
         result=length*width;
    }
    void display(){
        System.out.print("area: "+result);
    }
    public static void main(String[] args){
        Rectangle obj=new Rectangle();
        obj.getArea(5);
        obj.display();
    }
}
