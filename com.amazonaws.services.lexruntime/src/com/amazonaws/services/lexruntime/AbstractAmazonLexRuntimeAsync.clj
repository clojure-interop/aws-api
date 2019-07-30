(ns com.amazonaws.services.lexruntime.AbstractAmazonLexRuntimeAsync
  "Abstract implementation of AmazonLexRuntimeAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.lexruntime AbstractAmazonLexRuntimeAsync]))

(defn post-content-async
  "Description copied from interface: AmazonLexRuntimeAsync

  request - `com.amazonaws.services.lexruntime.model.PostContentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PostContent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexruntime.model.PostContentResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonLexRuntimeAsync this ^com.amazonaws.services.lexruntime.model.PostContentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.postContentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonLexRuntimeAsync this ^com.amazonaws.services.lexruntime.model.PostContentRequest request]
    (-> this (.postContentAsync request))))

(defn post-text-async
  "Description copied from interface: AmazonLexRuntimeAsync

  request - `com.amazonaws.services.lexruntime.model.PostTextRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PostText operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexruntime.model.PostTextResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonLexRuntimeAsync this ^com.amazonaws.services.lexruntime.model.PostTextRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.postTextAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonLexRuntimeAsync this ^com.amazonaws.services.lexruntime.model.PostTextRequest request]
    (-> this (.postTextAsync request))))

