# Bindings for com.amazonaws.services.lightsail

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.amazonaws.services.lightsail "1.0.0"]
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

- class **com.amazonaws.services.lightsail.AbstractAmazonLightsail**
- class **com.amazonaws.services.lightsail.AbstractAmazonLightsailAsync**
- interface **com.amazonaws.services.lightsail.AmazonLightsail**
- interface **com.amazonaws.services.lightsail.AmazonLightsailAsync**
- class **com.amazonaws.services.lightsail.AmazonLightsailAsyncClient**
- class **com.amazonaws.services.lightsail.AmazonLightsailAsyncClientBuilder**
- class **com.amazonaws.services.lightsail.AmazonLightsailClient**
- class **com.amazonaws.services.lightsail.AmazonLightsailClientBuilder**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
