(ns com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClientBuilder
  "Fluent builder for AmazonDynamoDBAsync. Use of the builder is preferred
  over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.dynamodbv2 AmazonDynamoDBAsyncClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClientBuilder`"
  (^com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClientBuilder []
    (AmazonDynamoDBAsyncClientBuilder/standard )))

(defn *default-client
  "returns: Default async client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync`"
  (^com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync []
    (AmazonDynamoDBAsyncClientBuilder/defaultClient )))

