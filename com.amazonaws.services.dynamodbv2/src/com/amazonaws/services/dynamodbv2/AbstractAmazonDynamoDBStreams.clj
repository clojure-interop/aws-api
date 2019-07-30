(ns com.amazonaws.services.dynamodbv2.AbstractAmazonDynamoDBStreams
  "Abstract implementation of AmazonDynamoDBStreams. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.dynamodbv2 AbstractAmazonDynamoDBStreams]))

(defn set-endpoint
  "Description copied from interface: AmazonDynamoDBStreams

  endpoint - The endpoint (ex: \"streams.dynamodb.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://streams.dynamodb.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonDynamoDBStreams this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn set-region
  "Description copied from interface: AmazonDynamoDBStreams

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonDynamoDBStreams this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn describe-stream
  "Description copied from interface: AmazonDynamoDBStreams

  request - Represents the input of a DescribeStream operation. - `com.amazonaws.services.dynamodbv2.model.DescribeStreamRequest`

  returns: Result of the DescribeStream operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.DescribeStreamResult`"
  (^com.amazonaws.services.dynamodbv2.model.DescribeStreamResult [^AbstractAmazonDynamoDBStreams this ^com.amazonaws.services.dynamodbv2.model.DescribeStreamRequest request]
    (-> this (.describeStream request))))

(defn get-records
  "Description copied from interface: AmazonDynamoDBStreams

  request - Represents the input of a GetRecords operation. - `com.amazonaws.services.dynamodbv2.model.GetRecordsRequest`

  returns: Result of the GetRecords operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.GetRecordsResult`"
  (^com.amazonaws.services.dynamodbv2.model.GetRecordsResult [^AbstractAmazonDynamoDBStreams this ^com.amazonaws.services.dynamodbv2.model.GetRecordsRequest request]
    (-> this (.getRecords request))))

(defn get-shard-iterator
  "Description copied from interface: AmazonDynamoDBStreams

  request - Represents the input of a GetShardIterator operation. - `com.amazonaws.services.dynamodbv2.model.GetShardIteratorRequest`

  returns: Result of the GetShardIterator operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.GetShardIteratorResult`"
  (^com.amazonaws.services.dynamodbv2.model.GetShardIteratorResult [^AbstractAmazonDynamoDBStreams this ^com.amazonaws.services.dynamodbv2.model.GetShardIteratorRequest request]
    (-> this (.getShardIterator request))))

(defn list-streams
  "Description copied from interface: AmazonDynamoDBStreams

  request - Represents the input of a ListStreams operation. - `com.amazonaws.services.dynamodbv2.model.ListStreamsRequest`

  returns: Result of the ListStreams operation returned by the service. - `com.amazonaws.services.dynamodbv2.model.ListStreamsResult`"
  (^com.amazonaws.services.dynamodbv2.model.ListStreamsResult [^AbstractAmazonDynamoDBStreams this ^com.amazonaws.services.dynamodbv2.model.ListStreamsRequest request]
    (-> this (.listStreams request))))

(defn shutdown
  "Description copied from interface: AmazonDynamoDBStreams"
  ([^AbstractAmazonDynamoDBStreams this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonDynamoDBStreams

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonDynamoDBStreams this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

