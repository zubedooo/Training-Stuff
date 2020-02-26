let p1 ={
    name:"Suraj",
    city:"Bengaluru",
    email:"suraj@ps.com"
}

function sayHello(name, city){
    console.log(`Hello ${name}, you live in ${city}`);
}
function sayHello1({name, city}){
    console.log(`Hello ${name}, you live in ${city}`);
}

sayHello("Siv","Bengaluru")
sayHello1(p1);