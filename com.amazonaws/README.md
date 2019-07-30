# Bindings for com.amazonaws

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.amazonaws "1.0.0"]
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

- class **com.amazonaws.AbortedException**
- class **com.amazonaws.AmazonClientException**
- enum **com.amazonaws.AmazonServiceException$ErrorType**
- class **com.amazonaws.AmazonServiceException**
- class **com.amazonaws.AmazonWebServiceClient**
- class **com.amazonaws.AmazonWebServiceRequest**
- class **com.amazonaws.AmazonWebServiceResponse**
- class **com.amazonaws.AmazonWebServiceResult**
- class **com.amazonaws.ApacheHttpClientConfig**
- class **com.amazonaws.ClientConfiguration**
- class **com.amazonaws.ClientConfigurationFactory**
- class **com.amazonaws.DefaultRequest**
- interface **com.amazonaws.DnsResolver**
- interface **com.amazonaws.HandlerContextAware**
- enum **com.amazonaws.HttpMethod**
- interface **com.amazonaws.ImmutableRequest**
- class **com.amazonaws.PredefinedClientConfigurations**
- enum **com.amazonaws.Protocol**
- enum **com.amazonaws.ProxyAuthenticationMethod**
- interface **com.amazonaws.ReadLimitInfo**
- interface **com.amazonaws.Request**
- enum **com.amazonaws.RequestClientOptions$Marker**
- class **com.amazonaws.RequestClientOptions**
- class **com.amazonaws.RequestConfig**
- class **com.amazonaws.ResetException**
- class **com.amazonaws.Response**
- class **com.amazonaws.ResponseMetadata**
- class **com.amazonaws.SDKGlobalConfiguration**
- class **com.amazonaws.SDKGlobalTime**
- class **com.amazonaws.SdkBaseException**
- class **com.amazonaws.SdkClientException**
- class **com.amazonaws.SdkThreadLocals**
- interface **com.amazonaws.SignableRequest**
- class **com.amazonaws.SystemDefaultDnsResolver**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
