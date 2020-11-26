import { Component, OnInit } from '@angular/core';
import { Person } from '../person';
import { ActivatedRoute, Router } from '@angular/router';
import { PersonService } from '../person-service';

@Component({
  selector: 'app-person-form',
  templateUrl: './person-form.component.html',
  styleUrls: ['./person-form.component.scss']
})
export class PersonFormComponent implements OnInit {

  person : Person;

  constructor(private route : ActivatedRoute,
              private router : Router,
              private personService : PersonService,) {
                this.person = new Person();
               }


  ngOnInit(): void {
  }

  onSubmit(){
    this.personService.save(this.person).subscribe(result => this.routChange());
  }

  routChange(){
    this.router.navigate(['/people']);
  }

}
