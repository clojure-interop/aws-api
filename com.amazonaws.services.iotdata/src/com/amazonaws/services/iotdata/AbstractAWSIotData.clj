(ns com.amazonaws.services.iotdata.AbstractAWSIotData
  "Abstract implementation of AWSIotData. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.iotdata AbstractAWSIotData]))

(defn set-endpoint
  "Description copied from interface: AWSIotData

  endpoint - The endpoint (ex: \"data.iot.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://data.iot.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAWSIotData this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn set-region
  "Description copied from interface: AWSIotData

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAWSIotData this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn delete-thing-shadow
  "Description copied from interface: AWSIotData

  request - The input for the DeleteThingShadow operation. - `com.amazonaws.services.iotdata.model.DeleteThingShadowRequest`

  returns: Result of the DeleteThingShadow operation returned by the service. - `com.amazonaws.services.iotdata.model.DeleteThingShadowResult`"
  (^com.amazonaws.services.iotdata.model.DeleteThingShadowResult [^AbstractAWSIotData this ^com.amazonaws.services.iotdata.model.DeleteThingShadowRequest request]
    (-> this (.deleteThingShadow request))))

(defn get-thing-shadow
  "Description copied from interface: AWSIotData

  request - The input for the GetThingShadow operation. - `com.amazonaws.services.iotdata.model.GetThingShadowRequest`

  returns: Result of the GetThingShadow operation returned by the service. - `com.amazonaws.services.iotdata.model.GetThingShadowResult`"
  (^com.amazonaws.services.iotdata.model.GetThingShadowResult [^AbstractAWSIotData this ^com.amazonaws.services.iotdata.model.GetThingShadowRequest request]
    (-> this (.getThingShadow request))))

(defn publish
  "Description copied from interface: AWSIotData

  request - The input for the Publish operation. - `com.amazonaws.services.iotdata.model.PublishRequest`

  returns: Result of the Publish operation returned by the service. - `com.amazonaws.services.iotdata.model.PublishResult`"
  (^com.amazonaws.services.iotdata.model.PublishResult [^AbstractAWSIotData this ^com.amazonaws.services.iotdata.model.PublishRequest request]
    (-> this (.publish request))))

(defn update-thing-shadow
  "Description copied from interface: AWSIotData

  request - The input for the UpdateThingShadow operation. - `com.amazonaws.services.iotdata.model.UpdateThingShadowRequest`

  returns: Result of the UpdateThingShadow operation returned by the service. - `com.amazonaws.services.iotdata.model.UpdateThingShadowResult`"
  (^com.amazonaws.services.iotdata.model.UpdateThingShadowResult [^AbstractAWSIotData this ^com.amazonaws.services.iotdata.model.UpdateThingShadowRequest request]
    (-> this (.updateThingShadow request))))

(defn shutdown
  "Description copied from interface: AWSIotData"
  ([^AbstractAWSIotData this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSIotData

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSIotData this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

