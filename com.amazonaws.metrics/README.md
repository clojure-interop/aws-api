# Bindings for com.amazonaws.metrics

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.amazonaws.metrics "1.0.0"]
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

- enum **com.amazonaws.metrics.AwsSdkMetrics**
- class **com.amazonaws.metrics.ByteThroughputProvider**
- class **com.amazonaws.metrics.MetricAdmin**
- interface **com.amazonaws.metrics.MetricAdminMBean**
- interface **com.amazonaws.metrics.MetricCollector$Factory**
- class **com.amazonaws.metrics.MetricCollector**
- class **com.amazonaws.metrics.MetricFilterInputStream**
- class **com.amazonaws.metrics.MetricInputStreamEntity**
- interface **com.amazonaws.metrics.MetricType**
- class **com.amazonaws.metrics.NoOpClassForJavadocGeneration**
- interface **com.amazonaws.metrics.RequestMetricCollector$Factory**
- class **com.amazonaws.metrics.RequestMetricCollector**
- interface **com.amazonaws.metrics.RequestMetricType**
- class **com.amazonaws.metrics.ServiceLatencyProvider**
- interface **com.amazonaws.metrics.ServiceMetricCollector$Factory**
- class **com.amazonaws.metrics.ServiceMetricCollector**
- interface **com.amazonaws.metrics.ServiceMetricType**
- class **com.amazonaws.metrics.SimpleMetricType**
- class **com.amazonaws.metrics.SimpleServiceMetricType**
- class **com.amazonaws.metrics.SimpleThroughputMetricType**
- interface **com.amazonaws.metrics.ThroughputMetricType**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
