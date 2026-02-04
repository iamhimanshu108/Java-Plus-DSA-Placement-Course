public class OddEvenCheck {
    public boolean isEven(int num){
      return (num & 1)==0;
    }
    public static void main(String[] args) {
        OddEvenCheck o = new  OddEvenCheck();
        int num =19;
        String  res = o.isEven(num)?"EVEN" : "ODD";
        System.out.println(num + " is " + res);
    }
}
