import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ListAllOrdersComponent } from './list-all-orders/list-all-orders.component';
import { UpdateOrderComponent } from './update-order/update-order.component';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { GetProductByIdComponent } from './get-product-by-id/get-product-by-id.component';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@NgModule({
  declarations: [
    AppComponent,
    ListAllOrdersComponent,
    UpdateOrderComponent,
    GetProductByIdComponent
  ],
  imports: [
    BrowserModule, AppRoutingModule, HttpClientModule ,FormsModule ,CommonModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
