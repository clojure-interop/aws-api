# Bindings for com.amazonaws.jmespath

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.amazonaws.jmespath "1.0.0"]
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

- class **com.amazonaws.jmespath.Comparator**
- class **com.amazonaws.jmespath.InvalidTypeException**
- class **com.amazonaws.jmespath.JmesPathAndExpression**
- class **com.amazonaws.jmespath.JmesPathContainsFunction**
- class **com.amazonaws.jmespath.JmesPathEvaluationVisitor**
- interface **com.amazonaws.jmespath.JmesPathExpression**
- class **com.amazonaws.jmespath.JmesPathField**
- class **com.amazonaws.jmespath.JmesPathFilter**
- class **com.amazonaws.jmespath.JmesPathFlatten**
- class **com.amazonaws.jmespath.JmesPathFunction**
- class **com.amazonaws.jmespath.JmesPathIdentity**
- class **com.amazonaws.jmespath.JmesPathLengthFunction**
- class **com.amazonaws.jmespath.JmesPathLiteral**
- class **com.amazonaws.jmespath.JmesPathMultiSelectList**
- class **com.amazonaws.jmespath.JmesPathNotExpression**
- class **com.amazonaws.jmespath.JmesPathProjection**
- class **com.amazonaws.jmespath.JmesPathSubExpression**
- class **com.amazonaws.jmespath.JmesPathValueProjection**
- interface **com.amazonaws.jmespath.JmesPathVisitor**
- class **com.amazonaws.jmespath.NumericComparator**
- class **com.amazonaws.jmespath.ObjectMapperSingleton**
- class **com.amazonaws.jmespath.OpEquals**
- class **com.amazonaws.jmespath.OpGreaterThan**
- class **com.amazonaws.jmespath.OpGreaterThanOrEqualTo**
- class **com.amazonaws.jmespath.OpLessThan**
- class **com.amazonaws.jmespath.OpLessThanOrEqualTo**
- class **com.amazonaws.jmespath.OpNotEquals**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
