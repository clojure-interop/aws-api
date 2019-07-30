# Bindings for com.amazonaws.services.dynamodbv2

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.amazonaws.services.dynamodbv2 "1.0.0"]
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

- class **com.amazonaws.services.dynamodbv2.AbstractAmazonDynamoDB**
- class **com.amazonaws.services.dynamodbv2.AbstractAmazonDynamoDBAsync**
- class **com.amazonaws.services.dynamodbv2.AbstractAmazonDynamoDBStreams**
- class **com.amazonaws.services.dynamodbv2.AbstractAmazonDynamoDBStreamsAsync**
- interface **com.amazonaws.services.dynamodbv2.AmazonDynamoDB**
- interface **com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync**
- class **com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient**
- class **com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClientBuilder**
- class **com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient**
- class **com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder**
- interface **com.amazonaws.services.dynamodbv2.AmazonDynamoDBStreams**
- interface **com.amazonaws.services.dynamodbv2.AmazonDynamoDBStreamsAsync**
- class **com.amazonaws.services.dynamodbv2.AmazonDynamoDBStreamsAsyncClient**
- class **com.amazonaws.services.dynamodbv2.AmazonDynamoDBStreamsAsyncClientBuilder**
- class **com.amazonaws.services.dynamodbv2.AmazonDynamoDBStreamsClient**
- class **com.amazonaws.services.dynamodbv2.AmazonDynamoDBStreamsClientBuilder**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
