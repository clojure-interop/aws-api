(ns com.amazonaws.client.ClientHandlerParams
  "Client level parameters for the ClientHandler implementation."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.client ClientHandlerParams]))

(defn ->client-handler-params
  "Constructor."
  (^ClientHandlerParams []
    (new ClientHandlerParams )))

(defn get-client-params
  "returns: `com.amazonaws.client.AwsSyncClientParams`"
  (^com.amazonaws.client.AwsSyncClientParams [^ClientHandlerParams this]
    (-> this (.getClientParams))))

(defn with-client-params
  "client-params - `com.amazonaws.client.AwsSyncClientParams`

  returns: `com.amazonaws.client.ClientHandlerParams`"
  (^com.amazonaws.client.ClientHandlerParams [^ClientHandlerParams this ^com.amazonaws.client.AwsSyncClientParams client-params]
    (-> this (.withClientParams client-params))))

(defn disable-strict-hostname-verification?
  "returns: `boolean`"
  (^Boolean [^ClientHandlerParams this]
    (-> this (.isDisableStrictHostnameVerification))))

(defn with-disable-strict-hostname-verification
  "disable-strict-hostname-verification - `boolean`

  returns: `com.amazonaws.client.ClientHandlerParams`"
  (^com.amazonaws.client.ClientHandlerParams [^ClientHandlerParams this ^Boolean disable-strict-hostname-verification]
    (-> this (.withDisableStrictHostnameVerification disable-strict-hostname-verification))))

