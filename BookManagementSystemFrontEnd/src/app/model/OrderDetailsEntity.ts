export class OrderDetailsEntity{
    orderId : number;
    bookCopies : number;
    orderedBy :string;
    paymentMethod :string;
    status : string;
    total : number;
    orderDate : Date;
    expectedDateOfDelivery : Date;
}