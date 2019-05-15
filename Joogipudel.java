public class Joogipudel{
  enum Type{
    PLASTIC,
    GLASS,
    ALUMINIUM
  }
  double mass;
  double capacity;
  double price;
  Jook jook;
  Type type;
  double bottlePrice;
  public Joogipudel(Jook jook, double capacity, Type type, double mass, double bottlePrice){
    this.jook = jook;
    this.capacity = capacity;
    this.type = type;
    this.mass = mass;
    this.price = bottlePrice;
  }
  public double showPrice(){
    price = (bottlePrice)+(capacity)*(jook.price);
    return price;
  }
  
  public double showMass(){
    mass += (capacity * jook.weight)/1000;
    return mass;
  }
}
