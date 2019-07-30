(ns com.amazonaws.waiters.core
  (:refer-clojure :only [require comment defn ->])
  (:import ))

(require '[com.amazonaws.waiters.AcceptorPathMatcher])
(require '[com.amazonaws.waiters.FixedDelayStrategy])
(require '[com.amazonaws.waiters.HttpFailureStatusAcceptor])
(require '[com.amazonaws.waiters.HttpSuccessStatusAcceptor])
(require '[com.amazonaws.waiters.MaxAttemptsRetryStrategy])
(require '[com.amazonaws.waiters.WaiterTimedOutException])
(require '[com.amazonaws.waiters.WaiterUnrecoverableException])
