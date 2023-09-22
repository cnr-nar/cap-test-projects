package cds.gen.ordersservice;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
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
public interface OrderItems extends CdsData {
  String ID = "ID";

  String PARENT = "parent";

  String PARENT_ID = "parent_ID";

  String BOOK_ID = "book_ID";

  String AMOUNT = "amount";

  String NET_AMOUNT = "netAmount";

  @CdsName(ID)
  String getId();

  @CdsName(ID)
  void setId(String id);

  Orders getParent();

  void setParent(Map<String, ?> parent);

  @CdsName(PARENT_ID)
  String getParentId();

  @CdsName(PARENT_ID)
  void setParentId(String parentId);

  @CdsName(BOOK_ID)
  String getBookId();

  @CdsName(BOOK_ID)
  void setBookId(String bookId);

  Integer getAmount();

  void setAmount(Integer amount);

  BigDecimal getNetAmount();

  void setNetAmount(BigDecimal netAmount);

  OrderItems_ ref();

  static OrderItems create() {
    return Struct.create(OrderItems.class);
  }

  static OrderItems create(String id) {
    Map<String, Object> keys = new HashMap<>();
    keys.put(ID, id);
    return Struct.access(keys).as(OrderItems.class);
  }
}
