(ns com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder
  "Fluent builder for AmazonDynamoDB. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.dynamodbv2 AmazonDynamoDBClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder`"
  (^com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder []
    (AmazonDynamoDBClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.dynamodbv2.AmazonDynamoDB`"
  (^com.amazonaws.services.dynamodbv2.AmazonDynamoDB []
    (AmazonDynamoDBClientBuilder/defaultClient )))

(defn enable-endpoint-discovery
  "returns: `com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder`"
  (^com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder [^AmazonDynamoDBClientBuilder this]
    (-> this (.enableEndpointDiscovery))))

(defn disable-endpoint-discovery
  "returns: `com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder`"
  (^com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder [^AmazonDynamoDBClientBuilder this]
    (-> this (.disableEndpointDiscovery))))

