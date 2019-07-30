(ns com.amazonaws.services.dynamodbv2.AmazonDynamoDBStreamsClientBuilder
  "Fluent builder for AmazonDynamoDBStreams. Use of the builder is preferred
  over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.dynamodbv2 AmazonDynamoDBStreamsClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.dynamodbv2.AmazonDynamoDBStreamsClientBuilder`"
  (^com.amazonaws.services.dynamodbv2.AmazonDynamoDBStreamsClientBuilder []
    (AmazonDynamoDBStreamsClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.dynamodbv2.AmazonDynamoDBStreams`"
  (^com.amazonaws.services.dynamodbv2.AmazonDynamoDBStreams []
    (AmazonDynamoDBStreamsClientBuilder/defaultClient )))

