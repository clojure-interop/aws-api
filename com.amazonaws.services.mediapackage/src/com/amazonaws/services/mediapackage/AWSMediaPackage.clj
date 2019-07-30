(ns com.amazonaws.services.mediapackage.AWSMediaPackage
  "Interface for accessing MediaPackage.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSMediaPackage instead.


  AWS Elemental MediaPackage"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediapackage AWSMediaPackage]))

(defn list-tags-for-resource
  "list-tags-for-resource-request - `com.amazonaws.services.mediapackage.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.mediapackage.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.mediapackage.model.ListTagsForResourceResult [^AWSMediaPackage this ^com.amazonaws.services.mediapackage.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn rotate-channel-credentials
  "Deprecated.

  rotate-channel-credentials-request - `com.amazonaws.services.mediapackage.model.RotateChannelCredentialsRequest`

  returns: Result of the RotateChannelCredentials operation returned by the service. - `com.amazonaws.services.mediapackage.model.RotateChannelCredentialsResult`

  throws: com.amazonaws.services.mediapackage.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackage.model.RotateChannelCredentialsResult [^AWSMediaPackage this ^com.amazonaws.services.mediapackage.model.RotateChannelCredentialsRequest rotate-channel-credentials-request]
    (-> this (.rotateChannelCredentials rotate-channel-credentials-request))))

(defn list-channels
  "Returns a collection of Channels.

  list-channels-request - `com.amazonaws.services.mediapackage.model.ListChannelsRequest`

  returns: Result of the ListChannels operation returned by the service. - `com.amazonaws.services.mediapackage.model.ListChannelsResult`

  throws: com.amazonaws.services.mediapackage.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackage.model.ListChannelsResult [^AWSMediaPackage this ^com.amazonaws.services.mediapackage.model.ListChannelsRequest list-channels-request]
    (-> this (.listChannels list-channels-request))))

(defn untag-resource
  "untag-resource-request - `com.amazonaws.services.mediapackage.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.mediapackage.model.UntagResourceResult`"
  (^com.amazonaws.services.mediapackage.model.UntagResourceResult [^AWSMediaPackage this ^com.amazonaws.services.mediapackage.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn list-origin-endpoints
  "Returns a collection of OriginEndpoint records.

  list-origin-endpoints-request - `com.amazonaws.services.mediapackage.model.ListOriginEndpointsRequest`

  returns: Result of the ListOriginEndpoints operation returned by the service. - `com.amazonaws.services.mediapackage.model.ListOriginEndpointsResult`

  throws: com.amazonaws.services.mediapackage.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackage.model.ListOriginEndpointsResult [^AWSMediaPackage this ^com.amazonaws.services.mediapackage.model.ListOriginEndpointsRequest list-origin-endpoints-request]
    (-> this (.listOriginEndpoints list-origin-endpoints-request))))

(defn update-channel
  "Updates an existing Channel.

  update-channel-request - Configuration parameters used to update the Channel. - `com.amazonaws.services.mediapackage.model.UpdateChannelRequest`

  returns: Result of the UpdateChannel operation returned by the service. - `com.amazonaws.services.mediapackage.model.UpdateChannelResult`

  throws: com.amazonaws.services.mediapackage.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackage.model.UpdateChannelResult [^AWSMediaPackage this ^com.amazonaws.services.mediapackage.model.UpdateChannelRequest update-channel-request]
    (-> this (.updateChannel update-channel-request))))

(defn rotate-ingest-endpoint-credentials
  "Rotate the IngestEndpoint's username and password, as specified by the IngestEndpoint's id.

  rotate-ingest-endpoint-credentials-request - `com.amazonaws.services.mediapackage.model.RotateIngestEndpointCredentialsRequest`

  returns: Result of the RotateIngestEndpointCredentials operation returned by the service. - `com.amazonaws.services.mediapackage.model.RotateIngestEndpointCredentialsResult`

  throws: com.amazonaws.services.mediapackage.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackage.model.RotateIngestEndpointCredentialsResult [^AWSMediaPackage this ^com.amazonaws.services.mediapackage.model.RotateIngestEndpointCredentialsRequest rotate-ingest-endpoint-credentials-request]
    (-> this (.rotateIngestEndpointCredentials rotate-ingest-endpoint-credentials-request))))

(defn create-channel
  "Creates a new Channel.

  create-channel-request - A new Channel configuration. - `com.amazonaws.services.mediapackage.model.CreateChannelRequest`

  returns: Result of the CreateChannel operation returned by the service. - `com.amazonaws.services.mediapackage.model.CreateChannelResult`

  throws: com.amazonaws.services.mediapackage.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackage.model.CreateChannelResult [^AWSMediaPackage this ^com.amazonaws.services.mediapackage.model.CreateChannelRequest create-channel-request]
    (-> this (.createChannel create-channel-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSMediaPackage this]
    (-> this (.shutdown))))

