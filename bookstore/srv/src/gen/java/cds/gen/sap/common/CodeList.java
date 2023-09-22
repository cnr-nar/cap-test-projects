package cds.gen.sap.common;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;
import javax.annotation.processing.Generated;

/**
 * Aspect for a code list with name and description
 *
 * See https://cap.cloud.sap/docs/cds/common#aspect-sapcommoncodelist
 */
@CdsName("sap.common.CodeList")
@Generated(
    value = "cds-maven-plugin",
    date = "2023-09-22T14:55:46.690827800Z",
    comments = "com.sap.cds:cds-maven-plugin:2.2.0 / com.sap.cds:cds4j-api:2.2.0"
)
public interface CodeList extends CdsData {
  String NAME = "name";

  String DESCR = "descr";

  String getName();

  void setName(String name);

  String getDescr();

  void setDescr(String descr);

  static CodeList create() {
    return Struct.create(CodeList.class);
  }
}
