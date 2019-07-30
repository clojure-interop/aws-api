# Bindings for com.amazonaws.services.personalizeruntime

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.amazonaws.services.personalizeruntime "1.0.0"]
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

- class **com.amazonaws.services.personalizeruntime.AbstractAmazonPersonalizeRuntime**
- class **com.amazonaws.services.personalizeruntime.AbstractAmazonPersonalizeRuntimeAsync**
- interface **com.amazonaws.services.personalizeruntime.AmazonPersonalizeRuntime**
- interface **com.amazonaws.services.personalizeruntime.AmazonPersonalizeRuntimeAsync**
- class **com.amazonaws.services.personalizeruntime.AmazonPersonalizeRuntimeAsyncClient**
- class **com.amazonaws.services.personalizeruntime.AmazonPersonalizeRuntimeAsyncClientBuilder**
- class **com.amazonaws.services.personalizeruntime.AmazonPersonalizeRuntimeClient**
- class **com.amazonaws.services.personalizeruntime.AmazonPersonalizeRuntimeClientBuilder**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
