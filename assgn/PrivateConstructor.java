class Singleton { 
    private static Singleton instance; 
    private Singleton() { 
        System.out.println("Private Constructor"); 
        // private constructor 
    } 

    public static Singleton getInstance() { 
        if (instance == null) { 
            instance = new Singleton(); 
        } 
        return instance; 
    } 
} 

class SingletonDriver{ 
    public static void main(String args[]){ 
        // Singleton.getInstance(); 
        Utility.createInstance();
    } 
} 

 class Utility {
    private Utility() {
        // private constructor
    }

    public static Utility createInstance() {
        return new Utility();
    }
}
