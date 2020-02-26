function fn1(strings, p1, p2){
    console.log("String passed is ", strings);
    console.log("Param 1 ", p1);
    console.log("Param 2 ", p2);
    console.log(arguments);
    
}
let name ="Pavan";
let city ="Bengaluru";
let s2 = fn1 `${name} lives in ${city}`;

// ... - spread operator

function fnTestSpread(strings, ... values){
    console.log(values);
    return "fnTestSpread called... "
}

let s3 = fnTestSpread `${name} lives in ${city}`;
console.log(" s3 " , s3);
