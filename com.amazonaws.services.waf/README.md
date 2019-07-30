# Bindings for com.amazonaws.services.waf

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.amazonaws.services.waf "1.0.0"]
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

- interface **com.amazonaws.services.waf.AWSWAF**
- interface **com.amazonaws.services.waf.AWSWAFAsync**
- class **com.amazonaws.services.waf.AWSWAFAsyncClient**
- class **com.amazonaws.services.waf.AWSWAFAsyncClientBuilder**
- class **com.amazonaws.services.waf.AWSWAFClient**
- class **com.amazonaws.services.waf.AWSWAFClientBuilder**
- interface **com.amazonaws.services.waf.AWSWAFRegional**
- interface **com.amazonaws.services.waf.AWSWAFRegionalAsync**
- class **com.amazonaws.services.waf.AWSWAFRegionalAsyncClient**
- class **com.amazonaws.services.waf.AWSWAFRegionalAsyncClientBuilder**
- class **com.amazonaws.services.waf.AWSWAFRegionalClient**
- class **com.amazonaws.services.waf.AWSWAFRegionalClientBuilder**
- class **com.amazonaws.services.waf.AbstractAWSWAF**
- class **com.amazonaws.services.waf.AbstractAWSWAFAsync**
- class **com.amazonaws.services.waf.AbstractAWSWAFRegional**
- class **com.amazonaws.services.waf.AbstractAWSWAFRegionalAsync**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
