# Bindings for com.amazonaws.services.neptune

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.amazonaws.services.neptune "1.0.0"]
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

- class **com.amazonaws.services.neptune.AbstractAmazonNeptune**
- class **com.amazonaws.services.neptune.AbstractAmazonNeptuneAsync**
- interface **com.amazonaws.services.neptune.AmazonNeptune**
- interface **com.amazonaws.services.neptune.AmazonNeptuneAsync**
- class **com.amazonaws.services.neptune.AmazonNeptuneAsyncClient**
- class **com.amazonaws.services.neptune.AmazonNeptuneAsyncClientBuilder**
- class **com.amazonaws.services.neptune.AmazonNeptuneClient**
- class **com.amazonaws.services.neptune.AmazonNeptuneClientBuilder**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
