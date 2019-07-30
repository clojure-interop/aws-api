(ns com.amazonaws.ResetException
  "Stream reset failure."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws ResetException]))

(defn ->reset-exception
  "Constructor.

  message - `java.lang.String`
  t - `java.lang.Throwable`"
  (^ResetException [^java.lang.String message ^java.lang.Throwable t]
    (new ResetException message t))
  (^ResetException [^java.lang.Throwable t]
    (new ResetException t))
  (^ResetException []
    (new ResetException )))

(defn retryable?
  "Returns a hint as to whether it makes sense to retry upon this exception.
   Default is true, but subclass may override.

   This method is internal to the SDK. Users should not depend on this method to decide
   if an exception from a service should be retried.
   A stream reset exception cannot be retried.

  returns: `boolean`"
  (^Boolean [^ResetException this]
    (-> this (.isRetryable))))

(defn get-message
  "returns: `java.lang.String`"
  (^java.lang.String [^ResetException this]
    (-> this (.getMessage))))

(defn get-extra-info
  "returns: `java.lang.String`"
  (^java.lang.String [^ResetException this]
    (-> this (.getExtraInfo))))

(defn set-extra-info
  "extra-info - `java.lang.String`"
  ([^ResetException this ^java.lang.String extra-info]
    (-> this (.setExtraInfo extra-info))))

