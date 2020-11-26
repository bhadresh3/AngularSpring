import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Observable } from 'rxjs';
import { Person } from './person';

@Injectable({
  providedIn: 'root'
})
export class PersonService {

  private peopleUrl : string;

  constructor(private http : HttpClient) { 
    this.peopleUrl = 'http://localhost:8080/java/person'
  }

  public findAll() : Observable<Person[]>{
    return this.http.get<Person[]> (this.peopleUrl);
  }

  public save(person: Person) {
    return this.http.post<Person>(this.peopleUrl, person);
  }

}