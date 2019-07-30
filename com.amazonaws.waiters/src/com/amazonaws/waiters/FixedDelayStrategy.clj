(ns com.amazonaws.waiters.FixedDelayStrategy
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.waiters FixedDelayStrategy]))

(defn ->fixed-delay-strategy
  "Constructor.

  Constructs a new FixedDelayStrategy with the given
   default delay time

  default-delay-in-seconds - `int`"
  (^FixedDelayStrategy [^Integer default-delay-in-seconds]
    (new FixedDelayStrategy default-delay-in-seconds)))

(defn delay-before-next-retry
  "Defines a default way of delaying the polling bound by
   the default delay associated with the corresponding
   waiter definition

  polling-strategy-context - Provides the polling context required to define custom delay - `com.amazonaws.waiters.PollingStrategyContext`

  throws: java.lang.InterruptedException"
  ([^FixedDelayStrategy this ^com.amazonaws.waiters.PollingStrategyContext polling-strategy-context]
    (-> this (.delayBeforeNextRetry polling-strategy-context))))

