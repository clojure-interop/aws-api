(ns com.amazonaws.services.lexruntime.AbstractAmazonLexRuntime
  "Abstract implementation of AmazonLexRuntime. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.lexruntime AbstractAmazonLexRuntime]))

(defn post-content
  "Description copied from interface: AmazonLexRuntime

  request - `com.amazonaws.services.lexruntime.model.PostContentRequest`

  returns: Result of the PostContent operation returned by the service. - `com.amazonaws.services.lexruntime.model.PostContentResult`"
  (^com.amazonaws.services.lexruntime.model.PostContentResult [^AbstractAmazonLexRuntime this ^com.amazonaws.services.lexruntime.model.PostContentRequest request]
    (-> this (.postContent request))))

(defn post-text
  "Description copied from interface: AmazonLexRuntime

  request - `com.amazonaws.services.lexruntime.model.PostTextRequest`

  returns: Result of the PostText operation returned by the service. - `com.amazonaws.services.lexruntime.model.PostTextResult`"
  (^com.amazonaws.services.lexruntime.model.PostTextResult [^AbstractAmazonLexRuntime this ^com.amazonaws.services.lexruntime.model.PostTextRequest request]
    (-> this (.postText request))))

(defn shutdown
  "Description copied from interface: AmazonLexRuntime"
  ([^AbstractAmazonLexRuntime this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonLexRuntime

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonLexRuntime this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

