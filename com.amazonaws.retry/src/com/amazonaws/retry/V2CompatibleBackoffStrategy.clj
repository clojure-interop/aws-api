(ns com.amazonaws.retry.V2CompatibleBackoffStrategy
  "Adapter interface for backoff strategies that can be used in both legacy RetryPolicies and the new V2 retry policy."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.retry V2CompatibleBackoffStrategy]))

