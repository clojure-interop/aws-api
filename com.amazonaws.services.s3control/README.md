# Bindings for com.amazonaws.services.s3control

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.amazonaws.services.s3control "1.0.0"]
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

- interface **com.amazonaws.services.s3control.AWSS3Control**
- interface **com.amazonaws.services.s3control.AWSS3ControlAsync**
- class **com.amazonaws.services.s3control.AWSS3ControlAsyncClient**
- class **com.amazonaws.services.s3control.AWSS3ControlAsyncClientBuilder**
- class **com.amazonaws.services.s3control.AWSS3ControlClient**
- class **com.amazonaws.services.s3control.AWSS3ControlClientBuilder**
- class **com.amazonaws.services.s3control.AbstractAWSS3Control**
- class **com.amazonaws.services.s3control.AbstractAWSS3ControlAsync**
- class **com.amazonaws.services.s3control.S3ControlClientOptions**
- class **com.amazonaws.services.s3control.S3ControlResponseMetadata**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
