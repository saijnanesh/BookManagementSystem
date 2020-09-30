import { Injectable } from '@angular/core';
import { HttpClient , HttpErrorResponse} from '@angular/common/http';

import {OrderDetailsEntity} from './model/OrderDetailsEntity'





@Injectable({
  providedIn: 'root'
})
export class OrderServiceService {
  url : string  = "http://localhost:8030/order/";

  constructor(private httpClient :HttpClient) { }

  listAllOrders(){
    console.log("In service");
    return this.httpClient.get("http://localhost:8030/order/listAllOrders");
  }

  getOrderById(id : number)
  {
    return this.httpClient.get(this.url + "getOrderById/" + id);
  }

  deleteOrderById(id : number)
  {
    return this.httpClient.delete(this.url + "deleteOrderById/" + id);
  }

  updateOrder(id : number , status : string)
  {
    return this.httpClient.put<OrderDetailsEntity>(this.url + "updateOrder/" + id + "/"+ status, OrderDetailsEntity);
  }

}
