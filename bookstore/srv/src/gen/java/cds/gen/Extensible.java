package cds.gen;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;
import javax.annotation.processing.Generated;

/**
 * Aspects for extensible entities.
 */
@CdsName("extensible")
@Generated(
    value = "cds-maven-plugin",
    date = "2023-09-22T14:55:46.690827800Z",
    comments = "com.sap.cds:cds-maven-plugin:2.2.0 / com.sap.cds:cds4j-api:2.2.0"
)
public interface Extensible extends CdsData {
  String EXTENSIONS_ = "extensions__";

  @CdsName(EXTENSIONS_)
  String getExtensions();

  @CdsName(EXTENSIONS_)
  void setExtensions(String extensions);

  static Extensible create() {
    return Struct.create(Extensible.class);
  }
}
