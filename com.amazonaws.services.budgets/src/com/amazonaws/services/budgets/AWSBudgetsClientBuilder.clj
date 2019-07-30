(ns com.amazonaws.services.budgets.AWSBudgetsClientBuilder
  "Fluent builder for AWSBudgets. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.budgets AWSBudgetsClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.budgets.AWSBudgetsClientBuilder`"
  (^com.amazonaws.services.budgets.AWSBudgetsClientBuilder []
    (AWSBudgetsClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.budgets.AWSBudgets`"
  (^com.amazonaws.services.budgets.AWSBudgets []
    (AWSBudgetsClientBuilder/defaultClient )))

