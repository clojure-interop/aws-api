(ns com.amazonaws.SdkThreadLocals
  "Utility class to manage ThreadLocal storage within the AWS SDK.


  ThreadLocal removal is especially relevant when the AWS SDK is used
  in an application server that manages a pool of threads across many
  applications (for example Tomcat or Glassfish). If a ThreadLocal is
  not cleared on application shutdown and the ThreadLocal value is a
  class from the application classloader then the application classloader
  cannot be garbage collected until the ThreadLocal is set again or the thread
  is disposed of (Glassfish attempts thread renewal on occasion to help with
  this)."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws SdkThreadLocals]))

(defn *remove
  "Removes the current thread's values for all ThreadLocals used by the
   AWS SDK."
  ([]
    (SdkThreadLocals/remove )))

