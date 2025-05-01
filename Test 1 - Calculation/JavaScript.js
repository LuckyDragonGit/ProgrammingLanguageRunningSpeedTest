function fibonacci(n) {
    switch (n) {
        case 0:
            return 0;
        case 1:
            return 1;
        default:
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

function main() {
    var n = 35;
    var start = new Date().getTime();
    console.log(fibonacci(n));
    var end = new Date().getTime();
    console.log("Fibonacci Time Taken: " + (end - start) / 1000 + "s.");
}

main();