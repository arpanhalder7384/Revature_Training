"use strict";
exports.__esModule = true;
exports.car = void 0;
var car = /** @class */ (function () {
    function car(name) {
        this.name = name;
    }
    car.prototype.getCar = function () {
        return "Car is " + this.name;
    };
    car.iAmStatic = function () {
        console.log("Hello I am static .................");
    };
    return car;
}());
exports.car = car;
