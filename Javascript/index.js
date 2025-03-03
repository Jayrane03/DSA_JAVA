const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function printPattern(n) {
    for (let i = n; i >= 1; i--) {
        let row = "";
        for (let j = 1; j <= i; j++) {
            row += j + " ";
        }
        console.log(row.trim());
    }
}

// Taking user input in Node.js
rl.question("Enter a number to print pattern: ", (input) => {
    const number = parseInt(input); // Convert input to an integer
    if (!isNaN(number) && number > 0) { // Validate input
        printPattern(number);
    } else {
        console.log("Please enter a valid positive number.");
    }
    rl.close(); 
});
