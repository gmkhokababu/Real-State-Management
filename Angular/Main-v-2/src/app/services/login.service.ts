import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from '../models/user';
import { Observable } from 'rxjs';
import { Tenant } from '../models/tenant';
import { Property } from '../models/property';

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

  //-----------------------------create user--------------------------
  createuser(u:User):Observable<User>{
    this.url=this.url+"create-user";
    return this.http.post<User>(this.url,u);
  }

  //----------------------------create tenant---------------------------
  createtenent(u:Tenant):Observable<Tenant>{
    this.url=this.url+"create-tenent";
    return this.http.post<Tenant>(this.url,u);
  }

  //---------------------save property---------------------------------
  saveproperty(p:Property):Observable<Property>{
    this.url="http://localhost:8080/postproperty";
    return this.http.post<Property>(this.url,p);
  }

  //---------------------Show all property------------------------------
  showall():Observable<Property>{
    this.url="http://localhost:8080/getproperty";
    return this.http.get<Property>(this.url);
  }

}
