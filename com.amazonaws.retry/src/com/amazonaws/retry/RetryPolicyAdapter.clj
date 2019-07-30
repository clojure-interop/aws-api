(ns com.amazonaws.retry.RetryPolicyAdapter
  "Adapts a legacy RetryPolicy to the new RetryPolicy. This class is intended for internal
  use by the SDK."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.retry RetryPolicyAdapter]))

(defn ->retry-policy-adapter
  "Constructor.

  legacy-retry-policy - `com.amazonaws.retry.RetryPolicy`
  client-configuration - `com.amazonaws.ClientConfiguration`"
  (^RetryPolicyAdapter [^com.amazonaws.retry.RetryPolicy legacy-retry-policy ^com.amazonaws.ClientConfiguration client-configuration]
    (new RetryPolicyAdapter legacy-retry-policy client-configuration)))

(defn compute-delay-before-next-retry
  "Description copied from interface: BackoffStrategy

  context - Context about the state of the last request and information about the number of requests made. - `com.amazonaws.retry.v2.RetryPolicyContext`

  returns: Amount of time in milliseconds to wait before the next attempt. Must be non-negative (can be zero). - `long`"
  (^Long [^RetryPolicyAdapter this ^com.amazonaws.retry.v2.RetryPolicyContext context]
    (-> this (.computeDelayBeforeNextRetry context))))

(defn should-retry?
  "Description copied from interface: RetryCondition

  context - Context about the state of the last request and information about the number of requests made. - `com.amazonaws.retry.v2.RetryPolicyContext`

  returns: True if the request should be retried, false if not. - `boolean`"
  (^Boolean [^RetryPolicyAdapter this ^com.amazonaws.retry.v2.RetryPolicyContext context]
    (-> this (.shouldRetry context))))

(defn retryable?
  "context - `com.amazonaws.retry.v2.RetryPolicyContext`

  returns: `boolean`"
  (^Boolean [^RetryPolicyAdapter this ^com.amazonaws.retry.v2.RetryPolicyContext context]
    (-> this (.isRetryable context))))

(defn get-legacy-retry-policy
  "returns: `com.amazonaws.retry.RetryPolicy`"
  (^com.amazonaws.retry.RetryPolicy [^RetryPolicyAdapter this]
    (-> this (.getLegacyRetryPolicy))))

(defn max-retries-exceeded
  "context - `com.amazonaws.retry.v2.RetryPolicyContext`

  returns: `boolean`"
  (^Boolean [^RetryPolicyAdapter this ^com.amazonaws.retry.v2.RetryPolicyContext context]
    (-> this (.maxRetriesExceeded context))))

