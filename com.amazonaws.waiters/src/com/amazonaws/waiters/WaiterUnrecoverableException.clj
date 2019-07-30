(ns com.amazonaws.waiters.WaiterUnrecoverableException
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.waiters WaiterUnrecoverableException]))

(defn ->waiter-unrecoverable-exception
  "Constructor.

  Constructs a new WaiterUnrecoverableException with the specified error
   message.

  message - Describes the error encountered. - `java.lang.String`"
  (^WaiterUnrecoverableException [^java.lang.String message]
    (new WaiterUnrecoverableException message)))

