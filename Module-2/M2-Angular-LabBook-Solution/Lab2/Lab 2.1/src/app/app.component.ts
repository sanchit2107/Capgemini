import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: [ './app.component.css' ]
})
export class AppComponent {
  id:number;
  name:string;
  salary:number;
  dep:string;
  employee=[{id:101,name:'Jyoti Pathak',salary:90000,dep:'java'}];
  
  constructor(){
  }
  add(){
    var emp={id:this.id,name:this.name,salary:this.salary,dep:this.dep};
       this.employee.push(emp);
  }
 delete(id:number){
    var flag:boolean=false;
   for (var i = 0;i <this.employee.length;i++) {
      if (this.employee[i].id === id) {
          flag=true;
          this.employee.splice(i, 1);
      }
    }
    return flag;
  }
newid:number;
newname:string;
newsalary:number;
newdepartment:string;
update(id:number,name:string,salary:number,dep:string)
{
  this.newid=id;
  this.newname=name;
  this.newsalary=salary;
  this.newdepartment=dep;
  }
updateValues(id:number,name:string,salary:number,dep:string)
{
  for(var i=0;i<this.employee.length;i++){
    let e=this.employee[i];
    if(e.id==id){
      //console.log(name);
      this.employee.splice(i,1);  
      this.employee.push({id,name,salary,dep});
      //console.log(e.name);
      break;
    }
}

}
}


