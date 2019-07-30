# Bindings for com.amazonaws.services.fsx

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.amazonaws.services.fsx "1.0.0"]
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

- class **com.amazonaws.services.fsx.AbstractAmazonFSx**
- class **com.amazonaws.services.fsx.AbstractAmazonFSxAsync**
- interface **com.amazonaws.services.fsx.AmazonFSx**
- interface **com.amazonaws.services.fsx.AmazonFSxAsync**
- class **com.amazonaws.services.fsx.AmazonFSxAsyncClient**
- class **com.amazonaws.services.fsx.AmazonFSxAsyncClientBuilder**
- class **com.amazonaws.services.fsx.AmazonFSxClient**
- class **com.amazonaws.services.fsx.AmazonFSxClientBuilder**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
