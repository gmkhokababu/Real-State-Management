import { Component, OnInit } from '@angular/core';
import { Property } from 'src/app/models/property';
import { LoginService } from 'src/app/services/login.service';

@Component({
  selector: 'app-listing-form',
  templateUrl: './listing-form.component.html',
  styleUrls: ['./listing-form.component.css']
})
export class ListingFormComponent implements OnInit {

  propertyId:any;
  type:any;
  location:any;
  size:any;
  details:any;
  status:any;
  landlordId:any;

  property:any;

  constructor(private myservice:LoginService) { }

  ngOnInit(): void {
  }
  saveproperty(){
    this.property=new Property(this.propertyId,this.type,this.location,this.size,this.details,this.status,this.landlordId);
    this.myservice.saveproperty(this.property).subscribe();
  }

}
