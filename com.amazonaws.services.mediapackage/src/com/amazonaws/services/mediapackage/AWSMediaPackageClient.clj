(ns com.amazonaws.services.mediapackage.AWSMediaPackageClient
  "Client for accessing MediaPackage. All service calls made using this client are blocking, and will not return until
  the service call completes.

  AWS Elemental MediaPackage"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediapackage AWSMediaPackageClient]))

(defn *builder
  "returns: `com.amazonaws.services.mediapackage.AWSMediaPackageClientBuilder`"
  (^com.amazonaws.services.mediapackage.AWSMediaPackageClientBuilder []
    (AWSMediaPackageClient/builder )))

(defn list-tags-for-resource
  "request - `com.amazonaws.services.mediapackage.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.mediapackage.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.mediapackage.model.ListTagsForResourceResult [^AWSMediaPackageClient this ^com.amazonaws.services.mediapackage.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn rotate-channel-credentials
  "Deprecated.

  request - `com.amazonaws.services.mediapackage.model.RotateChannelCredentialsRequest`

  returns: Result of the RotateChannelCredentials operation returned by the service. - `com.amazonaws.services.mediapackage.model.RotateChannelCredentialsResult`

  throws: com.amazonaws.services.mediapackage.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackage.model.RotateChannelCredentialsResult [^AWSMediaPackageClient this ^com.amazonaws.services.mediapackage.model.RotateChannelCredentialsRequest request]
    (-> this (.rotateChannelCredentials request))))

(defn list-channels
  "Returns a collection of Channels.

  request - `com.amazonaws.services.mediapackage.model.ListChannelsRequest`

  returns: Result of the ListChannels operation returned by the service. - `com.amazonaws.services.mediapackage.model.ListChannelsResult`

  throws: com.amazonaws.services.mediapackage.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackage.model.ListChannelsResult [^AWSMediaPackageClient this ^com.amazonaws.services.mediapackage.model.ListChannelsRequest request]
    (-> this (.listChannels request))))

(defn untag-resource
  "request - `com.amazonaws.services.mediapackage.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.mediapackage.model.UntagResourceResult`"
  (^com.amazonaws.services.mediapackage.model.UntagResourceResult [^AWSMediaPackageClient this ^com.amazonaws.services.mediapackage.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn list-origin-endpoints
  "Returns a collection of OriginEndpoint records.

  request - `com.amazonaws.services.mediapackage.model.ListOriginEndpointsRequest`

  returns: Result of the ListOriginEndpoints operation returned by the service. - `com.amazonaws.services.mediapackage.model.ListOriginEndpointsResult`

  throws: com.amazonaws.services.mediapackage.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackage.model.ListOriginEndpointsResult [^AWSMediaPackageClient this ^com.amazonaws.services.mediapackage.model.ListOriginEndpointsRequest request]
    (-> this (.listOriginEndpoints request))))

(defn update-channel
  "Updates an existing Channel.

  request - `com.amazonaws.services.mediapackage.model.UpdateChannelRequest`

  returns: Result of the UpdateChannel operation returned by the service. - `com.amazonaws.services.mediapackage.model.UpdateChannelResult`

  throws: com.amazonaws.services.mediapackage.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackage.model.UpdateChannelResult [^AWSMediaPackageClient this ^com.amazonaws.services.mediapackage.model.UpdateChannelRequest request]
    (-> this (.updateChannel request))))

(defn rotate-ingest-endpoint-credentials
  "Rotate the IngestEndpoint's username and password, as specified by the IngestEndpoint's id.

  request - `com.amazonaws.services.mediapackage.model.RotateIngestEndpointCredentialsRequest`

  returns: Result of the RotateIngestEndpointCredentials operation returned by the service. - `com.amazonaws.services.mediapackage.model.RotateIngestEndpointCredentialsResult`

  throws: com.amazonaws.services.mediapackage.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackage.model.RotateIngestEndpointCredentialsResult [^AWSMediaPackageClient this ^com.amazonaws.services.mediapackage.model.RotateIngestEndpointCredentialsRequest request]
    (-> this (.rotateIngestEndpointCredentials request))))

