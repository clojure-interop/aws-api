# Bindings for com.amazonaws.internal

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.amazonaws.internal "1.0.0"]
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

- class **com.amazonaws.internal.AmazonWebServiceRequestAdapter**
- class **com.amazonaws.internal.CRC32MismatchException**
- class **com.amazonaws.internal.ConnectionUtils**
- class **com.amazonaws.internal.CredentialsEndpointProvider**
- class **com.amazonaws.internal.CustomBackoffStrategy**
- class **com.amazonaws.internal.DateTimeJsonSerializer**
- class **com.amazonaws.internal.DefaultServiceEndpointBuilder**
- class **com.amazonaws.internal.DelegateInputStream**
- class **com.amazonaws.internal.DelegateSSLSocket**
- class **com.amazonaws.internal.DelegateSocket**
- class **com.amazonaws.internal.DynamoDBBackoffStrategy**
- class **com.amazonaws.internal.EC2CredentialsUtils**
- class **com.amazonaws.internal.EC2MetadataClient**
- class **com.amazonaws.internal.FIFOCache**
- class **com.amazonaws.internal.IdentityEndpointBuilder**
- class **com.amazonaws.internal.ListWithAutoConstructFlag**
- interface **com.amazonaws.internal.MetricAware**
- class **com.amazonaws.internal.MetricsInputStream**
- interface **com.amazonaws.internal.Releasable**
- class **com.amazonaws.internal.ReleasableInputStream**
- class **com.amazonaws.internal.ResettableInputStream**
- class **com.amazonaws.internal.SdkBufferedInputStream**
- class **com.amazonaws.internal.SdkDigestInputStream**
- class **com.amazonaws.internal.SdkFilterInputStream**
- class **com.amazonaws.internal.SdkFilterOutputStream**
- interface **com.amazonaws.internal.SdkFunction**
- class **com.amazonaws.internal.SdkInputStream**
- class **com.amazonaws.internal.SdkInternalList**
- class **com.amazonaws.internal.SdkInternalMap**
- class **com.amazonaws.internal.SdkMetricsSocket**
- class **com.amazonaws.internal.SdkPredicate**
- class **com.amazonaws.internal.SdkSSLContext**
- class **com.amazonaws.internal.SdkSSLMetricsSocket**
- class **com.amazonaws.internal.SdkSSLSocket**
- class **com.amazonaws.internal.SdkSocket**
- class **com.amazonaws.internal.SdkThreadLocalsRegistry**
- class **com.amazonaws.internal.ServiceEndpointBuilder**
- class **com.amazonaws.internal.StaticCredentialsProvider**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
