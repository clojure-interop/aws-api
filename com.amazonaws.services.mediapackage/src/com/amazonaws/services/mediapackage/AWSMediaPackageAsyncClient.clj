(ns com.amazonaws.services.mediapackage.AWSMediaPackageAsyncClient
  "Client for accessing MediaPackage asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  AWS Elemental MediaPackage"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediapackage AWSMediaPackageAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.mediapackage.AWSMediaPackageAsyncClientBuilder`"
  (^com.amazonaws.services.mediapackage.AWSMediaPackageAsyncClientBuilder []
    (AWSMediaPackageAsyncClient/asyncBuilder )))

(defn untag-resource-async
  "request - `com.amazonaws.services.mediapackage.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackage.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageAsyncClient this ^com.amazonaws.services.mediapackage.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageAsyncClient this ^com.amazonaws.services.mediapackage.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn rotate-ingest-endpoint-credentials-async
  "Description copied from interface: AWSMediaPackageAsync

  request - `com.amazonaws.services.mediapackage.model.RotateIngestEndpointCredentialsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RotateIngestEndpointCredentials operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackage.model.RotateIngestEndpointCredentialsResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageAsyncClient this ^com.amazonaws.services.mediapackage.model.RotateIngestEndpointCredentialsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rotateIngestEndpointCredentialsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageAsyncClient this ^com.amazonaws.services.mediapackage.model.RotateIngestEndpointCredentialsRequest request]
    (-> this (.rotateIngestEndpointCredentialsAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSMediaPackageAsyncClient this]
    (-> this (.getExecutorService))))

(defn update-origin-endpoint-async
  "Description copied from interface: AWSMediaPackageAsync

  request - Configuration parameters used to update an existing OriginEndpoint. - `com.amazonaws.services.mediapackage.model.UpdateOriginEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateOriginEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackage.model.UpdateOriginEndpointResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageAsyncClient this ^com.amazonaws.services.mediapackage.model.UpdateOriginEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateOriginEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageAsyncClient this ^com.amazonaws.services.mediapackage.model.UpdateOriginEndpointRequest request]
    (-> this (.updateOriginEndpointAsync request))))

(defn rotate-channel-credentials-async
  "Deprecated.

  request - `com.amazonaws.services.mediapackage.model.RotateChannelCredentialsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RotateChannelCredentials operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackage.model.RotateChannelCredentialsResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageAsyncClient this ^com.amazonaws.services.mediapackage.model.RotateChannelCredentialsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rotateChannelCredentialsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageAsyncClient this ^com.amazonaws.services.mediapackage.model.RotateChannelCredentialsRequest request]
    (-> this (.rotateChannelCredentialsAsync request))))

(defn describe-origin-endpoint-async
  "Description copied from interface: AWSMediaPackageAsync

  request - `com.amazonaws.services.mediapackage.model.DescribeOriginEndpointRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeOriginEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackage.model.DescribeOriginEndpointResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageAsyncClient this ^com.amazonaws.services.mediapackage.model.DescribeOriginEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeOriginEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageAsyncClient this ^com.amazonaws.services.mediapackage.model.DescribeOriginEndpointRequest request]
    (-> this (.describeOriginEndpointAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSMediaPackageAsyncClient this]
    (-> this (.shutdown))))

(defn describe-channel-async
  "Description copied from interface: AWSMediaPackageAsync

  request - `com.amazonaws.services.mediapackage.model.DescribeChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackage.model.DescribeChannelResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageAsyncClient this ^com.amazonaws.services.mediapackage.model.DescribeChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageAsyncClient this ^com.amazonaws.services.mediapackage.model.DescribeChannelRequest request]
    (-> this (.describeChannelAsync request))))

(defn update-channel-async
  "Description copied from interface: AWSMediaPackageAsync

  request - Configuration parameters used to update the Channel. - `com.amazonaws.services.mediapackage.model.UpdateChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackage.model.UpdateChannelResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageAsyncClient this ^com.amazonaws.services.mediapackage.model.UpdateChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageAsyncClient this ^com.amazonaws.services.mediapackage.model.UpdateChannelRequest request]
    (-> this (.updateChannelAsync request))))

(defn list-channels-async
  "Description copied from interface: AWSMediaPackageAsync

  request - `com.amazonaws.services.mediapackage.model.ListChannelsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListChannels operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackage.model.ListChannelsResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageAsyncClient this ^com.amazonaws.services.mediapackage.model.ListChannelsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listChannelsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageAsyncClient this ^com.amazonaws.services.mediapackage.model.ListChannelsRequest request]
    (-> this (.listChannelsAsync request))))

(defn list-tags-for-resource-async
  "request - `com.amazonaws.services.mediapackage.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackage.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageAsyncClient this ^com.amazonaws.services.mediapackage.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageAsyncClient this ^com.amazonaws.services.mediapackage.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn delete-channel-async
  "Description copied from interface: AWSMediaPackageAsync

  request - `com.amazonaws.services.mediapackage.model.DeleteChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackage.model.DeleteChannelResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageAsyncClient this ^com.amazonaws.services.mediapackage.model.DeleteChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageAsyncClient this ^com.amazonaws.services.mediapackage.model.DeleteChannelRequest request]
    (-> this (.deleteChannelAsync request))))

(defn create-channel-async
  "Description copied from interface: AWSMediaPackageAsync

  request - A new Channel configuration. - `com.amazonaws.services.mediapackage.model.CreateChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackage.model.CreateChannelResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageAsyncClient this ^com.amazonaws.services.mediapackage.model.CreateChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageAsyncClient this ^com.amazonaws.services.mediapackage.model.CreateChannelRequest request]
    (-> this (.createChannelAsync request))))

(defn delete-origin-endpoint-async
  "Description copied from interface: AWSMediaPackageAsync

  request - `com.amazonaws.services.mediapackage.model.DeleteOriginEndpointRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteOriginEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackage.model.DeleteOriginEndpointResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageAsyncClient this ^com.amazonaws.services.mediapackage.model.DeleteOriginEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteOriginEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageAsyncClient this ^com.amazonaws.services.mediapackage.model.DeleteOriginEndpointRequest request]
    (-> this (.deleteOriginEndpointAsync request))))

(defn list-origin-endpoints-async
  "Description copied from interface: AWSMediaPackageAsync

  request - `com.amazonaws.services.mediapackage.model.ListOriginEndpointsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListOriginEndpoints operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackage.model.ListOriginEndpointsResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageAsyncClient this ^com.amazonaws.services.mediapackage.model.ListOriginEndpointsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listOriginEndpointsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageAsyncClient this ^com.amazonaws.services.mediapackage.model.ListOriginEndpointsRequest request]
    (-> this (.listOriginEndpointsAsync request))))

(defn create-origin-endpoint-async
  "Description copied from interface: AWSMediaPackageAsync

  request - Configuration parameters used to create a new OriginEndpoint. - `com.amazonaws.services.mediapackage.model.CreateOriginEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateOriginEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackage.model.CreateOriginEndpointResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageAsyncClient this ^com.amazonaws.services.mediapackage.model.CreateOriginEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createOriginEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageAsyncClient this ^com.amazonaws.services.mediapackage.model.CreateOriginEndpointRequest request]
    (-> this (.createOriginEndpointAsync request))))

(defn tag-resource-async
  "request - `com.amazonaws.services.mediapackage.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediapackage.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSMediaPackageAsyncClient this ^com.amazonaws.services.mediapackage.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaPackageAsyncClient this ^com.amazonaws.services.mediapackage.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

