import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app_hey',
  //  templateUrl: './hey.component.html',
  //  styleUrls: ['./hey.component.css']
  template: `<h1> from hey component</h1><h2>{{message}}<\h2>`
})
export class HeyComponent  {

  message="This is asample message from ts file"
  // constructor() { }

  // ngOnInit() {
  // }

}
