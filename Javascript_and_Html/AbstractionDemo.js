// abstraction is a way of hiding implemnetation details and showing only the functionality to the users ( hides the details , show sthe essesntials )


function Employee(name, age, baseSalary) {
    this.name = name;
    this.age = age;
    this.baseSalary= baseSalary
    this.monthlyBonus =10000;
    
    this.calculateFinalsalary = function() {
        let finalSalary = this.baseSalary + this.monthlyBonus;
        console.log('final salary is : ' + finalSalary);
    }

    this.getEmployeeDetails =  function () {
        console.log('Name: ' + this.name+ " , Age: " + this.age + " BaseSalary: " +this.baseSalary);
    }

}

let emp1 = new Employee("John", 30, 100000);
emp1.getEmployeeDetails();
emp1.calculateFinalsalary();