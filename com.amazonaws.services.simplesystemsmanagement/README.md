# Bindings for com.amazonaws.services.simplesystemsmanagement

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.amazonaws.services.simplesystemsmanagement "1.0.0"]
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

- interface **com.amazonaws.services.simplesystemsmanagement.AWSSimpleSystemsManagement**
- interface **com.amazonaws.services.simplesystemsmanagement.AWSSimpleSystemsManagementAsync**
- class **com.amazonaws.services.simplesystemsmanagement.AWSSimpleSystemsManagementAsyncClient**
- class **com.amazonaws.services.simplesystemsmanagement.AWSSimpleSystemsManagementAsyncClientBuilder**
- class **com.amazonaws.services.simplesystemsmanagement.AWSSimpleSystemsManagementClient**
- class **com.amazonaws.services.simplesystemsmanagement.AWSSimpleSystemsManagementClientBuilder**
- class **com.amazonaws.services.simplesystemsmanagement.AbstractAWSSimpleSystemsManagement**
- class **com.amazonaws.services.simplesystemsmanagement.AbstractAWSSimpleSystemsManagementAsync**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
