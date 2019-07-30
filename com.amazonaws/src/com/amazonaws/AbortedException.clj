(ns com.amazonaws.AbortedException
  "SDK operation aborted exception."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws AbortedException]))

(defn ->aborted-exception
  "Constructor.

  message - `java.lang.String`
  t - `java.lang.Throwable`"
  (^AbortedException [^java.lang.String message ^java.lang.Throwable t]
    (new AbortedException message t))
  (^AbortedException [^java.lang.Throwable t]
    (new AbortedException t))
  (^AbortedException []
    (new AbortedException )))

(defn retryable?
  "Returns a hint as to whether it makes sense to retry upon this exception.
   Default is true, but subclass may override.

   This method is internal to the SDK. Users should not depend on this method to decide
   if an exception from a service should be retried.
   An aborted exception is not intended to be retried.

  returns: `boolean`"
  (^Boolean [^AbortedException this]
    (-> this (.isRetryable))))

