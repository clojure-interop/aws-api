(ns com.amazonaws.PredefinedClientConfigurations
  "Static factory methods for the default ClientConfiguration for a service. These defaults
  are used unless a different ClientConfiguration is explicitly provided in the constructor
  of the service client"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws PredefinedClientConfigurations]))

(defn ->predefined-client-configurations
  "Constructor."
  (^PredefinedClientConfigurations []
    (new PredefinedClientConfigurations )))

(defn *default-config
  "Factory method for default ClientConfiguration for all services unless otherwise
   specified

  returns: `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration []
    (PredefinedClientConfigurations/defaultConfig )))

(defn *dynamo-default
  "Factory method for DynamoDB's default ClientConfiguration

  returns: `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration []
    (PredefinedClientConfigurations/dynamoDefault )))

(defn *swf-default
  "Factory method for Simple Workflow's default ClientConfiguration

  returns: `com.amazonaws.ClientConfiguration`"
  (^com.amazonaws.ClientConfiguration []
    (PredefinedClientConfigurations/swfDefault )))

