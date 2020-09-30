import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { DatatransferbetweenthecomponentsService } from '../datatransferbetweenthecomponents.service';
import { OrderServiceService } from '../order-service.service';

@Component({
  selector: 'app-list-all-orders',
  templateUrl: './list-all-orders.component.html',
  styleUrls: ['./list-all-orders.component.css']
})
export class ListAllOrdersComponent implements OnInit {
  orderDto;

  constructor(private orderService : OrderServiceService , private router : Router ,private dataTransfer :DatatransferbetweenthecomponentsService) { }

  ngOnInit() {
  }
  


  getAllOrders()
  {
    console.log("ji");
    this.orderService.listAllOrders().subscribe((data) => 
    {
      console.log("hi");
      this.orderDto = data;
      console.log(this.orderDto);
    },error => {
      console.log(error.error)
      if(error.error == null)
      this.orderDto =null;
    }
    )
  }

  updateOrder(id: number)
  {
    this.dataTransfer.setOrderId(id);
    this.router.navigate(["/updatedeleteorder"]);
  }

  deleteOrder(id: number)
  {
    this.orderService.deleteOrderById(id).subscribe((data) => 
    {
      console.log("Product Deleted Successfully");
      this.getAllOrders();
    },
    error =>{
      console.log(error.error)
      this.getAllOrders();
    }
    )
  }


  


}
