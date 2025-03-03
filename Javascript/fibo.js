const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});


rl.question('Enter the number of Fibonacci terms to generate: ', (input) => {
    const n = parseInt(input, 10);
    if (isNaN(n) || n <= 0) {
        console.log("Please enter a valid positive number.");
    } else {
        printFibonacci(n);
    }
    rl.close(); 
});

function printFibonacci(num) {
    let a = 0, b = 1, nextTerm;

    console.log("First " + num + " Fibonacci numbers:");
    for (let i = 1; i <= num; i++) {
        console.log(a);
        nextTerm = a + b;
        a = b;
        b = nextTerm;
    }
}
