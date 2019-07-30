(ns com.amazonaws.retry.RetryUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.retry RetryUtils]))

(defn ->retry-utils
  "Constructor."
  (^RetryUtils []
    (new RetryUtils )))

(defn *retryable-service-exception?
  "Returns true if the specified exception is a retryable service side exception.

  exception - The exception to test. - `com.amazonaws.SdkBaseException`

  returns: True if the exception resulted from a retryable service error, otherwise false. - `boolean`"
  (^Boolean [^com.amazonaws.SdkBaseException exception]
    (RetryUtils/isRetryableServiceException exception)))

(defn *throttling-exception?
  "Returns true if the specified exception is a throttling error.

  exception - The exception to test. - `com.amazonaws.SdkBaseException`

  returns: True if the exception resulted from a throttling error message from a service, otherwise false. - `boolean`"
  (^Boolean [^com.amazonaws.SdkBaseException exception]
    (RetryUtils/isThrottlingException exception)))

(defn *request-entity-too-large-exception?
  "Returns true if the specified exception is a request entity too large error.

  exception - The exception to test. - `com.amazonaws.SdkBaseException`

  returns: True if the exception resulted from a request entity too large error message from a service, otherwise false. - `boolean`"
  (^Boolean [^com.amazonaws.SdkBaseException exception]
    (RetryUtils/isRequestEntityTooLargeException exception)))

(defn *clock-skew-error?
  "Returns true if the specified exception is definitely a clock skew error.

   This cannot determine all instances of clock skew errors. For example, not all HEAD requests return an error code, so
   there is no way to determine whether a failed HEAD response is definitely a clock skew error.

  exception - The exception to test. - `com.amazonaws.SdkBaseException`

  returns: True if the exception is definitely a clock skew error, otherwise false. - `boolean`"
  (^Boolean [^com.amazonaws.SdkBaseException exception]
    (RetryUtils/isClockSkewError exception)))

