import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PersonListComponent } from './person-list/person-list.component';
import { PersonFormComponent } from './person-form/person-form.component';
import { FindPersonComponent } from './find-person/find-person.component';
import { from } from 'rxjs';

const routes: Routes = [
  { path: 'people', component: PersonListComponent },
  { path: 'addPerson', component: PersonFormComponent },
  { path: 'find', component: FindPersonComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
