package cds.gen.booksservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.String;
import javax.annotation.processing.Generated;

@CdsName("BooksService.Books.texts")
@Generated(
    value = "cds-maven-plugin",
    date = "2023-09-22T14:55:46.690827800Z",
    comments = "com.sap.cds:cds-maven-plugin:2.2.0 / com.sap.cds:cds4j-api:2.2.0"
)
public interface BooksTexts_ extends StructuredType<BooksTexts_> {
  String CDS_NAME = "BooksService.Books.texts";

  ElementRef<String> locale();

  ElementRef<String> ID();

  ElementRef<String> title();

  ElementRef<String> descr();
}
