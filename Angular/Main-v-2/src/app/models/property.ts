export class Property {
    id:any;
    type:any;
    location:any;
    size:any;
    amenities:any;
    status:any;
    landlordId:any;
    constructor(propertyid:any,propertytype:any,location:any,size:any,amentity:any,status:any,landloard:any){
        this.id=propertyid;
        this.type=propertytype;
        this.location=location;
        this.size=size;
        this.amenities=amentity;
        this.status=status;
        this.landlordId=landloard;
    }
}
