(ns com.amazonaws.waiters.HttpSuccessStatusAcceptor
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.waiters HttpSuccessStatusAcceptor]))

(defn ->http-success-status-acceptor
  "Constructor.

  waiter-state - `com.amazonaws.waiters.WaiterState`"
  (^HttpSuccessStatusAcceptor [^com.amazonaws.waiters.WaiterState waiter-state]
    (new HttpSuccessStatusAcceptor waiter-state)))

(defn matches
  "Description copied from class: WaiterAcceptor

  output - Response got by the execution of the operation - `Output`

  returns: False by default.
   When overriden, returns True if it matches, False
   otherwise - `boolean`"
  (^Boolean [^HttpSuccessStatusAcceptor this output]
    (-> this (.matches output))))

(defn get-state
  "Description copied from class: WaiterAcceptor

  returns: Corresponding state of the resource - `com.amazonaws.waiters.WaiterState`"
  (^com.amazonaws.waiters.WaiterState [^HttpSuccessStatusAcceptor this]
    (-> this (.getState))))

