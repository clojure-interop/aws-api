(ns com.amazonaws.services.elasticsearch.AWSElasticsearchClientBuilder
  "Fluent builder for AWSElasticsearch. Use of the builder is preferred
  over using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.elasticsearch AWSElasticsearchClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.elasticsearch.AWSElasticsearchClientBuilder`"
  (^com.amazonaws.services.elasticsearch.AWSElasticsearchClientBuilder []
    (AWSElasticsearchClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.elasticsearch.AWSElasticsearch`"
  (^com.amazonaws.services.elasticsearch.AWSElasticsearch []
    (AWSElasticsearchClientBuilder/defaultClient )))

