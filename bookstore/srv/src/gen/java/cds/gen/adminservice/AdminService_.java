package cds.gen.adminservice;

import com.sap.cds.ql.CdsName;
import java.lang.Class;
import java.lang.String;
import javax.annotation.processing.Generated;

@Generated(
    value = "cds-maven-plugin",
    date = "2023-09-22T14:55:46.690827800Z",
    comments = "com.sap.cds:cds-maven-plugin:2.2.0 / com.sap.cds:cds4j-api:2.2.0"
)
@CdsName("AdminService")
public interface AdminService_ {
  String CDS_NAME = "AdminService";

  Class<CategoriesTexts_> CATEGORIES_TEXTS = CategoriesTexts_.class;

  Class<Authors_> AUTHORS = Authors_.class;

  Class<Currencies_> CURRENCIES = Currencies_.class;

  Class<CurrenciesTexts_> CURRENCIES_TEXTS = CurrenciesTexts_.class;

  Class<Products_> PRODUCTS = Products_.class;

  Class<Categories_> CATEGORIES = Categories_.class;

  Class<ProductsTexts_> PRODUCTS_TEXTS = ProductsTexts_.class;
}
