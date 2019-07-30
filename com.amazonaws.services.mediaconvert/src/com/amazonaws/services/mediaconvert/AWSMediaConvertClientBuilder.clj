(ns com.amazonaws.services.mediaconvert.AWSMediaConvertClientBuilder
  "Fluent builder for AWSMediaConvert. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediaconvert AWSMediaConvertClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.mediaconvert.AWSMediaConvertClientBuilder`"
  (^com.amazonaws.services.mediaconvert.AWSMediaConvertClientBuilder []
    (AWSMediaConvertClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.mediaconvert.AWSMediaConvert`"
  (^com.amazonaws.services.mediaconvert.AWSMediaConvert []
    (AWSMediaConvertClientBuilder/defaultClient )))

