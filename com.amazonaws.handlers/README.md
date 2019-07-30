# Bindings for com.amazonaws.handlers

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.amazonaws.handlers "1.0.0"]
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

- class **com.amazonaws.handlers.AbstractRequestHandler**
- interface **com.amazonaws.handlers.AsyncHandler**
- class **com.amazonaws.handlers.CredentialsRequestHandler**
- class **com.amazonaws.handlers.HandlerAfterAttemptContext$HandlerAfterAttemptContextBuilder**
- class **com.amazonaws.handlers.HandlerAfterAttemptContext**
- class **com.amazonaws.handlers.HandlerBeforeAttemptContext$HandlerBeforeAttemptContextBuilder**
- class **com.amazonaws.handlers.HandlerBeforeAttemptContext**
- class **com.amazonaws.handlers.HandlerChainFactory**
- class **com.amazonaws.handlers.HandlerContextKey**
- interface **com.amazonaws.handlers.IRequestHandler2**
- interface **com.amazonaws.handlers.RequestHandler**
- class **com.amazonaws.handlers.RequestHandler2**
- class **com.amazonaws.handlers.StackedRequestHandler**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
