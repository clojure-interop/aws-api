# Bindings for com.amazonaws.services.s3

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.amazonaws.services.s3 "1.0.0"]
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

- class **com.amazonaws.services.s3.AbstractAmazonS3**
- interface **com.amazonaws.services.s3.AmazonS3**
- class **com.amazonaws.services.s3.AmazonS3Builder**
- class **com.amazonaws.services.s3.AmazonS3Client**
- class **com.amazonaws.services.s3.AmazonS3ClientBuilder**
- interface **com.amazonaws.services.s3.AmazonS3Encryption**
- class **com.amazonaws.services.s3.AmazonS3EncryptionClient**
- class **com.amazonaws.services.s3.AmazonS3EncryptionClientBuilder**
- class **com.amazonaws.services.s3.AmazonS3EncryptionClientParamsWrapper**
- class **com.amazonaws.services.s3.AmazonS3URI**
- interface **com.amazonaws.services.s3.Headers**
- class **com.amazonaws.services.s3.KeyWrapException**
- interface **com.amazonaws.services.s3.OnFileDelete**
- class **com.amazonaws.services.s3.S3ClientOptions$Builder**
- class **com.amazonaws.services.s3.S3ClientOptions**
- class **com.amazonaws.services.s3.S3ResponseMetadata**
- class **com.amazonaws.services.s3.UploadObjectObserver**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
