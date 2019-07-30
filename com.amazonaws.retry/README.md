# Bindings for com.amazonaws.retry

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.amazonaws.retry "1.0.0"]
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

- class **com.amazonaws.retry.ClockSkewAdjuster$AdjustmentRequest**
- class **com.amazonaws.retry.ClockSkewAdjuster$ClockSkewAdjustment**
- class **com.amazonaws.retry.ClockSkewAdjuster**
- class **com.amazonaws.retry.PredefinedBackoffStrategies$EqualJitterBackoffStrategy**
- class **com.amazonaws.retry.PredefinedBackoffStrategies$ExponentialBackoffStrategy**
- class **com.amazonaws.retry.PredefinedBackoffStrategies$FullJitterBackoffStrategy**
- class **com.amazonaws.retry.PredefinedBackoffStrategies$SDKDefaultBackoffStrategy**
- class **com.amazonaws.retry.PredefinedBackoffStrategies**
- class **com.amazonaws.retry.PredefinedRetryPolicies$SDKDefaultRetryCondition**
- class **com.amazonaws.retry.PredefinedRetryPolicies**
- interface **com.amazonaws.retry.RetryPolicy$BackoffStrategy**
- interface **com.amazonaws.retry.RetryPolicy$RetryCondition**
- class **com.amazonaws.retry.RetryPolicy**
- class **com.amazonaws.retry.RetryPolicyAdapter**
- class **com.amazonaws.retry.RetryUtils**
- interface **com.amazonaws.retry.V2CompatibleBackoffStrategy**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
