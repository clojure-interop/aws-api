(ns com.amazonaws.services.workspaces.AmazonWorkspacesClientBuilder
  "Fluent builder for AmazonWorkspaces. Use of the builder is preferred over
  using constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.workspaces AmazonWorkspacesClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.workspaces.AmazonWorkspacesClientBuilder`"
  (^com.amazonaws.services.workspaces.AmazonWorkspacesClientBuilder []
    (AmazonWorkspacesClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.workspaces.AmazonWorkspaces`"
  (^com.amazonaws.services.workspaces.AmazonWorkspaces []
    (AmazonWorkspacesClientBuilder/defaultClient )))

