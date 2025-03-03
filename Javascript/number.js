const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

// Function to check if a number is prime
function isPrime(num) {
    if (num <= 1) {
        return false;
    }
    for (let i = 2; i <= Math.sqrt(num); i++) {
        if (num % i === 0) {
            return false;
        }
    }
    return true;
}

// Function to print prime numbers between a range
function printPrimeNumbers(start, end) {
    console.log(`Prime numbers between ${start} and ${end}:`);
    for (let i = start; i <= end; i++) {
        if (isPrime(i)) {
            console.log(i);
        }
    }
}

// Taking user input in Node.js
rl.question("Enter the start number: ", (startInput) => {
    rl.question("Enter the end number: ", (endInput) => {
        const start = parseInt(startInput);
        const end = parseInt(endInput);

        // Validate the inputs
        if (!isNaN(start) && !isNaN(end) && start > 0 && end > start) {
            printPrimeNumbers(start, end);
        } else {
            console.log("Please enter valid positive numbers where the end number is greater than the start number.");
        }

        rl.close(); // Close the readline interface after use
    });
});
