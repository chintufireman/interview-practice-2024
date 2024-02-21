function sum() {
    var total = 0;
    for (var i = 0; i < arguments.length; i++) {
        total += arguments[i];
    }
    return total;
}

console.log(sum(1, 2, 3)); // Output: 6
console.log(sum(4, 5, 6, 7)); // Output: 22
