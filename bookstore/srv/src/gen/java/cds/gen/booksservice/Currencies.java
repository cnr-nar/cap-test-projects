package cds.gen.booksservice;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Short;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;

/**
 * Code list for currencies
 *
 * See https://cap.cloud.sap/docs/cds/common#entity-sapcommoncurrencies
 */
@CdsName("BooksService.Currencies")
@Generated(
    value = "cds-maven-plugin",
    date = "2023-09-22T14:55:46.690827800Z",
    comments = "com.sap.cds:cds-maven-plugin:2.2.0 / com.sap.cds:cds4j-api:2.2.0"
)
public interface Currencies extends CdsData {
  String NAME = "name";

  String DESCR = "descr";

  String CODE = "code";

  String SYMBOL = "symbol";

  String MINOR_UNIT = "minorUnit";

  String TEXTS = "texts";

  String LOCALIZED = "localized";

  String getName();

  void setName(String name);

  String getDescr();

  void setDescr(String descr);

  String getCode();

  void setCode(String code);

  String getSymbol();

  void setSymbol(String symbol);

  Short getMinorUnit();

  void setMinorUnit(Short minorUnit);

  List<CurrenciesTexts> getTexts();

  void setTexts(List<? extends Map<String, ?>> texts);

  CurrenciesTexts getLocalized();

  void setLocalized(Map<String, ?> localized);

  Currencies_ ref();

  static Currencies create() {
    return Struct.create(Currencies.class);
  }

  static Currencies create(String code) {
    Map<String, Object> keys = new HashMap<>();
    keys.put(CODE, code);
    return Struct.access(keys).as(Currencies.class);
  }
}
