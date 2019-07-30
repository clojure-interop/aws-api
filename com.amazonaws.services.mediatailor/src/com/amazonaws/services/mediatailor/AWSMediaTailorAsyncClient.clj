(ns com.amazonaws.services.mediatailor.AWSMediaTailorAsyncClient
  "Client for accessing MediaTailor asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


  Use the AWS Elemental MediaTailor SDK to configure scalable ad insertion for your live and VOD content. With AWS
  Elemental MediaTailor, you can serve targeted ads to viewers while maintaining broadcast quality in over-the-top
  (OTT) video applications. For information about using the service, including detailed information about the settings
  covered in this guide, see the AWS Elemental MediaTailor User Guide.

  Through the SDK, you manage AWS Elemental MediaTailor configurations the same as you do through the console. For
  example, you specify ad insertion behavior and mapping information for the origin server and the ad decision server
  (ADS)."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediatailor AWSMediaTailorAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.mediatailor.AWSMediaTailorAsyncClientBuilder`"
  (^com.amazonaws.services.mediatailor.AWSMediaTailorAsyncClientBuilder []
    (AWSMediaTailorAsyncClient/asyncBuilder )))

(defn untag-resource-async
  "Description copied from interface: AWSMediaTailorAsync

  request - `com.amazonaws.services.mediatailor.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediatailor.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSMediaTailorAsyncClient this ^com.amazonaws.services.mediatailor.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaTailorAsyncClient this ^com.amazonaws.services.mediatailor.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSMediaTailorAsyncClient this]
    (-> this (.getExecutorService))))

(defn delete-playback-configuration-async
  "Description copied from interface: AWSMediaTailorAsync

  request - `com.amazonaws.services.mediatailor.model.DeletePlaybackConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePlaybackConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediatailor.model.DeletePlaybackConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSMediaTailorAsyncClient this ^com.amazonaws.services.mediatailor.model.DeletePlaybackConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePlaybackConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaTailorAsyncClient this ^com.amazonaws.services.mediatailor.model.DeletePlaybackConfigurationRequest request]
    (-> this (.deletePlaybackConfigurationAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSMediaTailorAsyncClient this]
    (-> this (.shutdown))))

(defn list-playback-configurations-async
  "Description copied from interface: AWSMediaTailorAsync

  request - `com.amazonaws.services.mediatailor.model.ListPlaybackConfigurationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPlaybackConfigurations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediatailor.model.ListPlaybackConfigurationsResult>`"
  (^java.util.concurrent.Future [^AWSMediaTailorAsyncClient this ^com.amazonaws.services.mediatailor.model.ListPlaybackConfigurationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPlaybackConfigurationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaTailorAsyncClient this ^com.amazonaws.services.mediatailor.model.ListPlaybackConfigurationsRequest request]
    (-> this (.listPlaybackConfigurationsAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSMediaTailorAsync

  request - `com.amazonaws.services.mediatailor.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediatailor.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSMediaTailorAsyncClient this ^com.amazonaws.services.mediatailor.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaTailorAsyncClient this ^com.amazonaws.services.mediatailor.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn put-playback-configuration-async
  "Description copied from interface: AWSMediaTailorAsync

  request - `com.amazonaws.services.mediatailor.model.PutPlaybackConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutPlaybackConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediatailor.model.PutPlaybackConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSMediaTailorAsyncClient this ^com.amazonaws.services.mediatailor.model.PutPlaybackConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putPlaybackConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaTailorAsyncClient this ^com.amazonaws.services.mediatailor.model.PutPlaybackConfigurationRequest request]
    (-> this (.putPlaybackConfigurationAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSMediaTailorAsync

  request - `com.amazonaws.services.mediatailor.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediatailor.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSMediaTailorAsyncClient this ^com.amazonaws.services.mediatailor.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaTailorAsyncClient this ^com.amazonaws.services.mediatailor.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn get-playback-configuration-async
  "Description copied from interface: AWSMediaTailorAsync

  request - `com.amazonaws.services.mediatailor.model.GetPlaybackConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPlaybackConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediatailor.model.GetPlaybackConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSMediaTailorAsyncClient this ^com.amazonaws.services.mediatailor.model.GetPlaybackConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPlaybackConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaTailorAsyncClient this ^com.amazonaws.services.mediatailor.model.GetPlaybackConfigurationRequest request]
    (-> this (.getPlaybackConfigurationAsync request))))

