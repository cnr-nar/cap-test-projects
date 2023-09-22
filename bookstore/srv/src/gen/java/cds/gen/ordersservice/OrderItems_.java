package cds.gen.ordersservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Integer;
import java.lang.String;
import java.math.BigDecimal;
import java.util.function.Function;
import javax.annotation.processing.Generated;

/**
 * Aspect for entities with canonical universal IDs
 *
 * See https://cap.cloud.sap/docs/cds/common#aspect-cuid
 */
@CdsName("OrdersService.OrderItems")
@Generated(
    value = "cds-maven-plugin",
    date = "2023-09-22T14:55:46.690827800Z",
    comments = "com.sap.cds:cds-maven-plugin:2.2.0 / com.sap.cds:cds4j-api:2.2.0"
)
public interface OrderItems_ extends StructuredType<OrderItems_> {
  String CDS_NAME = "OrdersService.OrderItems";

  ElementRef<String> ID();

  Orders_ parent();

  Orders_ parent(Function<Orders_, CqnPredicate> filter);

  ElementRef<String> parent_ID();

  ElementRef<String> book_ID();

  ElementRef<Integer> amount();

  ElementRef<BigDecimal> netAmount();
}
