# Bindings for com.amazonaws.services.fms

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.amazonaws.services.fms "1.0.0"]
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

- interface **com.amazonaws.services.fms.AWSFMS**
- interface **com.amazonaws.services.fms.AWSFMSAsync**
- class **com.amazonaws.services.fms.AWSFMSAsyncClient**
- class **com.amazonaws.services.fms.AWSFMSAsyncClientBuilder**
- class **com.amazonaws.services.fms.AWSFMSClient**
- class **com.amazonaws.services.fms.AWSFMSClientBuilder**
- class **com.amazonaws.services.fms.AbstractAWSFMS**
- class **com.amazonaws.services.fms.AbstractAWSFMSAsync**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
