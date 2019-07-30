(ns com.amazonaws.services.mediatailor.AbstractAWSMediaTailor
  "Abstract implementation of AWSMediaTailor. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediatailor AbstractAWSMediaTailor]))

(defn list-tags-for-resource
  "Description copied from interface: AWSMediaTailor

  request - `com.amazonaws.services.mediatailor.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.mediatailor.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.mediatailor.model.ListTagsForResourceResult [^AbstractAWSMediaTailor this ^com.amazonaws.services.mediatailor.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn list-playback-configurations
  "Description copied from interface: AWSMediaTailor

  request - `com.amazonaws.services.mediatailor.model.ListPlaybackConfigurationsRequest`

  returns: Result of the ListPlaybackConfigurations operation returned by the service. - `com.amazonaws.services.mediatailor.model.ListPlaybackConfigurationsResult`"
  (^com.amazonaws.services.mediatailor.model.ListPlaybackConfigurationsResult [^AbstractAWSMediaTailor this ^com.amazonaws.services.mediatailor.model.ListPlaybackConfigurationsRequest request]
    (-> this (.listPlaybackConfigurations request))))

(defn untag-resource
  "Description copied from interface: AWSMediaTailor

  request - `com.amazonaws.services.mediatailor.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.mediatailor.model.UntagResourceResult`"
  (^com.amazonaws.services.mediatailor.model.UntagResourceResult [^AbstractAWSMediaTailor this ^com.amazonaws.services.mediatailor.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn delete-playback-configuration
  "Description copied from interface: AWSMediaTailor

  request - `com.amazonaws.services.mediatailor.model.DeletePlaybackConfigurationRequest`

  returns: Result of the DeletePlaybackConfiguration operation returned by the service. - `com.amazonaws.services.mediatailor.model.DeletePlaybackConfigurationResult`"
  (^com.amazonaws.services.mediatailor.model.DeletePlaybackConfigurationResult [^AbstractAWSMediaTailor this ^com.amazonaws.services.mediatailor.model.DeletePlaybackConfigurationRequest request]
    (-> this (.deletePlaybackConfiguration request))))

(defn shutdown
  "Description copied from interface: AWSMediaTailor"
  ([^AbstractAWSMediaTailor this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSMediaTailor

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSMediaTailor this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn tag-resource
  "Description copied from interface: AWSMediaTailor

  request - `com.amazonaws.services.mediatailor.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.mediatailor.model.TagResourceResult`"
  (^com.amazonaws.services.mediatailor.model.TagResourceResult [^AbstractAWSMediaTailor this ^com.amazonaws.services.mediatailor.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn get-playback-configuration
  "Description copied from interface: AWSMediaTailor

  request - `com.amazonaws.services.mediatailor.model.GetPlaybackConfigurationRequest`

  returns: Result of the GetPlaybackConfiguration operation returned by the service. - `com.amazonaws.services.mediatailor.model.GetPlaybackConfigurationResult`"
  (^com.amazonaws.services.mediatailor.model.GetPlaybackConfigurationResult [^AbstractAWSMediaTailor this ^com.amazonaws.services.mediatailor.model.GetPlaybackConfigurationRequest request]
    (-> this (.getPlaybackConfiguration request))))

(defn put-playback-configuration
  "Description copied from interface: AWSMediaTailor

  request - `com.amazonaws.services.mediatailor.model.PutPlaybackConfigurationRequest`

  returns: Result of the PutPlaybackConfiguration operation returned by the service. - `com.amazonaws.services.mediatailor.model.PutPlaybackConfigurationResult`"
  (^com.amazonaws.services.mediatailor.model.PutPlaybackConfigurationResult [^AbstractAWSMediaTailor this ^com.amazonaws.services.mediatailor.model.PutPlaybackConfigurationRequest request]
    (-> this (.putPlaybackConfiguration request))))

