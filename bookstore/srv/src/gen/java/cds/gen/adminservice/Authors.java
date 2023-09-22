package cds.gen.adminservice;

import cds.gen.sap.capire.bookstore.Books;
import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;

/**
 * Aspect for entities with canonical universal IDs
 *
 * See https://cap.cloud.sap/docs/cds/common#aspect-cuid
 */
@CdsName("AdminService.Authors")
@Generated(
    value = "cds-maven-plugin",
    date = "2023-09-22T14:55:46.690827800Z",
    comments = "com.sap.cds:cds-maven-plugin:2.2.0 / com.sap.cds:cds4j-api:2.2.0"
)
public interface Authors extends CdsData {
  String ID = "ID";

  String FIRSTNAME = "firstname";

  String LASTNAME = "lastname";

  String BOOKS = "books";

  @CdsName(ID)
  String getId();

  @CdsName(ID)
  void setId(String id);

  String getFirstname();

  void setFirstname(String firstname);

  String getLastname();

  void setLastname(String lastname);

  List<Books> getBooks();

  void setBooks(List<? extends Map<String, ?>> books);

  Authors_ ref();

  static Authors create() {
    return Struct.create(Authors.class);
  }

  static Authors create(String id) {
    Map<String, Object> keys = new HashMap<>();
    keys.put(ID, id);
    return Struct.access(keys).as(Authors.class);
  }
}
