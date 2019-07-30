(ns com.amazonaws.retry.RetryPolicy
  "Retry policy that can be configured on a specific service client using
  ClientConfiguration. This class is immutable, therefore safe to be
  shared by multiple clients."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.retry RetryPolicy]))

(defn ->retry-policy
  "Constructor.

  Constructs a new retry policy. See PredefinedRetryPolicies for
   some pre-defined policy components, and also the default policies used by
   SDK.

  retry-condition - Retry condition on whether a specific request and exception should be retried. If null value is specified, the SDK' default retry condition is used. - `com.amazonaws.retry.RetryPolicy$RetryCondition`
  backoff-strategy - Back-off strategy for controlling how long the next retry should wait. If null value is specified, the SDK' default exponential back-off strategy is used. - `com.amazonaws.retry.RetryPolicy$BackoffStrategy`
  max-error-retry - Maximum number of retry attempts for failed requests. - `int`
  honor-max-error-retry-in-client-config - Whether this retry policy should honor the max error retry set by ClientConfiguration.setMaxErrorRetry(int) - `boolean`"
  (^RetryPolicy [^com.amazonaws.retry.RetryPolicy$RetryCondition retry-condition ^com.amazonaws.retry.RetryPolicy$BackoffStrategy backoff-strategy ^Integer max-error-retry ^Boolean honor-max-error-retry-in-client-config]
    (new RetryPolicy retry-condition backoff-strategy max-error-retry honor-max-error-retry-in-client-config)))

(defn get-retry-condition
  "Returns the retry condition included in this retry policy.

  returns: The retry condition included in this retry policy. - `com.amazonaws.retry.RetryPolicy$RetryCondition`"
  (^com.amazonaws.retry.RetryPolicy$RetryCondition [^RetryPolicy this]
    (-> this (.getRetryCondition))))

(defn get-backoff-strategy
  "Returns the back-off strategy included in this retry policy.

  returns: The back-off strategy included in this retry policy. - `com.amazonaws.retry.RetryPolicy$BackoffStrategy`"
  (^com.amazonaws.retry.RetryPolicy$BackoffStrategy [^RetryPolicy this]
    (-> this (.getBackoffStrategy))))

(defn get-max-error-retry
  "Returns the maximum number of retry attempts.

  returns: The maximum number of retry attempts. - `int`"
  (^Integer [^RetryPolicy this]
    (-> this (.getMaxErrorRetry))))

(defn max-error-retry-in-client-config-honored?
  "Returns whether this retry policy should honor the max error retry set in
   ClientConfiguration.

  returns: Whether this retry policy should honor the max error retry set in
           ClientConfiguration - `boolean`"
  (^Boolean [^RetryPolicy this]
    (-> this (.isMaxErrorRetryInClientConfigHonored))))

