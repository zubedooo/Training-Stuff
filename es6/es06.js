let names= ['Saahil', 'Preeti', 'Mayank', 'Nikith'];

let chars = names.map((value) => value.charAt(0));
console.log(chars);

let __lookfor="Preeti";
console.log("Found at ", names.map((value) => value === __lookfor));