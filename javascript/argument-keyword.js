function sum() {
    var total = 0;
    for (var i = 0; i < arguments.length; i++) {
        total += arguments[i];
    }
    return total;
}

console.log(sum(1, 2, 3)); // Output: 6
console.log(sum(4, 5, 6, 7)); // Output: 22

let thisExampler=()=>{
    const obj1={
        strength: 90,
        makesome : ()=>{
            console.log(this.strength);
        }
    }
    obj1.makesome()
    
}
thisExampler()