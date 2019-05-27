public class Calculator {
     private int  num1;
    private int num2;
    private double x;
    private double y;

     public Calculator(int num1, int num2, double x, double y){
         this.num1= num1;
        this.num2 = num2;
        this.x = x;
        this.y= y;
     }
    public int getNum1(){
         return this.num1;
    }
    public int getNum2(){
        return this.num2;
    }
    public double getX(){
         return this.x;
    }
    public double getY(){
         return this.y;
    }
    public int addToNums(){
         return ( this.num1 + this.num2);

    }
    public int substractToNums(){
         return (this.num1 - this.num2);
    }
    public int multiplyToNums(){
         return (this.num1 * this.num2);
    }
    public double divideToNums(){
         return (this.x / this.y);
    }

}
