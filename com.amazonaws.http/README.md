# Bindings for com.amazonaws.http

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.amazonaws.http "1.0.0"]
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

- class **com.amazonaws.http.AmazonHttpClient$Builder**
- interface **com.amazonaws.http.AmazonHttpClient$RequestExecutionBuilder**
- class **com.amazonaws.http.AmazonHttpClient**
- class **com.amazonaws.http.DefaultErrorResponseHandler**
- class **com.amazonaws.http.DelegatingDnsResolver**
- class **com.amazonaws.http.ExecutionContext$Builder**
- class **com.amazonaws.http.ExecutionContext**
- enum **com.amazonaws.http.HttpMethodName**
- class **com.amazonaws.http.HttpResponse**
- interface **com.amazonaws.http.HttpResponseHandler**
- class **com.amazonaws.http.IdleConnectionReaper**
- class **com.amazonaws.http.JsonErrorResponseHandler**
- class **com.amazonaws.http.JsonResponseHandler**
- class **com.amazonaws.http.RepeatableInputStreamRequestEntity**
- class **com.amazonaws.http.SdkHttpMetadata**
- class **com.amazonaws.http.StaxResponseHandler**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
