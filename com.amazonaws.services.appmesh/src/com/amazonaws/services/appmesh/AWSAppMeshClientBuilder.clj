(ns com.amazonaws.services.appmesh.AWSAppMeshClientBuilder
  "Fluent builder for AWSAppMesh. Use of the builder is preferred over using
  constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.appmesh AWSAppMeshClientBuilder]))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.appmesh.AWSAppMeshClientBuilder`"
  (^com.amazonaws.services.appmesh.AWSAppMeshClientBuilder []
    (AWSAppMeshClientBuilder/standard )))

(defn *default-client
  "returns: Default client using the DefaultAWSCredentialsProviderChain and
           DefaultAwsRegionProviderChain chain - `com.amazonaws.services.appmesh.AWSAppMesh`"
  (^com.amazonaws.services.appmesh.AWSAppMesh []
    (AWSAppMeshClientBuilder/defaultClient )))

