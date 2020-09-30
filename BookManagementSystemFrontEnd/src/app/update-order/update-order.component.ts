import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { DatatransferbetweenthecomponentsService } from '../datatransferbetweenthecomponents.service';
import { OrderDetailsEntity } from '../model/OrderDetailsEntity';
import { OrderServiceService } from '../order-service.service';

@Component({
  selector: 'app-update-order',
  templateUrl: './update-order.component.html',
  styleUrls: ['./update-order.component.css']
})
export class UpdateOrderComponent implements OnInit {
  orderDto : any;
  idToEdit : number;
  orderId : number;
 status:string;



  constructor(private orderService : OrderServiceService , private router : Router , private dataTransfer : DatatransferbetweenthecomponentsService) { }


  ngOnInit() {
    this.idToEdit = this.dataTransfer.getOrderId();
    this.getProduct();
    console.log(this.idToEdit);
  }

  getProduct()
  {
    if(this.idToEdit>0)
    {
      this.orderService.getOrderById(this.idToEdit).subscribe((data) => 
      {
        this.orderDto = data;
        console.log(this.orderDto);
      },
      error =>
      {
        console.log(error.error);
      }
      );
    }
    else{
      this.router.navigate(["/displayorder"])
    }
  }


  updateProduct()
  {
    this.orderService.updateOrder(this.idToEdit ,this.orderDto.status).subscribe((data) =>{

      this.orderDto = data;
      this.router.navigate(["/displayorder"]);   
    },
    error =>
    {
      console.log(error.error);
      this.router.navigate(["/displayorder"])
      
    }
    );
  }


}
