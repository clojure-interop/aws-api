(ns com.amazonaws.handlers.AsyncHandler
  "Callback interface for notification on web service requests executed with the
  asynchronous clients in the AWS SDK for Java."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.handlers AsyncHandler]))

(defn on-error
  "Invoked after an asynchronous request

  exception - `java.lang.Exception`"
  ([^AsyncHandler this ^java.lang.Exception exception]
    (-> this (.onError exception))))

(defn on-success
  "Invoked after an asynchronous request has completed successfully. Callers
   have access to the original request object and the returned response
   object.

  request - The initial request created by the caller - `REQUEST`
  result - The successful result of the executed operation. - `RESULT`"
  ([^AsyncHandler this request result]
    (-> this (.onSuccess request result))))

