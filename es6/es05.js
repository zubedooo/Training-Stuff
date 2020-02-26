let s1 = hello();
console.log(s1);

// this will be loaded in the VM
function hello(){
    console.log("Hello World");
    
}

let s2 = greet();
console.log(s2);
// will not br loaded in the VM till it has been invoked
// till then it will be anonymous
let greet = function(){
    return "Hello World"
}
