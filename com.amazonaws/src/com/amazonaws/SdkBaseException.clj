(ns com.amazonaws.SdkBaseException
  "Base class for all exceptions thrown by the SDK.
  Exception may be a client side exception or an unmarshalled service exception."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws SdkBaseException]))

(defn ->sdk-base-exception
  "Constructor.

  Creates a new SdkBaseException with the specified message, and root
   cause.

  message - An error message describing why this exception was thrown. - `java.lang.String`
  t - The underlying cause of this exception. - `java.lang.Throwable`"
  (^SdkBaseException [^java.lang.String message ^java.lang.Throwable t]
    (new SdkBaseException message t))
  (^SdkBaseException [^java.lang.String message]
    (new SdkBaseException message)))

