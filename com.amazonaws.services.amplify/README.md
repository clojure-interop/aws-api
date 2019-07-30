# Bindings for com.amazonaws.services.amplify

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.amazonaws.services.amplify "1.0.0"]
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

- interface **com.amazonaws.services.amplify.AWSAmplify**
- interface **com.amazonaws.services.amplify.AWSAmplifyAsync**
- class **com.amazonaws.services.amplify.AWSAmplifyAsyncClient**
- class **com.amazonaws.services.amplify.AWSAmplifyAsyncClientBuilder**
- class **com.amazonaws.services.amplify.AWSAmplifyClient**
- class **com.amazonaws.services.amplify.AWSAmplifyClientBuilder**
- class **com.amazonaws.services.amplify.AbstractAWSAmplify**
- class **com.amazonaws.services.amplify.AbstractAWSAmplifyAsync**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
