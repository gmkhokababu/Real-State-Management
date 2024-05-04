import { Component, OnInit } from '@angular/core';
import { LoginService } from 'src/app/services/login.service';

@Component({
  selector: 'app-rent',
  templateUrl: './rent.component.html',
  styleUrls: ['./rent.component.css']
})
export class RentComponent implements OnInit {

  allproperty:any=[];
  constructor(private myservice:LoginService) {
    this.myservice.showall().subscribe((x)=>{this.allproperty=x});
   }

  ngOnInit(): void {
  }
  check:boolean=false;

  m(){
    if (this.allproperty!=null){
      this.check=true;
      this.myservice.showall().subscribe((x)=>{this.allproperty=x});
    }
  }
  

}
