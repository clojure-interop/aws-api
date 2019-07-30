(ns com.amazonaws.waiters.WaiterTimedOutException
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.waiters WaiterTimedOutException]))

(defn ->waiter-timed-out-exception
  "Constructor.

  Constructs a new WaiterTimedOutException with the specified error
   message.

  message - Describes the error encountered. - `java.lang.String`"
  (^WaiterTimedOutException [^java.lang.String message]
    (new WaiterTimedOutException message)))