(defn update-origin-endpoint
  "Updates an existing OriginEndpoint.

  update-origin-endpoint-request - Configuration parameters used to update an existing OriginEndpoint. - `com.amazonaws.services.mediapackage.model.UpdateOriginEndpointRequest`

  returns: Result of the UpdateOriginEndpoint operation returned by the service. - `com.amazonaws.services.mediapackage.model.UpdateOriginEndpointResult`

  throws: com.amazonaws.services.mediapackage.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackage.model.UpdateOriginEndpointResult [^AWSMediaPackage this ^com.amazonaws.services.mediapackage.model.UpdateOriginEndpointRequest update-origin-endpoint-request]
    (-> this (.updateOriginEndpoint update-origin-endpoint-request))))

(defn create-origin-endpoint
  "Creates a new OriginEndpoint record.

  create-origin-endpoint-request - Configuration parameters used to create a new OriginEndpoint. - `com.amazonaws.services.mediapackage.model.CreateOriginEndpointRequest`

  returns: Result of the CreateOriginEndpoint operation returned by the service. - `com.amazonaws.services.mediapackage.model.CreateOriginEndpointResult`

  throws: com.amazonaws.services.mediapackage.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackage.model.CreateOriginEndpointResult [^AWSMediaPackage this ^com.amazonaws.services.mediapackage.model.CreateOriginEndpointRequest create-origin-endpoint-request]
    (-> this (.createOriginEndpoint create-origin-endpoint-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSMediaPackage this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn tag-resource
  "tag-resource-request - `com.amazonaws.services.mediapackage.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.mediapackage.model.TagResourceResult`"
  (^com.amazonaws.services.mediapackage.model.TagResourceResult [^AWSMediaPackage this ^com.amazonaws.services.mediapackage.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn delete-origin-endpoint
  "Deletes an existing OriginEndpoint.

  delete-origin-endpoint-request - `com.amazonaws.services.mediapackage.model.DeleteOriginEndpointRequest`

  returns: Result of the DeleteOriginEndpoint operation returned by the service. - `com.amazonaws.services.mediapackage.model.DeleteOriginEndpointResult`

  throws: com.amazonaws.services.mediapackage.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackage.model.DeleteOriginEndpointResult [^AWSMediaPackage this ^com.amazonaws.services.mediapackage.model.DeleteOriginEndpointRequest delete-origin-endpoint-request]
    (-> this (.deleteOriginEndpoint delete-origin-endpoint-request))))

(defn delete-channel
  "Deletes an existing Channel.

  delete-channel-request - `com.amazonaws.services.mediapackage.model.DeleteChannelRequest`

  returns: Result of the DeleteChannel operation returned by the service. - `com.amazonaws.services.mediapackage.model.DeleteChannelResult`

  throws: com.amazonaws.services.mediapackage.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackage.model.DeleteChannelResult [^AWSMediaPackage this ^com.amazonaws.services.mediapackage.model.DeleteChannelRequest delete-channel-request]
    (-> this (.deleteChannel delete-channel-request))))

(defn describe-channel
  "Gets details about a Channel.

  describe-channel-request - `com.amazonaws.services.mediapackage.model.DescribeChannelRequest`

  returns: Result of the DescribeChannel operation returned by the service. - `com.amazonaws.services.mediapackage.model.DescribeChannelResult`

  throws: com.amazonaws.services.mediapackage.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackage.model.DescribeChannelResult [^AWSMediaPackage this ^com.amazonaws.services.mediapackage.model.DescribeChannelRequest describe-channel-request]
    (-> this (.describeChannel describe-channel-request))))

(defn describe-origin-endpoint
  "Gets details about an existing OriginEndpoint.

  describe-origin-endpoint-request - `com.amazonaws.services.mediapackage.model.DescribeOriginEndpointRequest`

  returns: Result of the DescribeOriginEndpoint operation returned by the service. - `com.amazonaws.services.mediapackage.model.DescribeOriginEndpointResult`

  throws: com.amazonaws.services.mediapackage.model.UnprocessableEntityException - The parameters sent in the request are not valid."
  (^com.amazonaws.services.mediapackage.model.DescribeOriginEndpointResult [^AWSMediaPackage this ^com.amazonaws.services.mediapackage.model.DescribeOriginEndpointRequest describe-origin-endpoint-request]
    (-> this (.describeOriginEndpoint describe-origin-endpoint-request))))

