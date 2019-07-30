(ns com.amazonaws.services.comprehendmedical.AbstractAWSComprehendMedical
  "Abstract implementation of AWSComprehendMedical. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.comprehendmedical AbstractAWSComprehendMedical]))

(defn detect-entities
  "Description copied from interface: AWSComprehendMedical

  request - `com.amazonaws.services.comprehendmedical.model.DetectEntitiesRequest`

  returns: Result of the DetectEntities operation returned by the service. - `com.amazonaws.services.comprehendmedical.model.DetectEntitiesResult`"
  (^com.amazonaws.services.comprehendmedical.model.DetectEntitiesResult [^AbstractAWSComprehendMedical this ^com.amazonaws.services.comprehendmedical.model.DetectEntitiesRequest request]
    (-> this (.detectEntities request))))

(defn detect-phi
  "Description copied from interface: AWSComprehendMedical

  request - `com.amazonaws.services.comprehendmedical.model.DetectPHIRequest`

  returns: Result of the DetectPHI operation returned by the service. - `com.amazonaws.services.comprehendmedical.model.DetectPHIResult`"
  (^com.amazonaws.services.comprehendmedical.model.DetectPHIResult [^AbstractAWSComprehendMedical this ^com.amazonaws.services.comprehendmedical.model.DetectPHIRequest request]
    (-> this (.detectPHI request))))

(defn shutdown
  "Description copied from interface: AWSComprehendMedical"
  ([^AbstractAWSComprehendMedical this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSComprehendMedical

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSComprehendMedical this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

