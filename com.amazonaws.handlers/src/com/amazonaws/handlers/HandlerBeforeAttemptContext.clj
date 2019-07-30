(ns com.amazonaws.handlers.HandlerBeforeAttemptContext
  "Contextual data for the RequestHandler2 beforeAttempt callback"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.handlers HandlerBeforeAttemptContext]))

(defn *builder
  "returns: a new builder for a HandlerBeforeAttemptContext instance - `com.amazonaws.handlers.HandlerBeforeAttemptContext$HandlerBeforeAttemptContextBuilder`"
  (^com.amazonaws.handlers.HandlerBeforeAttemptContext$HandlerBeforeAttemptContextBuilder []
    (HandlerBeforeAttemptContext/builder )))

(defn get-request
  "returns: the request that is about to be attempted - `com.amazonaws.Request<?>`"
  (^com.amazonaws.Request [^HandlerBeforeAttemptContext this]
    (-> this (.getRequest))))

