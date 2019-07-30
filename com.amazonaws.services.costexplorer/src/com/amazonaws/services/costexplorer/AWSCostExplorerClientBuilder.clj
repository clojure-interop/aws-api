(ns com.amazonaws.services.costexplorer.AWSCostExplorerClientBuilder
  "Fluent builder for AWSCostExplorer. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.costexplorer AWSCostExplorerClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.costexplorer.AWSCostExplorerClientBuilder`"
  (^com.amazonaws.services.costexplorer.AWSCostExplorerClientBuilder []
    (AWSCostExplorerClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.costexplorer.AWSCostExplorer`"
  (^com.amazonaws.services.costexplorer.AWSCostExplorer []
    (AWSCostExplorerClientBuilder/defaultClient )))