(defn create-channel
  "Creates a new Channel.

  request - `com.amazonaws.services.mediapackage.model.CreateChannelRequest`

  returns: Result of the CreateChannel operation returned by the service. - `com.amazonaws.services.mediapackage.model.CreateChannelResult`

  throws: com.amazonaws.services.mediapackage.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackage.model.CreateChannelResult [^AWSMediaPackageClient this ^com.amazonaws.services.mediapackage.model.CreateChannelRequest request]
    (-> this (.createChannel request))))

(defn update-origin-endpoint
  "Updates an existing OriginEndpoint.

  request - `com.amazonaws.services.mediapackage.model.UpdateOriginEndpointRequest`

  returns: Result of the UpdateOriginEndpoint operation returned by the service. - `com.amazonaws.services.mediapackage.model.UpdateOriginEndpointResult`

  throws: com.amazonaws.services.mediapackage.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackage.model.UpdateOriginEndpointResult [^AWSMediaPackageClient this ^com.amazonaws.services.mediapackage.model.UpdateOriginEndpointRequest request]
    (-> this (.updateOriginEndpoint request))))

(defn create-origin-endpoint
  "Creates a new OriginEndpoint record.

  request - `com.amazonaws.services.mediapackage.model.CreateOriginEndpointRequest`

  returns: Result of the CreateOriginEndpoint operation returned by the service. - `com.amazonaws.services.mediapackage.model.CreateOriginEndpointResult`

  throws: com.amazonaws.services.mediapackage.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackage.model.CreateOriginEndpointResult [^AWSMediaPackageClient this ^com.amazonaws.services.mediapackage.model.CreateOriginEndpointRequest request]
    (-> this (.createOriginEndpoint request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSMediaPackageClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn tag-resource
  "request - `com.amazonaws.services.mediapackage.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.mediapackage.model.TagResourceResult`"
  (^com.amazonaws.services.mediapackage.model.TagResourceResult [^AWSMediaPackageClient this ^com.amazonaws.services.mediapackage.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn delete-origin-endpoint
  "Deletes an existing OriginEndpoint.

  request - `com.amazonaws.services.mediapackage.model.DeleteOriginEndpointRequest`

  returns: Result of the DeleteOriginEndpoint operation returned by the service. - `com.amazonaws.services.mediapackage.model.DeleteOriginEndpointResult`

  throws: com.amazonaws.services.mediapackage.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackage.model.DeleteOriginEndpointResult [^AWSMediaPackageClient this ^com.amazonaws.services.mediapackage.model.DeleteOriginEndpointRequest request]
    (-> this (.deleteOriginEndpoint request))))

(defn delete-channel
  "Deletes an existing Channel.

  request - `com.amazonaws.services.mediapackage.model.DeleteChannelRequest`

  returns: Result of the DeleteChannel operation returned by the service. - `com.amazonaws.services.mediapackage.model.DeleteChannelResult`

  throws: com.amazonaws.services.mediapackage.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackage.model.DeleteChannelResult [^AWSMediaPackageClient this ^com.amazonaws.services.mediapackage.model.DeleteChannelRequest request]
    (-> this (.deleteChannel request))))

(defn describe-channel
  "Gets details about a Channel.

  request - `com.amazonaws.services.mediapackage.model.DescribeChannelRequest`

  returns: Result of the DescribeChannel operation returned by the service. - `com.amazonaws.services.mediapackage.model.DescribeChannelResult`

  throws: com.amazonaws.services.mediapackage.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackage.model.DescribeChannelResult [^AWSMediaPackageClient this ^com.amazonaws.services.mediapackage.model.DescribeChannelRequest request]
    (-> this (.describeChannel request))))

(defn describe-origin-endpoint
  "Gets details about an existing OriginEndpoint.

  request - `com.amazonaws.services.mediapackage.model.DescribeOriginEndpointRequest`

  returns: Result of the DescribeOriginEndpoint operation returned by the service. - `com.amazonaws.services.mediapackage.model.DescribeOriginEndpointResult`

  throws: com.amazonaws.services.mediapackage.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackage.model.DescribeOriginEndpointResult [^AWSMediaPackageClient this ^com.amazonaws.services.mediapackage.model.DescribeOriginEndpointRequest request]
    (-> this (.describeOriginEndpoint request))))

