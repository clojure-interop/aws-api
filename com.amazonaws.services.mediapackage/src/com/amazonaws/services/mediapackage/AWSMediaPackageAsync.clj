(ns com.amazonaws.services.mediapackage.AWSMediaPackageAsync
  "Interface for accessing MediaPackage asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSMediaPackageAsync instead.


  AWS Elemental MediaPackage"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediapackage AWSMediaPackageAsync]))

(defn untag-resource-async
  "untag-resource-request - `com.amazonaws.services.mediapackage.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackage.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageAsync this ^com.amazonaws.services.mediapackage.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageAsync this ^com.amazonaws.services.mediapackage.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn rotate-ingest-endpoint-credentials-async
  "Rotate the IngestEndpoint's username and password, as specified by the IngestEndpoint's id.

  rotate-ingest-endpoint-credentials-request - `com.amazonaws.services.mediapackage.model.RotateIngestEndpointCredentialsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RotateIngestEndpointCredentials operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackage.model.RotateIngestEndpointCredentialsResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageAsync this ^com.amazonaws.services.mediapackage.model.RotateIngestEndpointCredentialsRequest rotate-ingest-endpoint-credentials-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rotateIngestEndpointCredentialsAsync rotate-ingest-endpoint-credentials-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageAsync this ^com.amazonaws.services.mediapackage.model.RotateIngestEndpointCredentialsRequest rotate-ingest-endpoint-credentials-request]
    (-> this (.rotateIngestEndpointCredentialsAsync rotate-ingest-endpoint-credentials-request))))

(defn update-origin-endpoint-async
  "Updates an existing OriginEndpoint.

  update-origin-endpoint-request - Configuration parameters used to update an existing OriginEndpoint. - `com.amazonaws.services.mediapackage.model.UpdateOriginEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateOriginEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackage.model.UpdateOriginEndpointResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageAsync this ^com.amazonaws.services.mediapackage.model.UpdateOriginEndpointRequest update-origin-endpoint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateOriginEndpointAsync update-origin-endpoint-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageAsync this ^com.amazonaws.services.mediapackage.model.UpdateOriginEndpointRequest update-origin-endpoint-request]
    (-> this (.updateOriginEndpointAsync update-origin-endpoint-request))))

(defn rotate-channel-credentials-async
  "Deprecated.

  rotate-channel-credentials-request - `com.amazonaws.services.mediapackage.model.RotateChannelCredentialsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RotateChannelCredentials operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackage.model.RotateChannelCredentialsResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageAsync this ^com.amazonaws.services.mediapackage.model.RotateChannelCredentialsRequest rotate-channel-credentials-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rotateChannelCredentialsAsync rotate-channel-credentials-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageAsync this ^com.amazonaws.services.mediapackage.model.RotateChannelCredentialsRequest rotate-channel-credentials-request]
    (-> this (.rotateChannelCredentialsAsync rotate-channel-credentials-request))))

(defn describe-origin-endpoint-async
  "Gets details about an existing OriginEndpoint.

  describe-origin-endpoint-request - `com.amazonaws.services.mediapackage.model.DescribeOriginEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeOriginEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackage.model.DescribeOriginEndpointResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageAsync this ^com.amazonaws.services.mediapackage.model.DescribeOriginEndpointRequest describe-origin-endpoint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeOriginEndpointAsync describe-origin-endpoint-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageAsync this ^com.amazonaws.services.mediapackage.model.DescribeOriginEndpointRequest describe-origin-endpoint-request]
    (-> this (.describeOriginEndpointAsync describe-origin-endpoint-request))))

(defn describe-channel-async
  "Gets details about a Channel.

  describe-channel-request - `com.amazonaws.services.mediapackage.model.DescribeChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackage.model.DescribeChannelResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageAsync this ^com.amazonaws.services.mediapackage.model.DescribeChannelRequest describe-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeChannelAsync describe-channel-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageAsync this ^com.amazonaws.services.mediapackage.model.DescribeChannelRequest describe-channel-request]
    (-> this (.describeChannelAsync describe-channel-request))))

(defn update-channel-async
  "Updates an existing Channel.

  update-channel-request - Configuration parameters used to update the Channel. - `com.amazonaws.services.mediapackage.model.UpdateChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackage.model.UpdateChannelResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageAsync this ^com.amazonaws.services.mediapackage.model.UpdateChannelRequest update-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateChannelAsync update-channel-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageAsync this ^com.amazonaws.services.mediapackage.model.UpdateChannelRequest update-channel-request]
    (-> this (.updateChannelAsync update-channel-request))))

