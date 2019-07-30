# Bindings for com.amazonaws.services.autoscalingplans

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.amazonaws.services.autoscalingplans "1.0.0"]
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

- interface **com.amazonaws.services.autoscalingplans.AWSAutoScalingPlans**
- interface **com.amazonaws.services.autoscalingplans.AWSAutoScalingPlansAsync**
- class **com.amazonaws.services.autoscalingplans.AWSAutoScalingPlansAsyncClient**
- class **com.amazonaws.services.autoscalingplans.AWSAutoScalingPlansAsyncClientBuilder**
- class **com.amazonaws.services.autoscalingplans.AWSAutoScalingPlansClient**
- class **com.amazonaws.services.autoscalingplans.AWSAutoScalingPlansClientBuilder**
- class **com.amazonaws.services.autoscalingplans.AbstractAWSAutoScalingPlans**
- class **com.amazonaws.services.autoscalingplans.AbstractAWSAutoScalingPlansAsync**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
