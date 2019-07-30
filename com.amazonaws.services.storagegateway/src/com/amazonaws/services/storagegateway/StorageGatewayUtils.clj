(ns com.amazonaws.services.storagegateway.StorageGatewayUtils
  "Utilities for working with the AWS Storage Gateway service, such as
  requesting a running AWS Storage Gateway instances's activation key for
  registering a Storage Gateway server."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.storagegateway StorageGatewayUtils]))

(defn ->storage-gateway-utils
  "Constructor."
  (^StorageGatewayUtils []
    (new StorageGatewayUtils )))

(defn *get-activation-key
  "Sends a request to the AWS Storage Gateway server running at the
   specified address, and returns the activation key for that server.

  gateway-address - The DNS name or IP address of a running AWS Storage Gateway - `java.lang.String`
  activation-region - `com.amazonaws.regions.Region`

  returns: The activation key required for some API calls to AWS Storage
           Gateway. - `java.lang.String`

  throws: com.amazonaws.AmazonClientException - If any problems are encountered while trying to contact the remote AWS Storage Gateway server."
  (^java.lang.String [^java.lang.String gateway-address ^com.amazonaws.regions.Region activation-region]
    (StorageGatewayUtils/getActivationKey gateway-address activation-region))
  (^java.lang.String [^java.lang.String gateway-address]
    (StorageGatewayUtils/getActivationKey gateway-address)))

