(ns com.amazonaws.services.mediatailor.AWSMediaTailorClient
  "Client for accessing MediaTailor. All service calls made using this client are blocking, and will not return until
  the service call completes.


  Use the AWS Elemental MediaTailor SDK to configure scalable ad insertion for your live and VOD content. With AWS
  Elemental MediaTailor, you can serve targeted ads to viewers while maintaining broadcast quality in over-the-top
  (OTT) video applications. For information about using the service, including detailed information about the settings
  covered in this guide, see the AWS Elemental MediaTailor User Guide.

  Through the SDK, you manage AWS Elemental MediaTailor configurations the same as you do through the console. For
  example, you specify ad insertion behavior and mapping information for the origin server and the ad decision server
  (ADS)."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediatailor AWSMediaTailorClient]))

(defn *builder
  "returns: `com.amazonaws.services.mediatailor.AWSMediaTailorClientBuilder`"
  (^com.amazonaws.services.mediatailor.AWSMediaTailorClientBuilder []
    (AWSMediaTailorClient/builder )))

(defn delete-playback-configuration
  "Deletes the playback configuration for the specified name.

  request - `com.amazonaws.services.mediatailor.model.DeletePlaybackConfigurationRequest`

  returns: Result of the DeletePlaybackConfiguration operation returned by the service. - `com.amazonaws.services.mediatailor.model.DeletePlaybackConfigurationResult`"
  (^com.amazonaws.services.mediatailor.model.DeletePlaybackConfigurationResult [^AWSMediaTailorClient this ^com.amazonaws.services.mediatailor.model.DeletePlaybackConfigurationRequest request]
    (-> this (.deletePlaybackConfiguration request))))

(defn get-playback-configuration
  "Returns the playback configuration for the specified name.

  request - `com.amazonaws.services.mediatailor.model.GetPlaybackConfigurationRequest`

  returns: Result of the GetPlaybackConfiguration operation returned by the service. - `com.amazonaws.services.mediatailor.model.GetPlaybackConfigurationResult`"
  (^com.amazonaws.services.mediatailor.model.GetPlaybackConfigurationResult [^AWSMediaTailorClient this ^com.amazonaws.services.mediatailor.model.GetPlaybackConfigurationRequest request]
    (-> this (.getPlaybackConfiguration request))))

(defn list-playback-configurations
  "Returns a list of the playback configurations defined in AWS Elemental MediaTailor. You can specify a maximum
   number of configurations to return at a time. The default maximum is 50. Results are returned in pagefuls. If
   MediaTailor has more configurations than the specified maximum, it provides parameters in the response that you
   can use to retrieve the next pageful.

  request - `com.amazonaws.services.mediatailor.model.ListPlaybackConfigurationsRequest`

  returns: Result of the ListPlaybackConfigurations operation returned by the service. - `com.amazonaws.services.mediatailor.model.ListPlaybackConfigurationsResult`"
  (^com.amazonaws.services.mediatailor.model.ListPlaybackConfigurationsResult [^AWSMediaTailorClient this ^com.amazonaws.services.mediatailor.model.ListPlaybackConfigurationsRequest request]
    (-> this (.listPlaybackConfigurations request))))

(defn list-tags-for-resource
  "Returns a list of the tags assigned to the specified playback configuration resource.

  request - `com.amazonaws.services.mediatailor.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.mediatailor.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.mediatailor.model.BadRequestException - Invalid request parameters."
  (^com.amazonaws.services.mediatailor.model.ListTagsForResourceResult [^AWSMediaTailorClient this ^com.amazonaws.services.mediatailor.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn put-playback-configuration
  "Adds a new playback configuration to AWS Elemental MediaTailor.

  request - `com.amazonaws.services.mediatailor.model.PutPlaybackConfigurationRequest`

  returns: Result of the PutPlaybackConfiguration operation returned by the service. - `com.amazonaws.services.mediatailor.model.PutPlaybackConfigurationResult`"
  (^com.amazonaws.services.mediatailor.model.PutPlaybackConfigurationResult [^AWSMediaTailorClient this ^com.amazonaws.services.mediatailor.model.PutPlaybackConfigurationRequest request]
    (-> this (.putPlaybackConfiguration request))))

(defn tag-resource
  "Adds tags to the specified playback configuration resource. You can specify one or more tags to add.

  request - `com.amazonaws.services.mediatailor.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.mediatailor.model.TagResourceResult`

  throws: com.amazonaws.services.mediatailor.model.BadRequestException - Invalid request parameters."
  (^com.amazonaws.services.mediatailor.model.TagResourceResult [^AWSMediaTailorClient this ^com.amazonaws.services.mediatailor.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn untag-resource
  "Removes tags from the specified playback configuration resource. You can specify one or more tags to remove.

  request - `com.amazonaws.services.mediatailor.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.mediatailor.model.UntagResourceResult`

  throws: com.amazonaws.services.mediatailor.model.BadRequestException - Invalid request parameters."
  (^com.amazonaws.services.mediatailor.model.UntagResourceResult [^AWSMediaTailorClient this ^com.amazonaws.services.mediatailor.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSMediaTailorClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

