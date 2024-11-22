package InnerClasses;

 class OuterClassMethod {
    void m1(){
        class InnerMethod {
        
            void insideMethod(){
                System.out.println("Inside method");
            }
        }
        InnerMethod i = new InnerMethod();
        // new InnerMethod().insideMethod();
        i.insideMethod();
        
    }
    public static void main(String[] args) {
        OuterClassMethod o = new OuterClassMethod();
        o.m1();
    }
}
