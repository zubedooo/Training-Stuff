function test(){

    for(let i=1; i<=10; i++){
        console.log("inside loop ",i);
    }
    // since let is used to declare the variable
    // it cannot have the scope outside the for loop
    //console.log("value of i outside for loop ", i);

}

test();

const name ="Prerana";
name ="Harry";