(defn list-channels-async
  "Returns a collection of Channels.

  list-channels-request - `com.amazonaws.services.mediapackage.model.ListChannelsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListChannels operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackage.model.ListChannelsResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageAsync this ^com.amazonaws.services.mediapackage.model.ListChannelsRequest list-channels-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listChannelsAsync list-channels-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageAsync this ^com.amazonaws.services.mediapackage.model.ListChannelsRequest list-channels-request]
    (-> this (.listChannelsAsync list-channels-request))))

(defn list-tags-for-resource-async
  "list-tags-for-resource-request - `com.amazonaws.services.mediapackage.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackage.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageAsync this ^com.amazonaws.services.mediapackage.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageAsync this ^com.amazonaws.services.mediapackage.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn delete-channel-async
  "Deletes an existing Channel.

  delete-channel-request - `com.amazonaws.services.mediapackage.model.DeleteChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackage.model.DeleteChannelResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageAsync this ^com.amazonaws.services.mediapackage.model.DeleteChannelRequest delete-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteChannelAsync delete-channel-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageAsync this ^com.amazonaws.services.mediapackage.model.DeleteChannelRequest delete-channel-request]
    (-> this (.deleteChannelAsync delete-channel-request))))

(defn create-channel-async
  "Creates a new Channel.

  create-channel-request - A new Channel configuration. - `com.amazonaws.services.mediapackage.model.CreateChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackage.model.CreateChannelResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageAsync this ^com.amazonaws.services.mediapackage.model.CreateChannelRequest create-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createChannelAsync create-channel-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageAsync this ^com.amazonaws.services.mediapackage.model.CreateChannelRequest create-channel-request]
    (-> this (.createChannelAsync create-channel-request))))

(defn delete-origin-endpoint-async
  "Deletes an existing OriginEndpoint.

  delete-origin-endpoint-request - `com.amazonaws.services.mediapackage.model.DeleteOriginEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteOriginEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackage.model.DeleteOriginEndpointResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageAsync this ^com.amazonaws.services.mediapackage.model.DeleteOriginEndpointRequest delete-origin-endpoint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteOriginEndpointAsync delete-origin-endpoint-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageAsync this ^com.amazonaws.services.mediapackage.model.DeleteOriginEndpointRequest delete-origin-endpoint-request]
    (-> this (.deleteOriginEndpointAsync delete-origin-endpoint-request))))

(defn list-origin-endpoints-async
  "Returns a collection of OriginEndpoint records.

  list-origin-endpoints-request - `com.amazonaws.services.mediapackage.model.ListOriginEndpointsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListOriginEndpoints operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackage.model.ListOriginEndpointsResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageAsync this ^com.amazonaws.services.mediapackage.model.ListOriginEndpointsRequest list-origin-endpoints-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listOriginEndpointsAsync list-origin-endpoints-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageAsync this ^com.amazonaws.services.mediapackage.model.ListOriginEndpointsRequest list-origin-endpoints-request]
    (-> this (.listOriginEndpointsAsync list-origin-endpoints-request))))

(defn create-origin-endpoint-async
  "Creates a new OriginEndpoint record.

  create-origin-endpoint-request - Configuration parameters used to create a new OriginEndpoint. - `com.amazonaws.services.mediapackage.model.CreateOriginEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateOriginEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackage.model.CreateOriginEndpointResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageAsync this ^com.amazonaws.services.mediapackage.model.CreateOriginEndpointRequest create-origin-endpoint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createOriginEndpointAsync create-origin-endpoint-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageAsync this ^com.amazonaws.services.mediapackage.model.CreateOriginEndpointRequest create-origin-endpoint-request]
    (-> this (.createOriginEndpointAsync create-origin-endpoint-request))))

(defn tag-resource-async
  "tag-resource-request - `com.amazonaws.services.mediapackage.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackage.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageAsync this ^com.amazonaws.services.mediapackage.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageAsync this ^com.amazonaws.services.mediapackage.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

