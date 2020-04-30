import { Component, OnInit } from '@angular/core';
import { MyorderPipe } from './myorder.pipe';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html'
})
export class AppComponent {
  title(title: any) {
    throw new Error("Method not implemented.");
  }

  constructor(private orderPipe: MyorderPipe) {
    console.log("order by digit");
    console.log(this.orderPipe.transform(this.items, 'digit'));
  } 

  items = [
    {empId:1001,empName:'Shweeta',empSal:9000,empDep:'JAVA',empjoiningdate:'8/12/2014'},
    {empId:1002,empName:'Richa',empSal:11000,empDep:'ORAAPS',empjoiningdate:'10/12/2017'},
    {empId:1003,empName:'Utsarg',empSal:12000,empDep:'JAVA',empjoiningdate:'1/12/2010'},
    {empId:1004,empName:'Jyoti',empSal:11500,empDep:'ORAAPS',empjoiningdate:'3/12/2017'},
    {empId:1005,empName:'Amit',empSal:7000,empDep:'.NET',empjoiningdate:'1/1/2018'},
    {empId:1006,empName:'Vishal',empSal:17000,empDep:'BI',empjoiningdate:'9/12/2012'},
    {empId:1007,empName:'Rajesh',empSal:21000,empDep:'BI',empjoiningdate:'6/7/2014'},
    {empId:1008,empName:'Neelima',empSal:81000,empDep:'TESTING',empjoiningdate:'6/17/2015'},
    {empId:1009,empName:'Daya',empSal:1000,empDep:'TESTING',empjoiningdate:'6/17/2016'} ,
  ];
  order = "empId";
  reverse = false;

}
