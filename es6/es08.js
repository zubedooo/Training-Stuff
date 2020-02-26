// behind the screen its a function
class Person{
    //constructor(){
      //  this.name ="Srinidhi";
        //this.city ="Bengaluru"
    //}
constructor(name, city="Bengaluru"){
    this.name =name;
    this.city = city;
}

    printPerson(){
        console.log("Name: " + this.name);
        console.log("City: " + this.city);
        
    }
}

class Employee extends Person{
    constructor(name, city="Bengaluru", country){
        super(name, city);
        this.country=country;
    }
}


let num1 =2323;
console.log(typeof(num1));

let str1 = "hi";
console.log(typeof(str1));

let p1 = new Person("Srinidhi", "Mysuru");
console.log(typeof(p1));
console.log(p1);
p1.printPerson();

let 