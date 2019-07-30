# Bindings for com.amazonaws.services.eks

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.amazonaws.services.eks "1.0.0"]
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

- class **com.amazonaws.services.eks.AbstractAmazonEKS**
- class **com.amazonaws.services.eks.AbstractAmazonEKSAsync**
- interface **com.amazonaws.services.eks.AmazonEKS**
- interface **com.amazonaws.services.eks.AmazonEKSAsync**
- class **com.amazonaws.services.eks.AmazonEKSAsyncClient**
- class **com.amazonaws.services.eks.AmazonEKSAsyncClientBuilder**
- class **com.amazonaws.services.eks.AmazonEKSClient**
- class **com.amazonaws.services.eks.AmazonEKSClientBuilder**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
