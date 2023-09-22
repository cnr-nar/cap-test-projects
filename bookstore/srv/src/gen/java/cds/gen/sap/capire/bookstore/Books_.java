package cds.gen.sap.capire.bookstore;

import cds.gen.sap.capire.products.Categories_;
import cds.gen.sap.capire.products.ProductsTexts_;
import cds.gen.sap.common.Currencies_;
import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Integer;
import java.lang.String;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.function.Function;
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
public interface Books_ extends StructuredType<Books_> {
  String CDS_NAME = "sap.capire.bookstore.Books";

  ElementRef<String> ID();

  ElementRef<Instant> createdAt();

  ElementRef<String> createdBy();

  ElementRef<Instant> modifiedAt();

  ElementRef<String> modifiedBy();

  ElementRef<String> title();

  ElementRef<String> descr();

  ElementRef<Integer> stock();

  ElementRef<BigDecimal> price();

  Currencies_ currency();

  Currencies_ currency(Function<Currencies_, CqnPredicate> filter);

  ElementRef<String> currency_code();

  Categories_ category();

  Categories_ category(Function<Categories_, CqnPredicate> filter);

  ElementRef<Integer> category_ID();

  Authors_ author();

  Authors_ author(Function<Authors_, CqnPredicate> filter);

  ElementRef<String> author_ID();

  ProductsTexts_ texts();

  ProductsTexts_ texts(Function<ProductsTexts_, CqnPredicate> filter);

  ProductsTexts_ localized();

  ProductsTexts_ localized(Function<ProductsTexts_, CqnPredicate> filter);
}
