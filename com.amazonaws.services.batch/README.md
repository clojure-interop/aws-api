# Bindings for com.amazonaws.services.batch

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.amazonaws.services.batch "1.0.0"]
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

- interface **com.amazonaws.services.batch.AWSBatch**
- interface **com.amazonaws.services.batch.AWSBatchAsync**
- class **com.amazonaws.services.batch.AWSBatchAsyncClient**
- class **com.amazonaws.services.batch.AWSBatchAsyncClientBuilder**
- class **com.amazonaws.services.batch.AWSBatchClient**
- class **com.amazonaws.services.batch.AWSBatchClientBuilder**
- class **com.amazonaws.services.batch.AbstractAWSBatch**
- class **com.amazonaws.services.batch.AbstractAWSBatchAsync**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
