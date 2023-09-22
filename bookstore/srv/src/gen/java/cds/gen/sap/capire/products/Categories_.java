package cds.gen.sap.capire.products;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Integer;
import java.lang.String;
import java.util.function.Function;
import javax.annotation.processing.Generated;

/**
 * Aspect for a code list with name and description
 *
 * See https://cap.cloud.sap/docs/cds/common#aspect-sapcommoncodelist
 */
@CdsName("sap.capire.products.Categories")
@Generated(
    value = "cds-maven-plugin",
    date = "2023-09-22T14:55:46.690827800Z",
    comments = "com.sap.cds:cds-maven-plugin:2.2.0 / com.sap.cds:cds4j-api:2.2.0"
)
public interface Categories_ extends StructuredType<Categories_> {
  String CDS_NAME = "sap.capire.products.Categories";

  ElementRef<String> name();

  ElementRef<String> descr();

  ElementRef<Integer> ID();

  Categories_ parent();

  Categories_ parent(Function<Categories_, CqnPredicate> filter);

  ElementRef<Integer> parent_ID();

  Categories_ children();

  Categories_ children(Function<Categories_, CqnPredicate> filter);

  CategoriesTexts_ texts();

  CategoriesTexts_ texts(Function<CategoriesTexts_, CqnPredicate> filter);

  CategoriesTexts_ localized();

  CategoriesTexts_ localized(Function<CategoriesTexts_, CqnPredicate> filter);
}
