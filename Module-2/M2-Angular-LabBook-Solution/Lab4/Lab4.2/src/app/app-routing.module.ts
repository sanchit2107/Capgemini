import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ListBookComponent } from './list-book/list-book.component';


const routes: Routes = [
 
  {
    path:'app-list-book',
    component :ListBookComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
