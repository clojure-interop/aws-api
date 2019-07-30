# Bindings for com.amazonaws.monitoring

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.amazonaws.monitoring "1.0.0"]
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

- class **com.amazonaws.monitoring.ApiCallAttemptMonitoringEvent**
- class **com.amazonaws.monitoring.ApiCallMonitoringEvent**
- class **com.amazonaws.monitoring.ApiMonitoringEvent**
- class **com.amazonaws.monitoring.CsmConfiguration$Builder**
- class **com.amazonaws.monitoring.CsmConfiguration**
- interface **com.amazonaws.monitoring.CsmConfigurationProvider**
- class **com.amazonaws.monitoring.CsmConfigurationProviderChain**
- class **com.amazonaws.monitoring.DefaultCsmConfigurationProviderChain**
- class **com.amazonaws.monitoring.EnvironmentVariableCsmConfigurationProvider**
- interface **com.amazonaws.monitoring.MonitoringEvent**
- class **com.amazonaws.monitoring.MonitoringListener**
- class **com.amazonaws.monitoring.ProfileCsmConfigurationProvider**
- class **com.amazonaws.monitoring.StaticCsmConfigurationProvider**
- class **com.amazonaws.monitoring.SystemPropertyCsmConfigurationProvider**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
