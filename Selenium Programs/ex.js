function fun(a, b) {
    var c = [];
    for (var _i = 2; _i < arguments.length; _i++) {
        c[_i - 2] = arguments[_i];
    }
    return a + b;
}
console.log(fun(1, 2));
console.log("," + fun(1, 2, 3, 4, 5));
