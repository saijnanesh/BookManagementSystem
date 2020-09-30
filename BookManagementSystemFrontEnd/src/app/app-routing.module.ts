import {Routes , RouterModule} from '@angular/router'
import {NgModule , Component} from "@angular/core";
import { ListAllOrdersComponent } from './list-all-orders/list-all-orders.component';
import { UpdateOrderComponent } from './update-order/update-order.component';


const routes: Routes = [   
    {path: "updatedeleteorder" ,component : UpdateOrderComponent},
     {path : "displayorder" ,component : ListAllOrdersComponent}
];


@NgModule(
    {
        imports: [RouterModule.forRoot(routes)],
        exports : [RouterModule]
    }
)

export class AppRoutingModule{

}