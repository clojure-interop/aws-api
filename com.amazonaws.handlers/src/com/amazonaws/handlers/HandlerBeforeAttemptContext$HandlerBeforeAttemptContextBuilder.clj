(ns com.amazonaws.handlers.HandlerBeforeAttemptContext$HandlerBeforeAttemptContextBuilder
  "Builder class for HandlerBeforeAttemptContext"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.handlers HandlerBeforeAttemptContext$HandlerBeforeAttemptContextBuilder]))

(defn with-request
  "Fluent set for what the request should be on the eventual HandlerBeforeAttemptContext instance

  request - the request that is to be attempted - `com.amazonaws.Request`

  returns: the modified builder - `com.amazonaws.handlers.HandlerBeforeAttemptContext$HandlerBeforeAttemptContextBuilder`"
  (^com.amazonaws.handlers.HandlerBeforeAttemptContext$HandlerBeforeAttemptContextBuilder [^HandlerBeforeAttemptContext$HandlerBeforeAttemptContextBuilder this ^com.amazonaws.Request request]
    (-> this (.withRequest request))))

(defn build
  "returns: a new HandlerBeforeAttemptContext object - `com.amazonaws.handlers.HandlerBeforeAttemptContext`"
  (^com.amazonaws.handlers.HandlerBeforeAttemptContext [^HandlerBeforeAttemptContext$HandlerBeforeAttemptContextBuilder this]
    (-> this (.build))))

