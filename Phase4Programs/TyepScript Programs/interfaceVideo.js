var myGreet = {
    name: "sree",
    age: 22
};
var myUser;
myUser = function (n, lan) {
    if (lan == "en") {
        return "welcome ".concat(n);
    }
    else {
        return "sry ".concat(n);
    }
};
console.log(myUser("sree", "en"));
