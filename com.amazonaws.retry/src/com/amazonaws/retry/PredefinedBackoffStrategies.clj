(ns com.amazonaws.retry.PredefinedBackoffStrategies
  "This class includes a set of pre-defined backoff policies.
  See this blog for more information on the different algorithms:
  https://www.awsarchitectureblog.com/2015/03/backoff.html"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.retry PredefinedBackoffStrategies]))

(defn ->predefined-backoff-strategies
  "Constructor."
  (^PredefinedBackoffStrategies []
    (new PredefinedBackoffStrategies )))

