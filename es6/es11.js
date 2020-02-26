function divide(num1, num2){

    if(typeof(num1)!='number'){
        throw "First number should be integer"
    }
    if(typeof(num2)!='number'){
        throw "Second number should be integer"
    }
    if(num2 ===0){
        throw "Sorry cannot divide by 0"
    }
    return num1/num2;

}

let c = divide(10,2);
console.log(c);
