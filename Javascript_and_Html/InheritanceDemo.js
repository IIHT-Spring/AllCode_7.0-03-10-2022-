class Car {
  // parent class
  setName(name) {
    this.name = name;
    console.log(name);
  }
  drive() {
    console.log("the car named " + this.name + " is running ");
  }
  stop() {
    console.log("this car named " + this.name + " is stopping");
  }
}
class Mercedes extends Car {
  // child class
  driver(driverName) {
    console.log("this mercedes is being driven by " + driverName);
  }
}
let W13 = new Mercedes();
W13.setName("F1 car");
W13.drive();
W13.stop();
W13.driver("Lewis Hamilton");
