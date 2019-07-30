(ns com.amazonaws.services.mediapackage.AbstractAWSMediaPackage
  "Abstract implementation of AWSMediaPackage. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediapackage AbstractAWSMediaPackage]))

(defn list-tags-for-resource
  "request - `com.amazonaws.services.mediapackage.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.mediapackage.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.mediapackage.model.ListTagsForResourceResult [^AbstractAWSMediaPackage this ^com.amazonaws.services.mediapackage.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn rotate-channel-credentials
  "Deprecated.

  request - `com.amazonaws.services.mediapackage.model.RotateChannelCredentialsRequest`

  returns: Result of the RotateChannelCredentials operation returned by the service. - `com.amazonaws.services.mediapackage.model.RotateChannelCredentialsResult`"
  (^com.amazonaws.services.mediapackage.model.RotateChannelCredentialsResult [^AbstractAWSMediaPackage this ^com.amazonaws.services.mediapackage.model.RotateChannelCredentialsRequest request]
    (-> this (.rotateChannelCredentials request))))

(defn list-channels
  "Description copied from interface: AWSMediaPackage

  request - `com.amazonaws.services.mediapackage.model.ListChannelsRequest`

  returns: Result of the ListChannels operation returned by the service. - `com.amazonaws.services.mediapackage.model.ListChannelsResult`"
  (^com.amazonaws.services.mediapackage.model.ListChannelsResult [^AbstractAWSMediaPackage this ^com.amazonaws.services.mediapackage.model.ListChannelsRequest request]
    (-> this (.listChannels request))))

(defn untag-resource
  "request - `com.amazonaws.services.mediapackage.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.mediapackage.model.UntagResourceResult`"
  (^com.amazonaws.services.mediapackage.model.UntagResourceResult [^AbstractAWSMediaPackage this ^com.amazonaws.services.mediapackage.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn list-origin-endpoints
  "Description copied from interface: AWSMediaPackage

  request - `com.amazonaws.services.mediapackage.model.ListOriginEndpointsRequest`

  returns: Result of the ListOriginEndpoints operation returned by the service. - `com.amazonaws.services.mediapackage.model.ListOriginEndpointsResult`"
  (^com.amazonaws.services.mediapackage.model.ListOriginEndpointsResult [^AbstractAWSMediaPackage this ^com.amazonaws.services.mediapackage.model.ListOriginEndpointsRequest request]
    (-> this (.listOriginEndpoints request))))

(defn update-channel
  "Description copied from interface: AWSMediaPackage

  request - Configuration parameters used to update the Channel. - `com.amazonaws.services.mediapackage.model.UpdateChannelRequest`

  returns: Result of the UpdateChannel operation returned by the service. - `com.amazonaws.services.mediapackage.model.UpdateChannelResult`"
  (^com.amazonaws.services.mediapackage.model.UpdateChannelResult [^AbstractAWSMediaPackage this ^com.amazonaws.services.mediapackage.model.UpdateChannelRequest request]
    (-> this (.updateChannel request))))

(defn rotate-ingest-endpoint-credentials
  "Description copied from interface: AWSMediaPackage

  request - `com.amazonaws.services.mediapackage.model.RotateIngestEndpointCredentialsRequest`

  returns: Result of the RotateIngestEndpointCredentials operation returned by the service. - `com.amazonaws.services.mediapackage.model.RotateIngestEndpointCredentialsResult`"
  (^com.amazonaws.services.mediapackage.model.RotateIngestEndpointCredentialsResult [^AbstractAWSMediaPackage this ^com.amazonaws.services.mediapackage.model.RotateIngestEndpointCredentialsRequest request]
    (-> this (.rotateIngestEndpointCredentials request))))

(defn create-channel
  "Description copied from interface: AWSMediaPackage

  request - A new Channel configuration. - `com.amazonaws.services.mediapackage.model.CreateChannelRequest`

  returns: Result of the CreateChannel operation returned by the service. - `com.amazonaws.services.mediapackage.model.CreateChannelResult`"
  (^com.amazonaws.services.mediapackage.model.CreateChannelResult [^AbstractAWSMediaPackage this ^com.amazonaws.services.mediapackage.model.CreateChannelRequest request]
    (-> this (.createChannel request))))

(defn shutdown
  "Description copied from interface: AWSMediaPackage"
  ([^AbstractAWSMediaPackage this]
    (-> this (.shutdown))))

(defn update-origin-endpoint
  "Description copied from interface: AWSMediaPackage

  request - Configuration parameters used to update an existing OriginEndpoint. - `com.amazonaws.services.mediapackage.model.UpdateOriginEndpointRequest`

  returns: Result of the UpdateOriginEndpoint operation returned by the service. - `com.amazonaws.services.mediapackage.model.UpdateOriginEndpointResult`"
  (^com.amazonaws.services.mediapackage.model.UpdateOriginEndpointResult [^AbstractAWSMediaPackage this ^com.amazonaws.services.mediapackage.model.UpdateOriginEndpointRequest request]
    (-> this (.updateOriginEndpoint request))))

(defn create-origin-endpoint
  "Description copied from interface: AWSMediaPackage

  request - Configuration parameters used to create a new OriginEndpoint. - `com.amazonaws.services.mediapackage.model.CreateOriginEndpointRequest`

  returns: Result of the CreateOriginEndpoint operation returned by the service. - `com.amazonaws.services.mediapackage.model.CreateOriginEndpointResult`"
  (^com.amazonaws.services.mediapackage.model.CreateOriginEndpointResult [^AbstractAWSMediaPackage this ^com.amazonaws.services.mediapackage.model.CreateOriginEndpointRequest request]
    (-> this (.createOriginEndpoint request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSMediaPackage

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSMediaPackage this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn tag-resource
  "request - `com.amazonaws.services.mediapackage.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.mediapackage.model.TagResourceResult`"
  (^com.amazonaws.services.mediapackage.model.TagResourceResult [^AbstractAWSMediaPackage this ^com.amazonaws.services.mediapackage.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn delete-origin-endpoint
  "Description copied from interface: AWSMediaPackage

  request - `com.amazonaws.services.mediapackage.model.DeleteOriginEndpointRequest`

  returns: Result of the DeleteOriginEndpoint operation returned by the service. - `com.amazonaws.services.mediapackage.model.DeleteOriginEndpointResult`"
  (^com.amazonaws.services.mediapackage.model.DeleteOriginEndpointResult [^AbstractAWSMediaPackage this ^com.amazonaws.services.mediapackage.model.DeleteOriginEndpointRequest request]
    (-> this (.deleteOriginEndpoint request))))

(defn delete-channel
  "Description copied from interface: AWSMediaPackage

  request - `com.amazonaws.services.mediapackage.model.DeleteChannelRequest`

  returns: Result of the DeleteChannel operation returned by the service. - `com.amazonaws.services.mediapackage.model.DeleteChannelResult`"
  (^com.amazonaws.services.mediapackage.model.DeleteChannelResult [^AbstractAWSMediaPackage this ^com.amazonaws.services.mediapackage.model.DeleteChannelRequest request]
    (-> this (.deleteChannel request))))

(defn describe-channel
  "Description copied from interface: AWSMediaPackage

  request - `com.amazonaws.services.mediapackage.model.DescribeChannelRequest`

  returns: Result of the DescribeChannel operation returned by the service. - `com.amazonaws.services.mediapackage.model.DescribeChannelResult`"
  (^com.amazonaws.services.mediapackage.model.DescribeChannelResult [^AbstractAWSMediaPackage this ^com.amazonaws.services.mediapackage.model.DescribeChannelRequest request]
    (-> this (.describeChannel request))))

(defn describe-origin-endpoint
  "Description copied from interface: AWSMediaPackage

  request - `com.amazonaws.services.mediapackage.model.DescribeOriginEndpointRequest`

  returns: Result of the DescribeOriginEndpoint operation returned by the service. - `com.amazonaws.services.mediapackage.model.DescribeOriginEndpointResult`"
  (^com.amazonaws.services.mediapackage.model.DescribeOriginEndpointResult [^AbstractAWSMediaPackage this ^com.amazonaws.services.mediapackage.model.DescribeOriginEndpointRequest request]
    (-> this (.describeOriginEndpoint request))))

