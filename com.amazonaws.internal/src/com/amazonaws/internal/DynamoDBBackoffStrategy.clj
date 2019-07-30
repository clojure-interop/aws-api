(ns com.amazonaws.internal.DynamoDBBackoffStrategy
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.internal DynamoDBBackoffStrategy]))

(defn ->dynamo-db-backoff-strategy
  "Constructor."
  (^DynamoDBBackoffStrategy []
    (new DynamoDBBackoffStrategy )))

(def *-default
  "Static Constant.

  type: com.amazonaws.internal.CustomBackoffStrategy"
  DynamoDBBackoffStrategy/DEFAULT)

(defn get-backoff-period
  "retries - `int`

  returns: `int`"
  (^Integer [^DynamoDBBackoffStrategy this ^Integer retries]
    (-> this (.getBackoffPeriod retries))))

