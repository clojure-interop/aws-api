(ns com.amazonaws.services.mediatailor.AbstractAWSMediaTailorAsync
  "Abstract implementation of AWSMediaTailorAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediatailor AbstractAWSMediaTailorAsync]))

(defn delete-playback-configuration-async
  "Description copied from interface: AWSMediaTailorAsync

  request - `com.amazonaws.services.mediatailor.model.DeletePlaybackConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePlaybackConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediatailor.model.DeletePlaybackConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaTailorAsync this ^com.amazonaws.services.mediatailor.model.DeletePlaybackConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePlaybackConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaTailorAsync this ^com.amazonaws.services.mediatailor.model.DeletePlaybackConfigurationRequest request]
    (-> this (.deletePlaybackConfigurationAsync request))))

(defn get-playback-configuration-async
  "Description copied from interface: AWSMediaTailorAsync

  request - `com.amazonaws.services.mediatailor.model.GetPlaybackConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPlaybackConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediatailor.model.GetPlaybackConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaTailorAsync this ^com.amazonaws.services.mediatailor.model.GetPlaybackConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPlaybackConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaTailorAsync this ^com.amazonaws.services.mediatailor.model.GetPlaybackConfigurationRequest request]
    (-> this (.getPlaybackConfigurationAsync request))))

(defn list-playback-configurations-async
  "Description copied from interface: AWSMediaTailorAsync

  request - `com.amazonaws.services.mediatailor.model.ListPlaybackConfigurationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPlaybackConfigurations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediatailor.model.ListPlaybackConfigurationsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaTailorAsync this ^com.amazonaws.services.mediatailor.model.ListPlaybackConfigurationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPlaybackConfigurationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaTailorAsync this ^com.amazonaws.services.mediatailor.model.ListPlaybackConfigurationsRequest request]
    (-> this (.listPlaybackConfigurationsAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSMediaTailorAsync

  request - `com.amazonaws.services.mediatailor.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediatailor.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaTailorAsync this ^com.amazonaws.services.mediatailor.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaTailorAsync this ^com.amazonaws.services.mediatailor.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn put-playback-configuration-async
  "Description copied from interface: AWSMediaTailorAsync

  request - `com.amazonaws.services.mediatailor.model.PutPlaybackConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutPlaybackConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediatailor.model.PutPlaybackConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaTailorAsync this ^com.amazonaws.services.mediatailor.model.PutPlaybackConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putPlaybackConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaTailorAsync this ^com.amazonaws.services.mediatailor.model.PutPlaybackConfigurationRequest request]
    (-> this (.putPlaybackConfigurationAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSMediaTailorAsync

  request - `com.amazonaws.services.mediatailor.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediatailor.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaTailorAsync this ^com.amazonaws.services.mediatailor.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaTailorAsync this ^com.amazonaws.services.mediatailor.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn untag-resource-async
  "Description copied from interface: AWSMediaTailorAsync

  request - `com.amazonaws.services.mediatailor.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediatailor.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaTailorAsync this ^com.amazonaws.services.mediatailor.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaTailorAsync this ^com.amazonaws.services.mediatailor.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

