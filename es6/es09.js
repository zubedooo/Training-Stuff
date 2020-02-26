// object de-structuring
let p1 = {
    name: "Suraj",
    city: "Bengaluru",
    email:"suraj@ps.com"
}

console.log(p1);

//let name = p1.name;
//let city = p1.city;
//let email = p1.email;

let {name, city, email} = p1;

console.log("Name: "+ name);
console.log("City: "+ city);
console.log("Email: "+ email);

let nums = [12,23,34,45,56,55];

let[n1, n2, n3, ...restOfNumbers] = nums;
console.log(n1);
console.log(n2);
console.log(n3);
console.log(restOfNumbers);





