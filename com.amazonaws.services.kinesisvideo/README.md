# Bindings for com.amazonaws.services.kinesisvideo

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.amazonaws.services.kinesisvideo "1.0.0"]
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

- class **com.amazonaws.services.kinesisvideo.AbstractAmazonKinesisVideo**
- class **com.amazonaws.services.kinesisvideo.AbstractAmazonKinesisVideoArchivedMedia**
- class **com.amazonaws.services.kinesisvideo.AbstractAmazonKinesisVideoArchivedMediaAsync**
- class **com.amazonaws.services.kinesisvideo.AbstractAmazonKinesisVideoAsync**
- class **com.amazonaws.services.kinesisvideo.AbstractAmazonKinesisVideoMedia**
- class **com.amazonaws.services.kinesisvideo.AbstractAmazonKinesisVideoMediaAsync**
- class **com.amazonaws.services.kinesisvideo.AbstractAmazonKinesisVideoPutMedia**
- interface **com.amazonaws.services.kinesisvideo.AmazonKinesisVideo**
- interface **com.amazonaws.services.kinesisvideo.AmazonKinesisVideoArchivedMedia**
- interface **com.amazonaws.services.kinesisvideo.AmazonKinesisVideoArchivedMediaAsync**
- class **com.amazonaws.services.kinesisvideo.AmazonKinesisVideoArchivedMediaAsyncClient**
- class **com.amazonaws.services.kinesisvideo.AmazonKinesisVideoArchivedMediaAsyncClientBuilder**
- class **com.amazonaws.services.kinesisvideo.AmazonKinesisVideoArchivedMediaClient**
- class **com.amazonaws.services.kinesisvideo.AmazonKinesisVideoArchivedMediaClientBuilder**
- interface **com.amazonaws.services.kinesisvideo.AmazonKinesisVideoAsync**
- class **com.amazonaws.services.kinesisvideo.AmazonKinesisVideoAsyncClient**
- class **com.amazonaws.services.kinesisvideo.AmazonKinesisVideoAsyncClientBuilder**
- class **com.amazonaws.services.kinesisvideo.AmazonKinesisVideoClient**
- class **com.amazonaws.services.kinesisvideo.AmazonKinesisVideoClientBuilder**
- interface **com.amazonaws.services.kinesisvideo.AmazonKinesisVideoMedia**
- interface **com.amazonaws.services.kinesisvideo.AmazonKinesisVideoMediaAsync**
- class **com.amazonaws.services.kinesisvideo.AmazonKinesisVideoMediaAsyncClient**
- class **com.amazonaws.services.kinesisvideo.AmazonKinesisVideoMediaAsyncClientBuilder**
- class **com.amazonaws.services.kinesisvideo.AmazonKinesisVideoMediaClient**
- class **com.amazonaws.services.kinesisvideo.AmazonKinesisVideoMediaClientBuilder**
- interface **com.amazonaws.services.kinesisvideo.AmazonKinesisVideoPutMedia**
- class **com.amazonaws.services.kinesisvideo.AmazonKinesisVideoPutMediaClient**
- class **com.amazonaws.services.kinesisvideo.AmazonKinesisVideoPutMediaClientBuilder**
- interface **com.amazonaws.services.kinesisvideo.PutMediaAckResponseHandler**
- interface **com.amazonaws.services.kinesisvideo.PutMediaResponseHandler**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
