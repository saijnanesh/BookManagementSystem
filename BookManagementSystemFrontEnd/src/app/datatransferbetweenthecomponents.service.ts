import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DatatransferbetweenthecomponentsService {
  orderId : number;
  constructor() { }

  setOrderId(id:number)
  {
    this.orderId = id;
  }

  getOrderId()
  {
    return this.orderId;
  }

}
