"use strict";
exports.__esModule = true;
exports.MyServiceImpl = void 0;
var MyServiceImpl = /** @class */ (function () {
    function MyServiceImpl() {
    }
    MyServiceImpl.prototype.hello1 = function () {
        console.log("Heyyy from hello1 ");
    };
    MyServiceImpl.prototype.hello2 = function () {
        return "Heyyy from hello2 ";
    };
    return MyServiceImpl;
}());
exports.MyServiceImpl = MyServiceImpl;
