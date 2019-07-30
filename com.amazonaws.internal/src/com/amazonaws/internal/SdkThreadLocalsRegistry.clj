(ns com.amazonaws.internal.SdkThreadLocalsRegistry
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.internal SdkThreadLocalsRegistry]))

(defn *register
  "Registers ThreadLocal objects in use by the AWS SDK so that their values can
   be removed via the remove() method.

   To avoid memory leaks and reduce contention this method should only be called when
   setting static final locations (for example finals in enums or static final fields).

  thread-local - ThreadLocal to register - `java.lang.ThreadLocal`

  returns: the input ThreadLocal - `<T> java.lang.ThreadLocal<T>`"
  ([^java.lang.ThreadLocal thread-local]
    (SdkThreadLocalsRegistry/register thread-local)))

(defn *remove
  ""
  ([]
    (SdkThreadLocalsRegistry/remove )))

