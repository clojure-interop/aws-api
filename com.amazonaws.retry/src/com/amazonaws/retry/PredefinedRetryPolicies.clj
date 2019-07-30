(ns com.amazonaws.retry.PredefinedRetryPolicies
  "This class includes a set of pre-defined retry policies, including default
  policies used by SDK."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.retry PredefinedRetryPolicies]))

(defn ->predefined-retry-policies
  "Constructor."
  (^PredefinedRetryPolicies []
    (new PredefinedRetryPolicies )))

(def *-no-retry-policy
  "Static Constant.

  No retry policy

  type: com.amazonaws.retry.RetryPolicy"
  PredefinedRetryPolicies/NO_RETRY_POLICY)

(def *-default-max-error-retry
  "Static Constant.

  SDK default max retry count

  type: int"
  PredefinedRetryPolicies/DEFAULT_MAX_ERROR_RETRY)

(def *-default
  "Static Constant.

  SDK default retry policy. Amazon DynamoDB has a custom retry policy that is used when no
   ClientConfiguration is provided.

  type: com.amazonaws.retry.RetryPolicy"
  PredefinedRetryPolicies/DEFAULT)

(def *-dynamodb-default-max-error-retry
  "Static Constant.

  Default max retry count for DynamoDB client

  type: int"
  PredefinedRetryPolicies/DYNAMODB_DEFAULT_MAX_ERROR_RETRY)

(def *-dynamodb-default
  "Static Constant.

  Default policy for DynamoDB client

  type: com.amazonaws.retry.RetryPolicy"
  PredefinedRetryPolicies/DYNAMODB_DEFAULT)

(def *-default-retry-condition
  "Static Constant.

  The SDK default retry condition, which checks for various conditions in
   the following order:

     Never retry on requests with non-repeatable content;
     Retry on client exceptions caused by IOException;
     Retry on service exceptions that are either 500 internal server
         errors, 503 service unavailable errors, service throttling errors or
         clock skew errors.

  type: com.amazonaws.retry.RetryPolicy$RetryCondition"
  PredefinedRetryPolicies/DEFAULT_RETRY_CONDITION)

(def *-default-backoff-strategy
  "Static Constant.

  The SDK default back-off strategy, which increases exponentially up to a max amount of delay. It also applies a larger
   scale factor upon service throttling exception.

  type: com.amazonaws.retry.RetryPolicy$BackoffStrategy"
  PredefinedRetryPolicies/DEFAULT_BACKOFF_STRATEGY)

(def *-default-backoff-strategy-v-2
  "Static Constant.

  The SDK default back-off strategy, which increases exponentially up to a max amount of delay. It also applies a larger
   scale factor upon service throttling exception.

  type: com.amazonaws.retry.V2CompatibleBackoffStrategy"
  PredefinedRetryPolicies/DEFAULT_BACKOFF_STRATEGY_V2)

(def *-dynamodb-default-backoff-strategy
  "Static Constant.

  The default back-off strategy for DynamoDB client, which increases
   exponentially up to a max amount of delay. Compared to the SDK default
   back-off strategy, it applies a smaller scale factor.

  type: com.amazonaws.retry.RetryPolicy$BackoffStrategy"
  PredefinedRetryPolicies/DYNAMODB_DEFAULT_BACKOFF_STRATEGY)

(defn *get-default-retry-policy
  "Returns the SDK default retry policy. This policy will honor the
   maxErrorRetry set in ClientConfiguration.

  returns: `com.amazonaws.retry.RetryPolicy`"
  (^com.amazonaws.retry.RetryPolicy []
    (PredefinedRetryPolicies/getDefaultRetryPolicy )))

(defn *get-dynamo-db-default-retry-policy
  "Returns the default retry policy for DynamoDB client. This policy will
   honor the maxErrorRetry set in ClientConfiguration.

  returns: `com.amazonaws.retry.RetryPolicy`"
  (^com.amazonaws.retry.RetryPolicy []
    (PredefinedRetryPolicies/getDynamoDBDefaultRetryPolicy )))

(defn *get-default-retry-policy-with-custom-max-retries
  "Returns the SDK default retry policy with the specified max retry count.

  max-error-retry - `int`

  returns: `com.amazonaws.retry.RetryPolicy`"
  (^com.amazonaws.retry.RetryPolicy [^Integer max-error-retry]
    (PredefinedRetryPolicies/getDefaultRetryPolicyWithCustomMaxRetries max-error-retry)))

(defn *get-dynamo-db-default-retry-policy-with-custom-max-retries
  "Returns the default retry policy for DynamoDB client with the specified
   max retry count.

  max-error-retry - `int`

  returns: `com.amazonaws.retry.RetryPolicy`"
  (^com.amazonaws.retry.RetryPolicy [^Integer max-error-retry]
    (PredefinedRetryPolicies/getDynamoDBDefaultRetryPolicyWithCustomMaxRetries max-error-retry)))

