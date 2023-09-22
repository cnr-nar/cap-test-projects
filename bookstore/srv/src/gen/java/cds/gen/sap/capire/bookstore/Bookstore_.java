package cds.gen.sap.capire.bookstore;

import com.sap.cds.ql.CdsName;
import java.lang.Class;
import java.lang.String;
import javax.annotation.processing.Generated;

@Generated(
    value = "cds-maven-plugin",
    date = "2023-09-22T14:55:46.690827800Z",
    comments = "com.sap.cds:cds-maven-plugin:2.2.0 / com.sap.cds:cds4j-api:2.2.0"
)
@CdsName("sap.capire.bookstore")
public interface Bookstore_ {
  String CDS_NAME = "sap.capire.bookstore";

  Class<Authors_> AUTHORS = Authors_.class;

  Class<Orders_> ORDERS = Orders_.class;

  Class<OrderItems_> ORDER_ITEMS = OrderItems_.class;

  Class<Books_> BOOKS = Books_.class;
}
