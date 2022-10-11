// Encapsulation
// Inheritance
// Polymorphism 
// Abstraction 
class Employee {
    setEmployee(name, id, position) {
        this.name = name;
        this.id = id;
        this.position = position;
    }
    getEmployeeName() {
        return this.name;
    }
    getEmployeeId() {
        return this.id;
    }
    getEmployeeIdPosition() {
        return this.position;
    }
} // how to create classes in JS

let emp1 = new Employee(); // how to create objects from those classes in js 
let emp2 = new Employee();
emp1.setEmployee("Nishant", 123, "Full stack dev");
emp2.setEmployee("WAlter", 1234, "Senior Server Dev");
console.log(emp1.getEmployeeId());
console.log(emp1.getEmployeeName());
console.log(emp1.getEmployeeIdPosition());

