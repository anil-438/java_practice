//class method in same class method
//class method in inner class
//class method in another separate class
//class method in another page

class cls3{
    String c ="Hi";
    String c(){return c;} //class method in same class method
      public class innerCls1
        {
          // public static String d(){return c;} //inner class should not have static objects
          public String d(){return c;} //class method in inner class
        }

        String call_inner(){
            innerCls1 inner = new innerCls1();
            return inner.d();
        }

public static void main(String[]args)
{

    System.out.println("class method in same class method:: "+ new cls1().cls1Method());
    System.out.println("class method in inner class:: "+ new cls1().call_inner());
    System.out.println("class method in another page:: "+ new Simple().c());
                   }
}

//class method in another separate class
class cls4{
    public static void main(String[]args){

        System.out.println("class method in same class method:: "+ new cls1().cls1Method());

    }
}

