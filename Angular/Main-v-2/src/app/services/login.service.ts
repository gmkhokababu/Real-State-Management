import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from '../models/user';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http:HttpClient) { }

  url:any="http://localhost:8080/"
  login(userName:any,password:any):Observable<User>{
    this.url=this.url+userName+"/"+password;
    return this.http.get<User>(this.url);
  }


}
