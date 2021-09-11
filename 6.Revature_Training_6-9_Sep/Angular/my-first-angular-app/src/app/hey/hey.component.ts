import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-hey',
  // templateUrl: './hey.component.html',
  // styleUrls: ['./hey.component.css']
  template:`<h1> {{message}}</h1>
  <h2>I am in other Line</h2>`
})
export class HeyComponent  {

  message="This is asample message from ts file"
  // constructor() { }

  // ngOnInit() {
  // }

}
