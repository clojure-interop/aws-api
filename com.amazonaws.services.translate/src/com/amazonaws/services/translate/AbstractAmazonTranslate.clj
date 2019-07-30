(ns com.amazonaws.services.translate.AbstractAmazonTranslate
  "Abstract implementation of AmazonTranslate. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.translate AbstractAmazonTranslate]))

(defn delete-terminology
  "Description copied from interface: AmazonTranslate

  request - `com.amazonaws.services.translate.model.DeleteTerminologyRequest`

  returns: Result of the DeleteTerminology operation returned by the service. - `com.amazonaws.services.translate.model.DeleteTerminologyResult`"
  (^com.amazonaws.services.translate.model.DeleteTerminologyResult [^AbstractAmazonTranslate this ^com.amazonaws.services.translate.model.DeleteTerminologyRequest request]
    (-> this (.deleteTerminology request))))

(defn get-terminology
  "Description copied from interface: AmazonTranslate

  request - `com.amazonaws.services.translate.model.GetTerminologyRequest`

  returns: Result of the GetTerminology operation returned by the service. - `com.amazonaws.services.translate.model.GetTerminologyResult`"
  (^com.amazonaws.services.translate.model.GetTerminologyResult [^AbstractAmazonTranslate this ^com.amazonaws.services.translate.model.GetTerminologyRequest request]
    (-> this (.getTerminology request))))

(defn import-terminology
  "Description copied from interface: AmazonTranslate

  request - `com.amazonaws.services.translate.model.ImportTerminologyRequest`

  returns: Result of the ImportTerminology operation returned by the service. - `com.amazonaws.services.translate.model.ImportTerminologyResult`"
  (^com.amazonaws.services.translate.model.ImportTerminologyResult [^AbstractAmazonTranslate this ^com.amazonaws.services.translate.model.ImportTerminologyRequest request]
    (-> this (.importTerminology request))))

(defn list-terminologies
  "Description copied from interface: AmazonTranslate

  request - `com.amazonaws.services.translate.model.ListTerminologiesRequest`

  returns: Result of the ListTerminologies operation returned by the service. - `com.amazonaws.services.translate.model.ListTerminologiesResult`"
  (^com.amazonaws.services.translate.model.ListTerminologiesResult [^AbstractAmazonTranslate this ^com.amazonaws.services.translate.model.ListTerminologiesRequest request]
    (-> this (.listTerminologies request))))

(defn translate-text
  "Description copied from interface: AmazonTranslate

  request - `com.amazonaws.services.translate.model.TranslateTextRequest`

  returns: Result of the TranslateText operation returned by the service. - `com.amazonaws.services.translate.model.TranslateTextResult`"
  (^com.amazonaws.services.translate.model.TranslateTextResult [^AbstractAmazonTranslate this ^com.amazonaws.services.translate.model.TranslateTextRequest request]
    (-> this (.translateText request))))

(defn shutdown
  "Description copied from interface: AmazonTranslate"
  ([^AbstractAmazonTranslate this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonTranslate

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonTranslate this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

