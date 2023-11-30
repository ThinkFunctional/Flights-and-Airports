/*
This is not code you were asked to write.
It is provided only so that the methods you are to write
can be tested.
*/

public class Flight {
  
  public int numPassengers;
  public double price;
  public int capacity;

  public Flight(int numPassengers, double price, int capacity) {
    this.numPassengers = numPassengers;
    this.price = price;
    this.capacity = capacity;
  }

  public int getNumPassengers() {
    return this.numPassengers;
  }

  public double getPrice() {
    return this.price;
  }

  public int getCapacity() {
    return this.capacity;
  }

  public String toString() {
    return "number passengers: " + this.numPassengers + " price: " + this.price + " capacity: " + this.capacity;
  }
}