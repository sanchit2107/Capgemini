import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: [ './app.component.css' ]
})
export class AppComponent {
   public pid:number;
  public prodName:string;
  public prodCost:number;
  public prodOnline:string;
  public prodCategory:string;
  public msg:string;

  
 category:string[]=['Grocery','Mobile','Electronics','Cloths'];
 stores:string[]=['Big Bazar','DMart','Reliance','Mega Store'];
  

saveForm(prodForm){
   console.log(prodForm.value);
   this.msg='Submitted';
 }


}


