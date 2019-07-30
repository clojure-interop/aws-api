(ns com.amazonaws.waiters.HttpFailureStatusAcceptor
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.waiters HttpFailureStatusAcceptor]))

(defn ->http-failure-status-acceptor
  "Constructor.

  expected-status-code - `int`
  waiter-state - `com.amazonaws.waiters.WaiterState`"
  (^HttpFailureStatusAcceptor [^Integer expected-status-code ^com.amazonaws.waiters.WaiterState waiter-state]
    (new HttpFailureStatusAcceptor expected-status-code waiter-state)))

(defn matches
  "Description copied from class: WaiterAcceptor

  ase - Exception thrown by the execution of the operation - `com.amazonaws.AmazonServiceException`

  returns: False by default.
   When overriden, returns True if it matches, False
   otherwise - `boolean`"
  (^Boolean [^HttpFailureStatusAcceptor this ^com.amazonaws.AmazonServiceException ase]
    (-> this (.matches ase))))

(defn get-state
  "Description copied from class: WaiterAcceptor

  returns: Corresponding state of the resource - `com.amazonaws.waiters.WaiterState`"
  (^com.amazonaws.waiters.WaiterState [^HttpFailureStatusAcceptor this]
    (-> this (.getState))))

