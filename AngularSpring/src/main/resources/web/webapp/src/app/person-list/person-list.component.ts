import { Component, OnInit } from '@angular/core';
import { Person } from '../person'
import { PersonService } from '../person-service';

@Component({
  selector: 'app-person-list',
  templateUrl: './person-list.component.html',
  styleUrls: ['./person-list.component.scss']
})
export class PersonListComponent implements OnInit {

  people : Person[];

  constructor(private personService :  PersonService) { }

  ngOnInit(): void {
    this.personService.findAll().subscribe(data =>{
      this.people = data;
    })
  }

}
