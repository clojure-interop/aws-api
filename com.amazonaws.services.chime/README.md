# Bindings for com.amazonaws.services.chime

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.amazonaws.services.chime "1.0.0"]
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

- class **com.amazonaws.services.chime.AbstractAmazonChime**
- class **com.amazonaws.services.chime.AbstractAmazonChimeAsync**
- interface **com.amazonaws.services.chime.AmazonChime**
- interface **com.amazonaws.services.chime.AmazonChimeAsync**
- class **com.amazonaws.services.chime.AmazonChimeAsyncClient**
- class **com.amazonaws.services.chime.AmazonChimeAsyncClientBuilder**
- class **com.amazonaws.services.chime.AmazonChimeClient**
- class **com.amazonaws.services.chime.AmazonChimeClientBuilder**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
