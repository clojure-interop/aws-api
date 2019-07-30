(ns com.amazonaws.client.ClientHandlerImpl
  "Default implementation of ClientHandler."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.client ClientHandlerImpl]))

(defn ->client-handler-impl
  "Constructor.

  handler-params - `com.amazonaws.client.ClientHandlerParams`"
  (^ClientHandlerImpl [^com.amazonaws.client.ClientHandlerParams handler-params]
    (new ClientHandlerImpl handler-params)))

(defn execute
  "Description copied from class: ClientHandler

  execution-params - Parameters specific to this invocation of an API. - `com.amazonaws.client.ClientExecutionParams`

  returns: Unmarshalled output POJO type. - `<Input,Output> Output`"
  ([^ClientHandlerImpl this ^com.amazonaws.client.ClientExecutionParams execution-params]
    (-> this (.execute execution-params))))

(defn shutdown
  "Description copied from class: ClientHandler"
  ([^ClientHandlerImpl this]
    (-> this (.shutdown))))

