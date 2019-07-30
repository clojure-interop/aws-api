# Bindings for com.amazonaws.event

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.amazonaws.event "1.0.0"]
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

- class **com.amazonaws.event.DeliveryMode$Check**
- interface **com.amazonaws.event.DeliveryMode**
- class **com.amazonaws.event.ProgressEvent**
- interface **com.amazonaws.event.ProgressEventFilter**
- enum **com.amazonaws.event.ProgressEventType**
- class **com.amazonaws.event.ProgressInputStream**
- class **com.amazonaws.event.ProgressListener$ExceptionReporter**
- class **com.amazonaws.event.ProgressListener$NoOpProgressListener**
- interface **com.amazonaws.event.ProgressListener**
- class **com.amazonaws.event.ProgressListenerChain**
- class **com.amazonaws.event.ProgressTracker**
- class **com.amazonaws.event.SDKProgressPublisher**
- class **com.amazonaws.event.SyncProgressListener**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
