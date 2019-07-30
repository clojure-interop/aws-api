(ns com.amazonaws.SdkClientException
  "Base type for all client exceptions thrown by the SDK.

  This exception is thrown when service could not be contacted for a response,
  or when client is unable to parse the response from service."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws SdkClientException]))

(defn ->sdk-client-exception
  "Constructor.

  Creates a new SdkClientException with the specified message, and root
   cause.

  message - An error message describing why this exception was thrown. - `java.lang.String`
  t - The underlying cause of this exception. - `java.lang.Throwable`"
  (^SdkClientException [^java.lang.String message ^java.lang.Throwable t]
    (new SdkClientException message t))
  (^SdkClientException [^java.lang.String message]
    (new SdkClientException message)))

