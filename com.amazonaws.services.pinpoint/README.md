# Bindings for com.amazonaws.services.pinpoint

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.amazonaws.services.pinpoint "1.0.0"]
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

- class **com.amazonaws.services.pinpoint.AbstractAmazonPinpoint**
- class **com.amazonaws.services.pinpoint.AbstractAmazonPinpointAsync**
- interface **com.amazonaws.services.pinpoint.AmazonPinpoint**
- interface **com.amazonaws.services.pinpoint.AmazonPinpointAsync**
- class **com.amazonaws.services.pinpoint.AmazonPinpointAsyncClient**
- class **com.amazonaws.services.pinpoint.AmazonPinpointAsyncClientBuilder**
- class **com.amazonaws.services.pinpoint.AmazonPinpointClient**
- class **com.amazonaws.services.pinpoint.AmazonPinpointClientBuilder**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
