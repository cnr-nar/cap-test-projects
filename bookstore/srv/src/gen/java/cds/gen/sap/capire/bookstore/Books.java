package cds.gen.sap.capire.bookstore;

import cds.gen.sap.capire.products.Categories;
import cds.gen.sap.capire.products.ProductsTexts;
import cds.gen.sap.common.Currencies;
import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;

/**
 * Aspect to capture changes by user and name
 *
 * See https://cap.cloud.sap/docs/cds/common#aspect-managed
 */
@CdsName("sap.capire.bookstore.Books")
@Generated(
    value = "cds-maven-plugin",
    date = "2023-09-22T14:55:46.690827800Z",
    comments = "com.sap.cds:cds-maven-plugin:2.2.0 / com.sap.cds:cds4j-api:2.2.0"
)
public interface Books extends CdsData {
  String ID = "ID";

  String CREATED_AT = "createdAt";

  String CREATED_BY = "createdBy";

  String MODIFIED_AT = "modifiedAt";

  String MODIFIED_BY = "modifiedBy";

  String TITLE = "title";

  String DESCR = "descr";

  String STOCK = "stock";

  String PRICE = "price";

  String CURRENCY = "currency";

  String CURRENCY_CODE = "currency_code";

  String CATEGORY = "category";

  String CATEGORY_ID = "category_ID";

  String AUTHOR = "author";

  String AUTHOR_ID = "author_ID";

  String TEXTS = "texts";

  String LOCALIZED = "localized";

  @CdsName(ID)
  String getId();

  @CdsName(ID)
  void setId(String id);

  Instant getCreatedAt();

  void setCreatedAt(Instant createdAt);

  /**
   * Canonical user ID
   */
  String getCreatedBy();

  /**
   * Canonical user ID
   */
  void setCreatedBy(String createdBy);

  Instant getModifiedAt();

  void setModifiedAt(Instant modifiedAt);

  /**
   * Canonical user ID
   */
  String getModifiedBy();

  /**
   * Canonical user ID
   */
  void setModifiedBy(String modifiedBy);

  String getTitle();

  void setTitle(String title);

  String getDescr();

  void setDescr(String descr);

  Integer getStock();

  void setStock(Integer stock);

  BigDecimal getPrice();

  void setPrice(BigDecimal price);

  /**
   * Type for an association to Currencies
   *
   * See https://cap.cloud.sap/docs/cds/common#type-currency
   */
  Currencies getCurrency();

  /**
   * Type for an association to Currencies
   *
   * See https://cap.cloud.sap/docs/cds/common#type-currency
   */
  void setCurrency(Map<String, ?> currency);

  @CdsName(CURRENCY_CODE)
  String getCurrencyCode();

  @CdsName(CURRENCY_CODE)
  void setCurrencyCode(String currencyCode);

  Categories getCategory();

  void setCategory(Map<String, ?> category);

  @CdsName(CATEGORY_ID)
  Integer getCategoryId();

  @CdsName(CATEGORY_ID)
  void setCategoryId(Integer categoryId);

  Authors getAuthor();

  void setAuthor(Map<String, ?> author);

  @CdsName(AUTHOR_ID)
  String getAuthorId();

  @CdsName(AUTHOR_ID)
  void setAuthorId(String authorId);

  List<ProductsTexts> getTexts();

  void setTexts(List<? extends Map<String, ?>> texts);

  ProductsTexts getLocalized();

  void setLocalized(Map<String, ?> localized);

  Books_ ref();

  static Books create() {
    return Struct.create(Books.class);
  }

  static Books create(String id) {
    Map<String, Object> keys = new HashMap<>();
    keys.put(ID, id);
    return Struct.access(keys).as(Books.class);
  }
}
