let nums =[10,34,5,88,434];

console.log(nums);

//... here is used for appending
let anotherNums = [11,22, ...nums];
console.log(anotherNums);

let newNums = [... anotherNums];
console.log(newNums , newNums);

console.log("-------------------------------");


newNums.push(3333);
console.log("newNums", newNums);
console.log("anotherNums", anotherNums);

let person1 = {name :"Anjana", city:"Bengaluru", country: "india"};
let person2 = {name1 :"Siddhant", city1:"Mumbai", ...person1};

console.log(person2);

//when you use spread operator it creates a new object
let person3 = {...person1};

console.log(person3 === person1);

