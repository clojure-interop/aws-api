(ns com.amazonaws.handlers.HandlerAfterAttemptContext
  "Contextual data for the RequestHandler2 afterAttempt callback

  Under certain conditions (redirects), both response and exception may be null"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.handlers HandlerAfterAttemptContext]))

(defn *builder
  "returns: a new builder for a HandlerAfterAttemptContext instance - `com.amazonaws.handlers.HandlerAfterAttemptContext$HandlerAfterAttemptContextBuilder`"
  (^com.amazonaws.handlers.HandlerAfterAttemptContext$HandlerAfterAttemptContextBuilder []
    (HandlerAfterAttemptContext/builder )))

(defn get-request
  "returns: the request being attempted - `com.amazonaws.Request<?>`"
  (^com.amazonaws.Request [^HandlerAfterAttemptContext this]
    (-> this (.getRequest))))

(defn get-response
  "returns: the response to the request or null if the attempt failed - `com.amazonaws.Response<?>`"
  (^com.amazonaws.Response [^HandlerAfterAttemptContext this]
    (-> this (.getResponse))))

(defn get-exception
  "returns: the exception that was generated while processing the request, or null if the attempt succeeded - `java.lang.Exception`"
  (^java.lang.Exception [^HandlerAfterAttemptContext this]
    (-> this (.getException))))

