class Simple {
    public static String a ="Hi";  // static variable
    public static String a(){return "Hi";} // static mthod
    public String b ="Hi";  //  non static variable
    public String b(){return "Hi";} // non static mthod
    String c ="Hi";  // with out access modifier variable
    Integer c(){return 36;} //with out access modifier mthod

    public static void main(String[] args) {
        System.out.println("This is Static variable assosiated value[a]:: "+a);
        System.out.println("This is Static Methid assosiated value[a()]:: "+a());
        System.out.println("This is non Static variable assosiated value[b]:: "+new Simple().b);
        System.out.println("This is non Static Methid assosiated value[b()]:: "+ new Simple().b());
        System.out.println("This is with out access modifier variable assosiated value[c]:: "+new Simple().c);
        System.out.println("This is with out access modifier Methid assosiated value[c()]:: "+ new Simple().c());

    }

}


