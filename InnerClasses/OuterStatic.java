package InnerClasses;


public static class OuterStatic{
    int b = 90;
    static int a = 9;

   

    public static class _StaticInner {
         int a = 0;
        void display(){
            System.out.println(a);
        }
        public static void main(String[] args) {
            System.out.println(a);
        }
    }
}
