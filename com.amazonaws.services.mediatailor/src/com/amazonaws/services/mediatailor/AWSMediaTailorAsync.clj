(ns com.amazonaws.services.mediatailor.AWSMediaTailorAsync
  "Interface for accessing MediaTailor asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSMediaTailorAsync instead.



  Use the AWS Elemental MediaTailor SDK to configure scalable ad insertion for your live and VOD content. With AWS
  Elemental MediaTailor, you can serve targeted ads to viewers while maintaining broadcast quality in over-the-top
  (OTT) video applications. For information about using the service, including detailed information about the settings
  covered in this guide, see the AWS Elemental MediaTailor User Guide.

  Through the SDK, you manage AWS Elemental MediaTailor configurations the same as you do through the console. For
  example, you specify ad insertion behavior and mapping information for the origin server and the ad decision server
  (ADS)."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediatailor AWSMediaTailorAsync]))

(defn delete-playback-configuration-async
  "Deletes the playback configuration for the specified name.

  delete-playback-configuration-request - `com.amazonaws.services.mediatailor.model.DeletePlaybackConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePlaybackConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediatailor.model.DeletePlaybackConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSMediaTailorAsync this ^com.amazonaws.services.mediatailor.model.DeletePlaybackConfigurationRequest delete-playback-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePlaybackConfigurationAsync delete-playback-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaTailorAsync this ^com.amazonaws.services.mediatailor.model.DeletePlaybackConfigurationRequest delete-playback-configuration-request]
    (-> this (.deletePlaybackConfigurationAsync delete-playback-configuration-request))))

(defn get-playback-configuration-async
  "Returns the playback configuration for the specified name.

  get-playback-configuration-request - `com.amazonaws.services.mediatailor.model.GetPlaybackConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPlaybackConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediatailor.model.GetPlaybackConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSMediaTailorAsync this ^com.amazonaws.services.mediatailor.model.GetPlaybackConfigurationRequest get-playback-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPlaybackConfigurationAsync get-playback-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaTailorAsync this ^com.amazonaws.services.mediatailor.model.GetPlaybackConfigurationRequest get-playback-configuration-request]
    (-> this (.getPlaybackConfigurationAsync get-playback-configuration-request))))

(defn list-playback-configurations-async
  "Returns a list of the playback configurations defined in AWS Elemental MediaTailor. You can specify a maximum
   number of configurations to return at a time. The default maximum is 50. Results are returned in pagefuls. If
   MediaTailor has more configurations than the specified maximum, it provides parameters in the response that you
   can use to retrieve the next pageful.

  list-playback-configurations-request - `com.amazonaws.services.mediatailor.model.ListPlaybackConfigurationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPlaybackConfigurations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediatailor.model.ListPlaybackConfigurationsResult>`"
  (^java.util.concurrent.Future [^AWSMediaTailorAsync this ^com.amazonaws.services.mediatailor.model.ListPlaybackConfigurationsRequest list-playback-configurations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPlaybackConfigurationsAsync list-playback-configurations-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaTailorAsync this ^com.amazonaws.services.mediatailor.model.ListPlaybackConfigurationsRequest list-playback-configurations-request]
    (-> this (.listPlaybackConfigurationsAsync list-playback-configurations-request))))

(defn list-tags-for-resource-async
  "Returns a list of the tags assigned to the specified playback configuration resource.

  list-tags-for-resource-request - `com.amazonaws.services.mediatailor.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediatailor.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSMediaTailorAsync this ^com.amazonaws.services.mediatailor.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaTailorAsync this ^com.amazonaws.services.mediatailor.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn put-playback-configuration-async
  "Adds a new playback configuration to AWS Elemental MediaTailor.

  put-playback-configuration-request - `com.amazonaws.services.mediatailor.model.PutPlaybackConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutPlaybackConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediatailor.model.PutPlaybackConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSMediaTailorAsync this ^com.amazonaws.services.mediatailor.model.PutPlaybackConfigurationRequest put-playback-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putPlaybackConfigurationAsync put-playback-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaTailorAsync this ^com.amazonaws.services.mediatailor.model.PutPlaybackConfigurationRequest put-playback-configuration-request]
    (-> this (.putPlaybackConfigurationAsync put-playback-configuration-request))))

(defn tag-resource-async
  "Adds tags to the specified playback configuration resource. You can specify one or more tags to add.

  tag-resource-request - `com.amazonaws.services.mediatailor.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediatailor.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSMediaTailorAsync this ^com.amazonaws.services.mediatailor.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaTailorAsync this ^com.amazonaws.services.mediatailor.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn untag-resource-async
  "Removes tags from the specified playback configuration resource. You can specify one or more tags to remove.

  untag-resource-request - `com.amazonaws.services.mediatailor.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediatailor.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSMediaTailorAsync this ^com.amazonaws.services.mediatailor.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaTailorAsync this ^com.amazonaws.services.mediatailor.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

