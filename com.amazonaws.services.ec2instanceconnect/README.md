# Bindings for com.amazonaws.services.ec2instanceconnect

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.amazonaws.services.ec2instanceconnect "1.0.0"]
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

- interface **com.amazonaws.services.ec2instanceconnect.AWSEC2InstanceConnect**
- interface **com.amazonaws.services.ec2instanceconnect.AWSEC2InstanceConnectAsync**
- class **com.amazonaws.services.ec2instanceconnect.AWSEC2InstanceConnectAsyncClient**
- class **com.amazonaws.services.ec2instanceconnect.AWSEC2InstanceConnectAsyncClientBuilder**
- class **com.amazonaws.services.ec2instanceconnect.AWSEC2InstanceConnectClient**
- class **com.amazonaws.services.ec2instanceconnect.AWSEC2InstanceConnectClientBuilder**
- class **com.amazonaws.services.ec2instanceconnect.AbstractAWSEC2InstanceConnect**
- class **com.amazonaws.services.ec2instanceconnect.AbstractAWSEC2InstanceConnectAsync**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
