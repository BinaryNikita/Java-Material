package OnlineTest;

 class Hotel {
    public int booking;
    public void book(){
        booking++;
    }
  public class SuperHotel extends Hotel{
    public void book(){
        booking--;
    }
    public void book(int size){
      book();
      super.book();
      book();
      booking += size;
    }
   
  }  
  public static void main(String[] args) {
    Hotel hotel = new SuperHotel();
    hotel.book(2);
    System.out.println(hotel.booking);
}

}
