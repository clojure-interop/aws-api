# Bindings for com.amazonaws.services.workdocs

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.amazonaws.services.workdocs "1.0.0"]
```

## Class Members Naming Conventions

| Class Member | Java | Clojure |
|:--|:--|:--|
| constructor | new File() | (->file) |
| instance method | getAnyValue() | (get-any-value) |
| instance field | instanceField | (-instance-field) |
| static method | staticMethod() | (*static-method) |
| static field | ANY_STATIC_FIELD | (*-any-static-field) |
| boolean field/method | isExists(), canUse() | (exists?), (can-use?) |

## Classes

- class **com.amazonaws.services.workdocs.AbstractAmazonWorkDocs**
- class **com.amazonaws.services.workdocs.AbstractAmazonWorkDocsAsync**
- interface **com.amazonaws.services.workdocs.AmazonWorkDocs**
- interface **com.amazonaws.services.workdocs.AmazonWorkDocsAsync**
- class **com.amazonaws.services.workdocs.AmazonWorkDocsAsyncClient**
- class **com.amazonaws.services.workdocs.AmazonWorkDocsAsyncClientBuilder**
- class **com.amazonaws.services.workdocs.AmazonWorkDocsClient**
- class **com.amazonaws.services.workdocs.AmazonWorkDocsClientBuilder**
- class **com.amazonaws.services.workdocs.ContentManager**
- class **com.amazonaws.services.workdocs.ContentManagerAsync**
- class **com.amazonaws.services.workdocs.ContentManagerAsyncBuilder**
- class **com.amazonaws.services.workdocs.ContentManagerBuilder**
- class **com.amazonaws.services.workdocs.GetDocumentStreamRequest**
- class **com.amazonaws.services.workdocs.GetDocumentStreamResult**
- class **com.amazonaws.services.workdocs.UploadDocumentStreamRequest**
- class **com.amazonaws.services.workdocs.UploadDocumentStreamResult**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
