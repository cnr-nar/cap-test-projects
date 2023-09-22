package cds.gen.booksservice;

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
 * Aspect to capture changes by user and name
 *
 * See https://cap.cloud.sap/docs/cds/common#aspect-managed
 */
@CdsName("BooksService.Books")
@Generated(
    value = "cds-maven-plugin",
    date = "2023-09-22T14:55:46.690827800Z",
    comments = "com.sap.cds:cds-maven-plugin:2.2.0 / com.sap.cds:cds4j-api:2.2.0"
)
public interface Books_ extends StructuredType<Books_> {
  String CDS_NAME = "BooksService.Books";

  ElementRef<String> ID();

  ElementRef<String> title();

  ElementRef<String> descr();

  ElementRef<Integer> stock();

  ElementRef<BigDecimal> price();

  Currencies_ currency();

  Currencies_ currency(Function<Currencies_, CqnPredicate> filter);

  ElementRef<String> currency_code();

  Authors_ author();

  Authors_ author(Function<Authors_, CqnPredicate> filter);

  ElementRef<String> author_ID();

  BooksTexts_ texts();

  BooksTexts_ texts(Function<BooksTexts_, CqnPredicate> filter);

  BooksTexts_ localized();

  BooksTexts_ localized(Function<BooksTexts_, CqnPredicate> filter);

  Categories_ genre();

  Categories_ genre(Function<Categories_, CqnPredicate> filter);

  ElementRef<Integer> genre_ID();
}
