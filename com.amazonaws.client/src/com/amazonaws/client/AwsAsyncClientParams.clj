(ns com.amazonaws.client.AwsAsyncClientParams
  "Provides access to all params needed in a asynchronous AWS service client constructor. Abstract
  to allow additions to the params while maintaining backwards compatibility."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.client AwsAsyncClientParams]))

(defn ->aws-async-client-params
  "Constructor."
  (^AwsAsyncClientParams []
    (new AwsAsyncClientParams )))

(defn get-executor
  "returns: `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AwsAsyncClientParams this]
    (-> this (.getExecutor))))

