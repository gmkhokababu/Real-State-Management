import { Component, OnInit } from '@angular/core';
import { Tenant } from 'src/app/models/tenant';
import { User } from 'src/app/models/user';
import { LoginService } from 'src/app/services/login.service';

@Component({
  selector: 'app-rental-form',
  templateUrl: './rental-form.component.html',
  styleUrls: ['./rental-form.component.css']
})
export class RentalFormComponent implements OnInit {
//------------------tenent part--------------------------
  tenentId:any
  tenentName:any;
  presentAddress:any;
  permanentAddress:any;
  phoneNo:any;
  email:any;
  ocupation:any;
  propertyId:any;

  tenant:any;

  //----------------------user part-----------------------

  userId:any;
  name:any;
  useremail:any;
  userName:any;
  password:any;
  role:any="tenant";

  user:any;

  constructor(private myservice:LoginService) { }

  ngOnInit(): void {
  }

  submit(){
    this.savetenant();
    this.saveuser();

  }
  //id:any,name:any,presentAddress:any,permanentAddress:any,phoneNo:any,email:any,ocupation:any,propertyId:any
  savetenant(){
    this.tenant=new Tenant(this.tenentId,this.tenentName,this.presentAddress,this.permanentAddress,this.phoneNo,this.email,this.ocupation,this.propertyId)
    this.myservice.createtenent(this.tenant).subscribe();
  }

  saveuser(){
    this.name=this.tenentName;
    this.useremail=this.email;
    this.user=new User(this.userId,this.name,this.useremail,this.userName,this.password,this.role);
    this.myservice.createuser(this.user).subscribe();
    alert("work")
  }

}
