import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { DatatransferbetweenthecomponentsService } from '../datatransferbetweenthecomponents.service';
import { OrderServiceService } from '../order-service.service';

@Component({
  selector: 'app-get-product-by-id',
  templateUrl: './get-product-by-id.component.html',
  styleUrls: ['./get-product-by-id.component.css']
})
export class GetProductByIdComponent implements OnInit {
orderDto;
idToEdit : number;
  constructor(private orderService : OrderServiceService , private router : Router , private dataTransfer : DatatransferbetweenthecomponentsService) {
   }

  ngOnInit() {
  }

}
