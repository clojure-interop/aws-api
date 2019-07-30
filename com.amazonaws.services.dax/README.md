# Bindings for com.amazonaws.services.dax

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.amazonaws.services.dax "1.0.0"]
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

- class **com.amazonaws.services.dax.AbstractAmazonDax**
- class **com.amazonaws.services.dax.AbstractAmazonDaxAsync**
- interface **com.amazonaws.services.dax.AmazonDax**
- interface **com.amazonaws.services.dax.AmazonDaxAsync**
- class **com.amazonaws.services.dax.AmazonDaxAsyncClient**
- class **com.amazonaws.services.dax.AmazonDaxAsyncClientBuilder**
- class **com.amazonaws.services.dax.AmazonDaxClient**
- class **com.amazonaws.services.dax.AmazonDaxClientBuilder**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
