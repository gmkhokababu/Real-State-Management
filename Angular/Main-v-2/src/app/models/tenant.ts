export class Tenant {
    id:any;
    name:any;
    presentAddress:any;
    permanentAddress:any;
    phoneNo:any;
    email:any;
    occupation:any;
    propertyId:any;
    constructor(id:any,name:any,presentAddress:any,permanentAddress:any,phoneNo:any,email:any,ocupation:any,propertyId:any){
        this.id=id;
        this.name=name;
        this.presentAddress=presentAddress;
        this.permanentAddress=permanentAddress;
        this.phoneNo=phoneNo;
        this.email=email;
        this.occupation=ocupation;
        this.propertyId=propertyId;
    }
}
