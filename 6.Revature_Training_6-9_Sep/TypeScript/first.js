"use strict";
exports.__esModule = true;
exports.Myclass = void 0;
var car_1 = require("./car");
var serviceimpl_1 = require("./serviceimpl");
console.log("Hello and welcome to TS");
var x;
x = 1000;
console.log("x= " + x);
function helloFunction() {
    console.log("Hello from TS function");
}
var Myclass = /** @class */ (function () {
    function Myclass() {
        console.log("Hello from Myclass Constructor");
    }
    Myclass.prototype.helloMethod = function () {
        console.log("Heyy fom  Myclass Hello method");
    };
    return Myclass;
}());
exports.Myclass = Myclass;
var c = new Myclass();
c.helloMethod();
var car1 = new car_1.car("BMW");
console.log(car1.getCar());
console.log(car_1.car.iAmStatic());
var service = new serviceimpl_1.MyServiceImpl();
service.hello1();
console.log(service.hello2);
