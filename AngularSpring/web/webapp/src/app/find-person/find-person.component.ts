import { Component, OnInit } from '@angular/core';
import { PersonService } from '../person-service';
import { Person } from '../person'

@Component({
  selector: 'app-find-person',
  templateUrl: './find-person.component.html',
  styleUrls: ['./find-person.component.scss']
})
export class FindPersonComponent implements OnInit {

  search: string;
  category: string;
  people: Person[];

  constructor(private personService  : PersonService) { }

  ngOnInit(): void {
    this.search = "";
    this.category= "name";
  }

  onSubmit(){
    this.personService.find(this.category, this.search).subscribe(data =>{
      this.people = data;
    });
  }

}
