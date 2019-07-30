(ns com.amazonaws.waiters.MaxAttemptsRetryStrategy
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.waiters MaxAttemptsRetryStrategy]))

(defn ->max-attempts-retry-strategy
  "Constructor.

  Constructs a new MaxAttemptsRetryStrategy with the given
   default number of attempts

  default-max-attempts - `int`"
  (^MaxAttemptsRetryStrategy [^Integer default-max-attempts]
    (new MaxAttemptsRetryStrategy default-max-attempts)))

(defn should-retry?
  "Default way of checking if polling should be retried
   or fast failed

  polling-strategy-context - Provides the polling context required to make the retry decision - `com.amazonaws.waiters.PollingStrategyContext`

  returns: false if the number of re - `boolean`"
  (^Boolean [^MaxAttemptsRetryStrategy this ^com.amazonaws.waiters.PollingStrategyContext polling-strategy-context]
    (-> this (.shouldRetry polling-strategy-context))))

