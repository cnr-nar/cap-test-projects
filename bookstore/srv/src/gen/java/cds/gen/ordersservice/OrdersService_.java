package cds.gen.ordersservice;

import com.sap.cds.ql.CdsName;
import java.lang.Class;
import java.lang.String;
import javax.annotation.processing.Generated;

@Generated(
    value = "cds-maven-plugin",
    date = "2023-09-22T14:55:46.690827800Z",
    comments = "com.sap.cds:cds-maven-plugin:2.2.0 / com.sap.cds:cds4j-api:2.2.0"
)
@CdsName("OrdersService")
public interface OrdersService_ {
  String CDS_NAME = "OrdersService";

  Class<Orders_> ORDERS = Orders_.class;

  Class<Currencies_> CURRENCIES = Currencies_.class;

  Class<OrderItems_> ORDER_ITEMS = OrderItems_.class;

  Class<CurrenciesTexts_> CURRENCIES_TEXTS = CurrenciesTexts_.class;
}
