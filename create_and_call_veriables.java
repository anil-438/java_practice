//call class veriable in same class method
//call class veriable in inner/sub class method
//call class veriable in another separate class
//call class veriable in another file

class cls1{
    String c ="Hi"; //class veriable
    String cls1Method(){
        String b =c+" Anu";
        return b;
    } //class veriable in same class method
      public class innerCls1
        {
          // public static String d(){return c;} //inner class should not have static objects
           String innerCls1Meth(){
               String b =c+" Anu";
               return b;
          } //class veriable in inner class
        }

        String call_inner(){
            return new innerCls1().innerCls1Meth();
        }

public static void main(String[]args)
{

    System.out.println("class veriable in same class method:: "+ new cls1().cls1Method());
    System.out.println("class veriable in inner class:: "+ new cls1().call_inner());
    System.out.println("class veriable in another page:: "+ new Simple().c);
                   }
}
//class veriable in another separate class
class cls2{
    public static void main(String[]args){

        System.out.println("call class veriable in another separate class:: "+ new cls1().c);

    }
}

